# Clase 1

### <ins>USO DE GITHUB</ins>
GitHub es una plataforma que nos permite guardar repositorios de Git que podemos usar como servidores remotos y ejecutar algunos comandos de forma visual e interactiva (sin necesidad de la consola de comandos).
Luego de crear nuestra cuenta, podemos crear o importar repositorios, crear organizaciones y proyectos de trabajo, descubrir repositorios de otras personas, contribuir a esos proyectos, dar estrellas y muchas otras cosas

### <ins>COMANDOS</ins>
`Import repository`  
`New repository`  
`New organization`: significa que es como tu empresa  
`New project`: significa es como un grupo de repositorios que puedes tener dentro de una empresa  
`New gist`: es un pedacito de código que puedes compartir  
`New repository`: ponemos el nombre `Prueba-Inicio.Repo`. Así armamos un repositorio. Hay muchas licencias para publicar el código, pero NO lo hacemos ahora.  
`Create repository`: lo ponemos en privado o en Publico.

### <ins>README</ins>
El README.md es el archivo que veremos por defecto al entrar a un repositorio. Es una muy buena práctica configurarlo para describir el proyecto, los requerimientos y las instrucciones que debemos seguir para contribuir correctamente.

### <ins>CLONACIÓN</ins>
Para clonar un repositorio desde GitHub (o cualquier otro servidor remoto) debemos copiar la URL (por ahora, luego usaremos ssh) y ejecutar el comando git clone + la URL que acabamos de copiar. Esto descargará la versión de nuestro proyecto que se encuentra en GitHub. Clonar solo sirve para aquellos que todavía no tienen el proyecto en sus maquinas, si ya lo tenes, no hace falta clonar (se usaría git fetch, pull, etc.).

_ATENCIÓN_: ¿Por qué? Porque a través de https nos pedirá usuario(nombre perfil) y contraseña. Igual esto ya no funciona de una manera fácil.

