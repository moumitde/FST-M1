

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumProject 
{
	WebDriver driver ;
	@SuppressWarnings("deprecation")
	public void openURL()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://alchemy.hguy.co/crm");
		driver.manage().window().maximize() ;
	}
	
	public void login()
	{
		WebElement username = null;
		WebElement password = null;
		WebElement loginButton = null;
		try {
			username = driver.findElement(By.id("user_name")); 
			password = driver.findElement(By.id("username_password"));
			loginButton = driver.findElement(By.id("bigbutton"));
		} catch (NoSuchElementException e) {
              System.out.println("Element is not found ");
		}
		catch(Exception e)
		{
			
		}
		
		username.sendKeys("admin");
		password.sendKeys("pa$$w0rd");
		loginButton.click();
		try {
			Thread.sleep(15);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	@Test
	public void Activity1()
	{
		//Open a Browser and navigate to the given URL
		openURL();
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "SuiteCRM") ;
		driver.close();
		
	}
	
	@Test
	public void Activity2()
	{
		openURL();
		WebElement image = driver.findElement(By.xpath("//div[@class='companylogo']//img"));
		String imageURL = image.getAttribute("src");
		System.out.println("Printing the image URL: "+imageURL);
		driver.close();
	}
	
	@Test
	public void Activity3()
	{
		openURL();
		WebElement element =driver.findElement(By.xpath("//a[text()='© Supercharged by SuiteCRM']"));
		String footerText = element.getText();
		System.out.println(footerText);
		driver.close();
	}
	
	@Test
	public void Activity4() throws InterruptedException
	{
		openURL();
		WebElement username = null;
		WebElement password = null;
		WebElement loginButton = null;
		try {
			username = driver.findElement(By.id("user_name")); 
			password = driver.findElement(By.id("username_password"));
			loginButton = driver.findElement(By.id("bigbutton"));
		} catch (NoSuchElementException e) {
              System.out.println("Element is not found ");
		}
		catch(Exception e)
		{
			System.out.println("Exception Occurred");
		}
		
		username.sendKeys("admin");
		password.sendKeys("pa$$w0rd");
		loginButton.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement searchButton = null ;
		try {
		searchButton = driver.findElement(By.xpath("//div[@class='tablet-bar']//button[@id='searchbutton']"));
		}
		catch(NoSuchElementException e)
		{
			System.out.println("No such element present");
		}
		catch(Exception e)
		{
			System.out.println("Element is throwing an exception");
		}
		//Checking if search button is present , to verify that the Homepage is opened
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='tablet-bar']//button[@id='searchbutton']")));
		driver.close();
	}
	
	@Test
	public void Activity5()
	{
		openURL();
		login() ;
		WebElement navigationBar = driver.findElement(By.xpath("//div[@class='desktop-toolbar']"));
		String color = navigationBar.getCssValue("color");
		System.out.println("Color of the Navigation Bar is: "+color);
		driver.close();
		
	}
	
	@Test
	public void Activity6()
	{
		openURL();
		login() ;
		WebElement navigationBar = driver.findElement(By.xpath("//div[@class='desktop-toolbar']"));
		WebElement activitiesLink = navigationBar.findElement(By.xpath("//a[text()='Activities']"));
		System.out.println("Activities menu item is displayed: "+activitiesLink.isDisplayed());
		driver.close();
	}
	
	@Test
	public void Activity7() throws InterruptedException
	{
		openURL();
		login() ;
		Thread.sleep(20);
		WebElement salesTab= null;
		WebElement leads = null ;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		try {
			salesTab = driver.findElement(By.xpath("//div[@class='desktop-toolbar']//a[text()='Sales']"));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception Occurred");
		}
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='desktop-toolbar']//a[text()='Sales']")));
		
		//Hover over the menu option -Sales 
		Actions action = new Actions(driver);
		action.moveToElement(salesTab).perform();
		
		try {
			leads = driver.findElement(By.xpath("//a[text()='Sales']/..//li/a[text()='Leads']"));
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.out.println("No such element exists for Leads");
		}
		catch(Exception e)
		{
			System.out.println("Exception occurred when accessing Leads tab");
		}
		
		//Click on the Leads sub-menu option
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		js.executeScript("arguments[0].click();", leads);
		
		WebElement additionalInfo = driver.findElement(By.xpath("//span[@title='Additional Details']"));
		//click on the additional Info button
		additionalInfo.click() ;
		WebElement widgetPhoneNo = driver.findElement(By.xpath("//div[contains(@class,'ui-widget-content')]//span[@class='phone']"));
		System.out.println("Print the phone number from the widget: "+widgetPhoneNo.getText()) ;
		driver.close();
	
	}
	
	
	@Test
	public void Activity8()
	{
		openURL();
		login() ;
		WebElement salesTab = driver.findElement(By.xpath("//a[text()='Sales']"));
		WebElement accountsTab = driver.findElement(By.xpath("//a[text()='Sales']/..//li/a[text()='Accounts']"));
		
		//Hover over the Sales Menu Option
		Actions action = new Actions(driver);
		action.moveToElement(salesTab).build().perform() ;
		
		//Click on the Accounts sub-menu option
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		js.executeScript("arguments[0].click();", accountsTab);
		
		List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='list view table-responsive']//tr"));
		
		System.out.println("Printing the names of the First 5 row values:- ");
		for(int i=0 ; i<10 ; i++)
		{
			if(tableRows.get(i).getAttribute("class").contains("odd"))
			{
				WebElement elementData = tableRows.get(i).findElement(By.xpath("./td[3]"));
				System.out.println(elementData.getText());
			}
		}
		driver.close();
	}
	
	@Test
	public void Activity9() throws Exception
	{
		openURL();
		login() ;
		Thread.sleep(20);
		WebElement salesTab= null;
		WebElement leads = null ;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		try {
			salesTab = driver.findElement(By.xpath("//div[@class='desktop-toolbar']//a[text()='Sales']"));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception Occurred");
		}
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='desktop-toolbar']//a[text()='Sales']")));
		
		//Hover over the menu option -Sales 
		Actions action = new Actions(driver);
		action.moveToElement(salesTab).perform();
		
		try {
			leads = driver.findElement(By.xpath("//a[text()='Sales']/..//li/a[text()='Leads']"));
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.out.println("No such element exists for Leads");
		}
		catch(Exception e)
		{
			System.out.println("Exception occurred when accessing Leads tab");
		}
		
		//Click on the Leads sub-menu option
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		js.executeScript("arguments[0].click();", leads);
		Thread.sleep(20);
		List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='list view table-responsive']//tbody//tr"));
		
		
		List<String> names = new ArrayList<String>() ;
		List<String> users = new ArrayList<String>() ;
		
		for(int i=1 ; i<=10 ; i++)
		{
			WebElement elementNames = tableRows.get(i).findElement(By.xpath("./td[3]"));
			names.add(elementNames.getText());
			System.out.println(elementNames.getText());
			
			WebElement elementUsers = tableRows.get(i).findElement(By.xpath("./td[8]"));
			users.add(elementUsers.getText());
			System.out.println(elementUsers.getText());
			
		}
		
		System.out.println("Printing the List of names:- "+names);
		System.out.println("Printing the list of users:- "+users);
		
	}

}
