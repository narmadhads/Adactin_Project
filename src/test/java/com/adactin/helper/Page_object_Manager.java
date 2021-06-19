package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.com.BookHotel;
import com.pom.com.BookedItinerary;
import com.pom.com.BookingConfirmation;
import com.pom.com.SearchHotel;
import com.pom.com.SelectHotel;
import com.pom.com.SignIn;

public class Page_object_Manager {
public WebDriver driver;
private SignIn signin;
private SelectHotel select;
private SearchHotel search;
private BookingConfirmation bookingconfirm;
private BookHotel book;
private BookedItinerary itinerary;

public Page_object_Manager(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
}

public SignIn get_Instance_Signin() {
	signin=new SignIn(driver);
	return signin;
}

public SelectHotel get_Instance_Select() {
	select = new SelectHotel(driver);
	return select;
}

public SearchHotel get_Instance_Search() {
	search= new SearchHotel(driver);
	return search;
}

public BookingConfirmation get_Instance_Booking_Confirmation() {
	bookingconfirm = new BookingConfirmation(driver);
	return bookingconfirm;
}

public BookHotel get_Instance_Book() {
	book= new BookHotel(driver);
	return book;
}

public BookedItinerary get_Instance_Itinerary() {
	itinerary=new BookedItinerary(driver);
	return itinerary;
}

}
