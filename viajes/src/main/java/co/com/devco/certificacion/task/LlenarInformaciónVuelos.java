package co.com.devco.certificacion.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static co.com.devco.certificacion.userinterfase.InformacionHotel.*;
import static co.com.devco.certificacion.userinterfase.InformacionVuelos.BTN_CHECKIN;
import static co.com.devco.certificacion.userinterfase.InformacionVuelos.*;
import static co.com.devco.certificacion.userinterfase.InformacionVuelos.BTN_SELECCIONAR_DESTINO;
import static co.com.devco.certificacion.userinterfase.InformacionVuelos.CIUDADES_DESTINO;
import static co.com.devco.certificacion.userinterfase.InformacionVuelos.TXT_CIUDAD_DESTINO;

public class LlenarInformaciónVuelos implements Task {

    private List<Map<String,String>> informacion;

    public LlenarInformaciónVuelos(List<Map<String, String>> informacion) {
        this.informacion = informacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Click.on(BTN_SELECCIONAR_DESDE),
               Enter.theValue(informacion.get(0).get("origen")).into(TXT_CIUDAD_DESDE),
               Click.on(CIUDADES_DESDE),
               Click.on(BTN_SELECCIONAR_DESTINO),
               Enter.theValue(informacion.get(0).get("destino")).into(TXT_CIUDAD_DESTINO),
               Click.on(CIUDADES_DESTINO),
               Click.on(BTN_CHECKIN),
               BuscarFecha.deCalentario(informacion.get(0).get("fecha_inicial")),
               Click.on(BTN_FECHA.of(informacion.get(0).get("fecha_final"))),
               Click.on(BTN_HECHO),
               Click.on(BTN_BUSCAR)
       );
    }

    public static LlenarInformaciónVuelos con(List<Map<String,String>> informacion){
        return Tasks.instrumented(LlenarInformaciónVuelos.class,informacion);
    }


}
