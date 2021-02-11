package co.com.devco.certificacion.userinterfase;

import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarVuelos {

    public static Target BTN_VUELO_IDA=
            Target.the("Boton vuelo ida").locatedBy("(//span[contains(.,'11:10pm')]/../../../../../../..//button)[{0}]");

    public static Target BTN_VUELO_REGRESO=
            Target.the("Boton vuelo regreso").locatedBy("(//span[@data-test-id='departure-time' and contains(.,'10:01pm')]/../../../../../../../..//button)[{0}]");


}
