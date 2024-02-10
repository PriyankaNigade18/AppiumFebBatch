package createTestSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CreateSession {
  @Test
  public void createDriverSession() throws MalformedURLException
  {
	  //set up all the capabilities
	  
	  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setCapability("platformName", "Android");
	  cap.setCapability("appium:automationName", "UIAutomator2");
	  cap.setCapability("deviceName","pixel_6");
	  cap.setCapability("udid","emulator-5554");
	  
	  //application path
	  String path=System.getProperty("user.dir")+"/src/test/resources/ApiDemos-debug.apk";
	  cap.setCapability("appium:app",path);
	  
	  //server details
	  
	  URL url=new URL("http://0.0.0.0:4723");
	  	  
	  //to create driver session
	  AppiumDriver driver=new AndroidDriver(url,cap);
	  System.out.println("Session id is: "+driver.getSessionId());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
