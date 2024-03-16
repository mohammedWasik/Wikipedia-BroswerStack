package Wikipedia_BDD.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/java/Wikipedia_BDD/features"},
        glue = {"Wikipedia_BDD.stepDefinition","Wikipedia_BDD.hooks"}
)
public class WikipediaBDDTest extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}