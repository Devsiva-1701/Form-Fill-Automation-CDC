package selenium;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class SeleniumMain {

	public static void main(String[] args) throws Exception {
		

		Scanner input = new Scanner(System.in);
		System.out.println( "Enter the Website URL..." );
		String url = input.nextLine();
		
		String workbookPath = "./assets/ExcelFiles/UserData.xlsx";
		FileInputStream fis = new FileInputStream(workbookPath);
		System.out.println("Do you want the data to be written? Y/N ");
		String ans =  input.nextLine();
		ReadDataExcel read = new ReadDataExcel( fis );
		read.displayData();
		if(ans.equalsIgnoreCase("y"))
		{
			
			read.writeData();
			
		}
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		WebElement submitbutotn = driver.findElement(By.tagName("button"));
		submitbutotn.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.and(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("input")),
				ExpectedConditions.attributeToBeNotEmpty(driver.findElement(By.tagName("input")), "value")
				));
		
		List<WebElement> elements = driver.findElements(By.tagName("input"));
		List<String> values = new ArrayList<String>();
		for(WebElement element : elements)
		{
			
			values.add(element.getAttribute("value"));
			
		}
		
		System.out.println(values);
		
		
	
		
		
	}

}
