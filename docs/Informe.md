# NULLSOFT - TP FINAL ING. DE SOFTWARE 

----------

## 1- NOTA DE ENTREGA

### a. Breve listado de la funcionalidad incluida (con el estado de implementaci�n de c/u)
### b. Pass/Fail Ratio de sistema
### c. Bugs conocidos (i.e. no resueltos) en la entrega
### d. Lugar/link del entregable y de las instrucciones de instalaci�n

## 2- MANEJO DE LAS CONFIGURACIONES

### Prop�sito y alcance

SCM es el proceso mediante el cual se identifican los m�todos y herramientas para controlar el software a lo largo de su desarrollo y utilizaci�n.
En esta seccion se describe la forma de trabajo, los documentos, el hardware, software y las herramientas utilizadas en este proyecto.

### Prop�sito del Manejo de la Configuraci�n del Software (SCM)

- Asegurar la consistencia de la informaci�n poniendo en pr�ctica la SCM.
- Definir las personas que le dan soporte a las pr�cticas de SCM.
- Mantener la integridad a los largo de todo el ciclo de vida del producto.
- Informar a grupos y las personas el estado del proyecto.
- Crear un historial del estado anterior y actual del proyecto.
- Mejora de Procesos.

### Referencias, Abreviaturas y Glosario

- **SCM** Gesti�n de la Configuraci�n del Software (Software Configuration Management)
- **SVN** Sistema de control de versiones
- **CCC** Comit� de Control de Cambios
- **SCI** Software Configuration item
- **SCMer** Rol encargado de realizar la tarea de gesti�n de la configuraci�n (SCM).

### Herramientas de Gesti�n de Configuraci�n

