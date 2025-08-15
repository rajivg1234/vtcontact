package genericutility;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
/**
 * @author Rajiv
 */
public class WebDriverUtility {
	/**
	 * This method will maximize the window
	 * @param driver
	 */
	
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();	
	}
	/**
	 * This method will mouseHover
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver,WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * This method will scrollToElement
	 * @param driver
	 * @param element
	 */
	public void scrollToElement(WebDriver driver,WebElement element) {
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();
	}
	/**
	 * This method will scrollByAmount
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void scroll(WebDriver driver,int x,int y) {
		Actions act = new Actions(driver);
		act.scrollByAmount(x,y).perform();
	}
	/**
	 * This method will selectDropDown
	 * @param element
	 * @param index
	 */
	public void selectDropDown(WebElement element,int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
/**
 * This method will selectDropDown
 * @param value
 * @param element
 */
	public void selectDropDown1(String value,WebElement element) {
		Select sel=new Select(element);
		sel.selectByValue(value);
}
	/**
	 * This method will selectDropDown
	 * @param text
	 * @param element
	 */
	public void selectDropDown(String text,WebElement element) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	/**
	 * This method will switchToframe
	 * @param driver
	 * @param element
	 */
	public void switchToframe(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	public void switchToframe(WebDriver driver,String nameid) {
		driver.switchTo().frame(nameid);
	}
	public void switchToframe(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
		public Alert switchToAlart1(WebDriver driver) {
			return driver.switchTo().alert();
		}
		public void switchToAlartAndAccept(WebDriver driver) {
			 driver.switchTo().alert().accept();
		}
		public void switchToAlartAndDismiss(WebDriver driver) {
			 driver.switchTo().alert().dismiss();
			
		}
		public void getPhotos(WebDriver driver) throws IOException {
			JavaUtility juti = new JavaUtility();
			TakesScreenshot ts = (TakesScreenshot)driver;
			File temp=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("./screenshot/"+juti.getSystemTime()+"image.png");
			FileHandler.copy(temp, dest);
	}
		public void switchTowindow(WebDriver driver,String expurl) {
			Set<String> allwindowids = driver.getWindowHandles();
			for(String id:allwindowids) {
				driver.switchTo().window(id);
				String acturl = driver.getCurrentUrl();
				if(acturl.contains(expurl)) {
					break;
				}
			}
		}
		public void switchTowindow(String expTitle,WebDriver driver) {
			Set<String> allwindowids = driver.getWindowHandles();
			for(String id:allwindowids) {
				driver.switchTo().window(id);
				if(driver.getTitle().contains(expTitle)) {
					break;
				}
			}
		}
}
