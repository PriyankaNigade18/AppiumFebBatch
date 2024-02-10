package day_2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import createTestSession.DriverSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LocatorDemo {
  @Test
  public void LocatorTest() throws InterruptedException
  {
	 AppiumDriver driver= DriverSession.createDriverSession();
	 System.out.println("Session id is: "+driver.getSessionId());
	 
	 
	 //locator -accessibility id
	 
	 WebElement ele1=driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	System.out.println("Text of mobileElement is: "+ele1.getText());
	ele1.click();
	 
	//Accessibility Service
	 //driver.findElement(AppiumBy.accessibilityId("Accessibility Service")).click();
	 //resource-id (id locator)
	WebElement ele2=driver.findElements(AppiumBy.id("android:id/text1")).get(2);
	 System.out.println("Text of element2 is: "+ele2.getText());
	 ele2.click();
	 
	 //come back to previous screen
	 driver.navigate().back();
	 Thread.sleep(2000);
	 
	 driver.navigate().back();
	 
	 
	 //app xpath locator
	 
	 driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"App\"]")).click();
	 
	 driver.navigate().back();
	 
	 
	 //app -className
	 
	 driver.findElements(AppiumBy.className("android.widget.TextView")).get(4).click();
	 
	 
	 
	 
  }
}
