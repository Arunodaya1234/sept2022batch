package seleniumjavaautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement cardC=driver.findElement(By.xpath("//li[text()='C']"));
		WebElement cardA=driver.findElement(By.xpath("//li[text()='A']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(cardC);
		actions.clickAndHold().perform();
		actions.moveToElement(cardA);
		actions.release().perform();
		

	}

}
