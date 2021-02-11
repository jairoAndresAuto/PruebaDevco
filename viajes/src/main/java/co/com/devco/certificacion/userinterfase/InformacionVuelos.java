package co.com.devco.certificacion.userinterfase;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class InformacionVuelos {

    public static Target BTN_SELECCIONAR_DESDE=
            Target.the("boton seleccionar desde").located(By.xpath("//button[@aria-label='Leaving from']"));
    public static Target TXT_CIUDAD_DESDE=
            Target.the("ingresar seleccionar desde").located(By.xpath("//input[@data-stid='location-field-leg1-origin-menu-input']"));
    public static Target CIUDADES_DESDE=
            Target.the("boton seleccionar ciudad desde").located(By.xpath("//span[contains(.,'Bogota')]"));

    public static Target BTN_SELECCIONAR_DESTINO=
            Target.the("boton seleccionar destino").located(By.xpath("//button[@aria-label='Going to']"));
    public static Target TXT_CIUDAD_DESTINO=
            Target.the("ingresar seleccionar destino").located(By.xpath("//input[@data-stid='location-field-leg1-destination-menu-input']"));
    public static Target CIUDADES_DESTINO=
            Target.the("boton seleccionar ciudad destino").located(By.xpath("//span[contains(.,'Buenos Aires')]"));

    public static Target BTN_HECHO=
            Target.the("boton hecho").located(By.xpath("(//button[contains(.,'Done')])[2]//span"));

    public static Target BTN_CHECKIN=
            Target.the("boton seleccionar checkin").located(By.id("d1-btn"));

}
