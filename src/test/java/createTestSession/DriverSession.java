package createTestSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DriverSession
{
	public static AppiumDriver driver;

public static AppiumDriver createDriverSession()
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		  cap.setCapability("platformName", "Android");
		  cap.setCapability("appium:automationName", "UIAutomator2");
		  cap.setCapability("deviceName","pixel_6");
		  cap.setCapability("udid","emulator-5554");
		  
		  //application path
		  String path=System.getProperty("user.dir")+"/src/test/resources/ApiDemos-debug.apk";
		  cap.setCapability("appium:app",path);
		  
		  //server details
		  
		 
		  URL url;
		try {
			url = new URL("http://0.0.0.0:4723");
			driver=new AndroidDriver(url,cap);
			 //System.out.println("Session id is: "+driver.getSessionId());
			  
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  	  
		return driver;
//		  //to create driver session
//		  AppiumDriver driver=new AndroidDriver(url,cap);
//		  System.out.println("Session id is: "+driver.getSessionId());
		  
	}

}
