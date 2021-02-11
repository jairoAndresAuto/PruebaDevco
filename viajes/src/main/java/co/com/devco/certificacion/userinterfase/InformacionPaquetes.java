package co.com.devco.certificacion.userinterfase;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class InformacionPaquetes {

    public static Target TXT_CIUDAD_DESDE=
            Target.the("ingresar seleccionar destino").located(By.xpath("//input[@data-stid='location-field-origin-menu-input']"));

    public static Target TXT_CIUDAD_DESTINO=
            Target.the("ingresar seleccionar destino").located(By.xpath("//input[@data-stid='location-field-destination-menu-input']"));
    public static Target BTN_DONE=
            Target.the("boton hecho").located(By.xpath("(//button[contains(.,'Done')])[2]//span"));
}
