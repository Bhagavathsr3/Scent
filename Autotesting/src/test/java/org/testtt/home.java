
package org.testtt;
import org.base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class home extends Base {
	@Given("to launch the browser")
	public void to_launch_the_browser() {
	   Launcher();
	}

	@Given("enter the url to launch")
	public void enter_the_url_to_launch() {
	    launchURL("https://scentarts.ae/");
	driver.manage().window().maximize();
	}

	@Given("Click the About us button")
	public void click_the_About_us_button() {
	    WebElement ab = driver.findElement(By.xpath("//*[@id=\"menu-1-d09d7d2\"]/li[2]/a"));
       ab.click();
	}

	@Given("Scroll to Areas of Scenting")
	public void scroll_to_Areas_of_Scenting() {
	   scrolll("/html/body/div[2]/section[10]/div/div/div/div/div/h2");
	}

	
	
	@Given("verify Descriptions for Hotels")
	public void verify_Descriptions_for_Hotels() throws InterruptedException {
		Thread.sleep(3000);
		WebElement htl = driver.findElement(By.xpath("//*[@id=\"elementor-tab-title-2361\"]"));
	    htl.click();
	  
	    WebElement status = driver.findElement(By.xpath("//*[contains (text(),'Smell provides guests ')]"));
	    String text = status.getText();
	    System.out.println("description for hotels "+text);
	   
	
	}

	@SuppressWarnings("deprecation")
	@Given("verify Descriptions for offices")
	public void verify_Descriptions_for_offices() {
	  WebElement off = driver.findElement(By.xpath("//*[@id=\"elementor-tab-title-4431\"]"));
	   off.click();
	boolean statuss = driver.findElement(By.xpath("//*[contains(text(),'A signature scent is like a business')]")).isDisplayed();
	Assert.assertEquals(true, statuss);
	}

	@Given("verify Descriptions for Airports")
	public void verify_Descriptions_for_Airports() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement element = driver.findElement(By.xpath("//a[text()='Airports Lounges']"));
	js.executeScript("arguments[0].click()", element);

	 WebElement status  = driver.findElement(By.xpath("//*[contains(text(),'Every airport wants to deliver a seamless and enjoyable Journey')]"));	   
		String Airport = status.getText();
		System.out.println("Description of Airport "+Airport);
	}

	@Then("the descriptions must be viewed")
	public void the_descriptions_must_be_viewed() {
	    
	   System.out.println("the Descriptions were verified");
	}

}