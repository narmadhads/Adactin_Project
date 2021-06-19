$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin1.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Room Booking In Adactin Application",
  "description": "",
  "id": "hotel-room-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Hotel Booking",
  "description": "",
  "id": "hotel-room-booking-in-adactin-application;hotel-booking",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cUsername\u003e\" Username In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cPassword\u003e\" Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-room-booking-in-adactin-application;hotel-booking;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11,
      "id": "hotel-room-booking-in-adactin-application;hotel-booking;;1"
    },
    {
      "cells": [
        "narmadhads",
        "Hanuman04"
      ],
      "line": 12,
      "id": "hotel-room-booking-in-adactin-application;hotel-booking;;2"
    },
    {
      "cells": [
        "Hello",
        "password"
      ],
      "line": 13,
      "id": "hotel-room-booking-in-adactin-application;hotel-booking;;3"
    },
    {
      "cells": [
        "Hello1",
        "password1"
      ],
      "line": 14,
      "id": "hotel-room-booking-in-adactin-application;hotel-booking;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Hotel Booking",
  "description": "",
  "id": "hotel-room-booking-in-adactin-application;hotel-booking;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"narmadhads\" Username In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"Hanuman04\" Password In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 13676374322,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "narmadhads",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_Username_In_Username_Field(String)"
});
formatter.result({
  "duration": 1652182392,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hanuman04",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_Password_In_Password_Field(String)"
});
formatter.result({
  "duration": 293330366,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1736984539,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Hotel Booking",
  "description": "",
  "id": "hotel-room-booking-in-adactin-application;hotel-booking;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Hello\" Username In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"password\" Password In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 424568686,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_Username_In_Username_Field(String)"
});
formatter.result({
  "duration": 126212116,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_Password_In_Password_Field(String)"
});
formatter.result({
  "duration": 98636104,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 890308486,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Hotel Booking",
  "description": "",
  "id": "hotel-room-booking-in-adactin-application;hotel-booking;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Hello1\" Username In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"password1\" Password In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 486232754,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello1",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_Username_In_Username_Field(String)"
});
formatter.result({
  "duration": 101248107,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password1",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_Password_In_Password_Field(String)"
});
formatter.result({
  "duration": 116516590,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 455189157,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "",
  "description": "",
  "id": "hotel-room-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user Select The Location",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user Select The Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select The Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Enter The Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Enter The Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select Adults per Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Select Children per Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Click On The Search Button And It Navigates To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Location()"
});
formatter.result({
  "duration": 869544022,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel()"
});
formatter.result({
  "duration": 31606212,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Room_Type()"
});
formatter.result({
  "duration": 20892756,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Rooms()"
});
formatter.result({
  "duration": 20383324,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Check_In_Date()"
});
formatter.result({
  "duration": 20146802,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Check_Out_Date()"
});
formatter.result({
  "duration": 20485490,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Adults_per_Rooms()"
});
formatter.result({
  "duration": 5112223743,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Children_per_Rooms()"
});
formatter.result({
  "duration": 6739720167,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 5051932154,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "",
  "description": "",
  "id": "hotel-room-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "user Click On The Radio Button For Selecting The Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user Click On Continue Button And It Navigates To The Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Radio_Button_For_Selecting_The_Hotel()"
});
formatter.result({
  "duration": 5034248071,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 5063970971,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "",
  "description": "",
  "id": "hotel-room-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "user Enter The First Name In The First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user Enter The Last Name In The Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Enter The Billing Address In The Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Enter The Credit Card Number In The Credit Card Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Select The Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Select The Expiry Month In The Expiry Date",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Select The Expiry Year In The Expiry Date",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Enter The Cvv Number In The Cvv Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Click On The Book Now Button And It Navigates To The Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_First_Name_In_The_First_Name_Field()"
});
formatter.result({
  "duration": 5107838527,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Last_Name_In_The_Last_Name_Field()"
});
formatter.result({
  "duration": 5067518332,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Billing_Address_In_The_Billing_Address_Field()"
});
formatter.result({
  "duration": 5026619194,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Credit_Card_Number_In_The_Credit_Card_Number_Field()"
});
formatter.result({
  "duration": 5400525572,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Credit_Card_Type()"
});
formatter.result({
  "duration": 5076253309,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Expiry_Month_In_The_Expiry_Date()"
});
formatter.result({
  "duration": 5019364927,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Expiry_Year_In_The_Expiry_Date()"
});
formatter.result({
  "duration": 5073705684,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Cvv_Number_In_The_Cvv_Number_Field()"
});
formatter.result({
  "duration": 5027105766,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 5039145051,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "",
  "description": "",
  "id": "hotel-room-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 45,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "user Click On The Itirnerary Button And It Navigates To The Booked Itirnerary Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Itirnerary_Button_And_It_Navigates_To_The_Booked_Itirnerary_Page()"
});
formatter.result({
  "duration": 5045062760,
  "status": "passed"
});
});