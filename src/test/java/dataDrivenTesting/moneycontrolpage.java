
package dataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class moneycontrolpage {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/personal-finance/tools/emi-calculator.html");
		driver.manage().window().maximize();
		//driver.switchTo().alert().accept();
		String File = System.getProperty("user.dir")+"//testdata/emitable.xlsx";
		int trow = ExcelUtilities.getRowCount(File, "Sheet1");
		
		for (int r = 1; r <=trow; r++) {
			
			//read data from excel
			String LoanAmmount = ExcelUtilities.getData(File, "Sheet1", r, 0);
			String LoanPeriod = ExcelUtilities.getData(File, "Sheet1", r, 1);
			String EmistartFrom = ExcelUtilities.getData(File, "Sheet1", r, 2);
			String Interestrate = ExcelUtilities.getData(File, "Sheet1", r, 3);
			String uprontcharge = ExcelUtilities.getData(File, "Sheet1", r, 4);
			String Exemi = ExcelUtilities.getData(File, "Sheet1", r, 5);
			System.out.println(Exemi);
			//Pass data int application
			WebElement ammount1 = driver.findElement(By.xpath("//input[@id='carhome_loan']"));
			ammount1.clear();
			ammount1.sendKeys(LoanAmmount);
			
			WebElement period1 = driver.findElement(By.xpath("//input[@id='loan_period']"));
			period1.clear();
			period1.sendKeys(LoanPeriod);
			
			Select drp=new Select(driver.findElement(By.xpath("//select[@id='emi_start_from']")));
			
			drp.selectByVisibleText(EmistartFrom);
			
			WebElement roi = driver.findElement(By.xpath("//input[@id='interest_rate']"));
			roi.clear();
			roi.sendKeys(Interestrate);
			
			WebElement up = driver.findElement(By.xpath("//input[@id='upfront_charges']"));
			up.clear();
			up.sendKeys(uprontcharge);
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement clickbutton = driver.findElement(By.xpath("//a[normalize-space()='Submit']"));
			js.executeScript("arguments[0].click();", clickbutton);
			
			Thread.sleep(6000);
			String Actual_emi = driver.findElement(By.xpath("//span[@id='emi']")).getText();
			System.out.println(Actual_emi);
		if (Exemi.equals(Actual_emi)) {
			
			System.out.println("Test is passed");
			ExcelUtilities.setCellData(File, "sheet1", r,7, "passed");
			ExcelUtilities.fillGreenColour(File, "sheet1", r, 7);
			
			
		} else {
			System.out.println("Test is failed");
			ExcelUtilities.setCellData(File, "sheet1", r, 7,"failed");
			ExcelUtilities.fillRedColour(File, "sheet1", r, 7);

		}
			
			
		}
		
		
		
		
	}

}
