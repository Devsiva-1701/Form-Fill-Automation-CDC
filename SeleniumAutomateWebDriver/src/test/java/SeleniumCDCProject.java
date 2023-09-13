import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumCDCProject {

	public static void main(String[] args) {
		
// 		WebDriverManager.edgedriver().setup();
// String userProfilePath = "C:\\Users\\Admin\\AppData\\Local\\Microsoft\\Edge\\User Data\\Default";
// EdgeOptions options = new EdgeOptions();
//         options.addArguments("user-data-dir=" + userProfilePath);
// 		System.out.println("Break 1 ");
// WebDriver driver = new EdgeDriver(options);
// 		System.out.println("Break 1 ");
		
// 		driver.get("https://docs.google.com/forms/d/e/1FAIpQLSdhGktN8PpyUQ4-SsOV6FROxXJNO5pUMrKmEeoAz0maS--cpA/viewform?usp=sf_link");
// 		System.out.println(driver.getTitle());

		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:\\Users\\Admin\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 236\\Default");
		


        // Create ChromeOptions and add the "user-data-dir" argument

        
		System.out.println("Break 1 ");

// DesiredCapabilities capabilities = new DesiredCapabilities();
// String chromeProfile = "C:\\Users\\Tiuz\\AppData\\Local\\Google\\Chrome\\User Data\\Default";
// ArrayList<String> switches = new ArrayList<String>();
// switches.add("--user-data-dir=" + chromeProfile);
// capabilities.setCapability("chrome.switches", switches);
// WebDriver driver = new ChromeDriver(capabilities);

		// WebDriver driver = new ChromeDriver(options);
		// System.out.println("Break 1 ");
		
		// driver.get("https://docs.google.com/forms/d/e/1FAIpQLSdhGktN8PpyUQ4-SsOV6FROxXJNO5pUMrKmEeoAz0maS--cpA/viewform?usp=sf_link");
		// System.out.println(driver.getTitle());
		
		
	}

}