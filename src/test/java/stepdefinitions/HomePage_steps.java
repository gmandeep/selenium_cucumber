package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import DriverManager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.ConfigReader;
import utils.ExtentManager;

public class HomePage_steps {

	HomePage hp = new HomePage();
	
	   ExtentReports extent = ExtentManager.getInstance();
	    ExtentTest test;

    @Given("I am on homePage")
    public void I_am_on_homePage() throws InterruptedException {
     //   String baseUrl = ConfigReader.getProperty("baseUrl");
        DriverManager.getDriver().get("https://www.amazon.in/");
        Thread.sleep(2000);
        test = extent.createTest("Login Test");
        test.info("User navigated to home page");
        
    }

    @When("I search for item name {string}")
    public void I_search_for_item_name(String item) throws InterruptedException {
        hp.clicksearchbutton();
        hp.EnterSearchtext(item);
        Thread.sleep(2000);
        hp.clicksearchbutton();
        test.info("search button is working");
    }

    @Then("iphone listing page should reflect")
    public void iphone_listing_page_should_reflect() {
       hp.getLoginPageTitle();
       test.info("user is on item listing page");
       
    }
}
