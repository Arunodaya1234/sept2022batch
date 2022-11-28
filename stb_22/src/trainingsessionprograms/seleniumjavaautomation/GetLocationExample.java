package seleniumjavaautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetLocationExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		WebElement gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions action =new Actions(driver);
		int getX=gmail.getLocation().getX();
		int getY=gmail.getLocation().getY();
		System.out.println("X: "+getX+" Y: "+getY);
		action.moveByOffset(getX+1, getY+1);
		action.build().perform();
		System.out.println("Clicked successfully");

	}

}
