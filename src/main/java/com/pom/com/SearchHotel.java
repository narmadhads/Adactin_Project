package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public WebDriver driver;
@FindBy(xpath = "//select[@id='location']")
private WebElement location;

@FindBy(xpath = "//select[@id='hotels']")
private WebElement hotels;

@FindBy(xpath = "//select[@id='room_type']")
private WebElement room;

@FindBy(xpath = "//select[@id='room_nos']")
private WebElement roomnos;

@FindBy(xpath = "//input[@id='datepick_in']")
private WebElement datepick;

@FindBy(xpath = "//input[@id='datepick_out']")
private WebElement dpickout;

@FindBy(xpath = "//select[@id='adult_room']")
private WebElement aroom;

@FindBy(xpath = "//select[@id='child_room']")
private WebElement croom;

@FindBy(xpath = "//input[@id='Submit']")
private WebElement submit;

public SearchHotel(WebDriver Sedriver) {
this.driver=Sedriver;
PageFactory.initElements(driver, this);
}

public WebElement getLocation() {
	return location;
}

public WebElement getHotels() {
	return hotels;
}

public WebElement getRoom() {
	return room;
}

public WebElement getRoomnos() {
	return roomnos;
}

public WebElement getDatepick() {
	return datepick;
}

public WebElement getDpickout() {
	return dpickout;
}

public WebElement getAroom() {
	return aroom;
}

public WebElement getCroom() {
	return croom;
}

public WebElement getSubmit() {
	return submit;
}


}
