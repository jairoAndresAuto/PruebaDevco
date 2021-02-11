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

import static co.com.devco.certificacion.userinterfase.SeleccionarHotel.BTN_HABITACIÓN;
import static co.com.devco.certificacion.userinterfase.SeleccionarHotel.BTN_HOTEL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SeleccionarHotel implements Task {

    private String nombreHotel;
    private String numeroHabitacion;

    public SeleccionarHotel(String nombreHotel, String numeroHabitacion) {
        this.nombreHotel = nombreHotel;
        this.numeroHabitacion = numeroHabitacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_HOTEL.of(nombreHotel),isPresent()),
                Scroll.to(BTN_HOTEL.of(nombreHotel)),
                Click.on(BTN_HOTEL.of(nombreHotel)));
        cambiarPestaña(actor);
        actor.attemptsTo(Click.on(BTN_HABITACIÓN.of(numeroHabitacion)));
    }

    public <T extends Actor> void cambiarPestaña(T actor) {
        WebDriver driver= BrowseTheWeb.as(actor).getDriver();
        Set<String> handlesSet = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<String>(handlesSet);
        driver.switchTo().window(handlesList.get(1));
    }


    public static SeleccionarHotel con(String nombreHotel,String numeroHabitacion){
        return Tasks.instrumented(SeleccionarHotel.class,nombreHotel,numeroHabitacion);
    }

}
