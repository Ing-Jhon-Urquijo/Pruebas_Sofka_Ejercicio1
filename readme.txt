Instrucciones de Ejecución:

1. Asegúrate de tener Java (versión 17 o superior), Maven y Chrome instalados en tu sistema.
2. Abre una terminal o línea de comandos y navega hasta el directorio raíz del proyecto `saucedemo-serenity-jhon`.
3. Ejecuta el test completo con el siguiente comando:
   `mvn clean verify`
4. Este comando limpiará el proyecto, compilará el código y ejecutará el escenario de prueba.

Cómo ver los reportes:

Al finalizar la ejecución, se generará un reporte de Serenity en la siguiente ruta:
   `target/site/serenity/index.html`

Si el reporte no se ve correctamente (sin formato) al abrirlo directamente, es un problema de seguridad del navegador. Para solucionarlo:

1. Abre una terminal y navega hasta el directorio del reporte:
   `cd target/site/serenity`
2. Inicia un servidor web local con Python:
   `python -m http.server`
3. Abre tu navegador y accede a `http://localhost:8000` para ver el reporte con el formato correcto.