- **Lenguaje de Programaci�n:** Java [https://www.java.com](https://www.java.com)
- **Entorno de Desarrollo:** Netbeans IDE [https://netbeans.org/](https://netbeans.org/) 
- **Software de Manejo de Versiones:** Git [https://git�scm.com/](https://git�scm.com/)
- **Sistema de Control de Versiones:** GitHub [https://github.com/cnicolaide/IngSoft-2016-NullSoft](https://github.com/cnicolaide/IngSoft-2016-NullSoft)
- **Sistema de Seguimiento de Errores:** Git Issues [https://github.com/cnicolaide/IngSoft-2016-NullSoft/issues](https://github.com/cnicolaide/IngSoft-2016-NullSoft/issues)
- **Herramienta de Integraci�n Continua:** Travis [https://travis-ci.org/cnicolaide/IngSoft-2016-NullSoft](https://travis-ci.org/cnicolaide/IngSoft-2016-NullSoft)
- **Herramienta de Automatizaci�n:** Gradle [http://gradle.org/](http://gradle.org/)

### Conceptos b�sicos

**Repositorio:** Espacio f�sico (directorio y grupo de directorios), donde se almacenan, una vez terminados, todos los elementos generados durante el proceso de desarrollo en sus diferentes versiones. Estos elementos pueden estar en tres estados: Pendientes de aprobar por el �rea de SQA, Aprobados por SQA, y en Producci�n.

**SCI:** Software Configuration Item, Elemento de Configuraci�n del Software. Son los elementos creados durante el proceso. Pueden ser de tres tipos:
De Software: c�digo fuente, recursos gr�ficos, bibliotecas, ejecutables
Documentos:t�cnicos, administrativos y de usuario
Estructuras de datos: estructura de base de datos, datos iniciales, archivos de configuraci�n, etc.

**Check Out:** Tomar un SCI del repositorio y copiarlo en un �rea de trabajo, dejando bloqueado el SCI en el repositorio, para que nadie m�s pueda hacer un check out del mismo.

**Check In:** Si se trata de un SCI nuevo, ingresarlo en el repositorio y dejarlo disponible para posteriores modificaciones, mediante el mecanismo de check out y check in. Si se trata de un SCI existente al que se le hizo check out, el check in implica el ingreso al repositorio de una nueva versi�n del SCI, dejando al SCI disponible, liberando el bloqueo que registrado en el momento del check out.

### Administraci�n de la Configuraci�n del Proyecto

La Administraci�n de la configuraci�n del proyecto est� a cargo del "Global PCM�, �l es el responsable de actividades como seguimiento de las herramientas, creaci�n de los nuevos branches, creaci�n del rel�ase, etc.

**GPCM**
Posee toda responsabilidad sobre todos los CI.
Responsabilidad en la creaci�n de branches y administraci�n de sus pol�ticas.
Responsabilidad y asistencia sobre el etiquetado y lanzamiento de branches.
Coordinar actividades del CM en el proyecto.
Asegurar la correcta ejecuci�n del esquema del CM.
Participaci�n en auditorias.
Analizar todas las novedades relacionadas al CM.

**TPCM**
Asistencia en la creaci�n de tags y branches.
Creaci�n de actividades para el equipo espec�fico en branches.
Garantizar la integridad del producto y el seguimiento de los elementos de configuraci�n propios del equipo.
Participaci�n en auditorias.
Analizar todas las novedades relacionadas al CM.

**Team**
Ayudar a resolver conflictos durante la actividad de merge.
Asegurarse que los criterios de calidad de los
entregables a la rama principal se cumplan.
Seguir todos los procesos asociados, pol�ticas y pr�cticas definidas por sus roles asignados.

### a. Direcci�n y forma de accesos a la herramienta de control de versiones
### b. Esquema de directorios y prop�sito de cada uno.
### c. Normas de etiquetado y de nombramiento de los archivos.

Para nombramiento de etiquetas se seguir� una notaci�n num�rica compuesta por tres n�meros (y un cuarto opcional) separados por puntos con la siguiente notaci�n:

**major.minor.revision[.entrega]**

Cada uno de estos n�meros tienen el siguiente significado:

- **major**: indica la versi�n principal del software, consistiendo en un conjunto de funcionalidades concretas que son recogidas y cubiertas en dicha versi�n.
- **minor**: indican funcionalidad menor cubierta en la versi�n de software entregada.
- **revision**: se modifican cuando hay revisiones de c�digo ante fallos de la aplicaci�n.
- **entrega**: este d�gito tiene el objetivo de llevar la cuenta del n�mero de veces que una entrega se rechaza, por incumplimiento de alg�n requisitos de la gesti�n de entregas o del proyecto.

En el caso de la creaci�n de un branch o linea de desarrollo distinta de la principal a�adiremos la letra b al final de la numeraci�n. 

### d. Plan del esquema de ramas a usar (y en uso).

Entendiendo que un branch es una linea de desarrollo distinta de la principal. Generalmente se trabajara sobre el trunk del proyecto, pero en ciertas ocasiones podr� ser necesario crear una linea de desarrollo paralela, para esto se utilizaran los branch.

Imaginando que tenemos nuestro proyecto con una linea de desarrollo principal (sobre el trunk), y que en ciertos momentos algunas de las versiones (tags) que se marcaron pasaron al entorno de producci�n. Pero en un determinado momento se detecta un error critico o una tarea (por ejemplo cambiar la integraci�n con otra aplicaci�n) y hay que abordarla de forma r�pida sobre la versi�n que hay en producci�n y si pasar toda la nueva funcionalidad de las versiones que la siguieron y que no han pasado por un proceso de pruebas.

En este caso el equipo debe de crear un branch sobre el tag que marca la versi�n que hay en producci�n y sobre la que se quiere implementar alguna tarea concreta. Por ejemplo en el siguiente diagrama podemos ver que sobre la versi�n 1.0.1 se crea un branch 1.0.1b.

![](http://www.juntadeandalucia.es/servicios/madeja/sites/default/files/imagecache/wysiwyg_imageupload_big/wysiwyg_imageupload/10/branchs.jpg)

Una vez finalizada la tarea tendremos una versi�n que podremos desplegar (pasando por el procedimiento de entrega y pruebas previamente) en producci�n.
Para evitar que se repitan tareas en las distintas lineas, cada branch debe representar el desarrollo una tarea concreta para que se vuelva a integrar en la linea principal de desarrollo en poco tiempo, de esta manera la tarea de integraci�n sera menos costosa.

### e. Pol�ticas de fusi�n de archivos y de etiquetado de acuerdo al progreso de calidad en los entregables.

Para fusionar nuevas ramas que pudieran surgir con el c�digo principal nuevamente, el administrador realizara la fusi�n haciendo un rebase del c�digo junto a los desarrolladores. De esta forma r�pidamente se podran identificar errores, los desarrolladores podran trabajar en resolverlos y el administrador est�ra al tanto de la situaci�n para coordinar otro eventual cambio en el c�digo.

Los criterios para modificar (incrementar) cada uno de los contadores de la etiqueta de versi�n son los siguientes:

- **major**: nuevas funcionalidades claves de la aplicaci�n respecto a la versi�n anterior debido a la inclusi�n de nuevos requerimientos para el sistema, como la inclusi�n de nuevos m�dulos o una revisi�n completa de los existentes.
- **minor**: cambios significativos en la forma en la que se ofrece la funcionalidad existente, correcci�n de grandes fallos del sistema o nuevas versiones evolutivas que modifican significativamente la funcionalidad ofrecida.
- **revision**: se modifica por cada entrega de software que se realice.
- **entrega**: al rechazarse una entrega se incrementa este contador en la siguiente. Cuando la entrega se aceptase se crear�a un tag p�blico que solo conservar�a los tres primeros d�gitos (mayor, minor, revision).

De esta forma se puede visualizar el �rbol de entregables con la siguiente estructura

![](http://www.juntadeandalucia.es/servicios/madeja/sites/default/files/imagecache/wysiwyg_imageupload_big/wysiwyg_imageupload/10/versiones.jpg)

### f. Forma de entrega de los �releases�, instrucciones m�nimas de instalaci�n y formato de entrega.

Una vez terminado el c�digo, corregidos todos los errores del mismo, el c�digo es compilado y el compilador genera un archivo de extensi�n .jar, este archivo puede ser ejecutado ubic�ndolo en cualquier carpeta de la computadora del usuario, con la aclaraci�n que debe estar instalado en el equipo cliente el sistema Java runtime enviroment (JRE).
El software puede ser distribuido por medio de discos USB.

### g. Listado y forma de contacto de los integrantes del equipo, as� como sus roles en la CCB. Tambi�n incluir periodicidad de las reuniones y miembros obligatorios.

El CCC es un comit� que asegura que cada cambio est� apropiadamente considerado por todas las partes y es autorizado antes de su implementaci�n.
El CCC es responsable de aprobar, monitorear y controlar cada solicitud de cambios para establecer una l�nea de trabajo.
El alcance del trabajo ser� aprobar o rechazar los cambios necesarios en planes, documentos y c�digos. Las decisiones deber�n ser tomadas respecto a las acciones que deber�n estar basadas en la calidad del producto, asegurando el correcto estado del producto despu�s de cada ciclo de prueba.
El CCC puede estar conformado por una o varias personas, pero es importante que estas tengan una visi�n global del proyecto.
La decisi�n del CCC y sus apreciaciones se registran en los apartados correspondientes del formulario del cambio.
Si el CCC aprueba el cambio, se genera la asignaci�n de la tarea de llevar a cabo dicho cambio. Esta asignaci�n y el formulario de cambio correspondientes, llegar�n al SCMer .
El formulario de cambio debe incluir:

- Cambio a realizar.
- Productos a modificar.
- Restricciones.
- Criterios de revisi�n y auditor�a.
- Tiempo estimado para realizar el cambio y dedicaci�n real.
- Costo estimado y real.
- Persona responsable del cambio.
- Pruebas y reportes de pruebas.

Este �ltimo punto es importante, ya que si surge un cambio se deber�n realizar nuevamente las mismas
pruebas de manera de verificar que no se alter� la funcionalidad existente.

#### Integrantes del Equipo, Roles y reuniones

- Los roles de los distintos miembros estar�n dados por los siguientes cargos:
- Engineering Manager
- Release Manager Coordinador de errores
- Uber Scrum Team
- Director de Ingenier�a
- GPCM

Al ser 3 integrantes en el grupo, realizamos diversas tareas que engloban la mayor�a de las responsabilidades de los roles nombrados anteriormente.

Nuestra forma de trabajo con respecto al proyecto, fue con 2 reuniones reales donde nos organizamos y definimos la forma de trabajo a seguir, nos pusimos de acuerdo en las herramientas a utilizar y nivelamos los conocimientos en la utilizaci�n de las herramientas.

Siempre y en todo momento trabajamos todos los integrantes del grupo.

Fecha Horas
Tipo de Reuni�n Actividad
23/03/16 1,5
h Real Planificaci�n y organizaci�n
28/03/16 2
h Real
Nivelaci�n de conocimiento sobre uso de
herramientas.
31/03/16 2 h Virtual Creaci�n de espacios virtuales
Tipo de Reuni�n
Las reuniones reales las realizamos en los box de la Facultad, y para las reuniones virtuales y forma de
contacto, utilizamos las siguientes Herramientas, con las que nos manten�amos al tanto.
Grupo de WhatsApp.
Grupo de Facebook del trabajo.

### h. Herramienta de seguimiento de bugs usado para reportar los defectos descubiertos y su estado.

Utilizamos la herramienta Issues proporcionada por GitHub para hacer seguimiento de los errores. Una vez creado el repositorio se tiene acceso a ella.

La direcci�n de la herramienta se encuentra en la secci�n 1.4.

### i. Cualquier otra informaci�n relevante (ej. Direcciones del servidor de integraci�n continua, etc.)

## 3- REQUERIMIENTOS

### Diagramas de Casos de Usos
### Diagramas de Actividades
### Diagramas de Secuencias

### Requerimientos Funcionales

- Se reproducira solo un archivo de audio que no sera posible alterar.
- El ritmo (BPM) puede ser aumentado y disminuido  en valores que van de 0 a 1000.
- Se debe poder detener la reproduccion de audio.
- El usuario debe poder observar las pulsasiones a travez de una repesentacion grafica.

### Requerimientos No Funcionales
##  ##
**Eficiencia**

- Toda funcionalidad del sistema y transacci�n de negocio debe responder al usuario en menos de 2 segundos.

**Usabilidad**

- El sistema debe proporcionar mensajes de error que sean informativos y orientados a usuario final.
- El tiempo de aprendizaje del sistema por un usuario deber� ser menor a 5 minutos.
- El sistema debe poseer interfaces gr�ficas bien formadas.

**Dependabilidad**

- El tiempo para iniciar o reiniciar el sistema no podr� ser mayor a 15 segundos.
- La probabilidad de falla del Sistema no podr� ser mayor a 1%.

### Diagrama de Arquitectura Preliminar

### Matriz de Trazabilidad

## 4- ARQUITECTURA
## 5- DISE�O E IMPLEMENTACI�N
## 6- PRUEBAS UNITARIAS Y DEL SISTEMA
## 7- DATOS HIST�RICOS
## 8- INFORMACI�N ADICIONAL 
