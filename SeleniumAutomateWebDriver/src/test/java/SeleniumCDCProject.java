import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumCDCProject {
	//Remote chrome access used to access the current opened tab
	//chrome.exe --remote-debugging-port=9222 --user-data-dir=E:\NavapData\chromedata (create a folder)

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "localhost:9222");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://docs.google.com/forms/d/e/1FAIpQLSdhGktN8PpyUQ4-SsOV6FROxXJNO5pUMrKmEeoAz0maS--cpA/viewform?usp=sf_link");
		// WebElement field1 = driver.findElement(By.xpath("//*[@id="mG61Hd"]/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/div[1]/input"));
		
	}

}