package co.com.devco.certificacion.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.certificacion.userinterfase.SeleccionarVuelos.BTN_VUELO_IDA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class SeleccionarVueloDesde implements Task {

    private String numVuelo;

    public SeleccionarVueloDesde(String numVuelo) {
        this.numVuelo = numVuelo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_VUELO_IDA.of(numVuelo), isClickable()),
                Scroll.to(BTN_VUELO_IDA.of(numVuelo)),
                Click.on(BTN_VUELO_IDA.of(numVuelo))
        );
    }

    public static SeleccionarVueloDesde con(String numVuelo){
        return Tasks.instrumented(SeleccionarVueloDesde.class,numVuelo);
    }
}
