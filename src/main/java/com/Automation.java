package com;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Automation {
	
	
	public static void main(String[] args) {
		try {
			ResourceLoader resourceLoader = null;
			DesiredCapabilities caps = new DesiredCapabilities(); 
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
			//caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
			//caps.setCapability(MobileCapabilityType.UDID, "h6nzmfkbus6lys65");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
			
			//File directory = new File("./"); 
			//System.out.println(directory.getAbsolutePath());
			//caps.setCapability(MobileCapabilityType.APP, "D:\\Vijay\\temp\\Dastavez_0.0.7.apk");
			caps.setCapability("autoAcceptAlerts","true" );
			caps.setCapability("autoGrantPermissions","true" );
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, caps); 
			WebDriverWait wait = new WebDriverWait(driver, 20);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View/android.widget.TextView")));
			Thread.sleep(4000);
			MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View/android.widget.TextView");
			el1.click();
			Thread.sleep(4000);
			MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.widget.TextView");
			el2.click();
			
			Thread.sleep(4000);
			  el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.view.View/android.view.View[1]/android.widget.TextView");
			el1.click(); 
			Thread.sleep(4000);
			MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[1]/android.widget.ImageView");
			el4.click();
			Thread.sleep(4000);
			MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.TextView");
			el6.click();
			
//			
//			MobileElement el1 = (MobileElement) driver.findElementById("net.sirma.impacto.B2U:id/mainCLick");
//			Thread.sleep(2000);
//
//			el1.click();
//
//			MobileElement el2 = (MobileElement) driver.findElementById("net.sirma.impacto.B2U:id/userMobNo");
//			Thread.sleep(2000);
//
//			el2.sendKeys("9008066009");
//			Thread.sleep(2000);
//
//			MobileElement el3 = (MobileElement) driver.findElementById("net.sirma.impacto.B2U:id/userEmail");
//			Thread.sleep(2000);
//
//			el3.sendKeys("9008066009@gmail.com");
//			Thread.sleep(2000);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}