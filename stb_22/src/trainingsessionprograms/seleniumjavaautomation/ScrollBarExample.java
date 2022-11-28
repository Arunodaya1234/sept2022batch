package seleniumjavaautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBarExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement help=driver.findElement(By.xpath("//a[text()='Help']"));
		//js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();",help);
	}

}
