package Package1;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DynamicDropDown {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("css-1cwyjr8")).click();
		driver.findElement(By.xpath("//div[text()='Belagavi']")).click();
	}

}
