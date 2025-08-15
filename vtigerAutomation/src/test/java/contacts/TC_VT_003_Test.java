package contacts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListencersUtility;
import objectrepository.Contactpage;
import objectrepository.Homepage;
@Listeners(ListencersUtility.class)
public class TC_VT_003_Test extends BaseClass {
	@Test
	public void createContactWithOrganization() throws EncryptedDocumentException, IOException {
	Homepage hp=new Homepage(driver);
	hp.getContactlink().click();
	
	Contactpage cp=new Contactpage(driver);
	cp.getCreateIcon().click();
	cp.getLastname().sendKeys(eutil.getStringDataFromExcel("Contacts", 1, 0));
	cp.getOrganizationSelectIcon().click();
	
	wutil.switchTowindow(driver, "Accounts&action");
	cp.getFirstOrganization().click();
	
	wutil.switchTowindow(driver, "Contacts&action");
	cp.getSavebutton().click();
	
	Assert.assertTrue(cp.getHeaderTextField().isDisplayed());
	test.log(Status.PASS,"Contact has been created with organization name");
	}
}
