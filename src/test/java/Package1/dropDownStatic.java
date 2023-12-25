package Package1;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class dropDownStatic {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://in.via.com/hotels");
		WebElement staticDropDown = driver.findElement(By.id("nationalityCountry"));
		Select dropdown = new Select(staticDropDown);
		//selectByIndex
		dropdown.selectByIndex(2);
		
		System.out.println(dropdown.getFirstSelectedOption().getText());
	}

}
