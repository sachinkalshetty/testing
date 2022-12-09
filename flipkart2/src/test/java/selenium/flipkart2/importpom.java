package selenium.flipkart2;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import importpom.pom;

public class importpom {
	WebDriver driver;

	@BeforeTest
	public void launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		}
	
	@Test
	public void setup(){
		pom p= new pom(driver);
		p.facebook();
		
    

			
		}
	}



