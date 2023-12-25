package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpdateDropDown {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.easemytrip.com/flights.html");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='FromSector_show']")).sendKeys("Dhak");
		 driver.findElement(By.xpath("//input[@placeholder='Departure']")).click();
		 driver.findElement(By.id("frth_2_19/12/2023")).click();
        driver.findElement(By.xpath("//input[@id='chkStudent']")).click();
        driver.findElement(By.id("ptravlr")).click();
		
		  for(int i = 1;i<=5;i++) { driver.findElement(By.id("add")).click(); }
		  driver.findElement(By.id("lbBusiness")).click();
		  driver.findElement(By.id("traveLer")).click();
		  driver.findElement(By.xpath("//button[@class='srchBtnSe']")).click();
		  
		 
	}
}
