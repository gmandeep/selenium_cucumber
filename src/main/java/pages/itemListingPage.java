package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverManager.DriverManager;

public class itemListingPage {
	
private WebDriver driver;
	
	public itemListingPage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }
	
	
	
	@FindBy(xpath = "//h2[normalize-space()='Results']")
    WebElement text_itemlisting;
	
	@FindBy(xpath = "(//div[contains(@class,'rush-component s-featured-result-item')])[1]")
    WebElement first_item_itemlisting;
    
    @FindBy(xpath = "//span[normalize-space()='Apple iPhone 15 (128 GB) - Black']")
    WebElement first_item_name_itemlisting;
    
    @FindBy(xpath = "//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//span[@class='a-price-whole'][normalize-space()='69,900']")
    WebElement discounted_price_itemlisting;
    
    @FindBy(xpath = "(//div[@class='a-section aok-inline-block']//span[@class='a-offscreen'])[1]")
    WebElement actual_price_itemlisting;
    
    @FindBy(xpath = "//button[@id='a-autoid-1-announce']")
    WebElement add_to_cart_itemlisting;
    
    @FindBy(xpath = "//div[@id=\"nav-cart-count-container\"]")
    WebElement cartbtn_itemlisting;
    
    public boolean itemlistingpageheading()
    {
    	return text_itemlisting.isDisplayed();
    }
    
    public boolean itemexistonlistingpage()
    {
    	return first_item_itemlisting.isDisplayed();
    	
    }
    
    public String firstitemname_listing_page()
    {
    	String firstitemname = first_item_name_itemlisting.getText();
    	return firstitemname;
    }
    
    public boolean discount_less_than_99k()
    {
    	String discounted_price = discounted_price_itemlisting.getText();
    	discounted_price = discounted_price.replaceAll(",","");
    	System.out.println(discounted_price);
    	String actual_price = actual_price_itemlisting.getText();
    	actual_price = actual_price.replaceAll(",","");
    	System.out.println(actual_price);
    	if(Integer.parseInt(discounted_price) < 99000)
    	{
    		return true;
    	}
    	else {
    		return false;
    	}
    	
    }
    
    public void click_addtocart_listingpage()
    {
    	add_to_cart_itemlisting.click();
    }
    
    public void click_cartbtn_listingpage()
    {
    	cartbtn_itemlisting.click();
    }
    
    

}
