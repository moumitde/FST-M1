package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity12_1 {
	
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		
		//Create the Driver object
		WebDriver driver = new FirefoxDriver() ;
		
		//Open the page URL
		driver.get("https://www.training-support.net/selenium/iframes");
		//Get the page title
		String title = driver.getTitle();
		System.out.println("The page title is:- "+title);
		
		//Switch to the first frame
		driver.switchTo().frame(0);
		
		WebElement frame1 = driver.findElement(By.cssSelector("div.content")) ;
		String frameText = frame1.getText() ;
		System.out.println("Print text of the first frame:- "+frameText);
		
		WebElement button1 = driver.findElement(By.cssSelector("button"));
		System.out.println(button1.getText());
		System.out.println(button1.getCssValue("background-color"));
		
		//print info after clicking on the button
		button1.click();
		System.out.println(button1.getText());
		System.out.println(button1.getCssValue("background-color"));
		
		//Switch back to the parent page
		driver.switchTo().defaultContent() ;
		
		//Switch to the second frame 
		driver.switchTo().frame(1);
		
		WebElement frame2 = driver.findElement(By.cssSelector("div.content"));
		String frameText2 = frame2.getText();
		System.out.println("Print the text from the frame 2:- "+frameText2);
		
		
		WebElement button2 = driver.findElement(By.cssSelector("button"));
		System.out.println(button2.getText());
		System.out.println(button2.getCssValue("background-color"));
		
		//print info after clicking on the button
		button2.click();
		System.out.println(button2.getText());
		System.out.println(button2.getCssValue("background-color"));
		
		//Switch back to the parent page
		driver.switchTo().defaultContent() ;
		
		//close the browser
		driver.close();
		
	}
	

}
