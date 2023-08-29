package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {
	public  AndroidDriver driver;

	public BasePage(AndroidDriver driver) {
		this.driver=driver;
	
	//	PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
		
		PageFactory.initElements(driver,this);

}

}
