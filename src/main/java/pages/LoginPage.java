package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
	
	
	@FindBy(xpath=("//input[@name='username']"))
	private WebElement usernameBOX;
	
	@FindBy(xpath=("//input[@name='password']"))
	private WebElement passwordBOX;
	 
	@FindBy(xpath=("//button[text()=' Login ']"))
	private WebElement loginbutton;

	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements( driver, this);
		
	}
	
	public void entercread(String username, String password) {
		
		usernameBOX.sendKeys(username);
		
		passwordBOX.sendKeys(password);
	}
	
	public void loginbutton() {
		
		loginbutton.click();
	}

}
