package com.falabella.store.feature;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
//@CucumberOptions(features="src/test/java/com/falabella/store/feature",glue={"src/test/java/com/falabella/store/steps"})
@CucumberOptions(tags={"@StoreTest"})
public class StoreRunner 				
{		

}
