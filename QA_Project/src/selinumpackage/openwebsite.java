package selinumpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class openwebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/freyhailu/Downloads/chromedriver-mac-arm64 2/chromedriver" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	     ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://www.amazon.com/");
	}

}
