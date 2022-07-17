package mtribesPageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mtribesQASandboxPage {
	
	private static WebElement element = null ;
	
    public static WebElement Welcome_Message (WebDriver driver) {
		element = driver.findElement(By.xpath("//h3[@class=\"h2\"]"));
		return element;
	}
    
    public static WebElement Profile_Button (WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@data-qa=\"button:profile\"]"));
		return element;
	}
    
    public static WebElement SignOut_Button (WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@data-qa=\"item:Sign out\"]"));
		return element;
	}
    
}
