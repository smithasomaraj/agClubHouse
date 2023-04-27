package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin ={"pretty" , "json:target/cucumber/cucumber.json", "html:target/cucumber/report.html"},
		features = "src/test/resources/features",
		glue = {"step_definitions"},
		tags = "@qt"
		)
public class SingleTestRunner {

}
