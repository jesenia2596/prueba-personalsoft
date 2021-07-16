package stepdefinitions;


import cucumber.api.PendingException;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navegation.Navegation;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import sustainability.SustainabilityPdfForm;
import sustainability.SustainabilityQuestions;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class SustainabilityStepDefinitions  extends PageObject {
    private String actor;

    @Before
    public void seeTheStage(){
        this.actor="user";
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("user is page")
    public void user_is_page() {
        theActorCalled( actor ).attemptsTo(Navegation.theRequestPage());;
    }

    @When("Users click in ABOUT US")
    public void users_click_in_ABOUT_US()  {
        theActorCalled(actor).attemptsTo(Click.on(SustainabilityPdfForm.BUTTON_ABOUT_US));
    }

    @When("Users click in CORPORATE INFORMATION")
    public void users_click_in_CORPORATE_INFORMATION() {
        theActorCalled(actor).attemptsTo(Click.on(SustainabilityPdfForm.BUTTON_CORPORATE_INFORMATION));
    }

    @When("Users click in SUSTAINABILITY")
    public void users_click_in_SUSTAINABILITY() {
        theActorCalled(actor).attemptsTo(Click.on(SustainabilityPdfForm.BUTTON_SUSTAINABILITY));
    }

    @When("Users click in GENERATION SUSTAINABILITY")
    public void users_click_in_GENERATION_SUSTAINABILITY() throws InterruptedException {
        Thread.sleep(3000);
        theActorCalled(actor).attemptsTo(Click.on(SustainabilityPdfForm.BUTTON_GENERATION_SUSTAINABILITY));
    }

    @When("Users click in PDF")
    public void users_click_in_PDF() throws InterruptedException {
        Thread.sleep(2000);
        theActorCalled(actor).attemptsTo(Click.on(SustainabilityPdfForm.BUTTON_PDF));
    }


    @Then("You should see the PDF")
    public void you_should_see_the_PDF() throws InterruptedException {
        WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
        String url =driver.findElement( SustainabilityPdfForm.BUTTON_PDF ).getAttribute("href");

        List<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window( tabs.get(1));

        //theActorCalled(actor).attemptsTo(Click.on(SustainabilityPdfForm.TITLE_PDF));
        theActorInTheSpotlight().should(
                seeThat("The view PDF ", SustainabilityQuestions.existItemCreated( url ), equalTo(true))
        );
    }


}