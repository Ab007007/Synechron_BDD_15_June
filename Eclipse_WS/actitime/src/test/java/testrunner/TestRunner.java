package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/feature/",
		glue = {"stepdefinitons"},
		tags = "@development",
//		tags = "@google and @regression",
//		tags = "@google or @regression",
//		tags = "@regression and not @smoke",
//		dryRun = true,
		monochrome = true, 
		plugin = {"pretty","junit:target/JunitReports/reports.xml",
							"json:target/JsonReports/reports.json", 
							"html:target/HTMLReports/reports.html"}
		)
public class TestRunner {

}
