package pageObjectclassTwoapproach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage1 {

	public WebDriver driver;
	
	//constructors
	public loginPage1( WebDriver driver) {
		this.driver=driver;
			}
	
	//locators
	
	By logo_img_loc=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img");
	
	By username_txt_loc=By.name("username");
	
	By password_txt_loc=By.name("password");
	
	By submit_click_loc=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
	
	//Actions Methods
	
	public void setupusername(String username)
	{
		driver.findElement(username_txt_loc).sendKeys(username);
	}
	
	public void setuppassword(String password)
	{
		driver.findElement(password_txt_loc).sendKeys(password);
	}
	
	public void clickonsubmit()
	{
		driver.findElement(submit_click_loc).click();
	}
	
	public boolean checklogopresence() {
	boolean status = driver.findElement(logo_img_loc).isDisplayed();
	
	return status;
	}
}
