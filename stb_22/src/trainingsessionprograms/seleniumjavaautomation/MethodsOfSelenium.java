package seleniumjavaautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		WebElement searchbox=driver.findElement(By.xpath("//input[@name='q']"));
		if(searchbox.isEnabled())
		{
			System.out.println("Search box isEnabled:"+searchbox.isEnabled());
		}
		else
		{
			System.err.println("Search box isEnabled:"+searchbox.isEnabled());
		}
		
		if(searchbox.isDisplayed())
		{
			System.out.println("Search box isDisplayed:"+searchbox.isDisplayed());
		}
		else
		{
			System.err.println("Search box isDisplayed:"+searchbox.isDisplayed());
		}
		driver.close();

	}

}
