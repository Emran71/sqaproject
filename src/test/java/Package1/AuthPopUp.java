package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthPopUp {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		//Syntax
		//https://username:password@the-internet.herokuapp.com/basic_auth
        driver.get("//https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
