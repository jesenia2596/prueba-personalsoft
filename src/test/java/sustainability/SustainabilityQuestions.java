package sustainability;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;


public class SustainabilityQuestions {

    public static Question<Boolean> existItemCreated(String url) {


        return actor -> BrowseTheWeb.as(actor).compatibleWithUrl( url );
    }
}

