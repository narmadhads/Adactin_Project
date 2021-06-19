package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItinerary {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='order_id_text']")
	private WebElement orderId;
	
	@FindBy(xpath = "//input[@id='search_hotel_id']")
	private WebElement go;
	
public WebElement getGo() {
		return go;
	}

public WebElement getOrderId() {
		return orderId;
	}

@FindBy(xpath = "//input[@id='check_all']")
private WebElement checkall;

@FindBy(xpath = "//input[@id='logout']")
private WebElement logout;

public BookedItinerary(WebDriver Idriver) {
this.driver=Idriver;
PageFactory.initElements(driver, this);
}

public WebElement getLogout() {
	return logout;
}

public WebElement getCheckall() {
	return checkall;
}
}
