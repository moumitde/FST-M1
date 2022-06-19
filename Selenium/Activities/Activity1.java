package seleniumActivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity1 
{
	
	public static void main(String[] args) 
	{
		  WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
           WebDriver driver = new FirefoxDriver();
          
				
	    // Open the browser
	       driver.get("https://www.training-support.net");
				
	    // Close the browser
	       driver.close();
	 }

	}


