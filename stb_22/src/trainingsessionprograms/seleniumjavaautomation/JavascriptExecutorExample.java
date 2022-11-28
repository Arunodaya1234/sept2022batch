package seleniumjavaautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		Object title=js.executeScript("return document.title");
//		String title1=(String) title;
//		System.out.println("Title of doc is :"+title1);
//		String title=(String) js.executeScript("return document.title");
//		System.out.println(title);
		
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		WebElement submitbtn=driver.findElement(By.xpath("//input[@name='btnK']"));
//		js.executeScript("arguments[0].value='Selenium'",search);
//		js.executeScript("arguments[0].click()",submitbtn);
		js.executeScript("arguments[0].value='Selenium',arguments[1].click()",search,submitbtn);
	}

}
