package pageObjectclassTwoapproach;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginpageApproach2 {
WebDriver driver;
	//constructor
	public loginpageApproach2(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Webelements 
	//@FindBy(xpath = "//img[@alt='company-branding']") WebElement img_logo_loc;
	
	@FindBy(how=How.XPATH,using="//img[@alt='company-branding']") WebElement img_logo_loc;

	
	@FindBy(name="username") WebElement username_txt_loc;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']") WebElement submit_click_loc;
	
	@FindBy(name="password") WebElement password_txt_loc;
	
	//Action Methods
	
	
	public void setupusername(String username)
	{
		username_txt_loc.sendKeys(username);
	}
	
	public void setuppassword(String password)
	{
	password_txt_loc.sendKeys(password);
	}
	
	public void clickonsubmit()
	{
		submit_click_loc.click();
	}
	
	public boolean checklogopresence() {
	boolean status = img_logo_loc.isDisplayed();
	
	return status;
	}
	
	
	
	
	
	
	
	
	
	
}
