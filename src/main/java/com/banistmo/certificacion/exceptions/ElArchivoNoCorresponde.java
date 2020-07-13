package com.banistmo.certificacion.exceptions;

public class ElArchivoNoCorresponde extends AssertionError {

    public static final String ARCHIVO_NO_CORRESPONDE_AL_ESPERADO = "El archivo abierto no corresponde al esperado";
    public ElArchivoNoCorresponde(String message, Throwable cause) {
        super(message, cause);
    }
}
