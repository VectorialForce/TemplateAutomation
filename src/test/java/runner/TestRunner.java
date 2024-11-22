package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {
    public TestRunner() {
    }

    @AfterClass
    public static void cleanDriver() {
        BasePage.closeBrowser();
    }
}
