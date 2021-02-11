package co.com.devco.certificacion.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.certificacion.userinterfase.SeleccionarVuelos.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SeleccionarVueloDestino implements Task {

    private String numeroVuelto;

    public SeleccionarVueloDestino(String numeroVuelto) {
        this.numeroVuelto = numeroVuelto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_VUELO_REGRESO.of(numeroVuelto),isClickable()),
                Scroll.to(BTN_VUELO_REGRESO.of(numeroVuelto)),
                Click.on(BTN_VUELO_REGRESO.of(numeroVuelto))

        );
    }


    public static SeleccionarVueloDestino con(String numeroVuelto){
        return Tasks.instrumented(SeleccionarVueloDestino.class,numeroVuelto);
    }
}
