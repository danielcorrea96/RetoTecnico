package com.banistmo.certificacion.tasks;

import com.banistmo.certificacion.interactions.CambiarVentana;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.annotations.Step;

import java.time.Duration;

import static com.banistmo.certificacion.userinterface.PortalBanistmo.TARIFARIO;
import static com.banistmo.certificacion.userinterface.Tarifario.DOCUMENTOS;

public class AbrirUnArchivo implements Task {
    private String documento;

    public AbrirUnArchivo(String documento) {
        this.documento = documento;
    }

    @Override
    @Step("{0} abre un archivo de la sesion del tarifario")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(TARIFARIO),
                Click.on(DOCUMENTOS.waitingForNoMoreThan(Duration.ofSeconds(5)).of(documento)),
                CambiarVentana.aLaActual()
        );
    }

    public static AbrirUnArchivo delTarifario(String documento){
        return Tasks.instrumented(AbrirUnArchivo.class, documento);
    }

}



