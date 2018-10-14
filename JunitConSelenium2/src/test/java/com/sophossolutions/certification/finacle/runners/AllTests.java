package com.sophossolutions.certification.finacle.runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.sophossolutions.certification.finacle.stepdefinitions.BuscarGoogle;

@RunWith(Suite.class)
@SuiteClasses({BuscarGoogle.class})
public class AllTests {

}
