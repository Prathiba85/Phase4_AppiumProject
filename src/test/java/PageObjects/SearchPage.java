package PageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class SearchPage extends BasePage {

	public SearchPage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickSearch(AndroidDriver driver, String productname) {
		List <WebElement> skip_signin = driver.findElements(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button"));
		if (skip_signin.size()>0)
		{
			driver.findElement(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button")).click();

		}

		driver.findElement(By.id("com.amazon.mShop.android.shopping:id/chrome_search_hint_view")).click();
		WebDriverWait wc = new WebDriverWait(driver, Duration.ofSeconds(10));
		wc.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.amazon.mShop.android.shopping:id/rs_search_src_text")));
		WebElement search = driver.findElement(By.id("com.amazon.mShop.android.shopping:id/rs_search_src_text"));
				search.sendKeys(productname);
		//driver.findElement(By.id("com.amazon.mShop.android.shopping:id/rs_search_src_text")).click();
		Actions keyboard = new Actions(driver);
		keyboard.keyDown(search,Keys.ENTER).build().perform();
		driver.hideKeyboard();

	}
	
}
