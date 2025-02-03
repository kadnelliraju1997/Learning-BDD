package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "./src/test/java/features" }, glue = { "stepDefinition", "hook" },
		/* tags = "@Search", */
		dryRun = false, plugin = { "html:Reports/cucumberReports.html", "json:Reports/CucumberJSONReport.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
