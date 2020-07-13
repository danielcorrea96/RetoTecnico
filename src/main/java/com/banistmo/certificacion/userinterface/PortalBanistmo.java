package com.banistmo.certificacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class PortalBanistmo extends PageObject {
    public static final Target TARIFARIO = Target.the("Tarifario").locatedBy("//a[contains(text(),'Tarifario')]");
}
