package com.adactin.step;

import org.openqa.selenium.WebDriver;

import com.AdactinProj.BaseClass;
import com.adactin.helper.File_Reader_Manager;
import com.adactin.helper.Page_object_Manager;
import com.adactin.runner.Test_Runner1;
import com.pom.com.BookHotel;
import com.pom.com.BookedItinerary;
import com.pom.com.BookingConfirmation;
import com.pom.com.SearchHotel;
import com.pom.com.SelectHotel;
import com.pom.com.SignIn;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Step_Definition extends BaseClass {
	public static WebDriver driver= Test_Runner1.driver;
	public static Page_object_Manager pom=new Page_object_Manager(driver);
	public static SignIn login= new SignIn(driver);
	public static SearchHotel seahotel= new SearchHotel(driver);
	public static SelectHotel shotel= new SelectHotel(driver);
	public static BookHotel bhotel=new BookHotel(driver);
	public static BookingConfirmation bcon=new BookingConfirmation(driver);
	public static BookedItinerary biti=new BookedItinerary(driver);
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		gets("https://adactinhotelapp.com/");
	}

	@When("^user Enter The \"([^\"]*)\" Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field(String username) throws Throwable {
		enterValues(pom.get_Instance_Signin().getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field(String password) throws Throwable {
		enterValues(pom.get_Instance_Signin().getPassword(), password);
	}
	
	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		clickOnElement(pom.get_Instance_Signin().getLogin());
	}

	@When("^user Select The Location$")
	public void user_Select_The_Location() throws Throwable {
		//SearchHotel seahotel=new SearchHotel(driver);
		dropdown1(pom.get_Instance_Search().getLocation(), "Sydney");
	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		dropdown1(pom.get_Instance_Search().getHotels(), "Hotel Sunshine");
	}

	@When("^user Select Room Type$")
	public void user_Select_Room_Type() throws Throwable {
		dropdown1(pom.get_Instance_Search().getRoom(), "Standard");
	}

	@When("^user Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		dropdown1(pom.get_Instance_Search().getRoomnos(), "1-One");
	}

	@When("^user Enter The Check In Date$")
	public void user_Enter_The_Check_In_Date() throws Throwable {
		enterValues(pom.get_Instance_Search().getDatepick(), "14/06/2021");
	}

	@When("^user Enter The Check Out Date$")
	public void user_Enter_The_Check_Out_Date() throws Throwable {
		enterValues(pom.get_Instance_Search().getDpickout(), "15/06/2021");
	}

	@When("^user Select Adults per Rooms$")
	public void user_Select_Adults_per_Rooms() throws Throwable {
		implicitWait(5);
		dropdown1(pom.get_Instance_Search().getAroom(), "2");
	}

	@When("^user Select Children per Rooms$")
	public void user_Select_Children_per_Rooms() throws Throwable {
		implicitWait(5);
		dropdown1(pom.get_Instance_Search().getCroom(), "1");
	}

	@Then("^user Click On The Search Button And It Navigates To The Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		clickOnElement(pom.get_Instance_Search().getSubmit());
	}

	@When("^user Click On The Radio Button For Selecting The Hotel$")
	public void user_Click_On_The_Radio_Button_For_Selecting_The_Hotel() throws Throwable {
		//SelectHotel shotel=new SelectHotel(driver);
		clickOnElement(pom.get_Instance_Select().getRadio());

	}

	@Then("^user Click On Continue Button And It Navigates To The Book A Hotel Page$")
	public void user_Click_On_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel_Page() throws Throwable {
		clickOnElement(pom.get_Instance_Select().getContinu());
	}

	@When("^user Enter The First Name In The First Name Field$")
	public void user_Enter_The_First_Name_In_The_First_Name_Field() throws Throwable {
		//BookHotel bhotel=new BookHotel(driver);
		enterValues(pom.get_Instance_Book().getFname(), "Narmadha");

	}

	@When("^user Enter The Last Name In The Last Name Field$")
	public void user_Enter_The_Last_Name_In_The_Last_Name_Field() throws Throwable {
		enterValues(pom.get_Instance_Book().getLname(), "Sivakumar");
	}

	@When("^user Enter The Billing Address In The Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_The_Billing_Address_Field() throws Throwable {
		enterValues(pom.get_Instance_Book().getAddress(), "No.2/43, Shree Nagar, Velachery");
	}

	@When("^user Enter The Credit Card Number In The Credit Card Number Field$")
	public void user_Enter_The_Credit_Card_Number_In_The_Credit_Card_Number_Field() throws Throwable {
		String cnum = File_Reader_Manager.getInstance().getInstanceCR().get_Cnum();
		enterValues(pom.get_Instance_Book().getCnum(), cnum);
	}

	@When("^user Select The Credit Card Type$")
	public void user_Select_The_Credit_Card_Type() throws Throwable {
		dropdown1(pom.get_Instance_Book().getCtype(), "VISA");
	}

	@When("^user Select The Expiry Month In The Expiry Date$")
	public void user_Select_The_Expiry_Month_In_The_Expiry_Date() throws Throwable {
		String emon = File_Reader_Manager.getInstance().getInstanceCR().get_Emon();
		dropdown1(pom.get_Instance_Book().getEmon(),emon);
	}

	

	@When("^user Select The Expiry Year In The Expiry Date$")
	public void user_Select_The_Expiry_Year_In_The_Expiry_Date() throws Throwable {
		String eyea = File_Reader_Manager.getInstance().getInstanceCR().get_Eyear();
		dropdown1(pom.get_Instance_Book().getEyear(), eyea);
	}

	@When("^user Enter The Cvv Number In The Cvv Number Field$")
	public void user_Enter_The_Cvv_Number_In_The_Cvv_Number_Field() throws Throwable {
		String cvv = File_Reader_Manager.getInstance().getInstanceCR().get_Cvv();
		enterValues(pom.get_Instance_Book().getCvv(),cvv );
	}

	@Then("^user Click On The Book Now Button And It Navigates To The Booking Confirmation Page$")
	public void user_Click_On_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation_Page() throws Throwable {
		clickOnElement(pom.get_Instance_Book().getBook());
	}

	@Then("^user Click On The Itirnerary Button And It Navigates To The Booked Itirnerary Page$")
	public void user_Click_On_The_Itirnerary_Button_And_It_Navigates_To_The_Booked_Itirnerary_Page() throws Throwable {
		//BookingConfirmation bcon= new BookingConfirmation(driver);
		clickOnElement(pom.get_Instance_Booking_Confirmation().getItinerary());

	}

	@When("^user Enter the Order Id In The Search Order Id Field$")
	public void user_Enter_the_Order_Id_In_The_Search_Order_Id_Field() throws Throwable {
		//BookedItinerary biti=new BookedItinerary(driver);
		enterValues(pom.get_Instance_Itinerary().getOrderId(), "T3057XH3F7");

	}

	@Then("^user Click On The Go Button To List the Searched Order Id$")
	public void user_Click_On_The_Go_Button_To_List_the_Searched_Order_Id() throws Throwable {
		clickOnElement(pom.get_Instance_Itinerary().getGo());
	}

	@Then("^user Click On The Radio Button For Selecting The Booked Itirnerary From The List$")
	public void user_Click_On_The_Radio_Button_For_Selecting_The_Booked_Itirnerary_From_The_List() throws Throwable {
		clickOnElement(pom.get_Instance_Itinerary().getCheckall());
	}

	@Then("^user Click On The Logout Button And It Navigates To The Logout Success Page$")
	public void user_Click_On_The_Logout_Button_And_It_Navigates_To_The_Logout_Success_Page() throws Throwable {
		clickOnElement(pom.get_Instance_Itinerary().getLogout());
	}


}
