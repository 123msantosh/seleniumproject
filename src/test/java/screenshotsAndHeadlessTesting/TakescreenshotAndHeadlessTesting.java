package screenshotsAndHeadlessTesting;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TakescreenshotAndHeadlessTesting {

	public static void main(String[] args) throws IOException, InterruptedException {
		//Headless Testing
		ChromeOptions option=new ChromeOptions();
		option.setHeadless(true);
		WebDriver driver=new ChromeDriver(option);
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot)driver;
		//capture full page screenshot
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Selenium Workspace\\seleniumproject\\screenshots\\fullpage2.png");
		FileUtils.copyFile(src,dest);
		Thread.sleep(2000);
		//capture countries screenshot without using above interface above selenium 4
		WebElement element = driver.findElement(By.xpath("//div[@class='container']"));
		File trg = element.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("D:\\Selenium Workspace\\seleniumproject\\screenshots\\country.png");
		FileUtils.copyFile(trg,dest1);
	}

}
