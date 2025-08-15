package contacts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListencersUtility;
import objectrepository.Homepage;
@Listeners(ListencersUtility.class)
public class TC_VT_001_Test extends BaseClass{
	@Test
	public void clickOnContacts() {
		Homepage hp=new Homepage(driver);
		hp.getContactlink().click();
		Assert.assertTrue(driver.getTitle().contains("Contacts "));
		test.log(Status.PASS,"Contact page should be displayed");
		
	}
	
}
