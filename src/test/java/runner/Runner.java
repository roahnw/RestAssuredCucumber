package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/main/resources/features/pet.feature"},
        dryRun = !true,
        glue = {"stepDef"},
        monochrome = true
)

public class Runner extends AbstractTestNGCucumberTests {
}
