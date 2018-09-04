package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Open_Application {
WebDriver driver;
	
	public Open_Application(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy (xpath = "//*[@id='gdprCompliance']/div/div/div[3]/button")
	WebElement closeButton;
	
	@FindBy (xpath = "//*[@id='store254244']/div[1]/div[7]/ul/li[4]/a/span")
	WebElement AddButton;
	
	@FindBy (xpath ="//*[@id='addApplicants']/div/div/div[2]/button[1]")
	WebElement AddApplicant;
	
	@FindBy (xpath = "//*[@id='addApplicants']/div/div/div[2]/button[2]")
	WebElement AddGuarantor;
	
	@FindBy (xpath = "//*[@id='addApplicants']/div/div/div[2]/button[3]")
	WebElement AddPO;
	
	@FindBy (xpath = "//div[@class='sidebar-nav']")
	WebElement SideMenu;
	
	@FindBy (xpath = "html/body/section/div/div/ul/li[2]/ul/li[1]/a")
	WebElement NewApplication;
	
	
	//Create New Application
	public void newApplication() {
		WebDriverWait wait = new WebDriverWait(driver, 40);	
		wait.until(ExpectedConditions.visibilityOf(SideMenu));
		SideMenu.click();
		wait.until(ExpectedConditions.visibilityOf(NewApplication));
		NewApplication.click();
	}
	
	
	public void acceptGDPR() {
		WebDriverWait wait = new WebDriverWait(driver, 300);	
		try {
		//wait.until(ExpectedConditions.visibilityOf(closeButton));
		
		closeButton.sendKeys(Keys.RETURN);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
		
	//Add Applicant
	public void AddApplicant() {
		WebDriverWait wait = new WebDriverWait(driver, 300);	
		wait.until(ExpectedConditions.visibilityOf(AddButton));
		AddButton.click();
	
		wait.until(ExpectedConditions.visibilityOf(AddApplicant));
		
		AddApplicant.click();//sendKeys(Keys.RETURN);
	}
	
	//Add Guarantor
	public void AddGuarantor() {
		WebDriverWait wait = new WebDriverWait(driver, 300);	
		wait.until(ExpectedConditions.visibilityOf(AddButton));
		AddButton.click();
	
		wait.until(ExpectedConditions.visibilityOf(AddGuarantor));
		
		AddGuarantor.click();//sendKeys(Keys.RETURN);
	}


}

