package runners;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"//will generate json report but needs to be run from command-line
        },
        features = {"classpath:features"},
        glue = {"step_defs"},
        tags = {"@smoke"},
        dryRun = false
        // If it is set to true, it will mean that Cucumber checks every Step mentioned in the
        // Feature File have corresponding code written in Step Definition file or not.
)
public class SmokeRunner {

}









