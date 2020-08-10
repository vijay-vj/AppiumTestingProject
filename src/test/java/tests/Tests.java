package tests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Tests {
	AndroidDriver<MobileElement> driver;
	
	public void setup() {

		try {

			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
			// caps.setCapability(MobileCapabilityType.UDID, "h6nzmfkbus6lys65");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
			// caps.setCapability(MobileCapabilityType.APP,
			// "C:\\Users\\Dell\\eclipse-workspaceNew\\AppiumTestingProject\\src\\test\\resources\\apps\\TuningBillAPK.apk");
			caps.setCapability("autoAcceptAlerts", "true");
			caps.setCapability("autoGrantPermissions", "true");
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver<MobileElement>(url, caps);
			// driver = new AndroidDriver<MobileElement>(url, caps);

		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());

			e.printStackTrace();
		}

	}

	
	public void TestOne() {
		try {
			try {
				driver.findElementById("net.sirma.impacto.B2U:id/mainCLick");
			} catch (Exception e) {
				// TODO: handle exception
			}
			Thread.sleep(10000);

			MobileElement el1 = (MobileElement) driver.findElementById("net.sirma.impacto.B2U:id/mainCLick");
			Thread.sleep(2000);

			el1.click();

			MobileElement el2 = (MobileElement) driver.findElementById("net.sirma.impacto.B2U:id/userMobNo");
			Thread.sleep(2000);

			el2.sendKeys("9008066009");
			Thread.sleep(2000);

			MobileElement el3 = (MobileElement) driver.findElementById("net.sirma.impacto.B2U:id/userEmail");
			Thread.sleep(2000);

			el3.sendKeys("9008066009@gmail.com");
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());

			e.printStackTrace();
		}

	}

	
	public void teardown() {
		driver.quit();

	}
}