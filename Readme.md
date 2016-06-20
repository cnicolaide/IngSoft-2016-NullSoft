# NULLSOFT - TP FINAL ING. DE SOFTWARE 

----------

## 1- NOTA DE ENTREGA

### Listado de la funcionalidad incluida 

#### 0.1.0

* Se arma arquitectura de trabajo.
* Se implementa singleton en el HeartModel.
* Se implementan los metodos del panel de control del modelo Heart.
* Se agrega a la DJView texto para cuando esta vista es utilizada por el modelo Heart.

Para ver todos los commits de esta versión, [click aqui](https://github.com/cnicolaide/IngSoft-2016-NullSoft/compare/0.1.0...0.2.0).

#### 0.2.0

##### Nuevas Características / Mejoras

* Se agrega el modelo Bullet y un TestDrive para su ejecucion directa.
* Se agrega una vista propia para el modelo Bullet.
* Se agrega un TestDrive para ejecutar los 3 modelos (Bullet, Heart y Beat) en simultaneo.

##### Bug Fixes

* Se resuelve problema con delay debajo de 50 en vista Bullet.

Para ver todos los commits de esta versión, [click aqui](https://github.com/cnicolaide/IngSoft-2016-NullSoft/compare/0.2.0...master).

### Pass/Fail Ratio de sistema
![](http://s2.subirimagenes.com/otros/previo/thump_9608158tests.jpg)

### Bugs conocidos (i.e. no resueltos) en la entrega.
![](http://www.subirimagenes.com/imagedata.php?url=http://s2.subirimagenes.com/imagen/9603262bugs.png)
### Lugar/link del entregable y de las instrucciones de instalación.
1. Clonar el repositorio de GitHub
1. Abrir la consola de sistema cmd
1. Hacer change directory (cd) a la carpeta del proyecto. Ej: cd C:\Users\myuser\Desktop\IngSoft-2016-NullSoft
1. Correr el comando gradlew copilarTodo
2. Acceder a los ejecutables generados en ../build/libs
 
## 2- MANEJO DE LAS CONFIGURACIONES

### Propósito y alcance

SCM es el proceso mediante el cual se identifican los métodos y herramientas para controlar el software a lo largo de su desarrollo y utilización.
En esta sección se describe la forma de trabajo, los documentos, el hardware, software y las herramientas utilizadas en este proyecto.

### Propósito del Manejo de la Configuración del Software (SCM)

- Asegurar la consistencia de la información poniendo en práctica la SCM.
- Definir las personas que le dan soporte a las prácticas de SCM.
- Mantener la integridad a los largo de todo el ciclo de vida del producto.
- Informar a grupos y las personas el estado del proyecto.
- Crear un historial del estado anterior y actual del proyecto.
- Mejora de Procesos.

### Referencias, Abreviaturas y Glosario

- **SCM** Gestión de la Configuración del Software (Software Configuration Management)
- **SVN** Sistema de control de versiones
- **CCC** Comité de Control de Cambios
- **SCI** Software Configuration item
- **SCMer** Rol encargado de realizar la tarea de gestión de la configuración (SCM).

### Conceptos básicos

**Repositorio:** Espacio físico (directorio y grupo de directorios), donde se almacenan, una vez terminados, todos los elementos generados durante el proceso de desarrollo en sus diferentes versiones. Estos elementos pueden estar en tres estados: Pendientes de aprobar por el área de SQA, Aprobados por SQA, y en Producción.

**SCI:** Software Configuration Item, Elemento de Configuración del Software. Son los elementos creados durante el proceso. Pueden ser de tres tipos:
De Software: código fuente, recursos gráficos, bibliotecas, ejecutables
Documentos: técnicos, administrativos y de usuario
Estructuras de datos: estructura de base de datos, datos iniciales, archivos de configuración, etc.

**Check Out:** Tomar un SCI del repositorio y copiarlo en un área de trabajo, dejando bloqueado el SCI en el repositorio, para que nadie más pueda hacer un check out del mismo.

**Check In:** Si se trata de un SCI nuevo, ingresarlo en el repositorio y dejarlo disponible para posteriores modificaciones, mediante el mecanismo de check out y check in. Si se trata de un SCI existente al que se le hizo check out, el check in implica el ingreso al repositorio de una nueva versión del SCI, dejando al SCI disponible, liberando el bloqueo que registrado en el momento del check out.

### Administración de la Configuración del Proyecto

La Administración de la configuración del proyecto está a cargo del "Global PCM”, él es el responsable de actividades como seguimiento de las herramientas, creación de los nuevos branches, creación del reléase, etc.

**GPCM**
Posee toda responsabilidad sobre todos los CI.
Responsabilidad en la creación de branches y administración de sus políticas.
Responsabilidad y asistencia sobre el etiquetado y lanzamiento de branches.
Coordinar actividades del CM en el proyecto.
Asegurar la correcta ejecución del esquema del CM.
Participación en auditorias.
Analizar todas las novedades relacionadas al CM.

**TPCM**
Asistencia en la creación de tags y branches.
Creación de actividades para el equipo específico en branches.
Garantizar la integridad del producto y el seguimiento de los elementos de configuración propios del equipo.
Participación en auditorias.
Analizar todas las novedades relacionadas al CM.

**Team**
Ayudar a resolver conflictos durante la actividad de merge.
Asegurarse que los criterios de calidad de los
entregables a la rama principal se cumplan.
Seguir todos los procesos asociados, políticas y prácticas definidas por sus roles asignados.

### Dirección y forma de accesos a la herramienta de control de versiones

- **Lenguaje de Programación:** Java [https://www.java.com](https://www.java.com)
- **Entorno de Desarrollo:** Netbeans IDE [https://netbeans.org/](https://netbeans.org/) 
- **Software de Manejo de Versiones:** Git [https://git-scm.com/](https://git-scm.com/)
- **Sistema de Control de Versiones:** GitHub [https://github.com/cnicolaide/IngSoft-2016-NullSoft](https://github.com/cnicolaide/IngSoft-2016-NullSoft)
- **Sistema de Seguimiento de Errores:** Git Issues [https://github.com/cnicolaide/IngSoft-2016-NullSoft/issues](https://github.com/cnicolaide/IngSoft-2016-NullSoft/issues)
- **Herramienta de Integración Continua:** Travis [https://travis-ci.org/cnicolaide/IngSoft-2016-NullSoft](https://travis-ci.org/cnicolaide/IngSoft-2016-NullSoft)
- **Herramienta de Automatización:** Gradle [http://gradle.org/](http://gradle.org/)

### Esquema de directorios y propósito de cada uno.

![](http://www.subirimagenes.com/imagedata.php?url=http://s2.subirimagenes.com/otros/9594700directorios.jpg)

| Ruta       	| Propósito                                               	|
|------------	|---------------------------------------------------------	|
| .\config\  	| Contiene archivos de configuración de plugins de Gradle 	|
| .\docs\    	| Contiene documentación y diagramas del proyecto.         	|
| .\gradle\  	| Contiene el wrapper de Gradle.                          	|
| .\src\main 	| Contiene las clases principales del proyecto.           	|
| .\src\test 	| Contiene las clases de test usadas en el proyecto.      	|

### Normas de etiquetado y de nombramiento de los archivos.

Para nombramiento de etiquetas se seguirá una notación numérica compuesta por tres números (y un cuarto opcional) separados por puntos con la siguiente notación:

**major.minor.revision[.entrega]**

Cada uno de estos números tienen el siguiente significado:

- **major**: indica la versión principal del software, consistiendo en un conjunto de funcionalidades concretas que son recogidas y cubiertas en dicha versión.
- **minor**: indican funcionalidad menor cubierta en la versión de software entregada.
- **revision**: se modifican cuando hay revisiones de código ante fallos de la aplicación.
- **entrega**: este dígito tiene el objetivo de llevar la cuenta del número de veces que una entrega se rechaza, por incumplimiento de algún requisitos de la gestión de entregas o del proyecto.

En el caso de la creación de un branch o línea de desarrollo distinta de la principal añadiremos la letra b al final de la numeración. 

### Plan del esquema de ramas a usar (y en uso).

Entendiendo que un branch es una línea de desarrollo distinta de la principal. Generalmente se trabajara sobre el trunk del proyecto, pero en ciertas ocasiones podrá ser necesario crear una línea de desarrollo paralela, para esto se utilizaran los branch.

Imaginando que tenemos nuestro proyecto con una linea de desarrollo principal (sobre el trunk), y que en ciertos momentos algunas de las versiones (tags) que se marcaron pasaron al entorno de producción. Pero en un determinado momento se detecta un error critico o una tarea (por ejemplo cambiar la integración con otra aplicación) y hay que abordarla de forma rápida sobre la versión que hay en producción y si pasar toda la nueva funcionalidad de las versiones que la siguieron y que no han pasado por un proceso de pruebas.

En este caso el equipo debe de crear un branch sobre el tag que marca la versión que hay en producción y sobre la que se quiere implementar alguna tarea concreta. Por ejemplo en el siguiente diagrama podemos ver que sobre la versión 1.0.1 se crea un branch 1.0.1b.

![](http://www.juntadeandalucia.es/servicios/madeja/sites/default/files/imagecache/wysiwyg_imageupload_big/wysiwyg_imageupload/10/branchs.jpg)

Una vez finalizada la tarea tendremos una versión que podremos desplegar (pasando por el procedimiento de entrega y pruebas previamente) en producción.
Para evitar que se repitan tareas en las distintas líneas, cada branch debe representar el desarrollo una tarea concreta para que se vuelva a integrar en la línea principal de desarrollo en poco tiempo, de esta manera la tarea de integración será menos costosa.

### Políticas de fusión de archivos y de etiquetado de acuerdo al progreso de calidad en los entregables.

Para fusionar nuevas ramas que pudieran surgir con el código principal nuevamente, el administrador realizara la fusión haciendo un rebase del código junto a los desarrolladores. De esta forma rápidamente se podrán identificar errores, los desarrolladores podrán trabajar en resolverlos y el administrador estará al tanto de la situación para coordinar otro eventual cambio en el código.

Los criterios para modificar (incrementar) cada uno de los contadores de la etiqueta de versión son los siguientes:

- **major**: nuevas funcionalidades claves de la aplicación respecto a la versión anterior debido a la inclusión de nuevos requerimientos para el sistema, como la inclusión de nuevos módulos o una revisión completa de los existentes.
- **minor**: cambios significativos en la forma en la que se ofrece la funcionalidad existente, corrección de grandes fallos del sistema o nuevas versiones evolutivas que modifican significativamente la funcionalidad ofrecida.
- **revision**: se modifica por cada entrega de software que se realice.
- **entrega**: al rechazarse una entrega se incrementa este contador en la siguiente. Cuando la entrega se aceptase se crearía un tag público que solo conservaría los tres primeros dígitos (mayor, minor, revisión).

De esta forma se puede visualizar el árbol de entregables con la siguiente estructura

![](http://www.juntadeandalucia.es/servicios/madeja/sites/default/files/imagecache/wysiwyg_imageupload_big/wysiwyg_imageupload/10/versiones.jpg)

### Forma de entrega de los “releases”, instrucciones mínimas de instalación y formato de entrega.

Una vez finalizadas las pruebas y llegado a un nivel aceptable de fail/ratio, se procede a la compilación del release, el compilador genera un archivo de extensión .jar, este archivo puede ser ejecutado ubicándolo en cualquier carpeta de la computadora del usuario, con la aclaración que debe estar instalado en el equipo cliente el sistema Java runtime enviroment (JRE).

El software puede ser distribuido por medio de un sitio web, CDs, o cualquier otro tipo de unidad de almacenamiento removible.

### Listado y forma de contacto de los integrantes del equipo, así como sus roles en la CCB. También incluir periodicidad de las reuniones y miembros obligatorios.

El CCC es un comité que asegura que cada cambio está apropiadamente considerado por todas las partes y es autorizado antes de su implementación.

El CCC es responsable de aprobar, monitorear y controlar cada solicitud de cambios para establecer una línea de trabajo.
El alcance del trabajo será aprobar o rechazar los cambios necesarios en planes, documentos y códigos. Las decisiones deberán ser tomadas respecto a las acciones que deberán estar basadas en la calidad del producto, asegurando el correcto estado del producto después de cada ciclo de prueba.

El CCC puede estar conformado por una o varias personas, pero es importante que estas tengan una visión global del proyecto.
La decisión del CCC y sus apreciaciones se registran en los apartados correspondientes del formulario del cambio.

Si el CCC aprueba el cambio, se genera la asignación de la tarea de llevar a cabo dicho cambio. Esta asignación y el formulario de cambio correspondientes, llegarán al SCMer.

**El formulario de cambio debe incluir:**

- Cambio a realizar.
- Productos a modificar.
- Restricciones.
- Criterios de revisión y auditoría.
- Tiempo estimado para realizar el cambio y dedicación real.
- Costo estimado y real.
- Persona responsable del cambio.
- Pruebas y reportes de pruebas.

Este último punto es importante, ya que si surge un cambio se deberán realizar nuevamente las mismas pruebas de manera de verificar que no se alteró la funcionalidad existente.

**Los roles de los distintos miembros estarán dados por los siguientes cargos:**

- Engineering Manager
- Release Manager 
- Uber Scrum Master
- GPCM

Al ser 3 integrantes en el grupo, todos realizamos diversas tareas que engloban la mayoría de las responsabilidades de los roles nombrados anteriormente. 

**Los datos de contacto de los miembros y los roles teóricos asignados son los siguientes:**

| Miembro             	| Email                    	| Rol Teorico        	|
|---------------------	|--------------------------	|--------------------	|
| Christian Nicolaide 	| cnicolaide@gmail.com     	| Eng. Manager, GPCM 	|
| Enzo Candotti       	| enzocandotti93@gmail.com 	| Rel. Manager       	|
| Mauricio Flores     	| elmauri229@gmail.com     	| Uber Scrum Master    	|

Nuestra forma de trabajo consiste en 2 reuniones semanales en día y horario a convenir según disponibilidad.

Las reuniones reales las realizamos en los box de la Facultad, y para las reuniones virtuales utilizamos Skype, Facebook y WhatsApp.

### Herramienta de seguimiento de bugs usado para reportar los defectos descubiertos y su estado.

Utilizamos la herramienta Issues proporcionada por GitHub para hacer seguimiento de los errores. Una vez creado el repositorio se tiene acceso a ella.

La dirección de la herramienta se encuentra definido en la sección superior.

## 3- REQUERIMIENTOS

El sistema estará compuesto por modelos diferentes que se listan y detallan a continuación:

### BeatModel

![](http://www.subirimagenes.com/imagedata.php?url=http://s2.subirimagenes.com/imagen/9594441usecasediagram1.png)

Este modelo debe emular una consola de DJ donde se podrá reproducir una pista de sonido y alterar el ritmo de reproducción conforme se desee. Siendo posible detener y reanudar la reproducción en cualquier momento.

![](http://www.subirimagenes.com/imagedata.php?url=http://s2.subirimagenes.com/imagen/9594439activitydiagram1.png)

#### Requerimientos Funcionales del Modelo
- Se reproducirá solo una pista de audio que no será posible alterar.
- El ritmo (BPM) puede ser aumentado y disminuido  en valores que van de 0 a 1000.
- Se debe poder detener la reproducción de audio y reanudar tantas veces como se desee.
- Se debe informar el ritmo al cual se está reproduciendo la música.

### BulletModel

![](http://www.subirimagenes.com/imagedata.php?url=http://s2.subirimagenes.com/imagen/9603244casodeusobullet.png)

En este modelo se deberá emular un protector de pantalla, donde se muestra una bolita en movimiento con una trayectoria y mapa definido inicialmente que no sera posible alterar luego.

![](http://www.subirimagenes.com/imagedata.php?url=http://s2.subirimagenes.com/imagen/9603247actividades-bullet.png)

#### Requerimientos Funcionales del Modelo
- Se debe hacer rebotar una pelota contra cuatro paredes.
- El usuario no podrá modificar la trayectoria de la pelota en el mapa.
- La velocidad puede ser aumentada o disminuida en valores de 0 a 1000 mili segundos.
- El usuario debe poder observar el movimiento de la pelota a través de una representación gráfica.
- Se debe informar la velocidad y posición de la pelota cuando esta está en movimiento.

### Requerimientos Funcionales del Sistema
- La ventana de control debe de tener el mismo aspecto en los 3 modelos. Un campo y botón para setear el tempo, un botón para incrementar y otro para decrementar.
- Se deben de poder ejecutar los 3 modelos en simultaneo.

### Requerimientos No Funcionales del Sistema

- Toda funcionalidad del sistema y transacción de negocio debe responder al usuario en menos de 2 segundos.
- El tiempo de aprendizaje del sistema por un usuario deberá ser menor a 5 minutos.
- El tiempo para iniciar o reiniciar el sistema no podrá ser mayor a 15 segundos.

## 4- ARQUITECTURA
Debido a las características del sistema, que contendra diferentes modelos donde habrá ventanas compartidas se opto por utilizar el patrón de arquitectura MVC que nos permitirá independizar la lógica y la parte visual del sistema usando para eso un controlador que administra los procesos sirviendo como puente entre estos.

![](https://github.com/cnicolaide/IngSoft-2016-NullSoft/blob/master/docs/images/Arquitectura.PNG?raw=true)

Se decidió por una cuestión de comodidad a la hora de ubicar los elementos para trabajar agrupar las clases conforme la arquitectura MVC utilizada en:

![](https://github.com/cnicolaide/IngSoft-2016-NullSoft/blob/master/docs/images/Package%20Structure.png?raw=true)

En el paquete de Mains se incluyen los diferentes TestDrive que fueron solicitados, los cuales permiten utilizar cada modelo por separado o todos juntos en simultaneo.

## 5- DISEÑO E IMPLEMENTACIÓN

![](https://github.com/cnicolaide/IngSoft-2016-NullSoft/blob/master/docs/images/Observer.png?raw=true)

Utilizamos el patrón Observer para poder relacionar diferentes objetos entre si en torno a uno principal, de modo que, cuando este último cambie, los demás también lo harán. Particularmente en este caso el principal ( o sujeto) seria BulletModelInterface, este conoce a sus observadores, es el encargado de proporcionar la interfaz para añadir y/o quitar observadores.
El observador concreto sería DJView, este mantiene una referencia al sujeto concreto, y mantiene su estado consistente con el del sujeto.
El sujeto concreto sería BulletModel el cual se encargará de almacenar ciertos estados de interés y notificar a sus observadores cuando se modificó su estado.
El observador es BulletObserver, su tarea consiste en definir la interfaz de los objetos a los que se deben notificar cambios en un sujeto.

![](https://github.com/cnicolaide/IngSoft-2016-NullSoft/blob/master/docs/images/strategy.png)

Utilizamos el patrón Strategy para el controller del sistema, ya que nos permite tener varios algoritmos encapsularlos e ir intercambiandolos a medida que surja la necesidad de hacerlo, ya que tenemos clases que difieren en alunos aspectos, entonces necesitamos tomar ciertas decisiones, respecto al algoritmo a utilizar, en tiempo de ejecución.

![](https://github.com/cnicolaide/IngSoft-2016-NullSoft/blob/master/docs/images/Adapter.png)

En esta instancia, debemos adaptar el modelo del BeatModel a uno de BulletModel. Si no lo hacemos, la vista no será capaz de trabajar con este modelo.
Para esto utilizamos el patrón Adapter, que nos permite adaptar un modelo para trabajar con controladores y vistas existentes. Es una técnica muy utilizada en MVC.
La clase BullerAdapter implementa la interfaz BeatModelInterface. Tendrá como atributo un objeto del tipo BulletModelInterface, por lo que aquí hacemos referencia a nuestro modelo. Habrá métodos que no se utilizarán para nuestro nuevo modelo, y otros que necesitamos que se adapten (el método getBPM(), por ejemplo).

La interacción entre los diferentes componentes en el caso del bullet model se da de la siguiente manera:
![](http://www.subirimagenes.com/imagedata.php?url=http://s2.subirimagenes.com/imagen/9603248secuenciabullet.png)

El sistema completo se puede resumir de la siguiente manera:
![](https://github.com/cnicolaide/IngSoft-2016-NullSoft/blob/master/docs/images/Clases.png?raw=true)

## 6- PRUEBAS UNITARIAS Y DEL SISTEMA

Se realizaron una seria de pruebas de unidad básica para garantizar el funcionamiento de las principales actividades de la aplicación. 

![](http://s2.subirimagenes.com/otros/previo/thump_9608161test2.jpg)

Si bien el nivel de cobertura es bajo, las principales actividades están testeadas.

![](http://www.subirimagenes.com/imagedata.php?url=http://s2.subirimagenes.com/imagen/9608164test100.png)

## 7- DATOS HISTÓRICOS

**Estimación original:** Al iniciar el trabajo practico esperábamos poder resolverlo con facilidad por conocer el lenguaje Java y haber asistido a todas las clases de la materia, estimamos una duración de 24 HS, distribuidas a lo largo de 2 semanas entre los 3 miembros del equipo. 

**Resultado real:** Después de comenzar con los primeros diagramas, notamos que teníamos algunas dudas por lo que debimos recurrir a material de apoyo, re-leer varias veces la consigna y evacuar dudas con los profesores. De este modo, nuestro plazo original se vio afectado.
La distribución de tareas resulto compleja, debido a la época en la que se encaro el trabajo (final de semestre) donde factores externos, hacían difícil las posibilidades de concretar reuniones de equipo presenciales y prolongadas. Los avances mas importantes se debían producir individualmente.
Tuvimos que expandir el plazo de entrega 1 semana, e incluir mayor cantidad de horas de dedicación al trabajo.

## 8- INFORMACIÓN ADICIONAL
 
Durante la elaboración de este trabajo práctico aprendimos la importancia que tiene el proceso de planificación a la hora de desarrollar software de manera profesional.

Nos pudimos ver inmersos en una situación de trabajo cooperativo, donde cada uno de nosotros debía asumir diferentes roles de ejecución y control de tareas.
Recorrimos y utilizamos la mayoría de las herramientas que fueron presentadas a lo largo de la materia para el control de versiones, automatización, integración continua y gestión de defectos.

Notamos la importancia del desarrollo de esquemas previos para la interpretación correcta del problema a resolver y como esto sirve de soporte después a la hora de escribir código.

Pudimos identificar en nuestro trabajo comportamientos aplicables a algunos de los patrones de diseño y arquitectura estudiados a lo largo del curso, lo cual nos facilitó bastante el desarrollo.

Utilizando metodologías de testing profesional, pudimos evaluar de cierta forma la calidad de nuestro desarrollo y tomamos conciencia de los diferentes niveles de control que se deben tener durante la etapa de desarrollo para poder concluir con un nivel aceptable de pruebas sobre el producto a entregar.

En algunos momentos tuvimos problemas de interpretación de ciertas consignas lo que nos pudo llevar a cometer algunos errores de implementación, gracias al apoyo y el dialogo con los docentes de la materia esto fue superado y pudimos concluir de manera exitosa nuestro proyecto.
