package handlewebtablestaticanddynamic;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleStaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
//total no of rows
int Trows = driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
System.out.println(Trows);

//find tottal no of columns
int Tcol = driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//th")).size();
System.out.println(Tcol);

//Read Specific data from rows and column
String spdata = driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr[5]//td[3]")).getText();

System.out.println(spdata);
for (int i = 1; i <=Tcol; i++) {
	
		 String titlerow = driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr[1]//th["+i+"]")).getText();
		 System.out.print(titlerow+"\t");

}
System.out.println();
//Read data from all rows and columns

for (int i = 2; i <= Trows; i++) {
	
	for (int j = 1; j <=Tcol; j++) {
		String alldata = driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+i+"]//td["+j+"]")).getText();
		System.out.print(alldata+"\t");
	}
	System.out.println();
}
System.out.println("========================");
for (int i =2; i <=Trows; i++) {

	 String author = driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+i+"]//td[2]")).getText();
	 //System.out.print(author+"\t");
	 if (author.equals("Amit")) {
		 System.out.print(author+"\t");
		String BooksName = driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+i+"]//td[1]")).getText();
		System.out.println(BooksName);
	}

}
int sum=0;

//find total price of books
for (int i = 2; i <=Trows; i++) {
	
	 String price = driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+i+"]//td[4]")).getText();
	 System.out.print(price+"\t");
	 sum=sum+Integer.parseInt(price);

}
System.out.println();
System.out.println("Total price of book="+sum);
driver.quit();
	}
	
	

}
