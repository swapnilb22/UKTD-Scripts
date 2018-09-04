package POM;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import pom_practise.Login;
import scripts.resources.ExcelUtils;

public class TestAuthentication {
	
	@Test
	public void verifyAuthentication() throws Exception
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("http://88.208.208.58:1033/public/app/#");
	
		driver.manage().window().maximize();
		
		Login_Page TestLogin = PageFactory.initElements(driver,Login_Page.class);
		

		TestLogin.authentication("swapnilbhaskar@benchmarkitsolutions.com", "12345678");	
		
		Open_Application OpenAPP = PageFactory.initElements(driver,Open_Application.class);
		OpenAPP.acceptGDPR();
		//OpenAPP.AddApplicant();
		
		assertEquals(driver.getTitle(),"UktenantData");
		
	}
}