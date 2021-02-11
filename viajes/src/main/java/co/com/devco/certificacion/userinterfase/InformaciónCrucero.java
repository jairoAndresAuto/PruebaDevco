package co.com.devco.certificacion.userinterfase;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class InformaciónCrucero {

    public static Target SLC_DESTINO=
            Target.the("ingresar seleccionar destino").located(By.id("cruise-destination"));


    public static Target BTN_HECHO=
            Target.the("ingresar seleccionar destino").located(By.xpath("//button//span[contains(.,'Done')]"));


}
