package com.adactinsite.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel {

	public WebDriver driver;

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement room_type;

	@FindBy(id = "room_nos")
	private WebElement room_nos;

	@FindBy(id = "datepick_in")
	private WebElement datepick_in;

	@FindBy(id = "datepick_out")
	private WebElement datepick_out;

	@FindBy(id = "adult_room")
	private WebElement adult_room;

	@FindBy(id = "child_room")
	private WebElement child_room;

	@FindBy(id = "Submit")
	private WebElement Submit;

	public Searchhotel(WebDriver bdriver) {
		this.driver = bdriver;
		PageFactory.initElements(bdriver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getNumberofRooms() {
		return room_nos;
	}

	public WebElement getCheckInDate() {
		return datepick_in;
	}

	public WebElement getCheckOutDate() {
		return datepick_out;
	}

	public WebElement getAdultsperRoom() {
		return adult_room;
	}

	public WebElement getChildrenperRoom() {
		return child_room;
	}

	public WebElement getsearch() {
		return Submit;
	}

}
