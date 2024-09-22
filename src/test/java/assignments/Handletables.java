package assignments;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handletables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/reserve.php");
		driver.manage().window().maximize();
		int Trows = driver.findElements(By.xpath("//table//tbody//tr")).size();
		int Tcol = driver.findElements(By.xpath("//table//thead//th")).size();
		double [] pricearray=new double[Trows];
		for (int i =1; i <=Trows; i++) {
			String Prices = driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[6]")).getText();
		
			String removed = Prices.replace("$", " ");
			System.out.println(removed);
			double Prices1 = Double.parseDouble(removed);	
			pricearray[i-1]=Prices1;
		}
		Arrays.sort(pricearray);
		double lowestprice = pricearray[0];
		
		System.out.println(lowestprice);
		for (int i =1; i <=Trows; i++) {
			String Prices = driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[6]")).getText();
			//double Prices2 = Double.parseDouble(Prices);
			//String removed$ = Prices.replace("$", " ");
			
			
			System.out.println(Prices);
			if (Prices.equals("$"+lowestprice)) {
				driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[1]//input")).click();
				break;
			}
		}
		
		//enter details
		
		 WebElement name = driver.findElement(By.xpath("//input[@id='inputName']"));
		 name.sendKeys("Mahesh");
	  driver.findElement(By.xpath("(//input[@id='address'])[1]")).sendKeys("Dhondalgaon maharashtra 423703");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Vaijapur");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("423703");
		 WebElement drp = driver.findElement(By.xpath("//select[@id='cardType']"));
		Select st=new Select(drp);
		st.selectByIndex(1);
		
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("1234568");
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2022");
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Mahesh Jadhav");
		driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		
		String Messaagse = driver.findElement(By.xpath("//h1")).getText();
		if (Messaagse.contains("Thank you for your purchase today!")) {
			System.out.println("Sucess===");
		}
		
	}

}
