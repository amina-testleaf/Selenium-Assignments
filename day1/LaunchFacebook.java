package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver(); 
driver.get("https://www.facebook.com/");
//driver.get("https://www.google.com/gmail/about/");

driver.manage().window().maximize();


driver.close();

	}

}
