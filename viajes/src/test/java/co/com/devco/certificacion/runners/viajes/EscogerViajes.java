package co.com.devco.certificacion.runners.viajes;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/escoger_hotel.feature",
        glue = "co.com.devco.certificacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class EscogerViajes {

}
