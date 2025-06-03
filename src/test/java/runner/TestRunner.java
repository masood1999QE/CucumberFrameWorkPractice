package runner;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("StepDefinitions")
@ConfigurationParameter(key = Constants.FEATURES_PROPERTY_NAME,value = "src\\test\\java\\Features\\searchItems.feature")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME,value = "StepDefinitions")
@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME,value = "@SmokeTest")
@ConfigurationParameter(key = Constants.EXECUTION_DRY_RUN_PROPERTY_NAME,value = "false")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, html:target-output/cucumber-report/cucumber.html")
public class TestRunner {

}