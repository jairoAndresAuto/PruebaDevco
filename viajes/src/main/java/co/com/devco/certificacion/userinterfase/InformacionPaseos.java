package co.com.devco.certificacion.userinterfase;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class InformacionPaseos {


    public static Target BTN_CIUDAD_DESTINO=
            Target.the("ingresar seleccionar destino").located(By.xpath("//button[@aria-label='Things to do in']"));

    public static Target TXT_CIUDAD_DESTINO=
            Target.the("ingresar seleccionar destino").located(By.xpath("//input[@data-stid='location-field-location-menu-input']"));
    public static Target CIUDADES_DESTINO=
            Target.the("boton seleccionar ciudad destino").located(By.xpath("(//span[contains(.,'Argentina')])[1]"));
}
