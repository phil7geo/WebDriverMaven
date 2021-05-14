import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException{
		
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void doLogin() {
		
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("phillip.thrylos@gmail.com");
		driver.findElement(By.id("Passed")).sendKeys("fffeef");
		driver.findElement(By.id("SignIn")).click();
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}
}
