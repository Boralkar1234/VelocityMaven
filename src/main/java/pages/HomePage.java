package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//@FindBy(xpath=("//a[@class='oxd-main-menu-item active']"))
	//private WebElement Dashboard;
	
	@FindBy(xpath=("//p[@class='oxd-userdropdown-name']"))
	private WebElement dropdownlogout;
	
	@FindBy(xpath=("//a[text()='Logout']"))
	private WebElement logout;
	
  public HomePage(WebDriver driver) {
		
		PageFactory.initElements( driver, this);
		
	}
    
    public void logout() {
    	//Dashboard.click();
    	
    	dropdownlogout.click();
    	
    	logout.click();
    	
    	
    }
}
