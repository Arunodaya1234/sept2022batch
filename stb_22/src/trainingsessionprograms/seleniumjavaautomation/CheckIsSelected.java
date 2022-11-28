package seleniumjavaautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckIsSelected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/checkbox");
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='tree-node-downloads']"));
		if(searchbox.isSelected())
		{
			System.out.println("Checkbox isSelected:"+searchbox.isSelected());
		}
		else
		{
			System.err.println("Checkbox isSelected:"+searchbox.isSelected());
		}
		driver.close();

	}

}
