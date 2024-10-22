package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverManager.DriverManager;

public class HomePage {

	private WebDriver driver;
	
	public HomePage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }
	  
	    @FindBy(id = "twotabsearchtextbox")
	    WebElement searchbox;
	    
	    @FindBy(id = "nav-search-submit-button")
	    WebElement confirmsearchbtn;
	    
	    
	    public String getLoginPageTitle() {
	        return driver.getTitle();
	    }
	    
	    public void EnterSearchtext(String element)
	    {
	    	searchbox.sendKeys(element);
	    }
	    
	    public void clicksearchbutton()
	    {
	    	confirmsearchbtn.click();
	    }
	    
}
