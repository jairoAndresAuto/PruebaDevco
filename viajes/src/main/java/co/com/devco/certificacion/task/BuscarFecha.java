package co.com.devco.certificacion.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.certificacion.userinterfase.InformacionHotel.BTN_FECHA;
import static co.com.devco.certificacion.userinterfase.InformacionHotel.BTN_SIGUIENTE_MES;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarFecha implements Task {

    private String fecha;

    public BuscarFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       boolean estaDato=false;
       while (estaDato==false){
           if (BTN_FECHA.of(fecha).resolveFor(actor).isVisible()){
               actor.attemptsTo(Click.on(BTN_FECHA.of(fecha)));
               estaDato=true;
               break;
           }
           actor.attemptsTo(Click.on(BTN_SIGUIENTE_MES));
       }
    }

    public static BuscarFecha deCalentario(String fecha){
        return Tasks.instrumented(BuscarFecha.class,fecha);
    }


}
