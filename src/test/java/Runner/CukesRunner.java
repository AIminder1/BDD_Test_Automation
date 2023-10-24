package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/TestResult.html"},
        features = "src/test/java/Resources",
        glue = "StepDef",
        tags = "@smoke",
        dryRun = false

)

public class CukesRunner {
}
