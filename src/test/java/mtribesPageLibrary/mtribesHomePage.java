package mtribesPageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mtribesHomePage {
	
	private static WebElement element = null ;
	
	public static WebElement SignIn_Button (WebDriver driver) {
		//element = driver.findElement(By.xpath("//div[@class =\"b-main-header__col b-main-header__col--responsive-nav\"]/following::li//a[@href=\"/login\" and @class=\"e-btn\"]"));
		element = driver.findElement(By.xpath("//ul[@class='b-main-header__nav']/child::li//a[@href='/login']"));
	    return element ;
	 }

}
