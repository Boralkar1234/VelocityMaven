package tests;

import java.io.FileNotFoundException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import utillity.PropReader;


public class Logintest extends BaseTest {

	
	public LoginPage lp; 
	
	public void initObject() {
		
		lp= new LoginPage(driver);
	}
	
	@BeforeClass
	public void init() {
		
			//step-5  creating object
			initObject();
			
	}
	
	@Test
	public void Login() throws InterruptedException, FileNotFoundException {
		
		//step-1 enter cred
		lp.entercread(PropReader.ReadProperty("username"), PropReader.ReadProperty("password"));
		System.out.println("user name & password entered successfully");
		
		//step-2
		lp.loginbutton();
		Thread.sleep(3000);
		System.out.println("Successfully click on loginbutton");
		
	}
	
	
	}
	


