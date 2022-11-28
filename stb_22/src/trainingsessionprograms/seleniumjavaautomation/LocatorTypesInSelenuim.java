package seleniumjavaautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTypesInSelenuim {

	public static void main(String[] args) {
		//using tag name
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/text-box");
		//driver.findElement(By.tagName("input")).sendKeys("User name");
		//driver.findElement(By.name("firstname")).sendKeys("Abhishek");
		//driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("Abhishek");
//		driver.findElement(By.id("userName")).sendKeys("Abhishek");
//		driver.findElement(By.cssSelector("#userEmail")).sendKeys("demoqa@gmail.com");
//		driver.findElement(By.id("btn btn-primary")).click();
		//driver.findElement(By.linkText("Home")).click();
		//driver.findElement(By.partialLinkText("Ho")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Robert Dsuza");
	}

}
