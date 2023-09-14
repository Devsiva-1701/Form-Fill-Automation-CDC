import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumCDCProject {
	//Remote chrome access used to access the current opened tab
	//chrome.exe --remote-debugging-port=9222 --user-data-dir=E:\NavapData\chromedata (create a folder)

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "localhost:9222");
		WebDriver driver = new ChromeDriver();
		// driver.get("https://docs.google.com/forms/d/e/1FAIpQLSdhGktN8PpyUQ4-SsOV6FROxXJNO5pUMrKmEeoAz0maS--cpA/viewform?usp=sf_link");
		
		driver.get("D:\\FormJs\\index.html");
		driver.findElement(By.id("fname")).sendKeys("Pavan");
		driver.findElement(By.id("lname")).sendKeys("S");
		driver.findElement(By.id("pnumber")).sendKeys("0000000000");
		driver.findElement(By.id("email")).sendKeys("21ec109@kpriet.ac.in");
		driver.findElement(By.id("college")).sendKeys("Kpr Institute of Engineering and Technology");
		driver.findElement(By.id("submit")).click();

		// System.out.println(driver.getPageSource());
		

		
		// System.out.println(field1);
		
	}

}