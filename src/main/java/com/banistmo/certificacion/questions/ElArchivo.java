package com.banistmo.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ElArchivo implements Question<Boolean> {

    private String documento;

    public ElArchivo(String documento) {
        this.documento = documento;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).getDriver().getCurrentUrl().contains(documento);
    }



    public static ElArchivo delDocumentoSeleccionado(String documento){
        return new ElArchivo(documento);
    }

}
