# Proyecto Final - Automatización de Pruebas E2E

Este proyecto contiene la automatización de pruebas End-to-End (E2E) para el sitio de comercio electrónico "Remeras Shop", desarrollado como trabajo final del curso de Testing Automatizado.

## Tecnologías Utilizadas

*   **Lenguaje:** Java 17+
*   **Framework de Pruebas:** JUnit
*   **Automatización Web:** Selenium WebDriver
*   **BDD:** Cucumber (Gherkin)
*   **Gestión de Dependencias:** Maven

## Estructura del Proyecto

El proyecto sigue el patrón **Page Object Model (o similar adaptado a Steps)** y estructura estándar de Maven:

*   `src/test/resources/features`: Archivos `.feature` con los escenarios de prueba en Gherkin.
*   `src/test/java/steps`: Definición de los pasos (Step Definitions) que ejecutan la lógica de automatización.
*   `src/test/java/runners`: Clase `TestRunner` para ejecutar las pruebas con Cucumber.

## Pre-requisitos

*   Java JDK 17 o superior instalado.
*   Maven instalado y configurado en el PATH.
*   Google Chrome instalado (el driver se gestiona automáticamente o debe coincidir con la versión del navegador).

## Ejecución de las Pruebas

Para ejecutar todas las pruebas, abre una terminal en la raíz del proyecto y ejecuta:

```bash
mvn test
```

Esto compilará el proyecto, ejecutará los escenarios definidos en los archivos `.feature` y generará los reportes correspondientes.

## Escenario Principal

El escenario principal automatizado es "Compra exitosa con cupón y tarjeta de crédito", que cubre el flujo completo:
1.  Navegación al home.
2.  Selección de productos (Remera Negra y Blanca) con talles y colores específicos.
3.  Uso del carrito y aplicación de cupón.
4.  Proceso de Checkout (Datos personales, Envío, Pago con Tarjeta).
5.  Validación de la confirmación de compra (Número de orden, URL, Resumen).

