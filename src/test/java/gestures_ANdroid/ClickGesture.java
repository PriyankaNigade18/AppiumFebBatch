package gestures_ANdroid;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import createTestSession.DriverSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ClickGesture {
  @Test
  public void clickTEst()
  {
	  AppiumDriver driver=DriverSession.createDriverSession();
	  
	 // driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	 WebElement ele=driver.findElement(AppiumBy.accessibilityId("Views"));
	 
	 driver.executeScript("mobile:clickGesture",ImmutableMap.of(
			 "elementId",((RemoteWebElement)ele).getId()));
	  
	  System.out.println("Clicked on Views with Mobile ClickGuesture!");
	  
	  
	  
  }
}
