package june_selenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
	     System. setProperty("webdriver.chrome.driver", "src//main//resource//chromedriver.exe");
			// Initialize browser.
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.google.com/");
			
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			//System.out.println(driver.getPageSource());
			WebElement Searchbox = driver.findElement(By.name("q"));
			Searchbox.sendKeys("Selenium");
		    List<WebElement> searchResult=driver.findElements(By.cssSelector("ul.erkvQe li"));
		    for (int i = 0;i < searchResult.size();i++) {
		    	System.out.println(searchResult.get(i).getText());
		    }
		    driver.findElement(By.linkText("Gmail")).click();
		    String FirstWindow = driver.getWindowHandle();
		    driver.findElement(By.partialLinkText("Sign")).click();
		    try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    Set<String> Windows = driver.getWindowHandles();
		    System.out.println(FirstWindow);
		    System.out.println(Windows);
		    driver.switchTo().window(FirstWindow);
		    System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
		    try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    for(String s:Windows)
		    	
		    {
		    	System.out.println(s);
		    	if (!s.equals(FirstWindow)) {
		    		driver.switchTo().window(s);	
		    	}
		    }
		    
		    System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
		    
			//driver.quit();
			
	}

}
