package fst_Appium;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Activity1",
    glue = {"stepDefinitions"},
    tags = {"@activity1"},
    strict=true
)

public class ActivitiesRunner {
    //empty
}