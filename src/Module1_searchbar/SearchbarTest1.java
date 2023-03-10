package Module1_searchbar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchbarTest1 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream file=new FileInputStream("D:\\SearchBar.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		HomePage home=new HomePage(driver);
		home.inpsearchbar(sh.getRow(5).getCell(5).getStringCellValue());
		Thread.sleep(1000);
		home.clickcleardata();
		home.inpsearchbar(sh.getRow(5).getCell(5).getStringCellValue());
		home.clicksearchbutton();
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
