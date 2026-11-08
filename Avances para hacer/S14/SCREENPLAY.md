<!-- Slide number: 1 -->
# TABLA DE CONTENIDO

![Imagen 3](Imagen3.jpg)
¿QUÉ ES SERENITY BDD?
¿QUÉ ES SCREENPLAY?
¿POR QUÉ SCREENPLAY Y NO PAGE OBJECT?
ARQUITECTURA DE SCREENPLAY
CAPAS PRINCIPALES
CAPAS TRANSVERSALES
ELABORACION DE PROYECTO AUTOMATIZACIÓN WEB

<!-- Slide number: 2 -->

# 1) ¿QUÉ ES SERENITY BDD?

Es una librería de código abierto que ayuda a escribir pruebas de aceptación automatizadas de mayor calidad y más rápido.

Sus principales características son:
Escribir test flexibles y fáciles de mantener
Generar informes ilustrativos sobre las pruebas
Ajustar las pruebas automatizadas a las necesidades del proyecto
Ver cuanto de la aplicación se está probando

<!-- Slide number: 3 -->

# 2) ¿QUÉ ES SCREENPLAY?

<!-- Slide number: 4 -->

# 3) ¿POR QUÉ SCREENPLAY Y NO PAGE OBJECT?

El patrón Page Object no cumple con algunos de los principios SOLID recomendados para realizar código flexible y mantenible.

<!-- Slide number: 5 -->

# 4) ARQUITECTURA DE SCREENPLAY

![Imagen 3](Imagen3.jpg)

<!-- Slide number: 6 -->

Features: En esta capa se escriben los archivos .feature, estos describen las características y escenarios a probar haciendo uso del lenguaje Gherkin.

Runners: Contiene los archivos runner encargados de ejecutar los escenarios de la feature. Se usan las anotaciones @RunWhit() @CucumberOptions() para especificar qué ejecutar y cómo hacerlo.

Step Definitions: Gestiona los code snippets de los steps definidos con las palabras Given, When, Then en los escenarios de los archivos.

Code snippets: Son métodos que mapean las instrucciones de los escenarios
# 5) CAPAS PRINCIPALES

<!-- Slide number: 7 -->

Tasks: Esta carpeta contiene las clases que son el corazón del patrón de screenplay=Las tareas. Las tareas son acciones de alto nivel que definen un conjunto de interacciones en el lenguaje de negocio.

Interactions: Se encargan de las interacciones con la interfaz de usuario. Muchas interacciones ya fueron desarrolladas y se encuentran disponibles gracias a las librerías de screenplay y de serenity BDD. Ejemplo: Open, Click, Enter, Hit, SelectFromOptions….

Questions: Esta capa gestiona los Asserts o verificaciones de las pruebas las cuales son el fin último de las mismas, ya que con estas capturamos la información de la interfaz que puede ser usada. Text, Value, Visibility…

Userinterface: Almacena las clases en las cuales se mapean los elementos de la interfaz de usuario o inputs o botones.
# 5) CAPAS PRINCIPALES

<!-- Slide number: 8 -->

Models: Los objetos de negocio son una abstracción de un ente real o virtual, modelado mediante atributos y métodos

Utils: Contiene clases con los métodos unitarios que pueden ser utilizados libremente por otras clases del proyecto como: Conversores, Waits, verificadores…

Exceptions: Esta es una capa muy importante que tiene como objetivo dar manejo a los errores que pueden presentarse en la aplicación. Es una capa sensible al negocio y particular a cada proyecto.

# 6) CAPAS TRANSVERSALES

<!-- Slide number: 9 -->

![Habitación con servidores iluminados](Picture3.jpg)

# 7) ELABORACION DE PROYECTO AUTOMATIZACIÓN WEB

<!-- Slide number: 10 -->

# CREACION DE PROYECTO Y CONFIGURACION GRADLE

Esperamos que cargue la configuración base para proyectos Gradle

Nombrar y crear el proyecto Gradle
Abrir el IDE

![Imagen 135](Imagen135.jpg)

![Imagen 43](Imagen43.jpg)

![Imagen 8](Imagen8.jpg)

