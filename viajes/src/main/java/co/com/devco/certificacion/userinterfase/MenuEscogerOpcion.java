package co.com.devco.certificacion.userinterfase;

import net.serenitybdd.screenplay.targets.Target;

public class MenuEscogerOpcion {

    public static Target BTN_MENU=
            Target.the("Boton menu").locatedBy("(//a[@class='uitk-tab-anchor'])[{0}]");

}
