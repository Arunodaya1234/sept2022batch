package seleniumjavaautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://selenium08.blogspot.com/2019/08/radio-buttons.html");
		WebElement redRadioButton=driver.findElement(By.xpath("//input[@name='red']"));
		
		redRadioButton.click();
		if(redRadioButton.isSelected())
		{
			System.out.println("Red Radio Button selected:"+redRadioButton.isSelected());
		}
		else
		{
			System.out.println("Red Radio Button Deselected:"+redRadioButton.isSelected());
		}
	}

}
