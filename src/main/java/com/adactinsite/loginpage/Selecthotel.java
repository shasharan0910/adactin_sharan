package com.adactinsite.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotel {

	public WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton;

	@FindBy(id = "continue")
	private WebElement Continue;

	public Selecthotel(WebDriver cdriver) {
		this.driver = cdriver;
		PageFactory.initElements(cdriver, this);
	}

	public WebElement getradiobutton() {
		return radiobutton;
	}

	public WebElement getContinue() {
		return Continue;
	}

}
