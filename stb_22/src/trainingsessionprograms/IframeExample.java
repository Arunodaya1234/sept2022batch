package seleniumjavaautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		int totaliframes=driver.findElements(By.tagName("iframe")).size();
		System.out.println(totaliframes);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@itemprop='query-input']")).sendKeys("Frame1");
		driver.switchTo().defaultContent();
		System.out.println("Switching to main frame");
//		driver.findElement(By.xpath("//a[text()='Freshers Now']")).click();
//		System.out.println("Clicked success");
		driver.switchTo().frame("iframe_b");
		
	}

}
