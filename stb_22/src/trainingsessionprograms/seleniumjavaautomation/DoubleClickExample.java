package seleniumjavaautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
		WebElement dblclickbtn=driver.findElement(By.xpath("//button[contains(text(),'Double-Click me to see Alert message')]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(dblclickbtn);
		actions.doubleClick();
		actions.perform();
	}

}
