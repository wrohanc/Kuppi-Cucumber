import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by rohan on 2017-07-03.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "features",plugin = {"pretty", "html:target/cucumber"})
public class MyRunner {
}
