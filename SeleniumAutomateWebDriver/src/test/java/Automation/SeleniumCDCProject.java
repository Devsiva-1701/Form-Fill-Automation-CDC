package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.*;

 

public class SeleniumCDCProject {
	//Remote chrome access used to access the current opened tab
	//chrome.exe --remote-debugging-port=9222 --user-data-dir=E:\NavapData\chromedata (create a folder)

	public static void main(String[] args) throws FileNotFoundException {
		ReadExcelData ex = new ReadExcelData();
		ex.ReadData();

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		// options.setExperimentalOption("debuggerAddress", "localhost:9222");

		WebDriver driver = new ChromeDriver();

		driver.get("D:\\FormJs\\index.html");
		driver.findElement(By.id("fname")).sendKeys(ex.returnData(0,1));
		driver.findElement(By.id("lname")).sendKeys(ex.returnData(1,1));
		driver.findElement(By.id("email")).sendKeys(ex.returnData(2,1));
		driver.findElement(By.id("college")).sendKeys(ex.returnData(3,1));
		driver.findElement(By.id("pnumber")).sendKeys(ex.returnData(4,1));
		driver.findElement(By.id("submit")).click();
	}

}