package co.com.devco.certificacion.userinterfase;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class InformacionHotel {

    public static Target BTN_SELECCIONAR_DESTINO=
            Target.the("boton seleccionar destino").located(By.xpath("//button[@aria-label='Going to']"));
    public static Target TXT_CIUDAD_DESTINO=
            Target.the("ingresar seleccionar destino").located(By.xpath("//input[@data-stid='location-field-destination-menu-input']"));
    public static Target CIUDADES_DESTINO=
            Target.the("boton seleccionar ciudad destino").located(By.xpath("(//span[contains(.,'Argentina')])[1]"));
    public static Target BTN_CHECKIN=
            Target.the("boton seleccionar checkin").located(By.xpath("//button[@data-stid='open-date-picker']"));
    public static Target BTN_FECHA=
            Target.the("boton seleccionar fecha").locatedBy("//button[@aria-label='{0}.']");
    public static Target BTN_SIGUIENTE_MES=
            Target.the("boton siguiente mes").located(By.xpath("//button[@data-stid='date-picker-paging'][2]"));
    public static Target BTN_DONE=
            Target.the("boton hecho").located(By.xpath("(//button[contains(.,'Done')])[1]//span"));
    public static Target BTN_BUSCAR=
            Target.the("boton hecho").located(By.xpath("//div[@class='uitk-layout-grid-item uitk-layout-grid-item-columnspan-small-1 uitk-layout-grid-item-columnspan-medium-2 uitk-layout-grid-item-columnspan-large-2 ']"));



}
