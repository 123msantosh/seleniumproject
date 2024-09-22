package practice;

import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class RahulShettyAutomationPage {
WebDriver driver;
WebDriverWait mywait;
Logger logger;

    @BeforeClass
	public void setup()
	{   logger=LogManager.getLogger(this.getClass());
	logger.info("launch Browaer");
		driver=new ChromeDriver();
		mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
    @Test
    public void practiceTest()
    {   //handle radio button
    	List<WebElement> buttons = driver.findElements(By.xpath("//input[@name='radioButton']"));
    	for( WebElement rb:buttons)
    	{
    		rb.click();
    	}
    	
    	//Handle suggestion class example
    	WebElement search = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("autocomplete")));
    	search.sendKeys("ind");
    	List<WebElement> options = driver.findElements(By.xpath("//li[contains(@class,'ui-menu')]"));
    	for (WebElement names : options) {
			String text = names.getText();
			if (text.equals("India")) {
				names.click();
			}
		}
    	
    	//handle drop down
    	 WebElement drp = driver.findElement(By.xpath("//select[contains(@id,'dropdown-class-example')]"));
    	 
    	Select sl=new Select(drp);
    	sl.selectByVisibleText("Option2");
    	
    	//select checkbox
    	driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
    	
    	//new browser
//    	driver.findElement(By.id("openwindow")).click();
//    	String bid = driver.getWindowHandle();
//    	System.out.println(bid);
//    	
//    	//new tab open
//    	driver.findElement(By.id("opentab")).click();
//    	String title = driver.getTitle();
//    	System.out.println(title);
    	
    	//handle alert
    	driver.findElement(By.id("alertbtn")).click();
    	driver.switchTo().alert().accept();
    	
    	//Handle Web Table
    	List<WebElement> rows = driver.findElements(By.xpath("//div[@class='left-align']//tr"));
    	int Trow = rows.size();
    	List<WebElement> col = driver.findElements(By.xpath("//div[@class='left-align']//th"));
    	int Tcol = col.size();
    	System.out.println(Trow);
    	  String data = driver.findElement(By.xpath("//div[@class='left-align']//tr[4]//td[2]")).getText();
    	System.out.println(data);
    	int sum=0;
    	for (int i =2; i <Trow; i++) {
			
    		for (int j = 1; j <Tcol; j++) {
    			  String Totaldata = driver.findElement(By.xpath("//div[@class='left-align']//tr["+i+"]//td["+j+"]")).getText();
			   System.out.print(Totaldata);
    		
    		}
    		System.out.println();
		}
    	
    	for (int i = 2; i <Trow; i++) {
    		 String price = driver.findElement(By.xpath("//div[@class='left-align']//tr["+i+"]//td[3]")).getText();
    		sum=sum+Integer.parseInt(price);
		}
    	System.out.println(sum);	
    	
    	
    	 //mouse hover
        WebElement mh = driver.findElement(By.id("mousehover"));
        WebElement target = driver.findElement(By.xpath("//a[text()='Reload']"));
        Actions ac=new Actions(driver);
        ac.moveToElement(mh).moveToElement(target).click().build().perform();
        
        
        //slidder
 //      WebElement slidder = driver.findElement(By.xpath("//title"));
//        System.out.println(slidder.getLocation());
//        ac.dragAndDropBy(slidder, 100, 300).perform();
//        System.out.println(slidder.getLocation());
        Point p=new Point(300,400);
        driver.manage().window().setPosition(p);
  
        
    }
	
   
    
    
    
    
    
    
    
	@AfterClass
    public void tearDown()
    {
    	driver.quit();
    }
	
	
}
