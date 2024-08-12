package org.testtt;

import java.util.List;

import org.base.Base;
import org.base.pojoo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class formfields extends pojoo {
	pojoo pj;
	@Given("^launch the Browser sc three$")
    public void launch_the_browser_sc_three() throws Throwable {
       Launcher();
    }

    @And("^enter the url sc three$")
    public void enter_the_url_sc_three() throws Throwable {
      launchURL("https://scentarts.ae/");
      driver.manage().window().maximize();
    }

	@Given("Click the Contact us page SC-Three")
	public void click_the_Contact_us_page_SC_Three() {
		 WebElement cont = driver.findElement(By.xpath("//*[@id=\"menu-1-d09d7d2\"]/li[5]/a"));
			cont.click();
	}

	@Given("verify contact us page has opened or not")
	public void verify_contact_us_page_has_opened_or_not() {
		  WebElement end = driver.findElement(By.xpath("//h1[contains(text(),'Contact Us')]"));
		   String text = end.getText();
		   System.out.println(text.equalsIgnoreCase("contact us")?"Contact page was viewed":"contact page error");
	}

	@Given("Enter Your full Name")
	public void enter_Your_full_Name(io.cucumber.datatable.DataTable d1) throws InterruptedException {
		Thread.sleep(3000);
		pj= new pojoo();
		List<String> l1 = d1.asList();
	 passText(l1.get(2),pj.getName());
	}

	@Given("enter your company name")
	public void enter_your_company_name(io.cucumber.datatable.DataTable d2) {
		pj= new pojoo();
		List<String> l2 = d2.asList();
	pj.getCompanyName().sendKeys(l2.get(1));
	}

	@Given("enter your phone number")
	public void enter_your_phone_number(io.cucumber.datatable.DataTable d3) {
		pj= new pojoo();
		List<String> l3 = d3.asList();
		passText(l3.get(0),pj.getPhone());
		}

	@Given("enter email address")
	public void enter_email_address(io.cucumber.datatable.DataTable d4) {
	    List<List<String>> l4 = d4.asLists();
	   pj.getEmail().sendKeys(l4.get(0).get(0));
	}

	@Given("select the type of service")
	public void select_the_type_of_service() {
	    WebElement ele = driver.findElement(By.xpath("//select[@id='form-field-field_a5209a9']"));
	    ele.click();
	    WebElement ele2 = driver.findElement(By.xpath("//option[@value='want to create signature scent']"));
	ele2.click();
	}

	@Given("select the country")
	public void select_the_country() {
	  WebElement ele3 = driver.findElement(By.xpath("//*[@id='form-field-field_67f8bfa']"));
	ele3.sendKeys("japan");
	}

	@Given("Enter your message")
	public void enter_your_message() {
		WebElement ele4 = driver.findElement(By.xpath("//textarea[@id='form-field-field_7094c9e']"));
		ele4.sendKeys("i need to do scenting");
	}

	@Given("Click the send button")
	public void click_the_send_button() {
		WebElement ele4 = driver.findElement(By.xpath("(//*[@class='elementor-button-text'])[2]"));
		ele4.click();
	}

	@SuppressWarnings("deprecation")
	@Then("^check wheather the message sent or not$")
    public void check_wheather_the_message_sent_or_not() throws Throwable {
		Thread.sleep(3000);
	//	WebElement ele5 = driver.findElement(By.xpath("//*[contains(text(),'Your submission was successful.')]"));
		WebElement ele5 = driver.findElement(By.xpath("//*[contains(text(),'Your submission was successful.')]"));
		String text = ele5.getText();
			System.out.println(text);
			
    }
		
	}



