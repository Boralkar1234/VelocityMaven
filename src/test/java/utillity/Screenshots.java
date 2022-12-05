package utillity;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {

	
	public static void CaptureScreen(WebDriver driver,String name) throws IOException {
		
		String path =System.getProperty("user.dir")+"\\Screenshots\\"+ name +".png";
	
		
       System.out.println(path);
	
	           TakesScreenshot ts=  (TakesScreenshot)driver;
	           
	           File Sourcefile=ts.getScreenshotAs(OutputType.FILE);
	
	           File detinationfile = new File(path);
	           
	        FileHandler.copy(Sourcefile, detinationfile);
	        
	        System.out.println("Succesfully captured screenshots");
    }
      public static String CurrentDate() {
    	  
    	  DateFormat pattern = new SimpleDateFormat("yyyy-MM-dd ");
    	  Calendar cal=Calendar.getInstance();
    	  
    	  
    	  String CurrentDate =pattern.format(cal.getTime());
    	  
		return CurrentDate;
    	 	  
      }
     
    	  public static void main(String[] args) {
    		  
    		  System.out.println(CurrentDate());
    	  }
      }
