package com.banistmo.certificacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import java.util.Set;

public class CambiarVentana implements Interaction {

    private String ventanaPadre;
    private Set<String> ventanas;

    @Override
    public <T extends Actor> void performAs(T actor) {

        ventanaPadre = BrowseTheWeb.as(actor).getDriver().getWindowHandle();
        ventanas = BrowseTheWeb.as(actor).getDriver().getWindowHandles();

        for (String ventanaActual: ventanas) {
            if (!ventanaActual.equals(ventanaPadre)){
                BrowseTheWeb.as(actor).getDriver().switchTo().window(ventanaActual);
            }
        }
    }

    public static CambiarVentana aLaActual(){
        return new CambiarVentana();
    }
}
