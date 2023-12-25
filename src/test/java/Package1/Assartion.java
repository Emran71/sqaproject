package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Assartion {

	public static void main(String[] args) {

				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.spicejet.com/");
				driver.manage().window().maximize();
				
				Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Students')]")).isSelected());
				driver.findElement(By.xpath("//div[contains(text(),'Students')]")).click();
				Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Students')]")).isSelected());
				
	}

}
