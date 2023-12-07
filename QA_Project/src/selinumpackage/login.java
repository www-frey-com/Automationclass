package selinumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdiver.chrome.drivers","/Users/freyhailu/Downloads/chromedriver-mac-arm64 2/chromedriver" );
		WebDriver diver=new ChromeDriver();
	diver.get("https://admin-demo.nopcommerce.com/login");
	WebElement email=diver.findElement(By.id("Email"));        
	WebElement password=diver.findElement(By.id("Password"));
	 WebElement button=diver.findElement(By.className("button-1"));
	 button.submit();
	}

}
