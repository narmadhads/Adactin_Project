package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	public WebDriver driver;
@FindBy(xpath = "//input[@id='username']")
private WebElement username;

@FindBy(xpath = "//input[@id='password']")
private WebElement password;

@FindBy(xpath = "//input[@id='login']")
private WebElement login;

public SignIn(WebDriver Adriver) {
this.driver=Adriver;	
PageFactory.initElements(driver, this);
}

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}

}
