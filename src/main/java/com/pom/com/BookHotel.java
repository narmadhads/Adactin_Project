package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	public WebDriver driver;
@FindBy(xpath = "//input[@id='first_name']")
private WebElement fname;

@FindBy(xpath = "//input[@id='last_name']")
private WebElement lname;

@FindBy(xpath = "//textarea[@id='address']")
private WebElement address;

@FindBy(xpath = "//input[@id='cc_num']")
private WebElement cnum;

@FindBy(xpath = "//select[@id='cc_type']")
private WebElement ctype;

@FindBy(xpath = "//select[@id='cc_exp_month']")
private WebElement emon;

@FindBy(xpath = "//select[@id='cc_exp_year']")
private WebElement eyear;

@FindBy(xpath = "//input[@id='cc_cvv']")
private WebElement cvv;

@FindBy(xpath = "//input[@id='book_now']")
private WebElement book;


public BookHotel(WebDriver Bdriver) {
this.driver=Bdriver;
PageFactory.initElements(driver, this);
}

public WebElement getFname() {
	return fname;
}

public WebElement getLname() {
	return lname;
}

public WebElement getAddress() {
	return address;
}

public WebElement getCnum() {
	return cnum;
}

public WebElement getCtype() {
	return ctype;
}

public WebElement getEmon() {
	return emon;
}

public WebElement getEyear() {
	return eyear;
}

public WebElement getCvv() {
	return cvv;
}

public WebElement getBook() {
	return book;
}
}
