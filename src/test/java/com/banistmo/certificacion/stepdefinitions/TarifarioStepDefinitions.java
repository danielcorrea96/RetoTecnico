package com.banistmo.certificacion.stepdefinitions;

import com.banistmo.certificacion.exceptions.ElArchivoNoCorresponde;
import com.banistmo.certificacion.questions.ElArchivo;
import com.banistmo.certificacion.tasks.AbrirElNavegador;
import com.banistmo.certificacion.tasks.AbrirUnArchivo;
import com.banistmo.certificacion.userinterface.PortalBanistmo;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static com.banistmo.certificacion.exceptions.ElArchivoNoCorresponde.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class TarifarioStepDefinitions {

    private PortalBanistmo portalBanistmo;

    @Before
    public void configuracionesPrevias(){
        setTheStage(new OnlineCast());
    }

    @Dado("^que Daniel procede ingresar el portal de banistmo$")
    public void queDanielProcedeIngresarElPortalDeBanistmo() {
        theActorCalled("Daniel").wasAbleTo(
                AbrirElNavegador.enLaPagina(portalBanistmo));
    }


    @Cuando("^Daniel intenta abrir el archivo del tarifario con nombre (.*)$")
    public void danielIntentaAbrirElArchivoDeLasTarifasDeCuentasDeDepositos(String documento) {
        theActorInTheSpotlight().attemptsTo(AbrirUnArchivo.delTarifario(documento));
    }

    @Entonces("^Daniel espera ver que el archivo contenga (.*)$")
    public void danielEsperaVerElArchivo(String documento) {
        theActorInTheSpotlight().should(seeThat(ElArchivo.delDocumentoSeleccionado(documento))
                .orComplainWith(ElArchivoNoCorresponde.class, ARCHIVO_NO_CORRESPONDE_AL_ESPERADO));
    }
}
