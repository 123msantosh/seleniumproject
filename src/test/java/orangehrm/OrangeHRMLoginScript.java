package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

public class OrangeHRMLoginScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");

		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		 Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("admin");
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		
		/*String actualTitle = driver.getTitle();
		String exp_title="OrangeHRM";
		if(actualTitle.equalsIgnoreCase(exp_title))
		{
			System.out.println("test case pass");
		}
		////*[@id="app"]/div[1]/div[1]/header/div[1]/div[1]/span/h6
		else 
		{
			System.out.println("failed");
		}
		
		driver.quit();*/
		Thread.sleep(2000);
	String label="null";
		try {
		 label = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
		}
		catch(Exception e)
		{
			 label = "hello";
		}
		String Exixting_label="Dashboard";
		
		if (Exixting_label.equalsIgnoreCase(label))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
	}

}
