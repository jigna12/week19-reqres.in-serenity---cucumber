package in.reqres.cucumber;

import cucumber.api.CucumberOptions;
import in.reqres.testbase.TestBase;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * created by krishna
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/resources/feature/",
tags = "@SMOKE")//feature contactpath
public class CucumberRunner extends TestBase {

}
