package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pkg.Bookingpage;

public class Bookingtest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.booking.com/");
		driver.navigate().refresh();
	}
	@Test
	public void test1()
	{
		Bookingpage ob=new Bookingpage(driver);
		ob.where();
		ob.checkin();
		ob.setvalues();
		ob.search();
		
	}

}
