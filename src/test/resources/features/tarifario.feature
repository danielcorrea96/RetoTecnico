#language: es
Característica: Tarifario
  Yo como cliente de Banistmo
  Quiero abrir el archivo de las tarifas de cuentas de depositos en la sección de tarifario
  Para validar que el archivo corresponda a lo esperado para las tarifas de cuentas de depositos


  Escenario: Abrir archivo de las tarifas de cuentas de depositos en la seccion de tarifario
    Dado que Daniel procede ingresar el portal de banistmo
    Cuando Daniel intenta abrir el archivo del tarifario con nombre Tarifas de Cuentas de Depósitos
    Entonces Daniel espera ver que el archivo contenga ActualizacionTarifarioDepositos

