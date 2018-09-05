package home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LunchHomepage {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","‪‪C:\\Users\\dell\\Documents\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();

driver.get("https://lotd.com/");
driver.close();
	}

	

}
