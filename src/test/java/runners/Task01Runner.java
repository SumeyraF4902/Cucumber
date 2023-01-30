package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@ CucumberOptions(
    features = "src/test/resources/features/features/Task01.feature",
        glue = "stepdefinitions"
)
public class Task01Runner {
}
