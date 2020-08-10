package tests;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TestsFidelityWeb {
	
//	AndroidDriver <MobileElement> driver; 
//       @Test
//    public void testAppiumProSite_Android() throws MalformedURLException, InterruptedException {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("platformName", "android");
//        //capabilities.setCapability("platformVersion", "9");
//        
//        capabilities.setCapability("browserName", "Chrome");
//        capabilities.setCapability("automationName", "UiAutomator2");
//        //capabilities.setCapability("chromedriverExecutable","D:\\Vijay\\AWS\\geckodriver-v0.26.0-win64\\chromedriver.exe");
//        driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
//        
//        // Open up Chrome
//        actualTest();
//    }
//
//    public void actualTest() throws InterruptedException {
//		try {
//		driver.manage().deleteAllCookies();
//		//driver.manage().window().maximize();
//
//		driver.navigate().to("https://dpfbgltest01.fidelitybank.com.gh:7095/WebPortal/");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//
//		 
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		// Eligibility Page
////		driver.findElement(By.xpath("//*[@id=\"getStartedDiv\"]/div/div[2]/img")).click();
////		Thread.sleep(5000);
////		driver.findElement(By.xpath("//*[@id=\"optRadioYes\"]")).click();
////		Select idType = new Select(driver.findElement(By.xpath("//*[@id=\"idType\"]")));
////		idType.selectByVisibleText("STUDENT ID");
////		driver.findElement(By.xpath("//*[@id=\"idNumber\"]")).sendKeys("OK");
////		driver.findElement(By.xpath("//*[@id=\"nextIndex\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"dobOfCustomer\"]")).sendKeys("01011993");
////		driver.findElement(By.xpath("//*[@id=\"nextIndex\"]")).click();
////		Thread.sleep(5000);
////		
//		//driver.navigate().to("https://dpfbgl101.myfidelitybank.net:7095/WebPortal/");
//		// Get Started Screen 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"getStartedDiv\"]/div/div[2]/img")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		driver.findElement(By.xpath("//*[@id=\"getStartedDiv\"]/div/div[2]/img")).click();
//		
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"optRadioYes\"]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		Random r = new Random();
//		int rand = (int)( r. nextInt((99 - 10) + 1) + 10);
//
//		driver.findElement(By.xpath("//*[@id=\"optRadioYes\"]")).click();
//		Select idType = new Select(driver.findElement(By.xpath("//*[@id=\"idType\"]")));
//		idType.selectByVisibleText("STUDENT ID");
//		driver.findElement(By.xpath("//*[@id=\"idNumber\"]")).sendKeys("IICARDTES"+rand+rand + ""+r.nextInt());
//		driver.findElement(By.xpath("//*[@id=\"nextIndex\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"dobOfCustomer\"]")).sendKeys("01011993");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"nextIndex\"]")).click();
//		 
//		 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nationalIdYes\"]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		
//		// Auth Screen 
//		try {
//		js.executeScript("document.getElementById(\"otherNonCaptchaDiv\").setAttribute(\"style\", \"display:block\");");
//		
//		js.executeScript("document.querySelector(\"#messagedivSuccess\").setAttribute(\"style\", \"display:block\");");
//		js.executeScript("document.querySelector(\"#ghanaNationality\").setAttribute(\"style\", \"display:block\");");
//		js.executeScript("document.querySelector(\"#nextButton\").removeAttribute(\"disabled\");");
//		js.executeScript("window.scrollBy(0,1000)");
//		 
//		}catch (Exception e) {
//			// TODO: handle exception
//		}
//		
//		driver.findElement(By.xpath("//*[@id=\"inputMobileNumber\"]")).sendKeys("1234667"+rand);
//		driver.findElement(By.xpath("//*[@id=\"inputEmailId\"]")).sendKeys("test1"+ rand+"@gmail.com");
//		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
//
//		driver.findElement(By.xpath("//*[@id=\"nationalIdYes\"]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nextButton\"]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		driver.findElement(By.xpath("//*[@id=\"nextButton\"]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[4]/div/div/div[2]/button[2]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		driver.findElement(By.xpath("//*[@id=\"top\"]/div[4]/div/div/div[2]/button[2]")).click();
//		// Doc Upload Screen 
//		try {
//			
//			idType = new Select(driver.findElement(By.xpath("//*[@id=\"nearestBranch\"]")));
//			idType.selectByValue("012");
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[4]/div/div/div[2]/button[2]")));
//			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//			
//			
//			driver.findElement(By.xpath("//*[@id=\"top\"]/div[4]/div/div/div[2]/button[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"savingAccountDiv\"]/h3")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"StudentAccount\"]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		
//		driver.findElement(By.xpath("//*[@id=\"StudentAccount\"]")).click();
//		Thread.sleep(2000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"studentCheckbox0\"]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		
//		driver.findElement(By.xpath("//*[@id=\"studentCheckbox0\"]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"VerifyOTP\"]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		
//		driver.findElement(By.xpath("//*[@id=\"VerifyOTP\"]")).click();
//		//driver.findElement(By.xpath("//*[@id=\"top\"]/div[5]/div/div/div[2]/button")).click();
//		
//		//Thread.sleep(5000);
////		// ID's Upload Page 
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		 
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"uploadDocType\"]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		
//		idType = new Select(driver.findElement(By.xpath("//*[@id=\"uploadDocType\"]")));
//		idType.selectByVisibleText("Utility Bill in your name (not more than 3 months old)");
//		
//		idType = new Select(driver.findElement(By.xpath("//*[@id=\"uploadStuDocType\"]")));
//		idType.selectByValue("Introduction Letter from Head of Institution (if Student ID is being used for account opening)");
//		 
//		js.executeScript("document.getElementById(\"IdProofExtension\").setAttribute(\"value\", \"Y\");");
//		js.executeScript("document.getElementById(\"isPhotographUploaded\").setAttribute(\"value\", \"Y\");");
//		js.executeScript("document.getElementById(\"isIdProofUploaded\").setAttribute(\"value\", \"Y\");");
//		js.executeScript("document.getElementById(\"IdProofBackExtension\").setAttribute(\"value\", \"Y\");");
//		js.executeScript("document.getElementById(\"isIdProofBackUploaded\").setAttribute(\"value\", \"Y\");");
//		js.executeScript("document.getElementById(\"rejectDocFlag\").setAttribute(\"value\", \"Y\");");
//		js.executeScript("document.getElementById(\"DocSigHoldExtension\").setAttribute(\"value\", \"Y\");");
//		js.executeScript("document.getElementById(\"isDocSigHoldUploaded\").setAttribute(\"value\", \"Y\");");
//		js.executeScript("document.getElementById(\"SelfieExtension\").setAttribute(\"value\", \"Y\");");
//		js.executeScript("document.getElementById(\"isSelfieUploaded\").setAttribute(\"value\", \"Y\");");
//		js.executeScript("document.getElementById(\"isSignatureUploaded\").setAttribute(\"value\", \"Y\");");
//		js.executeScript("document.getElementById(\"isResDocUploaded\").setAttribute(\"value\", \"Y\");");
//		js.executeScript("document.getElementById(\"isStuDocUploaded\").setAttribute(\"value\", \"Y\");"); 
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"VerifyOTP\"]")).click();
//
//		// Data Entry 
// 		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"titleMr\"]")));
// 		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		
//		driver.findElement(By.xpath("//*[@id=\"titleMr\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Mike");
//		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Rachel");
//		driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("01011991");
//		driver.findElement(By.xpath("//*[@id=\"pob\"]")).sendKeys("ACCRA");
//		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
//		driver.findElement(By.xpath("//*[@id=\"moreFields1\"]")).click();
// 		// Second Page 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"issueDateIdProof\"]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		
//		driver.findElement(By.xpath("//*[@id=\"issueDateIdProof\"]")).sendKeys("01011996");
//		driver.findElement(By.xpath("//*[@id=\"expiryDateIdProof\"]")).sendKeys("01012023");
//		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
//		driver.findElement(By.xpath("//*[@id=\"moreFields2\"]")).click();
// 		// Third Page 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"addressType\"]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		
//		idType = new Select(driver.findElement(By.xpath("//*[@id=\"addressType\"]")));
//		idType.selectByValue("Self Owned");
//		driver.findElement(By.xpath("/html/body/form[3]/section/div/div[3]/div/div[5]/div[3]/div[1]/input")).sendKeys("BakerStreets");
//		driver.findElement(By.xpath("/html/body/form[3]/section/div/div[3]/div/div[5]/div[3]/div[2]/input")).sendKeys("Whitefield");
//		driver.findElement(By.xpath("//*[@id=\"resCity\"]")).sendKeys("ACCRA");
//		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
//		driver.findElement(By.xpath("//*[@id=\"moreFields3\"]")).click();
// 		// Forth Page
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"comAddress1\"]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		
//		driver.findElement(By.xpath("//*[@id=\"comAddress1\"]")).sendKeys("White");
//		driver.findElement(By.xpath("//*[@id=\"comAddress3\"]")).sendKeys("Field, Accra");
//		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Accra");
//		//driver.findElement(By.xpath("//*[@id=\"moreFields1\"]")).click();
//		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
//		WebElement Element = driver.findElement(By.xpath("//*[@id=\"VerifyOTP\"]"));
//		js.executeScript("arguments[0].scrollIntoView();", Element);
//		
//		driver.findElement(By.xpath("//*[@id=\"VerifyOTP\"]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"maritalStatus\"]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		
//		// Fifth Page 
//		 
//		idType = new Select(driver.findElement(By.xpath("//*[@id=\"maritalStatus\"]")));
//		idType.selectByValue("Single");
//		Element = driver.findElement(By.xpath("//*[@id=\"moreFieldsFamily\"]"));
//		js.executeScript("arguments[0].scrollIntoView();", Element);
//		
//		driver.findElement(By.xpath("//*[@id=\"moreFieldsFamily\"]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"homeTown\"]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		
//				// Sixth Page		
//		driver.findElement(By.xpath("//*[@id=\"homeTown\"]")).sendKeys("NA");
//		driver.findElement(By.xpath("//*[@id=\"tin\"]")).sendKeys("NA");
//		driver.findElement(By.xpath("//*[@id=\"motherMaidenName\"]")).sendKeys("NA");
//		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
//		
//		Element = driver.findElement(By.xpath("//*[@id=\"moreFieldsFamily1\"]"));
//		js.executeScript("arguments[0].scrollIntoView();", Element);
//		
//		driver.findElement(By.xpath("//*[@id=\"moreFieldsFamily1\"]")).click();
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"kin\"]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		
//		// Seventh Page		
//		driver.findElement(By.xpath("//*[@id=\"kin\"]")).sendKeys("NA");
//		driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("01012000");
//		idType = new Select(driver.findElement(By.xpath("//*[@id=\"relationship\"]")));
//		idType.selectByValue("Mother");
//		
//		driver.findElement(By.xpath("/html/body/form[4]/section/div/div[4]/div[1]/div[5]/div[3]/div[3]/div[2]/input")).sendKeys("123456789");
//		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
//		driver.findElement(By.xpath("/html/body/form[4]/section/div/div[4]/div[1]/div[6]/img[2]")).click();
//		  
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"kinAddressSame\"]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		//Thread.sleep(10000);
//		//driver.findElement(By.xpath("//*[@id=\"moreFields1\"]")).click();
//		// Eighth page 
//		//driver.findElement(By.xpath("//*[@id=\"kinAddressSame\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"resAddress1\"]")).sendKeys("BakersStreet");
//		driver.findElement(By.xpath("//*[@id=\"resAddress2\"]")).sendKeys("White");
//		driver.findElement(By.xpath("//*[@id=\"kinCity\"]")).sendKeys("Bangalore");
//		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
//		//Thread.sleep(10000);
//			driver.findElement(By.xpath("//*[@id=\"VerifyOTP\"]")).click();
//		//Thread.sleep(10000);
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]"))); 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"lessFields1\"]")));
//		// Ninth Occupation 
//		 Element = driver.findElement(By.xpath("//*[@id=\"lessFields1\"]"));
//
//		// This will scroll the page Horizontally till the element is found
//		js.executeScript("arguments[0].scrollIntoView();", Element);      
//	
//		driver.findElement(By.xpath("//*[@id=\"lessFields1\"]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"arrowForDivEmployment1\"]/img[2]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		
//		Element = driver.findElement(By.xpath("//*[@id=\"arrowForDivEmployment1\"]/img[2]"));
//		js.executeScript("arguments[0].scrollIntoView();", Element);
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"arrowForDivEmployment1\"]/img[2]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"arrowForDivEmployment2\"]/img[2]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		// Employer Details 
//		Element = driver.findElement(By.xpath("//*[@id=\"arrowForDivEmployment2\"]/img[2]"));
//		js.executeScript("arguments[0].scrollIntoView();", Element);
//		
//		driver.findElement(By.xpath("//*[@id=\"arrowForDivEmployment2\"]/img[2]")).click();
//		Element = driver.findElement(By.xpath("//*[@id=\"nextEmploymentDetails\"]"));
//		js.executeScript("arguments[0].scrollIntoView();", Element);
//		
//		driver.findElement(By.xpath("//*[@id=\"nextEmploymentDetails\"]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"operationPurpose\"]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		// Purpose 
//		idType = new Select(driver.findElement(By.xpath("//*[@id=\"operationPurpose\"]")));
//		idType.selectByValue("Personal Savings");
//		idType = new Select(driver.findElement(By.xpath("//*[@id=\"sourceofFunds\"]")));
//		idType.selectByValue("Savings");
//		Element = driver.findElement(By.xpath("//*[@id=\"moreFields1\"]"));
//		js.executeScript("arguments[0].scrollIntoView();", Element);
//		
//		driver.findElement(By.xpath("//*[@id=\"moreFields1\"]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"transactionTypeDep\"]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		// cd
//		idType = new Select(driver.findElement(By.xpath("//*[@id=\"transactionTypeDep\"]")));
//		idType.selectByValue("Cash");
//		idType = new Select(driver.findElement(By.xpath("//*[@id=\"amountDep\"]")));
//		idType.selectByValue("0-5K");
//		idType = new Select(driver.findElement(By.xpath("//*[@id=\"expectedMonthlyTransactionDep\"]")));
//		idType.selectByValue("0-10");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"transactionTypeWd\"]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		// CW 
//		idType = new Select(driver.findElement(By.xpath("//*[@id=\"transactionTypeWd\"]")));
//		idType.selectByValue("Cash");
//		idType = new Select(driver.findElement(By.xpath("//*[@id=\"amountWd\"]")));
//		idType.selectByValue("0-5K");
//		idType = new Select(driver.findElement(By.xpath("//*[@id=\"expectedMonthlyTransactionWd\"]")));
//		idType.selectByValue("0-10");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"reasonForTransfer\"]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		driver.findElement(By.xpath("//*[@id=\"reasonForTransfer\"]")).sendKeys("Savings");
//		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
//		Element = driver.findElement(By.xpath("//*[@id=\"nextTransactionalDetails\"]"));
//		js.executeScript("arguments[0].scrollIntoView();", Element);
//		
//		driver.findElement(By.xpath("//*[@id=\"nextTransactionalDetails\"]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"usCitizenNo\"]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		// FATCA
//		
//		driver.findElement(By.xpath("//*[@id=\"usCitizenNo\"]")).click();
//		Element = driver.findElement(By.xpath("//*[@id=\"usResidentNo\"]"));
//		js.executeScript("arguments[0].scrollIntoView();", Element);
//		
//		driver.findElement(By.xpath("//*[@id=\"usResidentNo\"]")).click();
//		Element = driver.findElement(By.xpath("//*[@id=\"usResidentCardNo\"]"));
//		js.executeScript("arguments[0].scrollIntoView();", Element);
//		
//		driver.findElement(By.xpath("//*[@id=\"usResidentCardNo\"]")).click();
//		Element = driver.findElement(By.xpath("/html/body/form[4]/section/div/div[5]/div/div/div/div[3]/button"));
//		js.executeScript("arguments[0].scrollIntoView();", Element);
//		
//		driver.findElement(By.xpath("/html/body/form[4]/section/div/div[5]/div/div/div/div[3]/button")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"status\"]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		// Status 
//		idType = new Select(driver.findElement(By.xpath("//*[@id=\"status\"]")));
//		idType.selectByValue("13");
//		Element = driver.findElement(By.xpath("//*[@id=\"relatePersonNo\"]"));
//		js.executeScript("arguments[0].scrollIntoView();", Element);
//	
//		driver.findElement(By.xpath("//*[@id=\"relatePersonNo\"]")).click();
//	
//		Element = driver.findElement(By.xpath("//*[@id=\"VerifyOTP\"]"));
//		js.executeScript("arguments[0].scrollIntoView();", Element);
//	
//		driver.findElement(By.xpath("//*[@id=\"VerifyOTP\"]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tncCheckbox\"]")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/div[1]")));
//		// Ack 
//		Element = driver.findElement(By.xpath("//*[@id=\"tncCheckbox\"]"));
//		js.executeScript("arguments[0].scrollIntoView();", Element);
//	
//		driver.findElement(By.xpath("//*[@id=\"tncCheckbox\"]")).click();
//		Element = driver.findElement(By.xpath("//*[@id=\"selfInit\"]"));
//		js.executeScript("arguments[0].scrollIntoView();", Element);
//	
//		driver.findElement(By.xpath("//*[@id=\"selfInit\"]")).click();
//		idType = new Select(driver.findElement(By.xpath("//*[@id=\"modeOfApplication\"]")));
//		idType.selectByValue("Website");
//		Thread.sleep(5000);
////		driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div/div/div[5]/div/button")).click();
////		Thread.sleep(5000);
////		driver.findElement(By.xpath("//*[@id=\"VerifyOTP\"]")).click();
////		Thread.sleep(2000);
////        element.sendKeys(searchKey);
////        System.out.println("submit");
////        element.submit();
////	        
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//    @AfterTest
//	public void teardown() {
//		driver.quit();
//
//	}
//	
	
}