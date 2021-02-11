package co.com.devco.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarTexto implements Question<Boolean> {

    private String descripcion;
    Target target;

    public ValidarTexto(String descripcion, Target target){
        this.descripcion = descripcion;
        this.target=target;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(target).viewedBy(actor).asString().contains(descripcion);
    }

    public static ValidarTexto conMensaje(String descripcion,Target target) {
        return new ValidarTexto(descripcion,target);
    }
}
