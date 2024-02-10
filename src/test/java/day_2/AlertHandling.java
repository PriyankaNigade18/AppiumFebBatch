package day_2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import createTestSession.DriverSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AlertHandling {
  @Test
  public void alertTest() throws InterruptedException 
  {
	  AppiumDriver driver=DriverSession.createDriverSession();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"App\"]")).click();
	  
	  
	  //Alert Dialogs
	  driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	  
	  //to get the alert
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
	  Thread.sleep(2000);
	  
	  /*
	   * Alert interface
	   * getText()
	   * Ok--->accept()
	   * cancel--->dismiss()
	   */
	  
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert text is: "+alt1.getText());
	  alt1.accept();
	  
	  System.out.println("Alert handled!");
	  
	  
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a long message")).click();
	  
	  Thread.sleep(2000);
	  
	  Alert alt2=driver.switchTo().alert();
	  System.out.println("Text of Alert 2 is: "+alt2.getText());
	  alt2.dismiss();
	  
	  System.out.println("Alert handled using cancel!");
	  
	  
	  
	  
  }
}
