package com.cts.goni.cucumber.stepdefs;

import com.cts.goni.GoniSoftwareApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = GoniSoftwareApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
