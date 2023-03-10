package Module1_searchbar;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

public class SearchBarTest extends BaseClass
{
	HomePage home;
	Sheet sh;
	int TCID;
	
	
	@BeforeClass
	public void browseropen() throws EncryptedDocumentException, IOException
	{
		Browser();
		home=new HomePage(driver);
		
	
	}
	
	@Test
	public void searchbar() throws EncryptedDocumentException, IOException
	{
		TCID=04;
		home.inpsearchbar(UtilityClass.TCdata(5, 5));
		home.clicksearchbutton();
		
	}
	
	
	
	@AfterMethod
	public void Screenshot(ITestResult s1) throws IOException
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.SS(driver, TCID);
		}
	}
	
	@AfterClass
	public void browserclose() throws InterruptedException
	{
		BrowserClose();
	}

}
