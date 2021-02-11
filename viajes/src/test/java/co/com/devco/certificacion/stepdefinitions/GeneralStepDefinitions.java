package co.com.devco.certificacion.stepdefinitions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class GeneralStepDefinitions {

    /*indicamos el navegador a trabajar*/
    @Managed(driver = "chrome")
    protected WebDriver hisBrowser;

    /*donde se llama el actor y se inicializa la pagina en la url indicada*/
    @SuppressWarnings("unchecked")
    public void setUp(String URL) {
        setTheStage(new Cast());
        theActorCalled("JairoGarcia");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
        theActorInTheSpotlight().wasAbleTo(Open.url(URL));
    }

    public void cerrarNavegador(Actor a){
        BrowseTheWeb.as(a).getDriver().close();
    }
}
