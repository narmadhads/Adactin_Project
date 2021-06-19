Feature: Hotel Room Booking In Adactin Application
 
@SmokeTest
Scenario Outline: Hotel Booking
Given user Launch The Application
When user Enter The "<Username>" Username In Username Field
And user Enter The "<Password>" Password In Password Field
Then user Click On The Login Button And It Navigates To The Search Hotel Page

Examples:
|Username|Password|
|narmadhads|Hanuman04|
|Hello|password|
|Hello1|password1|

@SanityTest
Scenario:
When user Select The Location
And user Select The Hotel 
And user Select Room Type
And user Select The Number Of Rooms
And user Enter The Check In Date
And user Enter The Check Out Date
And user Select Adults per Rooms
And user Select Children per Rooms
Then user Click On The Search Button And It Navigates To The Select Hotel Page

@SanityTest
Scenario:
When user Click On The Radio Button For Selecting The Hotel
Then user Click On Continue Button And It Navigates To The Book A Hotel Page

@SanityTest
Scenario:
When user Enter The First Name In The First Name Field
And user Enter The Last Name In The Last Name Field
And user Enter The Billing Address In The Billing Address Field
And user Enter The Credit Card Number In The Credit Card Number Field
And user Select The Credit Card Type
And user Select The Expiry Month In The Expiry Date
And user Select The Expiry Year In The Expiry Date
And user Enter The Cvv Number In The Cvv Number Field
Then user Click On The Book Now Button And It Navigates To The Booking Confirmation Page

@SanityTest
Scenario:
Then user Click On The Itirnerary Button And It Navigates To The Booked Itirnerary Page

@RegressionTest
Scenario:
When user Enter the Order Id In The Search Order Id Field
Then user Click On The Go Button To List the Searched Order Id 
And user Click On The Radio Button For Selecting The Booked Itirnerary From The List
Then user Click On The Logout Button And It Navigates To The Logout Success Page 
