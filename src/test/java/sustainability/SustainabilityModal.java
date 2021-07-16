package sustainability;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;



import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SustainabilityModal implements Task {


    public SustainabilityModal( ) {}

    public static Performable openModal() {
        return instrumented( SustainabilityModal.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SustainabilityPdfForm.BUTTON_ABOUT_US),
                Click.on(SustainabilityPdfForm.BUTTON_CORPORATE_INFORMATION),
                Click.on(SustainabilityPdfForm.BUTTON_SUSTAINABILITY),
                Click.on(SustainabilityPdfForm.BUTTON_GENERATION_SUSTAINABILITY),
                Click.on(SustainabilityPdfForm.BUTTON_PDF)

        );

    }
}