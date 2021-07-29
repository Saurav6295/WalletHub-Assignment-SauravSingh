package TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "G:\\Automation testing\\HandsOn\\Wallethub_SauravSingh\\src\\main\\java\\Feature\\WalletHub.feature"
,glue= {"StepDefinition"}
,dryRun=false
,monochrome=true
,strict=true
		)

public class WallethubTestRunner {

	public static void main(String[] args) {
		

	}

}
