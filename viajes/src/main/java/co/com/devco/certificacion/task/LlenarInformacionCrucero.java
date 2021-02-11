package co.com.devco.certificacion.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;
import java.util.Map;


import static co.com.devco.certificacion.userinterfase.InformacionHotel.BTN_BUSCAR;
import static co.com.devco.certificacion.userinterfase.InformacionHotel.BTN_CHECKIN;
import static co.com.devco.certificacion.userinterfase.InformacionHotel.BTN_FECHA;
import static co.com.devco.certificacion.userinterfase.InformaciónCrucero.BTN_HECHO;
import static co.com.devco.certificacion.userinterfase.InformaciónCrucero.SLC_DESTINO;

public class LlenarInformacionCrucero implements Task {

    private List<Map<String,String>> informacion;

    public LlenarInformacionCrucero(List<Map<String, String>> informacion) {
        this.informacion = informacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(informacion.get(0).get("destino")).from(SLC_DESTINO),
                Click.on(BTN_CHECKIN),
                BuscarFecha.deCalentario(informacion.get(0).get("fecha_inicial")),
                Click.on(BTN_FECHA.of(informacion.get(0).get("fecha_final"))),
                Click.on(BTN_HECHO),
                Click.on(BTN_BUSCAR)
        );

    }

    public static LlenarInformacionCrucero con(List<Map<String,String>> informacion){
        return Tasks.instrumented(LlenarInformacionCrucero.class,informacion);
    }
}
