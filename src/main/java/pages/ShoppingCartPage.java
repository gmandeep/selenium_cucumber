package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverManager.DriverManager;

public class ShoppingCartPage {
	
private WebDriver driver;
	
	public ShoppingCartPage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }
	
	
	
	@FindBy(xpath = "(//h2[@class=\"a-size-extra-large a-text-normal\"])[1]")
    WebElement heading_shoppingcart;
	
	@FindBy(xpath = "(//span[@class='a-truncate-cut'])[1]")
    WebElement itemtext_shoppingcart;
	
	@FindBy(xpath = "//span[@class='a-size-small'][normalize-space()='Black']")
    WebElement item_color_shoppingcart;
	
	@FindBy(xpath = "//span[@class='a-dropdown-prompt']")
    WebElement item_quantity_shoppingcart;
	
	@FindBy(xpath = "(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold'])[1]")
    WebElement item_price_shoppingcart;
	
	@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
    WebElement proceed_to_buy_btn;
	
	public String verify_shopping_cart_page_heading()
	{
		String heading_shopping_cart = heading_shoppingcart.getText();
		return heading_shopping_cart;
	}
	
	public String verify_item_name_shopping_page()
	{
		String item_name_shopping_cart = itemtext_shoppingcart.getText();
		return item_name_shopping_cart;
	}
	public int verify_item_price_shopping_cart()
	{
		String price_shopping_cart = item_price_shoppingcart.getText();
		price_shopping_cart = price_shopping_cart.replaceAll(",","");
		return Integer.parseInt(price_shopping_cart);
	}
	
	public void click_proceed_to_buy()
	{
		proceed_to_buy_btn.click();
	}
	

}
