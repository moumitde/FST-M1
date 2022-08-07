import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumProject {
    // Declare Android driver
	 AppiumDriver<MobileElement> driver;
	 WebDriverWait wait;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "PixelEmulator");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
    }

    @Test
    public void AddTask() throws InterruptedException {
        // Using resource-id
    	Thread.sleep(10000);
    	MobileElement task = driver.findElementByAccessibilityId("Create new task");
    	task.click();
    	Thread.sleep(6000);
        //wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title")));
        Thread.sleep(3000);
        MobileElement CreateTask = driver.findElementById("add_task_title");
        CreateTask.sendKeys("Complete Activity with Google Tasks");
        Thread.sleep(5000);
        MobileElement Save = driver.findElementById("add_task_done");
        Save.click();
        Thread.sleep(3000);
        String Task1 = driver.findElementById("task_name").getText();
        Thread.sleep(3000);
        Assert.assertEquals(Task1,"Complete Activity with Google Tasks");
        
        //2nd Task
        task.click();
        Thread.sleep(3000);
        driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Keep");
        Save.click();
        String Task2 = driver.findElementById("task_name").getText();
        Assert.assertEquals(Task2,"Complete Activity with Google Keep");
        //3rd task
        task.click();
        Thread.sleep(3000);
        driver.findElementById("add_task_title").sendKeys("Complete the second Activity Google Keep");
        Save.click();
        String Task3 = driver.findElementById("task_name").getText();
        Assert.assertEquals(Task3,"Complete the second Activity Google Keep");
    }

    @AfterClass
    public void tearDown() {
        // Close app
        driver.quit();
    }
}