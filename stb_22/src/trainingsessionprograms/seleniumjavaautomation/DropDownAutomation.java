package seleniumjavaautomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select(dropdown);
		int size=select.getOptions().size();
		System.out.println(size);
		//select.selectByIndex(3);
		//select.selectByValue("IN");
//		select.selectByVisibleText("Indonesia");
//		System.out.println(select.getFirstSelectedOption().getText());
		
//		List<WebElement> options=select.getOptions();
//		for(int i=0;i<options.size();i++)
//		{
//			System.out.println(options.get(i).getText());
//		}
		
		System.out.println(select.isMultiple());
	}

}
