import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
  features = "C:/Users/VC/eclipse-workspace/WebDriverCucumber/features",
  glue={"stepDefinition"},
  tags=("@EndToEnd")
  //plugin= {"html:target/cucumber-html-report","json:target/cucumbeer.json"}
 
 
  )
 

public class CucumberRunner {

}
