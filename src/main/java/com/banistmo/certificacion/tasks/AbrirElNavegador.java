package com.banistmo.certificacion.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class AbrirElNavegador implements Task {
    private PageObject pagina;

    public AbrirElNavegador(PageObject pagina) {
        this.pagina = pagina;
    }

    @Override
    @Step("{0} intenta abrir el navegador en la #pagina")
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(pagina));
    }

    public static AbrirElNavegador enLaPagina(PageObject pagina){
        return Tasks.instrumented(AbrirElNavegador.class, pagina);
    }
}