<!-- Slide number: 11 -->
Código base para serenity.properties
Creamos en la raíz del proyecto un archivo texto, lo llamamos serenity.properties y luego escribimos su código base.
#Webdriver settings
webdriver.driver=chrome
webdriver.chrome.driver=src/test/resources/drivers/chromedriver.exe
webdriver.firefox.driver=src/test/resources/drivers/geckodriver.exe
webdriver.ie.driver=src/test/resources/drivers/IEDriverServer.exe
webdriver.timeouts.implicitlywait = 10000
chrome.switches = --no-sandbox; --laging=es; --incognito; --disable-download-notification; --start-maximized; --test-type; --ignore-certificate-errors; --allow-running-insecure-content; --disable-translate; --always-authorize-plugins
# Serenity settings
serenity.project.name = Easy Home Project
serenity.take.screenshots=BEFORE_AND_AFTER_EACH_STEP
serenity.verbose.steps=FALSE
serenity.report.encoding=UTF8
serenity.test.root=net.thucydides.showcase.cucumber.junit
serenity.timeout = 60000
feature.file.encoding =UTF8|

![Imagen 4](Imagen4.jpg)
Raiz del Proyecto

![Imagen 64](Imagen64.jpg)

![Imagen 65](Imagen65.jpg)

![Imagen 11](Imagen11.jpg)

![Imagen 66](Imagen66.jpg)

![Imagen 31](Imagen31.jpg)

![Imagen 63](Imagen63.jpg)

![Imagen 67](Imagen67.jpg)

<!-- Slide number: 12 -->
Configuramos el archivo build.gradle, quien cargara todas las librerías y dependencias para ejecutar la automatización.

![Imagen 1](Imagen1.jpg)

![Imagen 24](Imagen24.jpg)

![Imagen 4](Imagen4.jpg)
Click
Escribimos el código

![Imagen 23](Imagen23.jpg)

![Imagen 5](Imagen5.jpg)

![Imagen 25](Imagen25.jpg)

<!-- Slide number: 13 -->
Código base para build.gradle
repositories {
mavenCentral()
}
buildscript {
repositories {
mavenCentral()
}
dependencies {
classpath("net.serenity-bdd:serenity-gradle-plugin:1.9.9")}
}
apply plugin: 'java'
apply plugin: 'eclipse'
apply plugin: 'idea'
apply plugin: 'net.serenity-bdd.aggregator'
compileJava.options.encoding = "UTF-8"
compileTestJava.options.encoding = "UTF-8"

dependencies {
testImplementation group: 'org.assertj', name: 'assertj-core', version: '1.7.0'
testImplementation group: 'org.slf4j', name: 'slf4j-simple', version: '1.7.7'
testImplementation group: 'junit', name: 'junit', version: '4.12'
implementation group: 'net.serenity-bdd', name: 'serenity-core', version: '1.9.9'
implementation group: 'net.serenity-bdd', name: 'serenity-junit', version: '1.9.9'
implementation group: 'net.serenity-bdd', name: 'serenity-cucumber', version: '1.9.5'
implementation group: 'net.serenity-bdd', name: 'serenity-screenplay', version: '1.9.9'
implementation group: 'net.serenity-bdd', name: 'serenity-screenplay-webdriver', version: '1.9.9'
implementation group: 'io.github.bonigarcia', name: 'webdrivermanager', version: '4.4.3'
}
gradle.startParameter.continueOnFailure = true

<!-- Slide number: 14 -->

# CREACION DE ESTRUCTURA PARA PROYECTO
 Iniciamos creando la estructura de paquetes que representen la firma de la  empresa

![Imagen 3](Imagen3.jpg)

![Imagen 4](Imagen4.jpg)

![Imagen 5](Imagen5.jpg)

<!-- Slide number: 15 -->

![Imagen 3](Imagen3.jpg)
Estructura ScreenPlay

![Imagen 16](Imagen16.jpg)

exeptions
Interations
models
Questions
Userinterface
utils

<!-- Slide number: 16 -->

![Imagen 3](Imagen3.jpg)

![Imagen 6](Imagen6.jpg)
Paquete Test ScreenPlay

![Imagen 9](Imagen9.jpg)

![Imagen 5](Imagen5.jpg)

![Imagen 4](Imagen4.jpg)

![Imagen 7](Imagen7.jpg)

runners
stepdefinitions

<!-- Slide number: 17 -->

![Imagen 3](Imagen3.jpg)

![Imagen 6](Imagen6.jpg)
Driver y Cucumber

![Imagen 4](Imagen4.jpg)

