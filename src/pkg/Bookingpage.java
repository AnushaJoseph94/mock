package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bookingpage {
	
	WebDriver driver;
	By wherefield=By.xpath("//*[@id=\":Ra9:\"]");
	By datebutton=By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[2]/div/div/button[1]");
	By checkindate=By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr[5]/td[4]/span");
	By checkoutdate=By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/table/tbody/tr[5]/td[4]/span");
	By adultbutton=By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[3]/div/button");
	By adultno=By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[3]/div/div/div/div/div[1]/div[2]/button[2]");
	By childno=By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[3]/div/div/div/div/div[2]/div[2]/button[2]/span/span/svg");
	By roomno=By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[3]/div/div/div/div/div[3]/div[2]/button[2]/span/span/svg");
	By donebutton=By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[3]/div/div/div/button");
	By searchbutton=By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[4]/button");
	
	public Bookingpage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void where()
	{
		driver.findElement(wherefield).sendKeys("munnar");
	
	}
	public void checkin()
	{
		driver.findElement(datebutton).click();
		driver.findElement(checkindate).click();
		driver.findElement(checkoutdate).click();
		
	}
	public void setvalues()
	{
		driver.findElement(adultbutton).click();
		driver.findElement(adultno).click();
		driver.findElement(childno).click();
		driver.findElement(roomno).click();
		driver.findElement(donebutton).click();
		
		
	}
	public void search()
	{
		driver.findElement(searchbutton).click();
	}
	

}
