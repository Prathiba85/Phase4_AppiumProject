package PageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage {
	public LoginPage(AndroidDriver driver) {
		super(driver);
			
	}

	//Locators
	@AndroidFindBy(id="com.amazon.mShop.android.shopping:id/btn_cancel")private List <WebElement> cancel;
	
	public void login(AndroidDriver driver)
	{
		
		List <WebElement> cancel = driver.findElements(By.id("com.amazon.mShop.android.shopping:id/btn_cancel"));
		if (cancel.size()>0) {
			

			// WebDriverWait wc = new WebDriverWait(driver, Duration.ofSeconds(10));
			// wc.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.amazon.mShop.android.shopping:id/btn_cancel")));
			driver.findElement(By.id("com.amazon.mShop.android.shopping:id/btn_cancel")).click();
			
		}
		else
		{
			
		List <WebElement> skip_signin = driver.findElements(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button"));
		
		
		if (skip_signin.size()>0)
		{
			driver.findElement(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button")).click();

		}
		List <WebElement> secondskip_signin = driver.findElements(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button"));
		if (secondskip_signin.size()>0)
		{
			driver.findElement(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button")).click();

		}
		
		}
		
	}
}
