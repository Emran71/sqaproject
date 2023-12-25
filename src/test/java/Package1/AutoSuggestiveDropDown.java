package Package1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.easemytrip.com/");
		driver.findElement(By.id("FromSector_show")).click();
		
	}
}
