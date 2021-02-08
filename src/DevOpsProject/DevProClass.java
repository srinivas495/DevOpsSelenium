package DevOpsProject;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DevProClass {
  @Test
  public void LaunchBrowser() {
	  System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
	  ChromeOptions chromeOptions = new ChromeOptions();
	 // chromeOptions.addArguments(“--headless”);
	  WebDriver driver = new ChromeDriver(chromeOptions);
	  driver.manage().window().maximize();
	  driver.get("http://192.168.12.128:3001/");
	  driver.findElement(By.name("login")).sendKeys("devops");
	  driver.findElement(By.name("password")).sendKeys("test");
	  driver.findElement(By.name("click")).click();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  String test = driver.findElement(By.name("test")).getText();
	  assertEquals(test, "Login Succeeded");
	  System.out.println("Test Succeeded!!");
	  driver.quit();
	  
	  
  }
}
