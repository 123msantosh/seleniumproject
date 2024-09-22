package handlebrokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLink {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		int brokenlink=0;
		for (WebElement linkelement : Links) {
			String targetlink = linkelement.getAttribute("href");
			//System.out.println(targetlink);
			//check link is present or not
			if (targetlink==null || targetlink.isEmpty()) {
				System.out.println("no link value present");
				continue;
			}
			//convert to link format
			URL linkurl=new URL(targetlink);
			//System.out.println(linkurl);
			
	//send request to server first open and then connect
			
		//convert to http format and open connection
			HttpURLConnection connection =(HttpURLConnection)linkurl.openConnection();
			
			//connect
			connection.connect();
			if (connection.getResponseCode()<=400) {
				System.out.println(linkelement.getText()+"======not Broken Link======");
				brokenlink++;
			} 
			
			else
			{
				System.out.println(linkelement.getText()+"======Broken link===============");
			}
		}
		System.out.println(brokenlink);
		
		
	}

}
