package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizationpage {
	@FindBy(xpath ="//img[@alt='Create Organization...']")
	private WebElement createIcon;
	public Organizationpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="accountname")
	private WebElement OrganizationNameTextField;
	@FindBy(xpath ="(//input[@name='button'])[1]")
	private WebElement savebutton;
	public WebElement getCreateIcon() {
		return createIcon;
	}
	public WebElement getOrganizationNameTextField() {
		return OrganizationNameTextField;
	}
	public WebElement getSavebutton() {
		return savebutton;
	}
	
	
	


}