![Imagen 7](Imagen7.jpg)

![Imagen 9](Imagen9.jpg)

![Imagen 5](Imagen5.jpg)
drivers
feature

<!-- Slide number: 18 -->

# CREACION DE ARCHIVO CUCUMBER – GHERKIN Y CONFIGURACIÓN
Creación de nuestro archivo CUCUMBER el cual tendrá bajo la sintaxis Gkerkin nuestros casos de prueba y así mismo se configurará bajo el idioma que se establezca Español/Ingles

![Picture 68](Picture68.jpg)
Idioma
es- español
Para ingles se omite el language

![Imagen 15](Imagen15.jpg)

![Picture 74](Picture74.jpg)

![Imagen 19](Imagen19.jpg)

![Imagen 16](Imagen16.jpg)

<!-- Slide number: 19 -->
GHERKIN
Escenario con tabla de ejemplos (datos
Escenario con antecedentes
Escenario con datos concretos

![Imagen 3](Imagen3.jpg)

![Imagen 5](Imagen5.jpg)

![Imagen 4](Imagen4.jpg)

<!-- Slide number: 20 -->

# CREACION CLASE RUNNER
Nos dirigimos al paquete runners y creamos la clase java, esta clase estará configurada para que lea el archivo Cucumber, los tags o identificadores dentro del lenguaje Gherkin para cada uno de los casos de prueba.

![Imagen 4](Imagen4.jpg)

![Imagen 3](Imagen3.jpg)
Configuración de la clase RunnerTags, dentro de estas y basándonos en la librería anteriormente mencionada junto con la librería de Junit, Serenity, Cucumber y net agregamos

<!-- Slide number: 21 -->
Código de la classe runners
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.cucumber.CucumberWithSerenity; import net.thucydides.core.util.SystemEnvironmentVariables;

public class RunnerTags {
    @Before     public void test() {         switch (SystemEnvironmentVariables.createEnvironmentVariables().getProperty("webdriver.driver")) {             case "chrome":
                WebDriverManager.chromedriver().setup();
 break;             case "ie":case "iexplorer":
                WebDriverManager.iedriver().setup();                 break;             case "firefox":
                WebDriverManager.firefoxdriver().setup();                 break;             default:
                WebDriverManager.chromedriver().setup();                 break;
        }
    }
    @Test
    public void testRunner() {
        JUnitCore.runClasses(RunnerTags.class);
    }
    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions(features = "src/test/resources/features/prueba.feature",             tags = { "@HistoriaDeUsuario"},
            glue = "co.com.choucair.certification.prueba.screenplay.stepdefinitions")     public class Runner{
    }
}

<!-- Slide number: 22 -->

# GENERACION DE CODIGO CAMELCASE
Generación de código – Dos métodos para la generación
Método A: Este método es posible si se maneja con la configuración de la clase RunnerTags tradicional
click derecho y seleccionamos la opción Run “RunnerTags”,
En la parte de bajo de IDE se desplega el Run

![Imagen 3](Imagen3.jpg)
Se crea una clase dentro del paquete definitions y dentro de la clase se pega el código generado en el Run

![Imagen 4](Imagen4.jpg)

![Imagen 5](Imagen5.jpg)

<!-- Slide number: 23 -->
METODO B
Nombre de la clase, el tipo de archivo: Java
Nos ubicamos en el feature, encima del caso de prueba y dar click derecho, seleccionar la opción que dice: “Show context Action”,

![Imagen 4](Imagen4.jpg)

![Imagen 3](Imagen3.jpg)

![Imagen 5](Imagen5.jpg)
selecciona la opción para generar todo los pasos “Create all step definition”

<!-- Slide number: 24 -->

# CREACION DE TAREAS
Llamamos la etiqueta @Before la cual tendrá como función iniciar un nuevo driver cuando inicia la ejecución, se crea un método tipo void que no retorne nada simplemente iniciara un nuevo escenario.

![Imagen 5](Imagen5.jpg)

![Imagen 3](Imagen3.jpg)
Creamos la clase en el paquete de tareas o tasks
creamos una clase, que contenga un método que nos permite levantar el driver con la pagina que deseamos.

![Imagen 6](Imagen6.jpg)

![Imagen 4](Imagen4.jpg)
llamamos al actor, y utilizamos el método wasAbleTo() este método solo  se usa en el Given/Dado en ningún otro método se puede implementar

<!-- Slide number: 25 -->

![Imagen 3](Imagen3.jpg)
Nos devolvemos a la Clase MyStepDefinitions y creamos el método de la clase.

![Imagen 10](Imagen10.jpg)
Ahora reemplazamos Perfomable por la clase misma es decir AbrirPagina.

![Imagen 11](Imagen11.jpg)

![Imagen 4](Imagen4.jpg)

<!-- Slide number: 26 -->

![Imagen 4](Imagen4.jpg)

![Imagen 6](Imagen6.jpg)
Retornamos la clase, pero antes implementamos la tarea de Screenplay para la Clase
Luego de implementar el método le decimos al actor lo que va hacer, es decir abrir el navegador con la url que queremos.

![Imagen 5](Imagen5.jpg)
Ahora implementamos los métodos para la clase que se retorna

![Imagen 7](Imagen7.jpg)

![Imagen 16](Imagen16.jpg)

<!-- Slide number: 27 -->

![Imagen 3](Imagen3.jpg)
Creamos la clase PaginaXTTT para que almacene los datos de la url y los elementos de la página.
Ahora extendemos la clase a los PageObject

![Imagen 6](Imagen6.jpg)
Luego agregamos la etiqueda @DefaultUrl() y dentro de ella le pasamos a través de un String la Url.

<!-- Slide number: 28 -->
# RESULTADOS

![Imagen 3](Imagen3.jpg)

![Imagen 4](Imagen4.jpg)

<!-- Slide number: 29 -->
Crear una clase para las tareas e invocar los métodos que realizan esas acciones para este caso nuestra tarea será escribir un usuario, una contraseña y dar click sobre el botón sing in.
Creamos la clase en tarea y el método tal cual como si se fuera a levantar el driver.

![Imagen 3](Imagen3.jpg)

![Imagen 4](Imagen4.jpg)

![Imagen 9](Imagen9.jpg)

<!-- Slide number: 30 -->
Le decimos al actor las acciones que realizara

![Imagen 9](Imagen9.jpg)

![Imagen 3](Imagen3.jpg)
le decimos que escriba como usaurio: @andres2022_screenplay, y que la localización del objeto esta contenida en la constante TXT_USUARIO en la clase PaginaXTTT.

![Imagen 4](Imagen4.jpg)

<!-- Slide number: 31 -->

![Imagen 3](Imagen3.jpg)

![Imagen 6](Imagen6.jpg)
Corremos la automatización y obtenemos esto

<!-- Slide number: 32 -->
CORREMOS LA AUTOAMTIZACION Y ESPEREMOS EL RESULTADO…

![Imagen 5](Imagen5.jpg)

![Imagen 6](Imagen6.jpg)
hacemos la verificación de los pasos, donde se verifica que ingreso correctamente a la página.

<!-- Slide number: 33 -->
En este métodos usamos la librería org.hamcrest.Matcher.* y las aserciones org.hamcrest.MatcherAssert.*

![Imagen 3](Imagen3.jpg)

![Imagen 4](Imagen4.jpg)

<!-- Slide number: 34 -->
Se crea en el paquete de las question y este paquete debe implementarse a las Question de Screenplay
Creamos el método y retornamos la clase, que nos devolverá un String de comparación.

![Imagen 3](Imagen3.jpg)

![Picture 380](Picture380.jpg)
Implementamos el método de la clase

![Picture 382](Picture382.jpg)
Le decimos que en vez de devolver un valor nulo o null nos devuelta un Text de la librería de screenplay

<!-- Slide number: 35 -->

![Imagen 3](Imagen3.jpg)
Una vez terminado de configurar en el contenedor de elemento y en el definition procedemos a correr la auto y a generar el informe, este informe a través de la terminal del ide podemos correrlo con el tag principal del feature.
Para obtener el informe que se almacena en la carpeta target

![Imagen 7](Imagen7.jpg)

![Imagen 8](Imagen8.jpg)

![Imagen 4](Imagen4.jpg)

<!-- Slide number: 36 -->

![Imagen 3](Imagen3.jpg)

![Imagen 4](Imagen4.jpg)

<!-- Slide number: 37 -->
VIDEO PROYECTO AUTOMATIZACIÓN WEB

![Elementos multimedia en línea 3](Elementosmultimediaenlínea3.jpg)