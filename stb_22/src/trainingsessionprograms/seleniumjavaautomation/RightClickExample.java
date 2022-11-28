package seleniumjavaautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.get("https://selenium08.blogspot.com/2019/12/right-click.html");
		WebElement rightClickBtn=driver.findElement(By.xpath("//div[@id='div-context']"));
		Actions actions=new Actions(driver);
		actions.contextClick(rightClickBtn);
		actions.click(driver.findElement(By.xpath("//a[text()='Python']")));
		actions.perform();
	}

}
