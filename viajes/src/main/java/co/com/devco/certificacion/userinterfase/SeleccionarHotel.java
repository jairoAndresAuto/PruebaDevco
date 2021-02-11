package co.com.devco.certificacion.userinterfase;

import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarHotel {

    public static Target BTN_HOTEL=
            Target.the("Boton menu").locatedBy("//a[@rel='noopener noreferrer' and contains(.,'{0}')]");
    public static Target BTN_HABITACIÓN=
            Target.the("Boton menu").locatedBy("(//button[@data-stid='submit-hotel-reserve'])[{0}]");



}
