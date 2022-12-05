package tests;

import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utillity.PropReader;

public class BaseTest {
	
	public static  WebDriver driver;
	
	@BeforeSuite
	public void lauchbrowser() throws FileNotFoundException {
		
		//initlization of instance
		 driver= new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		//step-3 open webpage
		driver.get(PropReader.ReadProperty("URL"));
	
		//step-4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		
	}
	@AfterSuite
	public void teardown() {
     driver.close();
	}

	

}
