package org.testtt;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources",glue = "org.testtt" ,
plugin = {"html:Report","junit:Report//Junitscent.xml","json:Report//jsonscent.json"}
)
public class RunnerClass {
//check changes
}
