package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        monochrome = true,
        tags = "@RegressionTest",
        plugin = {"pretty",
                "html:target/reports/cucumber.html",
                "json:target/reports/cucumber.json",}
)
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
