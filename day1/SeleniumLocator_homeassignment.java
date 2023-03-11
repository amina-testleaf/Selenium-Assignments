package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumLocator_homeassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();


		//enter value in login screen

		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		Thread.sleep(5000);
		driver.findElement(By.className("decorativeSubmit")).click();

		String title	= driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();

		//Navigate to Leads page
		driver.findElement(By.linkText("Leads")).click();

		Thread.sleep(3000);

		//Create Lead with Company name & username

		driver.findElement(By.linkText("Create Lead")).click();

		Thread.sleep(3000);

		System.out.println(driver.getTitle());

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Amina");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Begum");

		//If dropdown is in the select tag then use the select class 
		//select from source dropdown
		WebElement sourcedd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec = new Select(sourcedd);
		sec.selectByIndex(4);

		//select from Marketing Campaign 
		WebElement marketcc = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mar = new Select(marketcc);
		mar.selectByVisibleText("Automobile");

		//select from Ownership dropdown
		WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select own = new Select(owner);
		own.selectByValue("OWN_CCORP");

Thread.sleep(2000);

		driver.findElement(By.className("smallSubmit")).click();

String title2 = driver.getTitle();

System.out.println(title2);

//not sure how to verify title

if (title2 == "View Lead | opentaps CRM") {
	
	System.out.println("Testcase PASSED");
	
} else {
	
	System.out.println("Testcase FAILED");

}
	}

}
