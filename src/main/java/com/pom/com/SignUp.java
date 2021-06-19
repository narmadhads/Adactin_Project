package com.pom.com;


//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp {
	//private WebDriver driver;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='re_password']")
	private WebElement repassword;
	
	@FindBy(xpath = "//input[@id='full_name']")
	private WebElement fullname;
	
	@FindBy(xpath = "//input[@id='email_add']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='tnc_box']")
	private WebElement tncbox;
	
	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement submit;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getRepassword() {
		return repassword;
	}

	public WebElement getFullname() {
		return fullname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getTncbox() {
		return tncbox;
	}

	public WebElement getSubmit() {
		return submit;
	}


}
