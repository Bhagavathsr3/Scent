package org.testtt;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class services extends Base {
	@Given("click the Our Services button")
	public void click_the_Our_Services_button() throws InterruptedException {
		//Thread.sleep(3000);
	    WebElement ser = driver.findElement(By.xpath("//*[@id=\"menu-1-d09d7d2\"]/li[4]/a"));
	    ser.click();
	}

	@Given("Scroll to Contact Us button")
	public void scroll_to_Contact_Us_button() {
	    scrolll("/html/body/div[2]/section[9]/div[2]/div/div/div[3]/div/div/a");
	}

	@Given("Click the Contact us page")
	public void click_the_Contact_us_page() {
		 WebElement cont = driver.findElement(By.xpath("/html/body/div[2]/section[9]/div[2]/div/div/div[3]/div/div/a"));
	cont.click();
	}

	@Then("Contact us page mustbe viewed")
	public void contact_us_page_mustbe_viewed() {
	   WebElement end = driver.findElement(By.xpath("//h1[contains(text(),'Contact Us')]"));
	   String text = end.getText();
	   System.out.println(text.equalsIgnoreCase("contact us")?"Contact page was viewed":"contact page error");
	}

	}



