package com.banistmo.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Tarifario {
    public static final Target DOCUMENTOS = Target.the("Documentos").locatedBy("//span[contains(text(),'{0}')]//following::a[1]");
}
