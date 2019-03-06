package selenium.devops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] str) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\Selenium-KT\\browser-drivers\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		driver.manage().window().maximize(); 
		//driver.manage().window().fullscreen();
		
		driver.close();
		//driver.quit();
	}
}
