package com.adactinsite.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactinsite.baseclass.baseclass;
import com.adactinsite.helper.File_Reader_Manager;
import com.adactinsite.loginpage.loginpage;
import com.adactinsite.testrunner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends baseclass {

	public static WebDriver driver = Test_Runner.driver;

	public static loginpage Login = new loginpage(driver);

	@Given("^User Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {

		String _Url = File_Reader_Manager.getInstance().grtInstanceCR().get_Url();
		okg(_Url);
		
	}

	@When("^User Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
	
		sk(Login.getUsername(), "shasharan0910");

	}

	@When("^User Enter The Password In Username Filed$")
	public void user_Enter_The_Password_In_Username_Filed() throws Throwable {
		sk(Login.getPassword(), "lakshita6411");

	}

	@Then("^User Click On The Login Button And It Navigation To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigation_To_The_Search_Hotel_Page() throws Throwable {
		ck(Login.getLogin());
	}

//	@Given("^User Launch The Search Hotel Page$")
//	public void user_Launch_The_Search_Hotel_Page() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^User Select The Location In Location Field$")
//	public void user_Select_The_Location_In_Location_Field() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^User Select The Hotel In Hotel Filed$")
//	public void user_Select_The_Hotel_In_Hotel_Filed() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^User Select The Room Type In Room Type Filed$")
//	public void user_Select_The_Room_Type_In_Room_Type_Filed() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^User Select The Check In Date  In Check In Date Filed$")
//	public void user_Select_The_Check_In_Date_In_Check_In_Date_Filed() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^User Select The Check Out Date In Check Out Date Filed$")
//	public void user_Select_The_Check_Out_Date_In_Check_Out_Date_Filed() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^User Select The Adults Per Room In Adults Per Room Filed$")
//	public void user_Select_The_Adults_Per_Room_In_Adults_Per_Room_Filed() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^User Select The Children Per Room In Children Per Room Filed$")
//	public void user_Select_The_Children_Per_Room_In_Children_Per_Room_Filed() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^User Click On The Search Button And It Navigation To The Select Hotel Page$")
//	public void user_Click_On_The_Search_Button_And_It_Navigation_To_The_Select_Hotel_Page() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Given("^User Launch The Select Hotel Page$")
//	public void user_Launch_The_Select_Hotel_Page() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^User Enter The  Select Hotel In  Select Hotel Field$")
//	public void user_Enter_The_Select_Hotel_In_Select_Hotel_Field() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^User Click On The Continue Button And It Navigation To The Book Hotel Page$")
//	public void user_Click_On_The_Continue_Button_And_It_Navigation_To_The_Book_Hotel_Page() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Given("^User Launch The Book Hotel Page$")
//	public void user_Launch_The_Book_Hotel_Page() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^User Enter The Frist Name In Frist Name Field$")
//	public void user_Enter_The_Frist_Name_In_Frist_Name_Field() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^User Enter The Last Name In Last Name Filed$")
//	public void user_Enter_The_Last_Name_In_Last_Name_Filed() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^User Enter The Billing Address In  Billing Address Filed$")
//	public void user_Enter_The_Billing_Address_In_Billing_Address_Filed() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^User Enter The Credit Card Number In Credit Card Number Filed$")
//	public void user_Enter_The_Credit_Card_Number_In_Credit_Card_Number_Filed() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^User Enter The Credit Card Type In  Credit Card Type Filed$")
//	public void user_Enter_The_Credit_Card_Type_In_Credit_Card_Type_Filed() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^User Enter The Expiry Date In Expiry Date Filed$")
//	public void user_Enter_The_Expiry_Date_In_Expiry_Date_Filed() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^User Enter The CVV Number In CVV Number Filed$")
//	public void user_Enter_The_CVV_Number_In_CVV_Number_Filed() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^User Click On The Book Now Button And It Navigation To The Select Hotel Page$")
//	public void user_Click_On_The_Book_Now_Button_And_It_Navigation_To_The_Select_Hotel_Page() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Given("^User Launch The Booking Confrim Page$")
//	public void user_Launch_The_Booking_Confrim_Page() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^User Click On The Logout Button And It Navigation To The Application Page$")
//	public void user_Click_On_The_Logout_Button_And_It_Navigation_To_The_Application_Page() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}

}
