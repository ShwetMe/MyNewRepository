package june_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System. setProperty("webdriver.chrome.driver", "src//main//resource//chromedriver.exe");
			// Initialize browser.
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.testandquiz.com/selenium/testing.html");
			
			WebElement Female = driver.findElement(By.id("female"));
			System.out.println(Female.isSelected());
			WebElement Male = driver.findElement(By.id("male"));
			System.out.println(Male.isSelected());
			Female.click();
			System.out.println(Female.isSelected());
			System.out.println(Male.isSelected());
			Male.click();
			System.out.println(Female.isSelected());
			System.out.println(Male.isSelected());
	}

}
