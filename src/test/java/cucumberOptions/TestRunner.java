package cucumberOptions;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class) /* .......to run the test with junit */
@CucumberOptions(
		features="src/test/java/features",
		glue="step_Defination")
public class TestRunner /* extends AbstractTestNGCucumberTests */////to run the test with testng we extends this class  AbstractTestNGCucumberTests 
{

}
