package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class BasePage {
	public WebDriver driver;

	public BasePage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);

}

}
