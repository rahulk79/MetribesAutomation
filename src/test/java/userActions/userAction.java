package userActions;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import mtribesPageLibrary.mtribesLoginPage;
import mtribesPageLibrary.mtribesQASandboxPage;
import utility.fileUtil;


public class userAction {
	
	public static WebDriverWait webwait = null ;
	
	private static Logger log = LogManager.getLogger(userAction.class);
	
	
	public static void perfromLogin(WebDriver driver) throws IOException {
		webwait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.get(fileUtil.readProperty("login_url"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		log.debug("Navigated to login page");
	    webwait.until(ExpectedConditions.elementToBeClickable(mtribesLoginPage.UserName(driver))).sendKeys(fileUtil.readProperty("user_emailid"));
		mtribesLoginPage.Password(driver).sendKeys(fileUtil.readProperty("password"));
		mtribesLoginPage.Click_SignIn(driver).click();
		log.debug("User loggedin");
		webwait.until(ExpectedConditions.urlContains("/mtribes-qa-sandbox"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
	
	public static void performLogout(WebDriver driver) throws IOException{
		webwait = new WebDriverWait(driver, Duration.ofSeconds(60));
		log.debug("Performing logging off");
		webwait.until(ExpectedConditions.elementToBeClickable(mtribesQASandboxPage.Profile_Button(driver))).click();
		webwait.until(ExpectedConditions.elementToBeClickable(mtribesQASandboxPage.SignOut_Button(driver))).click();
		log.debug("User is logged off");
		webwait.until(ExpectedConditions.titleContains("Real-time UX control"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
	
}
   	


