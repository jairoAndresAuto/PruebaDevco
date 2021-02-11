package co.com.devco.certificacion.task;

import co.com.devco.certificacion.userinterfase.InformacionVuelos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;
import java.util.Map;

import static co.com.devco.certificacion.userinterfase.InformacionHotel.BTN_BUSCAR;
import static co.com.devco.certificacion.userinterfase.InformacionHotel.BTN_FECHA;
import static co.com.devco.certificacion.userinterfase.InformacionPaquetes.*;
import static co.com.devco.certificacion.userinterfase.InformacionPaquetes.TXT_CIUDAD_DESDE;
import static co.com.devco.certificacion.userinterfase.InformacionPaquetes.TXT_CIUDAD_DESTINO;
import static co.com.devco.certificacion.userinterfase.InformacionVuelos.*;
import static co.com.devco.certificacion.userinterfase.InformacionVuelos.BTN_CHECKIN;
import static co.com.devco.certificacion.userinterfase.InformacionVuelos.BTN_SELECCIONAR_DESTINO;
import static co.com.devco.certificacion.userinterfase.InformacionVuelos.CIUDADES_DESTINO;

public class InformaciónPaquetes implements Task {

    private List<Map<String,String>> informacion;

    public InformaciónPaquetes(List<Map<String, String>> informacion) {
        this.informacion = informacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SELECCIONAR_DESDE),
                Enter.theValue(informacion.get(0).get("origen")).into(TXT_CIUDAD_DESDE),
                Click.on(CIUDADES_DESDE),
                Click.on(BTN_SELECCIONAR_DESTINO),
                Enter.theValue("Argentina").into(TXT_CIUDAD_DESTINO),
                Click.on(CIUDADES_DESTINO),
                Click.on(BTN_CHECKIN),
                BuscarFecha.deCalentario(informacion.get(0).get("fecha_inicial")),
                Click.on(BTN_FECHA.of(informacion.get(0).get("fecha_final"))),
                Scroll.to(BTN_DONE),
                Click.on(BTN_DONE),
                Click.on(BTN_BUSCAR)
        );

    }

    public static InformaciónPaquetes con(List<Map<String,String>> informacion){
        return Tasks.instrumented(InformaciónPaquetes.class,informacion);
    }
}
