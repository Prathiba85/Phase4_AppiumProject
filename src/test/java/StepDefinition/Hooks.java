package StepDefinition;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {
	public static AndroidDriver driver;

	@Before 
	public void Setup() throws MalformedURLException  {
		URL URL = new URL("http://localhost:4723/wd/hub");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "11");
		capabilities.setCapability("appPackage", "com.amazon.mShop.android.shopping");
		capabilities.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");

		driver = new AndroidDriver(URL, capabilities);
		System.out.println("Session ID is " + driver.getSessionId());

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

	}

	
	@After
	public void teardown()
	{
		driver.quit();
	}
	
	/*
	public void teardown(Scenario scenario)
	{
		
		System.out.println("Scenario status ======>"+scenario.getStatus());
	       // if(scenario.isFailed()) {
	             byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png",scenario.getName());                       
		driver.quit();
	}*/

}
