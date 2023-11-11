package Runner_file;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/CUCUMBER_1/src/test/java/feature/fb_login.feature",
glue="StepDefinitions",tags="@RegressionTest"
)
public class Fb_loginrunner {

}
