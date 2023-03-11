package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//launch my browser
		ChromeDriver driver = new ChromeDriver();
		
		//load url
		driver.get("https://www.amazon.in/");
		// to maximize
		
		driver.manage().window().maximize();
		
		//close the current window
		driver.close();
		
		
	}

}
