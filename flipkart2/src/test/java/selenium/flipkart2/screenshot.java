package selenium.flipkart2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {
	
	public static void main (String[] args) throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f,new File("C:\\Users\\pavan\\OneDrive\\Desktop\\java testing\\sachi.png"));
		
	
	}
}
