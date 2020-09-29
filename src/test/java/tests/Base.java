package tests;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {	

	protected AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup()
	{
		try {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel3API28");
			caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);		
			caps.setCapability(MobileCapabilityType.BROWSER_NAME, "CHROME");
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			
			driver = new AppiumDriver<MobileElement>(url,caps);
		}
		catch(Exception ex)
		{
			System.out.println("Cause of exception is : " + ex.getCause());
			System.out.println("Message from exception is : " + ex.getMessage());
			ex.printStackTrace();			
		}		
	}
		
	@AfterTest
	public void tearDown()
	{
		driver.quit();		
	}
}
