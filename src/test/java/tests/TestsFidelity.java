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

public class TestsFidelity {
	AndroidDriver<MobileElement> driver;
	@BeforeTest
	public void setup() {

		try {

			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
			// caps.setCapability(MobileCapabilityType.UDID, "h6nzmfkbus6lys65");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
//			 caps.setCapability(MobileCapabilityType.APP,
//			 "D:\\Vijay\\Android\\Code\\appium_python_aws_device_farm-master\\android_aws_device_farm\\app\\Fedility.apk");
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

	//@Test
	public void TestOne() {
		try {
			try {
				driver.findElementById("net.sirma.impacto.B2U:id/mainCLick");
			} catch (Exception e) {
				// TODO: handle exception
			}
			Thread.sleep(10000);
			MobileElement el1 = (MobileElement) driver.findElementByAndroidUIAutomator("text(\"FIDELITY ACCOUNT HOLDERS\")");
			el1.click();
			
			MobileElement el2 = (MobileElement) driver.findElementByAndroidUIAutomator("text(\"Select Item\")");
			el2.click(); 
			
			Thread.sleep(2000);
			MobileElement el3 = (MobileElement) driver.findElementByAndroidUIAutomator("text(\"Individual\")");
			el3.click(); 

 
			MobileElement el4 = (MobileElement) driver.findElementById("com.fidelity.mobile:id/bootstrapMobileNumberField");
			Thread.sleep(2000);
			el4.sendKeys("9008066009");
			
			
			MobileElement el5 = (MobileElement) driver.findElementById("com.fidelity.mobile:id/bootstrapNewPasswordField");
			Thread.sleep(2000);
			el5.sendKeys("Sirma@123");
			
			MobileElement el6 = (MobileElement) driver.findElementById("com.fidelity.mobile:id/bootstrapRepeatPasswordField");
			Thread.sleep(2000);
			el6.sendKeys("Sirma@123");
			
			
			MobileElement el7 = (MobileElement) driver.findElementById("com.fidelity.mobile:id/user_agreement_checkbox_eula");
			Thread.sleep(2000);
			el7.click();
			
			MobileElement el8 = (MobileElement) driver.findElementById("com.fidelity.mobile:id/user_agreement_checkbox_tc");
			Thread.sleep(2000);
			el8.click();
			
			
			MobileElement el9 = (MobileElement) driver.findElementByAndroidUIAutomator("text(\"Next\")");
			el9.click(); 
			 
			
			
			Thread.sleep(10000);

		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());

			e.printStackTrace();
		}

	}

	@AfterTest
	public void teardown() {
		driver.quit();

	}
}