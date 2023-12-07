package selinumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fillform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/freyhailu/Downloads/chromedriver-mac-arm64 2/chromedriver" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	     ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        
	        browserObject.findElement(By.name("name")).sendKeys("Fery");
	        browserObject.findElement(By.id("eml")).sendKeys("frey.hailu@gmail.com");
	        browserObject.findElement(By.name("website")).sendKeys("itlearn360.com");
	        browserObject.findElement(By.name("comment")).sendKeys("hello");
	       
	       //Radio button 
	        browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
	        
	        browserObject.findElement(By.xpath("/html/body/form/input[5]")).click();
	        
	        browserObject.findElement(By.xpath("//*[@id=\"other\"]")).click();
	        
	        browserObject.findElement(By.xpath("/html/body/form/input[7]")).click();
	        
	        browserObject.findElement(By.xpath("/html/body/form/input[8]")).click();
	        
	        browserObject.findElement(By.xpath("/html/body/form/input[9]")).click();
	        
	        browserObject.findElement(By.xpath("/html/body/form/input[10]")).click();
	        
	        Select cn = new Select(browserObject.findElement(By.name("country")));
	        
	        cn.selectByVisibleText("France");
	        
	        Select se = new Select(browserObject.findElement(By.name("skill")));
	        		
	        se.selectByVisibleText("Management");
	        
	        se.selectByVisibleText("Database");
	        
	        
	  
	        
	      browserObject.findElement(By.name("submit")).click();
	       
	}
	

}
