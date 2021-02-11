package co.com.devco.certificacion.task;

import co.com.devco.certificacion.userinterfase.MenuEscogerOpcion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarDelMenu implements Task {

    private String opcion;

    public SeleccionarDelMenu(String opcion) {
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuEscogerOpcion.BTN_MENU.of(opcion)));
    }

    public static SeleccionarDelMenu con(String opcion){
        return Tasks.instrumented(SeleccionarDelMenu.class,opcion);
    }


}
