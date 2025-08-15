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
public class TC_VT_002_Test extends BaseClass {
	@Test
	public void createContact() throws EncryptedDocumentException, IOException {
		Homepage hp=new Homepage(driver);
		hp.getContactlink().click();
		Contactpage cp=new Contactpage(driver);
		cp.getCreateIcon().click();
		cp.getLastname().sendKeys(eutil.getStringDataFromExcel("Contacts", 1, 0));
		cp.getSavebutton().click();
		Assert.assertEquals(cp.getHeaderTextField().isDisplayed(),true);
		test.log(Status.PASS,"Contact has been created wit hlast name");
		
	}

}
