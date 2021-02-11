package co.com.devco.certificacion.userinterfase;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class pagar {

    public static Target LBL_PAGAR_HOTEL=
            Target.the("mensaje pago hotel").located(By.xpath("//h2[contains(.,'Your payment options')]"));

    public static Target LBL_PAGAR_VUELOS=
            Target.the("mensaje pago hotel").located(By.xpath("//h2[contains(.,'Unlock trip savings up to')]"));

    public static Target LBL_PAGAR_PAQUETE=
            Target.the("mensaje pago hotel").located(By.xpath("//span[contains(.,'Starting price')]"));

    public static Target LBL_PASEOS=
            Target.the("mensaje pago hotel").located(By.xpath("//h3[contains(.,'Sorry')]"));

}
