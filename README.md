### springboot
 - Se desarrolla código y se sube al repositorio
 - Se crea prueba unitaria utilizando Kata TDD 
 - Se crea pipeline de integración continua
 - Se valida compilación del proyecto (si falla, rompe el pipeline) 
 - Se valida pruebas unitarias y se genera reporte (si falla, rompe el pipeline y muestra mensaje, de lo contrario continúa flujo y muestra mensaje)
 - Crea branch release para ser mergeado con la rama develop
 - Crea pullrequest para mergear entre develop --> release y relese --> main listo para salir a producción.
 
