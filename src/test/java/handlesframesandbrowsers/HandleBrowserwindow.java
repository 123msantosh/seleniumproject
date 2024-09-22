package handlesframesandbrowsers;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
//Approach 1
/*Set<String> IDS = driver.getWindowHandles();

//convert to arraylist because for retrive individual id
List<String> windowIDS = new ArrayList<String>(IDS);
String ParentID = windowIDS.get(0);
String ChldID = windowIDS.get(1);
driver.switchTo().window(ChldID);
driver.findElement(By.xpath("(//button[text()='Contact Sales'])[2]")).click();

driver.switchTo().window(ParentID);
driver.switchTo().window(ChldID).close();
*/

//Approach 2

Set<String> IDS = driver.getWindowHandles();
for (String WIDs : IDS) {
	String title = driver.switchTo().window(WIDs).getTitle();
	if (title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM")) {
		driver.findElement(By.xpath("(//button[text()='Book a Free Demo'])[2]")).click();
		driver.close();
		
	}
}

	}

}
