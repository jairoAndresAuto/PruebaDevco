package co.com.devco.certificacion.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static co.com.devco.certificacion.userinterfase.InformacionHotel.*;

public class LlenarInformaciónHotel implements Task {

    private List<Map<String,String>> informacion;

    public LlenarInformaciónHotel(List<Map<String, String>> informacion) {
        this.informacion = informacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SELECCIONAR_DESTINO),
                Enter.theValue(informacion.get(0).get("Pais")).into(TXT_CIUDAD_DESTINO),
                Click.on(CIUDADES_DESTINO),
                Click.on(BTN_CHECKIN),
                BuscarFecha.deCalentario(informacion.get(0).get("fecha_inicial")),
                Click.on(BTN_FECHA.of(informacion.get(0).get("fecha_final"))),
                Click.on(BTN_DONE),
                Click.on(BTN_BUSCAR)
        );

    }

    public static LlenarInformaciónHotel con(List<Map<String,String>> informacion){
        return Tasks.instrumented(LlenarInformaciónHotel.class,informacion);
    }

}
