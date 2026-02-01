package io.cucumber.shouty;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        "pretty",
        "html:target/cucumber-html-report",
        "json:target/cucumber.json",
        "junit:target/cucumber.xml"
    },
    features = "classpath:io/cucumber/shouty",
    glue = "io.cucumber.shouty")
public class RunCucumberTest {
  
}
