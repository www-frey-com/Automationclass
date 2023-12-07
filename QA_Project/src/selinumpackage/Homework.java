package selinumpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

	public static void main(String[] args) {
		System.setProperty("webdiver.chrome.drivers","/Users/freyhailu/Downloads/chromedriver-mac-arm64 2/chromedriver" );
		WebDriver diver=new ChromeDriver();
		diver.get("https://www.google.com/");
		diver.findElement(By.name("q")).sendKeys("Selenium python");
		diver.findElement(By.name("btnK")).submit();
		
		
	}

	
}
