package org.base;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.IOException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
public static void Launcher() {
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
}
public static void launchURL(String url) {
	driver.get(url);
}
	public static void passText(String txt, WebElement ele) {
		ele.sendKeys(txt);
}
//Mouse hover 1.movetoElement
public static void MouseHover(WebElement hover) {
	Actions a = new Actions(driver);
	a.moveToElement(hover).perform();
}
public static void KeybrdEnter() throws AWTException {
	Robot rb = new Robot();
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
}
//drop down 
public static void dropdown(String drop1) {
	WebElement e1 = driver.findElement(By.xpath(drop1));
	Select s = new Select(e1);
	s.selectByVisibleText(drop1);
}
//screenshot

public static void screenshot(String path) throws IOException {
	TakesScreenshot tk = (TakesScreenshot)driver;
	File scrn = tk.getScreenshotAs(OutputType.FILE);
	File f1 = new File(path);
	FileUtils.copyFile(scrn, f1);
}
//Clicking button 
public static void Clickk(String cl) {
	WebElement clk = driver.findElement(By.xpath(cl));
	clk.click();
}
//scroll down using using js executor
public static void scrolll(String scrl) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement elscrl = driver.findElement(By.xpath(scrl));
	
	js.executeScript("arguments[0].scrollIntoView();",elscrl );
}
}
