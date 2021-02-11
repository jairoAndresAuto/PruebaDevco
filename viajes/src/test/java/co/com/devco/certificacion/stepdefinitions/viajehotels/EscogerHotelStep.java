package co.com.devco.certificacion.stepdefinitions.viajehotels;

import co.com.devco.certificacion.questions.ValidarTexto;
import co.com.devco.certificacion.stepdefinitions.GeneralStepDefinitions;
import co.com.devco.certificacion.task.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;

import java.util.List;
import java.util.Map;

import static co.com.devco.certificacion.userinterfase.pagar.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EscogerHotelStep extends GeneralStepDefinitions {

    @Given("^luego de ingresar a la pagina de travelocity$")
    public void luegoDeIngresarALaPaginaDeTravelocity() {

        setUp("https://www.travelocity.com/?pwaLob=wizard-hotel-pwa");
    }

    @When("^selecciono la opción (.*)$")
    public void seleccionoLaOpciónFlight(String opcion) {
        theActorInTheSpotlight().attemptsTo(SeleccionarDelMenu.con(opcion));
    }

    @When("^proceded a ingresar la información solicitada y escojo el hotel$")
    public void procededAIngresarLaInformaciónSolicitadaYEscojoElHotel(List<Map<String,String>> informacion) {
        theActorInTheSpotlight().attemptsTo(LlenarInformaciónHotel.con(informacion),
                SeleccionarHotel.con(informacion.get(0).get("nombreHotel"),
                        informacion.get(0).get("habitacion")));
    }

    @Then("^procedo con la reserva (.*)$")
    public void procedoConLaReserva(String mensaje) {
        theActorInTheSpotlight().should(seeThat(ValidarTexto.conMensaje(mensaje, LBL_PAGAR_HOTEL)));
    }

    /*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    @When("^proceded a ingresar la información solicitada y escojo vuelos ida y vuelta$")
    public void procededAIngresarLaInformaciónSolicitadaYEscojoVuelosIdaYVuelta(List<Map<String,String>> informacion) {
        theActorInTheSpotlight().attemptsTo(LlenarInformaciónVuelos.con(informacion),
                SeleccionarVueloDesde.con(informacion.get(0).get("numero_vuelo_ida")),
                SeleccionarVueloDestino.con(informacion.get(0).get("numero_vuelo_vuelta")));
    }

    @Then("^se puede visualizar el siguiente mensaje$")
    public void sePuedeVisualizarElSiguienteMensaje(List<Map<String,String>> mensaje) {
        theActorInTheSpotlight().should(seeThat(ValidarTexto.conMensaje(mensaje.get(0).get("mensaje"), LBL_PAGAR_VUELOS)));
    }

    /*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    @When("^proceded a ingresar la información solicitada, escoje un paquete y lo reserva$")
    public void procededAIngresarLaInformaciónSolicitadaEscojeUnPaqueteYLoReserva(List<Map<String,String>> informacion) {
        theActorInTheSpotlight().attemptsTo(InformaciónPaquetes.con(informacion),
                SeleccionarHotelPaquete.con(informacion.get(0).get("nombreHotel"), informacion.get(0).get("habitacion")),
                SeleccionarVueloDesde.con(informacion.get(0).get("numero_vuelo_ida")),
                SeleccionarVueloDestino.con(informacion.get(0).get("numero_vuelo_vuelta"))
        );
    }

    @Then("^se puede visualizar lo siguiente (.*)$")
    public void sePuedeVisualizarLoSiguienteStartingPrice(String mensaje) {
        theActorInTheSpotlight().should(seeThat(ValidarTexto.conMensaje(mensaje, LBL_PAGAR_PAQUETE)));
    }

    /*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    @When("^proceded a ingresar la información solicitada, escoje un plan y lo reserva$")
    public void procededAIngresarLaInformaciónSolicitadaEscojeUnPlanYLoReserva(List<Map<String,String>> informacion) {
        theActorInTheSpotlight().attemptsTo(LlenarInformaciónPaseos.con(informacion));
    }

    @Then("^se visualiza el siguiente titulo$")
    public void seVisualizaElSiguienteTitulo(List<Map<String,String>> mensaje) {
        theActorInTheSpotlight().should(seeThat(ValidarTexto.conMensaje(mensaje.get(0).get("mensaje"), LBL_PASEOS)));
    }

}
