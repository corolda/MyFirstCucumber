package com.demoaut.newtours.StepDefinitions;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
                  glue ="com.demoaut.newtours.StepDefinitions",
                  plugin ={"pretty" , "html:reporte"}
		)
public class CucumberTest {

}
