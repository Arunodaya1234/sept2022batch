package seleniumjavaautomation;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomationTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Point point=new Point(100,100);
		driver.manage().window().setPosition(point);
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		driver.navigate().to("https://www.facebook.com/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		driver.findElement(By.id("email")).sendKeys("vijay@facebook.com");
		driver.findElement(By.id("pass")).sendKeys("password");
		//driver.findElement(By.name("login")).click();
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//driver.close();
		//driver.quit();
	}

}
