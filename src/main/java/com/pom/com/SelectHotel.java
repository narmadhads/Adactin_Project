package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
public WebDriver driver;
	@FindBy(xpath = "//input[@id='radiobutton_0']")
private WebElement radio;

@FindBy(xpath = "//input[@id='continue']")
private WebElement continu;

public SelectHotel(WebDriver Hdriver) {
this.driver=Hdriver;
PageFactory.initElements(driver, this);

}

public WebElement getRadio() {
	return radio;
}

public WebElement getContinu() {
	return continu;
}

}
