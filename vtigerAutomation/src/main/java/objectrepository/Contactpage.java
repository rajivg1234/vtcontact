package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactpage {
	@FindBy(xpath ="//img[@alt='Create Contact...']")
	private WebElement createIcon;
	public Contactpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="lastname")
	private WebElement lastname;
	@FindBy(xpath ="(//input[@name='button'])[1]")
	private WebElement savebutton;
	@FindBy(name="//span[@class='dvHeaderText']")
	private WebElement HeaderTextField;
	@FindBy(xpath ="(//img[@title='Select'])[1]")
	private WebElement OrganizationSelectIcon;
	@FindBy(id="1")
	private WebElement firstOrganization;
	
	public WebElement getFirstOrganization() {
		return firstOrganization;
	}
	public WebElement getOrganizationSelectIcon() {
		return OrganizationSelectIcon;
	}
	public void setOrganizationSelectIcon(WebElement organizationSelectIcon) {
		OrganizationSelectIcon = organizationSelectIcon;
	}
	public WebElement getHeaderTextField() {
		return HeaderTextField;
	}
	public void setHeaderTextField(WebElement headerTextField) {
		HeaderTextField = headerTextField;
	}
	public WebElement getCreateIcon() {
		return createIcon;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getSavebutton() {
		return savebutton;
	}
	
	

}
