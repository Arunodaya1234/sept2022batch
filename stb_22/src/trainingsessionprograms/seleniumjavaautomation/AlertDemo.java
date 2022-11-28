package seleniumjavaautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");
//		WebElement simpleAlert=driver.findElement(By.xpath("//input[@id='simple']"));
//		simpleAlert.click();
//		WebElement confirmAlert=driver.findElement(By.xpath("//button[@id='confirm']"));
//		confirmAlert.click();
		WebElement promptAlert=driver.findElement(By.xpath("//button[@id='prompt']"));
		promptAlert.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Selenium Automation");
		alert.accept();
		WebElement pmsg=driver.findElement(By.xpath("//div[@id='prompt_demo']"));
		String msg=pmsg.getText();
//		String msg=driver.switchTo().alert().getText();
		System.out.println(msg);
		
		driver.close();
	}

}
