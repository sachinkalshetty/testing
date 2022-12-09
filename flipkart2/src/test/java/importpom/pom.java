package importpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class pom {
	WebDriver driver;
	
	By username = By.xpath("//*[@id=\"email\"]");
	By password = By.xpath("//*[@id=\"pass\"]");
	By login = By.xpath("//*[@id=\"loginbutton\"]");
	
	
	
	public pom(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public void facebook() {
		
		
		driver.findElement(username).sendKeys("8123283522");
		driver.findElement(password).sendKeys("kalshettysachin8123");
		driver.findElement(login).click();
	}

	
	
	
	
	

}
