package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation {
	public WebDriver driver;
@FindBy(xpath = "//input[@id='my_itinerary']")
private WebElement itinerary;

public BookingConfirmation(WebDriver Idriver) {
this.driver=Idriver;
PageFactory.initElements(driver, this);
}

public WebElement getItinerary() {
	return itinerary;
}
}
