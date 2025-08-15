package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(linkText ="Contacts")
	private WebElement contactlink;
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText ="Organizations")
	private WebElement organizationslink;
	
	@FindBy(xpath ="//img[contains(@src,'user')]")
	private WebElement profilelink;
	
	@FindBy(linkText ="Sign Out")
	private WebElement signoutbutton;
	public WebElement getContactlink() {
		return contactlink;
	}

	public WebElement getOrganizationslink() {
		return organizationslink;
	}

	public WebElement getProfilelink() {
		return profilelink;
	}

	public WebElement getSignoutbutton() {
		return signoutbutton;
	}

	
	
	
	

}
