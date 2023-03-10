package Module1_searchbar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath = "//input[@id='search']") private WebElement searchbar;
	@FindBy(xpath = "//button[@aria-label='Clear search query']") private WebElement cleardata;
	@FindBy(xpath = "//button[@class='style-scope ytd-searchbox']") private WebElement searchbutton;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpsearchbar(String data) 
	{
		searchbar.sendKeys(data);
		
	}
	
	public void clickcleardata() 
	{
		cleardata.click();
	}
	
	public void Verifysearchbutton() 
	{
		boolean result = searchbutton.isDisplayed();
	}
	
	public void clicksearchbutton() 
	{
		searchbutton.isDisplayed();
		searchbutton.click();
	}

}
