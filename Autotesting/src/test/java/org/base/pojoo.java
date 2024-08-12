package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojoo extends Base {
public pojoo() {
	PageFactory.initElements(driver, this);
}
@FindBy(id = "form-field-name")
private WebElement Name; 

public WebElement getCompanyName() {
	return CompanyName;
}

public WebElement getPhone() {
	return phone;
}

public WebElement getEmail() {
	return Email;
}
@FindBy(id="form-field-email")
private WebElement CompanyName;

@FindBy(id="form-field-message")
private WebElement phone;

@FindBy(id="form-field-field_ea2bfcd") 
private WebElement Email;

public WebElement getName() {
	return Name;
}

}
