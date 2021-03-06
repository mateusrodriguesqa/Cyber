package execute;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/AutomationDemoSite.feature", 
      glue = "",
      tags = { "@SuiteDeTeste" }, 
      plugin = { },
      monochrome = true, 
      snippets = SnippetType.CAMELCASE, 
      dryRun = false, 
      strict = true)

public class Runner {

}