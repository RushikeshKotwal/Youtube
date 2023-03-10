package Module1_searchbar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	public static String TCdata(int row,int col) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\SearchBar.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sh.getRow(row).getCell(col).getStringCellValue();
		return value;
		
	}
	
	public static void SS(WebDriver driver,int TCID) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Selenium\\Screenshot\\FAIL"+TCID+".png");
		FileHandler.copy(src, dest);
	}
	
	public static String readpropertyfile(String key) throws IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Rushikesh\\Eclipse\\Youtube\\src\\url.properties");
		
		Properties p=new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
	}



}
