package com.seleccion.banistmo.prueba.automatization.stepdefinitions;

import com.seleccion.banistmo.prueba.automatization.tasks.OpenUp;
import com.seleccion.banistmo.prueba.automatization.tasks.SelectCourse;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SeleccionBanistmoStepDefinition {

    @Managed(driver="chrome")
    private WebDriver ElNavegador;
    private Actor Jean = Actor.named("Jean");

    @Before
    public void setStage(){
        Jean.can(BrowseTheWeb.with(ElNavegador));
    }

    @Given("^that Jean wants to access the Web practice Automation Demo$")
    public void that_Jean_wants_to_access_the_Web_practice_Automation_Demo(){
        Jean.wasAbleTo(OpenUp.thePage());
    }

    @When("^He adds two items to the cart$")
    public void he_adds_two_items_to_the_cart(){
        Jean.wasAbleTo(SelectCourse.enterTo());
    }

    @Then("^he verifies that the screen is loaded with the expected amount$")
    public void he_verifies_that_the_screen_is_loaded_with_the_expected_amount(){

    }
}


