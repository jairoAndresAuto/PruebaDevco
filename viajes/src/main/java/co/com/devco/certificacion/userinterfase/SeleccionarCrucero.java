package co.com.devco.certificacion.userinterfase;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarCrucero {

    public static Target BTN_CRUCERO =
            Target.the("Boton hotel").locatedBy("(//div[@class='sailing-cruise-card-buttons-container']//a[contains(.,'Continue')])[{0}]");

    public static Target BTN_SELECCIONA_HABITACION =
            Target.the("Boton hotel").locatedBy("(//a[contains(.,'Continue')])[{0}]");

}
