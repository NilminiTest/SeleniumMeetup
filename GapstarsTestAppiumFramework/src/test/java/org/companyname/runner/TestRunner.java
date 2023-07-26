package org.companyname.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/features/userDetails.feature",
        glue = {"org.companyname.stepDef"}, // Package containing step definitions
        plugin = {"pretty", "html:target/cucumber-report.html"}
)
public class TestRunner {

}
