package Package1;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderHandle {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
        driver.findElement(By.id("trd_5_15/12/2023")).click();
         
	}

}