<ins>Cómo conectar un repositorio de GitHub a nuestro documento local</ins>: si queremos conectar el repositorio de GitHub con nuestro repositorio local, aconsejo que al trabajar desde GitHub no utilizemos localmente el comando git init, si debemos ejecutar las siguientes [instrucciones](https://drive.google.com/file/d/1qIz5XokUEoG9j7mnl-trPvkjbFKtAOgg/view?usp=drive_link)

<br><br>

# Clase 2

### <ins>LLAVE PÚBLICA</ins>
Vamos a cargar la llave SSH publica en GitHub
>( ! ) SI YA HAZ HECHO ESTE TRABAJO **NO** SE DEBE REPETIR EL SSH

Para copiar la llave publica debes ir al archivo `.ssh` y allí encontrarás el archivo `.pub` lo podes abrir con un editor de texto y luego copiar el contenido que esta dentro. Luego, iremos a GitHub y nos dirigimos a _setting_, vamos a _SSH and GPG keys_. Le damos a crear una nueva clave (`New SSH key`), ponemos nombre y pegamos la ssh publica, con esto esta listo. Aconsejo que la ssh tenga el nombre del ordenador en el que estas trabajando. Esto se debe hacer con cada pc nueva o dispositivo nuevo que tengamos para acceder a nuestra cuenta de GitHub.

### <ins>COMANDOS</ins>  
```
git branch               <- Vemos en que rama estamos

git checkout master      <- Ponernos en la rama master

git branch -M main       <- Cambiamos el nombre a la rama master

git remote add origin git@github.com:nombreUsuario/class-git.git    <- Agregamos el repositorio remoto, este es un ejemplo

git remote -v            <- Vemos si ya esta conectado

git merge segunda        <- Mergeamos lo que tenemos en la rama segunda en main

git commit -am "Uso de GitHub parte 20"    <- Hacemos el commit de hoy

git push origin main     <- Pasamos todo lo hecho a GitHub, revisar en el repositorio en GitHub.
```

Frente al cambio de nombre de rama master a main, suele suceder que en el repo de GitHub se hayan creado dos ramas, la rama master y la rama main, se debe ir al repo, settings y ahí se puede cambiar la rama principal, en vez de que siga siendo master, que sea la rama main, luego de eso ya podemos borrar la rama master.

<br><br>

# Clase 3
### <ins>Cambios en GitHub: de master a main</ins>
El escritor Argentino Julio Cortázar afirma que las palabras tienen color y peso. Por otro lado, los sinónimos existen por definición, pero no expresan lo mismo. Feo no es lo mismo que desagradable, ni aromático es lo mismo que oloroso. Por eso, podemos afirmar que los sinónimos no expresan lo mismo, no tienen el mismo “color” ni el mismo “peso”.

Desde el 1 de octubre de 2020 GitHub cambió el nombre de la rama principal: ya no es “master” -como aprenderás aquí- sino main. Este derivado de una profunda reflexión ocasionada por el movimiento #BlackLivesMatter. La industria de la tecnología lleva muchos años usando términos como master, slave, blacklist o whitelist y esperamos pronto puedan ir desapareciendo. Ya que sí, las palabras importan.

Tener en cuenta que de aquí en adelante cada vez que me se mencione “master” debes saber que se hace referencia a “main”.

<ins>¿Cuando es que sigue siendo master y cuando sigue siendo main?</ins>

Cuando se crea un repositorio desde git bash en nuestro ordenador a través de git init, sigue siendo el estandar como master. ¿Qué hacer con esto? Debes cambiar el nombre de la rama master a main con el comando `git branch -M main` o cambiando la asignación por default con `git config --global init.defaultBranch main` (esto hara que siempre que ingreses `git init` la rama será `main`).

Ahora cuando creamos un repositorio desde la nube, o sea desde GitHub, ya verás que la rama principal tiene por default el nombre de main y al clonar a nuestro ordenador seguira teniendo este nombre y no será necesario ningun cambio.

### <ins>gitk</ins>
Gitk fue el primer visor gráfico que se desarrolló para ver de manera gráfica el historial de un repositorio de Git. Es decir, podemos ver gráficamente nuestro entorno y flujo de trabajo local. El comando es `gitk`
>Si no te funciona el comando gitk es posible no lo tengas instalado por defecto. Para instalar gitk debemos ejecutar los siguientes comandos:
>
>`sudo apt-get update`
>
>`sudo apt-get install gitk`

<br><br>

# Clase 4
### <ins>De HTTPS a SSH</ins>
La creación de las SSH es necesario solo una vez por cada computadora!

Luego de crear nuestras llaves SSH podemos entregarle la llave pública a GitHub para comunicarnos de forma segura y sin necesidad de escribir nuestro usuario y contraseña todo el tiempo. Para esto debes entrar a la Configuración de Llaves SSH en GitHub, crear una nueva llave con el nombre que le quieras dar y el contenido de la llave pública de tu computadora.

Ahora podemos actualizar la URL que guardamos en nuestro repositorio remoto, solo que, en vez de guardar la URL con HTTPS, vamos a usar la URL con SSH:
```
ssh

git remote set-url origin url-ssh-del-repositorio-en-github
```

### <ins>RUTAS SSH (segun OS)</ins>
- Mac: `pbcopy < ~/.ssh/id_rsa.pub`
- Windows (git bash): `clip < ~/.ssh/id_rsa.pub`
- Linux (Ubuntu): `cat ~/.ssh/id_rsa.pub`

<br>

> ( ! ) Importante: las buenas costumbres nos enseñan que antes de hacer un push, siempre debemos hacer un pull, un fetch, esto para que si alguien ya hizo algún cambio, no se genere un conflicto.

<br>

### <ins>Invitar a un colaborador</ins>
Para invitar a un colaborador debemos ir a GitHub y seleccionar: _setting_ -> _colaborators_ -> _ingresar contraseña_ (o un F2A de verificación) y enviar la invitación escribiendo el nombre de usuario. Del otro lado el usuario invitado solo debe aceptar y listo, ya puede participar del proyecto haciendo commit.

<br><br>

# Clase 5
### <ins>TAGS</ins>
En Git, las etiquetas o Git tags tienen un papel importante al asignar versiones a los commits más significativos de un proyecto. Aprender a utilizar el comando git tag, entender los diferentes tipos de etiquetas, cómo crearlas, eliminarlas y compartirlas, es esencial para un flujo de trabajo eficiente. Para crear una tag, utiliza el comando:
```sh
git tag <identificador>
```
El identificador semántico debe reflejar el estado del repositorio en el momento de la creación. Git admite etiquetas anotadas y ligeras. Las etiquetas anotadas almacenan información adicional como la fecha, etiquetador y correo electrónico, y son ideales para publicaciones públicas. Mientras que las etiquetas ligeras son más simples y se emplean como “marcadores” de una confirmación específica.

Para obtener una lista de etiquetas en el repositorio, haz `git tag` solo. Esto devolverá una lista de tus tags, por ejemplo:
```
v1.0
v1.1
v1.2
clase11-java-arreglos
clase11-java-matrices
clase12-java-ventas
```

### <ins>Uso compartido de etiquetas</ins>

Compartir etiquetas requiere un enfoque explícito al usar el comando git push. Por defecto, las etiquetas no se envían automáticamente. Para enviar etiquetas específicas, utiliza `git push origin <identificador>`. Para enviar todas las etiquetas en tu repo local, utiliza `git push origin --tags` (cuidado, si tienes tags viejas o personales que no deberias subir al remoto, con este comando se subiran igual)

### <ins>Eliminación de etiquetas</ins>
Para eliminar una etiqueta, usa el comando `git tag -d <identificador>` (solo la elimina de tu repo local)

>En resumen, las etiquetas en Git son esenciales para asignar versiones y capturar instantáneas importantes en el historial de un proyecto. Aprender a crear, listar, compartir y eliminar etiquetas mejorará tu flujo de trabajo con Git.

<br><br>

# Clase 6
### <ins>Error con los tags</ins>
Investigación: ¿Qué pasa si por error cargamos un tag con el mismo nombre dos veces? ¿Cómo solucionarías este problema o error?

### <ins>La Respuesta</ins>
Al intentar duplicar una tag, Git directamente dará error, tanto en local como en remoto, no te permite continuar con la creación o el push si detecta que la tag ya existe

**¿Qué problemas _SÍ_ pueden haber?**  
Algo que si puede suceder es que haya una tag remota que apunta a un commit distinto al que apunta en tu local, de ahí hay tres caminos a elegir:
1. **Borrar del remoto la tag**: si queres borrar la tag del remoto y luego pushear la tuya, harías `git push origin --delete <nombre_tag>` seguido de `git push origin <nombre_tag>`
1. **Reasignar tu tag local hacia otro commit**: para reasignar la tag hacia el commit más reciente, harías `git tag -f <nombre_tag>`, si no, para traerlo a uno especifico haces `git tag -f <nombre_tag> <hash_del_commit>`
1. **Borrar tu tag local**: directamente borras tu tag local con `git tag -d <nombre_tag>`, de ahí podés traerte las tags correctas del remoto (`git fetch --tags -f`, ojo, con ``-f o --force`` te sobreescribe las duplicadas de forma local, sin `-f` solo traerá tags nuevas. Las que son iguales se ignoran.) o intentar crear una nueva tag evitando el problema en sí

**Luego de solucionar**  
Sí o sí hacer y pedirle a tus compañeros que también hagan `git fetch --prune --prune-tags` para eliminar cualquier rama y tag fantasma (o 'huérfana') que haya quedado localmente

<br><br>

# Clase 7
En esta clase, el profe comenta:
>En GitHub tenemos cantidad de comandos, hemos presentado muchos hasta ahora, les he solicitado que agreguen los comandos que aun vimos en vivo en el archivo README.md dentro del directorio class-git o dentro de un directorio con el nombre que eligan, esto de manera grupal, hoy en la clase en vivo, voy a estar pidiendo de nuevo este archivo README.md con todas las clases cargadas, en el formato markdown

<br><br>

# Clase 8
Es bueno recordar sobre gitk. Esta es una herramienta muy util a la hora de ver graficamente nuestro trabajo y así entender mejor todo el funcionamiento de ramas, merge y todo el flujo en un formato ordenado. Si no te funciona el comando gitk es posible no lo tengas instalado por defecto, para instalar gitk debemos ejecutar los comandos vistos [anteriormente](#gitk)

### <ins>Manejo de ramas en GitHub</ins>
Las ramas nos permiten hacer cambios a nuestros archivos sin modificar la versión principal (main). Puedes trabajar con ramas que nunca envías a GitHub, así como pueden haber ramas importantes en GitHub que nunca usas en el repositorio local. Lo crucial es que aprendas a manejarlas para trabajar profesionalmente.

Si, estando en otra rama, modificamos los archivos y hacemos commit, tanto el historial (`git log`) como los archivos serán afectados. La ventaja que tiene usar ramas es que las modificaciones solo afectarán a esa rama en particular. Si luego de “guardar” los archivos (`git commit`) nos movemos a otra rama (`git checkout otraRama`) veremos como las modificaciones de la rama pasada no aparecen en la otraRama.

Comandos para manejo de ramas en GitHub:
```sh
git branch branchName       # Crear una rama
git checkout -b branchName  # También crea una rama
git checkout branchName     # Movernos a otra rama 
git push origin branchName  # Publicar una rama local al repositorio remoto
```

<br><br>

# Clase 9
### <ins>MÚLTIPLES COLABORADORES</ins>
Por defecto, cualquier persona puede clonar o descargar tu proyecto desde GitHub, pero no pueden crear commits, ni ramas. Esto quiere decir que pueden copiar tu proyecto pero no colaborar con él, si este es publico, de otra manera, osea, si es privado es necesario que realmente estes haciendo una invitación, sino no lo van a poder ver. Existen varias formas de solucionar esto para poder aceptar contribuciones. Una de ellas es añadir a cada persona de nuestro equipo como colaborador de nuestro repositorio.

**<ins>Agregar Colaboradores</ins>**  
Solo debemos entrar a la configuración de colaboradores de nuestro proyecto. Se encuentra en:

>Repositorio > Settings > Collaborators

Ahí, debemos añadir el email o username de los nuevos colaboradores.

**<ins>Camiar mensaje de commit</ins>**  
Si, como colaborador, agregaste erróneamente el mensaje del commit, lo puedes cambiar haciendo un commit con el nuevo mensaje que queremos, esto nos abre el editor de texto de la terminal. Ejemplo:
```sh
git commit —amend                       # Corregimos el mensaje
git pull origin main                    # Traer el repositorio remoto
git push --set-upstream origin main     # Ejecutar el cambio, el error arreglado
```

### <ins>PASOS DE UN COLABORADOR</ins>
```sh
# 0. Abre git bash

cd Documentos
mkdir class-git         # Crea la carpeta o directorio de trabajo
ls -al                  # Revisa lo que va haciendo, los archivos o directorios que tiene

# 1. No debe hacer un git init, debe buscar el repositorio en el cual esta invitado a participar, por supuesto en GitHub.
# 2. Pasa a clonar desde HTTPS, copiar la url, esto es porque no se arranca el proyecto desde cero, se esta uniendo otro colaborador.
# 3. En git bash pone el siguiente comando:
git clone url-copiada-github        #Esto hace que clonemos el repositorio

# 4. No pide ni usuario ni contraseña si el repositorio es publico.
code .                  # Abre VSC y comienza con cambios, o abre el siguiente comando para hacer modificaciones
vim historia.txt        # Vamos a escribir: Aquí esta un nuevo colaborador
vim escribimos el mensaje del commit    #Esto en Ubuntu
ctrl + x
s                       # Para un si 
enter                   # Terminado el mensaje del commit
vim escribimos el mensaje del commit    #Esto en git bash window
esc                     # Presionamos esc luego de terminar de escribir
:wq!                    # Para salir del editor vim en window

# Luego...
git status
git commit -am "Mi primer commit, estoy muy emocionado!!!"
git pull origin main
git fetch
gti branch              # Para ver las ramas que se trajo, no se trae sino solo main, si hay mas debes crearlas local
git log                 # Para ver toda las historia
git log --graph         # Vemos el grafico de las diferentes ramas y del commit que acabamos de hacer que esta en el main
git push origin main    # Va a pedir un email que será el del colaborador, su contraseña.

# 5. Nos trae un denegado, ¿Por qué? Porque en el proceso de abordaje el jefe no le dio acceso: el dueño del repositorio no le agregó dandole acceso.
# 6. Ir a settings del repositorio, veremos la opción Collaborators, agregamos el correo o nombre de usuario: el colaborador debe tener un email publico y visible o de otra manera debera ser con el nombre de usuario publico: ingresar el username y debe ir como colaborador.
# 7. Se puede enviar un email con la url, pero ya GitHub envia una notificación al usuario de invitado, es una cosa que debemos empezar a consultar y revisar.
# 8. El colaborador debe aceptar la invitación, una vez hecho eso ya tendrá total acceso para hacer push al repositorio.
git pull origin main
git push origin main    #Colocar nombre de usuario y contraseña, listo

# 9. El dueño del repositorio no ve los cambios, ¿Qué hacer?
git pull origin main
git fetch
git log --stat          # Se verá claro que el colaborador ingreso su primer commit

# 10. A partir de ahora el dueño del repositorio y el colaborador deberán repartir el trabajo, esto se hace con distintas ramas de trabajo: el dueño trabajará desde la rama header y el colaborador desde la rama footer, al final cuando se termine, se hara un merge para terminar el proyecto.
```

<br><br>

# Clase 10
### <ins>Flujo de trabajo profesional</ins>
Para poder desarrollar software de manera óptima y ordenada, necesitamos tener un flujo de trabajo profesional, que nos permita trabajar en conjunto sin interrumpir el trabajo de otros desarrolladores (haciendo merge de ramas de desarrollo a main). Una buena práctica de flujo de trabajo sería la siguiente:

1. Crear ramas
1. Asignar una rama a cada programador
1. El programador baja el repositorio con git pull origin master
1. El programador cambia de rama
1. El programador trabaja en esa rama y hace commits
1. El programador sube su trabajo con git push origin #nombre_rama
1. El encargado de organizar el proyecto baja, revisa y unifica todos los cambios

<br><br>

# Clase 11
### <ins>Flujo de trabajo profesional - Archivos binarios</ins>
Las imagenes cargandolas en el repositorio, representan un problema: porque las imagenes son pesadas, y si la subimos al repositorio, siempre que hagamos cambios, vamos a estar trayendo la imagen siempre, estas imagenes son binarios para GitHub, mientras mas binarios carguemos, más pesado va a ser el repositorio, algo que no es parte de las buenas practicas.

Otra cosa muy importante a tener en cuenta, es que en cada commit que hagamos hay un tamaño predefinido para la carga, este no lo podemos superar o no podremos subir los commits, el tamaño es 100 mb, si acoplamos un archivo binario en un commit que pese mas de esto, será un problema, no nos dejará seguir commiteando, porque siempre seguirá arrastrando el archivo binario.

<br><br>

# Clase 12
### <ins>Flujo de trabajo profesional - Fin</ins>
El profe pide:
>Es momento de presentar el README.md con todos los comandos y prácticas en cada clase, ya terminando este semestre, es hoy que debe estar completo este archivo en el lenguaje de Markdown, lo voy a pedir en la clase en vivo por zoom. los espero.


<br><br>

# Glosario de comandos de Git
Nuestra colección de todos los comandos de git vistos se encuentra [aquí](#)