package seleniumActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity11_3 {

    public static void main(String[] args) throws InterruptedException {
    	WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        //Open browser
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        //Print title of page and heading on page
        System.out.println("Page title is: " + driver.getTitle());

        //Click on the prompt button
        driver.findElement(By.cssSelector("button#prompt")).click();
         
        //switch to the alert 
        Alert alert = driver.switchTo().alert() ;
        
        String text = alert.getText();
        System.out.println("Print the text in the alert:- "+text);
        
        //send text to the alert
        alert.sendKeys("Yes, you are!!");
        
        //click on the 'ok' button and close the alert
        alert.accept();
        
        //Close the Browser
        driver.close();
    }
}
