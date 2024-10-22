package stepdefinitions;

import java.sql.Time;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import DriverManager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.itemListingPage;
import utils.ExtentManager;

public class itemlistng_steps {
	   
    itemListingPage ilPage = new itemListingPage();
    ExtentReports extent = ExtentManager.getInstance();
    ExtentTest test;
    
    @Given("user is on item listing page")
    public void user_is_on_item_listing_page() throws InterruptedException {
    	Thread.sleep(5000);
    	boolean pagepresent = ilPage.itemlistingpageheading();
    	Assert.assertTrue(pagepresent, "item listing page is present"); 
    	test = extent.createTest("item listing Test");
    	test.info("user is on item listing page");
    }
    
    @When("first item name should be same as item searched")
    public void first_item_name_should_be_same_as_item_searched() {
   	String itemname= ilPage.firstitemname_listing_page();
    	Assert.assertEquals(itemname, "Apple iPhone 15 (128 GB) - Black");  
    	test.info("searched item is visible");
    }
    
    @When("item dicount price is less then lakh")
    public void item_dicount_price_is_less_then_actual() {
    	boolean pricecompare = ilPage.discount_less_than_99k();
    	Assert.assertTrue(pricecompare, "discount price less than 99k");
    	test.info("item is in budget");
    }
    
    @Then("user is able to click on add to cart")
    public void user_is_able_to_click_on_add_to_cart() throws InterruptedException {
       ilPage.click_addtocart_listingpage();
       Thread.sleep(3000);
       ilPage.click_cartbtn_listingpage();
       test.info("add to cart button is working");
  
    }
    
}

