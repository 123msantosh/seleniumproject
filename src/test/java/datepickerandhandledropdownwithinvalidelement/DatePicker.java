package datepickerandhandledropdownwithinvalidelement;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		//Approach 1
		//driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/12/2024");

		//Approach 2
		/*Scanner sc=new Scanner(System.in);
		String month=sc.next();
		String yr=sc.next();
		String date=sc.next();*/
		
		String month="August";
		String yr="2024";
		String date="20";
		driver.switchTo().frame(0);
		//find month and year
		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
		while (true) {
			String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			 if (mon.equals(month) && year.equals(yr)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
		}	//find date
			List<WebElement> AllDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
			
		for (int i =0; i<=AllDate.size(); i++) {
				
				String datedata = AllDate.get(i).getText();
				if (datedata.equals(date)) {
					AllDate.get(i).click();
					break;
				}
			}
			
			
		/*	for(WebElement dt : AllDate)
			{
				if(dt.getText().equals(date))
				{
					dt.click();
					break;
				}
			}*/
		}
		
		
		
	}


