package com.seleccion.banistmo.prueba.automatization.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/seleccion.feature",
        tags = "@RC-HP-1",
        glue = "com.seleccion.banistmo.prueba.automatization.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}