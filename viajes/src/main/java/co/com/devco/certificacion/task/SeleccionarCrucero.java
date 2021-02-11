package co.com.devco.certificacion.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static co.com.devco.certificacion.userinterfase.SeleccionarCrucero.BTN_CRUCERO;
import static co.com.devco.certificacion.userinterfase.SeleccionarCrucero.BTN_SELECCIONA_HABITACION;
import static co.com.devco.certificacion.userinterfase.SeleccionarHotel.BTN_HABITACIÓN;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SeleccionarCrucero implements Task {


    private String numCreucero;
    private String numeroHabitacion;

    public SeleccionarCrucero(String numCreucero, String numeroHabitacion) {
        this.numCreucero = numCreucero;
        this.numeroHabitacion = numeroHabitacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_CRUCERO.of(numCreucero),isPresent()),
                Scroll.to(BTN_CRUCERO.of(numCreucero)),
                Click.on(BTN_CRUCERO.of(numCreucero)));
        cambiarPestaña(actor);
        actor.attemptsTo(
                Scroll.to(BTN_SELECCIONA_HABITACION.of(numeroHabitacion)),
                Click.on(BTN_SELECCIONA_HABITACION.of(numeroHabitacion)),
                Scroll.to(BTN_SELECCIONA_HABITACION.of(numeroHabitacion)),
                Click.on(BTN_SELECCIONA_HABITACION.of(numeroHabitacion)));
    }

    public <T extends Actor> void cambiarPestaña(T actor) {
        WebDriver driver= BrowseTheWeb.as(actor).getDriver();
        Set<String> handlesSet = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<String>(handlesSet);
        driver.switchTo().window(handlesList.get(1));
    }

    public static SeleccionarCrucero con(String numCreucero,String numeroHabitacion){
        return Tasks.instrumented(SeleccionarCrucero.class,numCreucero,numeroHabitacion);
    }
}
