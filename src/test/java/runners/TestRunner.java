package runners;

import org.testng.annotations.AfterClass;

import DriverManager.DriverManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.ExtentManager;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = "stepdefinitions",
    plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	@AfterClass
    public void tearDown() {
		DriverManager.quitDriver();
        ExtentManager.flushReports();
    }
}
