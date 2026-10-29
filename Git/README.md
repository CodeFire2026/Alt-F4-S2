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