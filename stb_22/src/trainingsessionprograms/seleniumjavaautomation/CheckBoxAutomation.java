package seleniumjavaautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/checkbox");
		WebElement toggleButton=driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']"));
		toggleButton.click();
		Thread.sleep(2000);
		WebElement toggleButton1=driver.findElement(By.xpath("//label[@for='tree-node-desktop']//preceding-sibling::button"));
		toggleButton1.click();
		WebElement noteCheckbox=driver.findElement(By.xpath("//label[@for='tree-node-notes']//span[@class='rct-checkbox']//*[name()='svg']"));
		noteCheckbox.click();
		Thread.sleep(2000);
//		if(noteCheckbox.isDisplayed())
//		{
//			System.out.println("Checkbox Button selected:"+noteCheckbox.isDisplayed());
//		}
//		else
//		{
//			System.out.println("Checkbox Button selected:"+noteCheckbox.isDisplayed());
//		}
		
		driver.close();
	}

}
