package stepdefinitions;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ShoppingCartPage;
import pages.itemListingPage;
import utils.ExtentManager;

public class shopping_cart_steps {
	

	ShoppingCartPage SCPage = new ShoppingCartPage();
	  ExtentReports extent = ExtentManager.getInstance();
	    ExtentTest test;
	
	
	@Given("user is on shopping cart page")
    public void userisonshoppingcartpage() {
		String heading_SC= SCPage.verify_shopping_cart_page_heading();
		Assert.assertEquals(heading_SC, "Shopping Cart");
		test = extent.createTest("shopping cart Test");
    	test.info("user is on shopping cart page");
       
    }

    @When("shopping cart same item name price and quantity")    
    public void shoppingcart_same_item_name_price_and_quantity() {
    	String item_name_shopping_cart = SCPage.verify_item_name_shopping_page();
    	Assert.assertEquals(item_name_shopping_cart, "Apple iPhone 15 (128 GB) - Black");
    	test.info("item name and price shopping cart page is correct");
    }

    @Then("user clicks on proceed to buy")
    public void userclicksonproceedtobuy() {
    	SCPage.click_proceed_to_buy();
    	test.info("user is able to click proceed to buy button");
       
    }
}
