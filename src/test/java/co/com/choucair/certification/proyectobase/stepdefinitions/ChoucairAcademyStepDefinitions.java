package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^An user wants to learn automation at the Choucair Academy$")
    public void AnUserWantsToLearnAutomationAtTheChoucairAcademy () {
        OnStage.theActorCalled("An user").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));

    }

    @When("^The user searches for the course (.*) on the Choucair Academy platform$")
    public void TheUserSearchesForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));

    }

    @Then("^The user finds the course resources (.*)$")
    public void TheUserFindsTheCourseResourcesRecursosAutomatizacionBancolombia(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }
}
