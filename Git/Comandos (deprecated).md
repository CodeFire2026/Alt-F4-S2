# ℹ Comandos y Tips de Git


Listado de (casi) todos los comandos que hemos visto y usado en clases. Se recomienda fuertemente buscar con `Ctrl + F` el comando del que necesites aprender o recordar.

_⚠️ OJO: cualquier `<cosa-entre-flechas>` es a modo de ejemplo y debe reemplazarse con su respectivo nombre/comando/aclaración sin incluir las flechas (a menos que se indique lo contrario). Si hay comillas `"` en el comando es porque **sí** deben incluirse (si no funciona, probar sin comillas)._


<br>


# 💻 Las bases de Bash (CLIs)



**`tab` (tecla)**: permite autocompletar nombres de archivos, directorios, comandos e incluso opciones

**`↑`** o **`↓` (teclas)**: permite volver a usar rapidamente comandos previamente ingresados

**`pwd`**: PRINT WORKING DIRECTORY — Nos muestra por consola el directorio en el que estamos situados

**`cd`**: CHANGE DIRECTORY — Permite movernos de directorio. Se puede ingresar el comando sin nada (`cd`) para ir directamente a la dirección "~" ("virgulilla", por defecto es `C:/users/tu_usuario/`) o ingresar un nombre/ruta completa del directorio para ir ahí (ej. `cd tecnicatura2026/`)

**`mkdir`**: MAKE DIRECTORY — Crea un directorio con el nombre que le siga al comando (ej. `mkdir tecnicatura2026`)

**`clear`**: Limpia la consola

**`touch`**: Crea un archivo con el nombre y extension que le siga al comando (ej. `touch readme.txt`). Solo crea el archivo si no existe, si ya existe entonces no se crea ni se sobreescribe nada

**`.`**: Un solo punto quiere decir "el directorio actual". (ej. `cd .` nos mueve a la carpeta actual, basicamente no nos movemos. No solo aplica para `cd`, sino cualquier caso donde se requiera indicar una ruta).

**`..`**: Dos puntos quiere decir "el directorio anterior". (ej. `cd ..` nos moverá a la carpeta anterior a la que estemos parados. No solo aplica para `cd`, sino cualquier caso donde se requiera indicar una ruta).

**`cat`**: CONCATENATE — Muestra los contenidos de un archivo dado como argumento. (ej. `cat usuarios.txt` mostrará por pantalla los caracteres que contenga ese archivo).

**`--help`**: Opcion universal para la mayoria de comandos, devuelve instrucciones de uso, opciones e información sobre el comando que se haya indicado (ej. `mkdir --help` mostrará información detallada del comando `mkdir`, mientras que `rm --help` mostrará información del comando `rm`).


**`ls`**: LIST — Muestra por pantalla todos los archivos y directorios de la ruta actual (al ingresar el comando solo), aunque también se le puede pasar una ruta completa y mostrará su contenido (por ej. si estamos en `~` e ingresamos el comando `ls tecnicatura2026/2do_Semestre/python/Clase5`, la consola mostrará todos los ejercicios de la clase 5).

- **`-a`**: ALL — Mostrará también los archivos ocultos
- **`-l`**: LONG LISTING FORMAT — Mostrará también los permisos, dueño, tamaño y fecha de modificación de los archivos, es decir, más detalle


<br>


**`history`**: Muestra el historial completo de los comandos que hemos utilizamos en la consola previamente (es decir, los que podemos acceder con la flecha arriba `↑`).

- **`-c`**: CLEAR — Borra todos los comandos que se han ido guardando en el historial


<br>


**`rm`**: REMOVE — Borra de forma permanente el archivo que se le ingrese como argumento. Sín la opcion `-r` no puede borrar directorios. (ej. `rm archivo.txt`, esto borraría sin vuelta atrás a archivo.txt).

- **`-r`**: RECURSIVE — Eliminará los archivos y directorios que encuentre de manera recursiva, es decir que puede eliminar un directorio y los contenidos de éste. (ej. `rm -r tecnicatura2026/`, borraria de forma permanente todos los contenidos de ese directorio)
- **`-f`**: FORCE — Ignora los archivos que no existen y no pide confirmación antes de borrar, incluso si el archivo está protegido


<br>


# 🔧 Configuración e información de Git


<details>
<summary><b><code>git config</code></b></summary>

Sirve para obtener y establecer variables de configuración que controlan el funcionamiento, la apariencia y el comportamiento de Git (principalmente para establecer nombre e email).

- **`--list`** o **`-l`**: Muestra en forma de lista por pantalla las configuraciones actuales de tu Git, incluyendo información como Usuario e Email (si es que fueron ingresados antes)
- **`--local <variable>`**: configuraciones que solo estarán disponibles para el repositorio actual, sobreescribe a `global` y a `system` (por ej. `--local user.name "Juan Perez"` para ingresar tu nombre o `--local user.email "juanp@gmail.com"` para ingresar tu mail)
- **`--global <variable>`**: configuraciones que estarán disponible para todos los repositorios del usuario actual
- **`--system <variable>`**: configuraciones que estarán disponible para todos los usuarios del SO y todos los repositorios (requiere permisos de administrador)
---
</details><br>



<details>
<summary><b><code>ssh-keygen -t ed25519 -C "&lt;email&gt;"</code></b></summary>

Permite generar una clave ssh guardandola por defecto en una carpeta oculta llamada `.ssh` en `~` (esto se combina con el [script para iniciar el agente al abrir bash](https://docs.github.com/en/authentication/connecting-to-github-with-ssh/working-with-ssh-key-passphrases#auto-launching-ssh-agent-on-git-for-windows)), el nombre del archivo por defecto depende de tu algoritmo, en este caso seria `id_ed25519`. Al crear la clave te pedirá dónde guardarla, presionar enter para dejar por defecto. Al igual que preguntará por una contraseña (y otra vez para confirmarla), esto se puede dejar en blanco si se quiere.

- **`-t <algoritmo>`**: TYPE — Define el tipo de algoritmo criptográfico para crear la clave. El algoritmo ed25519 es el más seguro, moderno y eficiente actualmente. Aunque hay algunos sistemas que no soportan este algoritmo
- **`-C <email>`**: COMMENT — Agrega un comentario de texto dentro del archivo de la clave pública para identificar a qué cuenta o máquina le pertenece esa clave, comunmente va el mail
- **`-b <bits>`**: En caso de no poder usar `ed25519` y tener que usar `rsa` esta opción define la longitud de la clave en bits, para asegurar la máxima seguridad usando `rsa` se debe hacer `-b 4096`
---
</details><br>


<br>


# 🧰 Utileria diaria


**`git <subcomando>`**: Nombre del ejecutable "git.exe". Con éste podemos acceder a todas las funciones de git (es decir, seguirle con un `status`, `push`, `pull`, `commit`, etc.)


**`git init`**: GIT INITIALIZE — Crea un repositorio Git (carpeta oculta llamada `.git`) en la carpeta que estemos parados (`pwd`)


**`git clone <https-url/clave-ssh>`**: Permite descargar y copiar un repositorio remoto a tu espacio local (la carpeta con los archivos se crearán en la carpeta que estés parado)


<details>
<summary><b><code>git remote</code></b></summary>

Por si solo, muestra los nombres de los remotos a los que estemos conectados (por ej. lo básico es que al ingresar este comando te imprima solo `origin`).

- **`-v`**: Ejemplo de uso `git remote -v`. Nos muestra también los nombres de los remotos conectados, pero ahora le agrega las direcciones (URL o SSH) tanto para push como para pull
- **`show <apodo>`**: Ejemplo de uso `git remote show origin`. Mostrará información mucho más detallada de los remotos conectados, incluye nombres, direcciones para fetch, pull, push; puntero HEAD y con qué rama remota está viculada cada rama local
- **`add <apodo> <https-url/clave-ssh>`**: Con esto podemos indicarle a git qué repositorio remoto debería vincular con nuestro repo local, asignandole el apodo que queramos que comunmente se usa "origin". Util cuando se tiene un repo local, pero nunca se creó uno remoto. Dado este caso, uno tiene que crear un repositorio en github vacio con el nombre que quieras (puede ser el mismo que la carpeta padre de tu repo local) sin incluir ".gitignore" ni "README.md" (para evitar problemas de historial), luego copiar su URL/SSH, y por ultimo en tu repositorio local hacer `git remote add origin <url/ssh>` para vincularlos. Una vez hecho esto se puede hacer `git push -u origin main` para subir tu repo local a la nube y posteriormente hacer `git pull origin main` si lo necesitas
- **`set-url <apodo> <nueva-URL/SSH>`**: Si cambiaste el nombre del proyecto en github, cambiaste de nombre de usuario o si querés pasar de HTTPS a SSH, entonces este comando te permite indicar la nueva dirección del remoto indicado (ya sea origin o el apodo que hayas elegido)
- **`rename <apodo-original> <nuevo-apodo>`**: Si queres usar otro apodo que no sea "origin", primero tenes que indiar qué nombre queres modificar seguido del nuevo nombre para tu remoto. Por ej. `git remote rename origin github` (esto haria que tengamos que escribir "github" en lugar de "origin" para cualquier comando en el futuro)
- **`remove <apodo>`** o **`rm`**: Ejemplo `git remote rm origin`. Como indica el nombre sirve para desvincular por completo un repo remoto (no borra archivos)
---
</details><br>


<details>
<summary><b><code>git pull</code></b></summary>

Descarga e integra de inmediato los cambios remotos a tu espacio local. Es técnicamente la combinación de `git fetch` + `git merge`. Recuerda que este comando requiere que hayas ingresado `git push -u origin <nombre-de-rama>` antes, o sino dará error ya que no sabe de dónde sacar los cambios (aunque si no querés usar `-u`, siempre podes especificar manualmente de dónde sacar los cambios con `git pull origin <nombre-de-rama>`).

- **`origin <nombre-de-rama>`**: En sí "origin" es un alias/apodo, el cual apunta a la dirección URL/SSH del servidor remoto que hayamos clonado o ya pusheado antes (si no lo has hecho, ver info sobre `git remote` y su opción `add`), la rama se indica para que git sepa de qué rama hay que traer los cambios (cuidado, si por ejemplo queres traer una nueva rama remota llamada `second` a tu espacio local pero solo tenés creada la rama `main`, tenés que sí o sí crear la rama `second` primero de forma local, cambiarte a esa rama con `git switch` o `git checkout`, y _recien_ ahí hacer `git pull` o sino tus cambios se verán reflejados en la rama equivocada, que en este ejemplo seria `main`)
---
</details><br>









**`git fetch`**: Se usa para descargar _solamente_ el historial más reciente del servidor, sin hacer cambios inmediatos a tu zona de trabajo, permite revisar los cambios o ramas nuevas que se han hecho antes de integrarlos localmente, a diferencia de `git pull` que intenta mergear automaticamente.




<details>
<summary>Opciones</summary>


- **`origin <nombre-de-rama>`**: Es más bien un alias. Por defecto es la dirección URL del servidor remoto que hayamos clonado o ya pusheado antes. Sepase que `fetch` no tiene `-u`, por lo tanto este paso debe hacerse previo o se debe incluir manualmente `origin`
- **`-p`** o **`--prune`**: Normalmente, si se borraron ramas de forma remota, vas a seguir viendolas localmente. Usando esta opción esas ramas fantasmas se limpian


</details>










**`git status`**: Muestra los cambios hechos en el área de trabajo, los cambios añadidos al área de preparación y qué archivos son nuevos y todavía no trackeados (todo en el repositorio actual).









**`git ignore`**: Permite ignorar archivos pasados como argumentos. (Por ej. `git ignore archivo.py`).









**`git add`**: Añade un archivo al área de preparación, puede usarse un punto `.` para indicar que _todo_ lo que se encuentra en el directorio actual (en el que estamos parados) sea añadido al área de preparación (ej. estamos parados en el directorio `python/`, e ingresamos el comando `git add .`, esto añadirá todos los archivos y cambios hechos en `python/` al área de preparación listos a ser commiteados).




<details>
<summary>Opciones</summary>


- **`-A`**: stagea todos los cambios (archivos nuevos, modificados y eliminados) de **todo** el repositorio, sin importar desde qué carpeta se ejecute el comando


</details>










**`git restore`**: Lo opuesto a add, revierte los cambios hechos a un archivo/directorio para que vuelvan a estar como estén en el commit más reciente.

<!--INFORMACION-->

<div style="margin-top: -12px;">
<details>
<summary>Más información</summary>


Se le puede especificar un archivo con `git restore <nombre_archivo>` o directamente se puede revertir todo lo que no esté stageado con `git restore .`. También se le puede especificar qué estado revertir, por defecto se interpreta que es `--worktree`, es decir que la restauracion se aplicará a los archivos locales (en el working directory).


</details>




<div style="margin-top: 0px;">
<details>
<summary>Opciones</summary>


- **`--staged <nombre-archivo>`**: Saca al archivo del staging area sin tocar al archivo local, puede combinarse con `--worktree` para sacar del staging al archivo Y restaurarlo a como estaba en el ultimo commit
- **`--source=<hash/HEAD/branch> -- <nombre-archivo>`**: Permite restaurar el archivo al estado que tenia en el commit especificado o al estado que tenia en otra rama, hay que hacer un `git add` y un commit despues de usar este comando para guardar los cambios (el comando completo usando el nombre de la rama seria `git restore --source=rama2 -- archivo.txt`, se puede usar `--` como en `checkout` para indicar que lo que sigue es una ruta de archivo y no una rama)


</details>










**`git commit`**: Toma todos los cambios que hay en el área de preparación (los que fueron añadidos con `git add`) y los graba permanentemente en el historial del repositorio actual, si no se ingresa ninguna opción entonces se abrirá el editor de texto que tengas (puede ser _vim_ o _nano_) para escribir el mensaje de commit.




<details>
<summary>Opciones</summary>


- **`-m "mi mensaje"`**: MESSAGE — Nos permite ingresar un comentario para el commit sin tener que abrir el editor de texto
- **`-a`** o **`--all`**: Añade al commit todos los archivos que ya estén trackeados y que hayan sido modificados o eliminados, ahorrandote la necesidad de hacer `git add` (ojo, esta opción no incluye archivos nuevos)


</details>










**`git push`**: Se usa para subir los cambios locales al repositorio remoto vinculado. Para el primer push se debe indicar la rama usando `git push -u origin <rama>` (origin se establece automaticamente con `git clone` o lo estableces manualmente con `git remote`, para info sobre `-u` leer opciones de este comando). Advertencia, la rama que le indicamos se vinculará con la rama en la que estamos parados, asegurate de que la rama local y la rama remota sean las que quieras que se vinculen (si te equivocaste, leer opciones de `git branch` para solucionarlo).




<details>
<summary>Opciones</summary>


- **`-u`** o **`--set-upstream` (seguido de `origin <nombre-de-rama>`)**: Esta opción le indica a Git que recuerde la dirección del repo remoto y la rama remota ingresados para no tener que volver a ingresar el comando completo de vuelta (es decir, que para la proxima solo será necesario ingresar `git push`)
- **`--all`**: Sube todos los cambios de todas las ramas, no solo de la que estas parado
- **`--tags`**: Le indicas al push que incluya TODAS las tags locales que no estén en el servidor, OJO no se puede combinar con `--all` en la misma linea, deben hacerse dos push por separado
- **`-f`** o **`--force`**: Si el servidor rechaza el push, se lo puede forzar con esta opción. Sobreescribe el remoto con tu local, se puede pisar progreso cuidado
- **`--force-with-lease`**: Preferible antes que `-f`, fuerza tu push al servidor sin borrar los cambios nuevos de otros
- **`origin --delete <rama>`**: Permite eliminar del servidor la rama pasada como argumento


</details>










**`git tag <version> <hash-del-commit>`**: Permite crear punteros en el historial de commits (ej. `git tag v1.0 <hash>`).




<details>
<summary>Opciones</summary>


- **`-a <version> -m "mensaje de etiqueta anotada"`**: ANNOTATED — Le indica a git a crear una etiqueta anotada en vez de una ligera, la diferencia es que la ligera es un simple puntero a un commit sin información detallada, como si fuera una rama que no se mueve, mientras que una etiqueta anotada es un objeto completo e independiente dentro de git el cual guarda quién la creó y cuándo se creó. Pide si o si un mensaje si se usa esta opcion
- **`-d <version>`**: DELETE — Elimina la etiqueta que le indiquemos como argumento, por ej. `git tag -d version_2.4`


</details>










**`git log`**: Muestra todos los commits hechos para el repositorio actual, se le puede especificar un archivo (`git log archivo.txt`) para ver el historial de commits para ese archivo.




<details>
<summary>Opciones</summary>


- **`--oneline`**: Muestra de forma más resumida los commits (solo un hash corto por linea)
- **`--graph`**: Muestra de forma grafica con arte ASCII los commits y sus ramas
- **`--all`**: Por defecto `git log` solo muestra los commits en la rama actual, con esta opcion podemos forzar a que muestre _todos_ los commits, incluyendo de otras ramas locales o remotas
- **`--decorate`**: "decora" la lista de commits con parentesis indicando punteros y dónde están situados
- **`--raw`**: Muestra de forma resumida y en lista qué archivos se modificaron y cómo (M modified, A added, D deleted, R renamed, C copied) en cada commit
- **`-n <numero>`** o **`-<numero>`**: Permite especificar la cantidad de commits a mostrar (por ej. hacer `git log -n 4` es util cuando necesitas copiar un hash reciente sin tener que scrollear hasta arriba)
- **`-p`**: Muestra de forma detallada los mensajes de commit junto con el diff de cada uno, util para ver qué archivos fueron modificados y cómo línea por línea. Tiene subopciones: `-p -<numero>` limita la cantidad de commits a mostrar dependiendo de `<numero>`, `-p <ruta-archivo>` permite los cambios de un archivo especifico
- **`--after="YYYY-MM-DD/today"`** o **`--before=<lo-mismo>`**: Para localizar los commits por fecha
- **`--author="<nombre>"`**: Muestra los commits hechos por el usuario ingresado, resaltando su nombre con color
- **`--grep="<palabra-clave>"`**: Busca y muestra los commits que contengan en sus mensajes el texto ingresado. Ejemplo: `--grep="Java"`. También se puede agregar `-i` para que sea case insensitive, ejemplo: `--grep="modify" -i`
- **`-S "<palabras-clave>"`**: Muestra los commits cuyos archivos contengan las palabras ingresadas. Ejemplo: `-S "if __name__"`


</details>










**`git branch`**: Sirve para ver las ramas existentes y en cuál estamos parados.




<details>
<summary>Opciones</summary>


- **`-u <apodo-del-remoto>/<rama-remota>`** o **`--set-upstream-to=<apodo-del-remoto>/<rama-remota>`**: Al usar esta opcion con git branch podemos vincular de forma especifica nuestra rama en la que estemos parados con la rama que hayamos especificado, por ej. estando parados en la rama main, hacemos `git branch -u origin/main` para vincular nuestra rama local "main" con la rama remota "main". Esto es util por si nos equivocamos y vinculamos una rama con otra que no era, ya que con este comando podemos sobreescribir con qué rama se vincula la nuestra
- **`-a`**: Lista todas las ramas incluyendo las remotas
- **`-m <nuevo-nombre>`**: Cambia el nombre de la rama actual al nombre dado como argumento
- **`-d <nombre-rama>`**: Elimina de forma segura una rama (solo permite eliminar si la rama ya fue mergeada con main)
- **`-D <nombre-rama>`**: Elimina de forma forzada una rama (no importa si fue mergeada con main o no)


</details>










**`git checkout`**: Principalmente se usa para cambiar de rama, aunque también puede crear nuevas ramas o restaurar archivos a una version anterior (a una versión de un commit específico o del commit anterior).

<!--INFORMACION-->

<div style="margin-top: -12px;">
<details>
<summary>Más información</summary>


Para cambiar a otra rama el comando seria `git checkout <nombre-rama>`, mientras que para restaurar un archivo a como estaba en el commit anterior de la rama actual seria `git checkout <nombre-archivo>`. Ojo: hacer checkout puede hacer que cualquier cambio local (en el working directory) que no haya sido stageado sea eliminado o perdido (si solo cambias de rama no debería haber ningun problema, pero por las dudas nunca olvides stashear tu trabajo no stageado antes de hacer checkout).


</details>




<div style="margin-top: 0px;">
<details>
<summary>Opciones</summary>


- **`-b <nombre-de-nueva-rama>`**: Permite crear y cambiarse a una nueva rama ingresando un nombre como argumento
- **`<nombre-rama> -- <nombre-del-archivo>`**: Permite que el estado o version de un archivo vuelva al estado que tenia en la rama especificada, hay que hacer un commit despues de este comando para guardar el cambio. El `--` le aclara a Git que lo que sigue es el nombre de un archivo y no el nombre de una rama a la que queres cambiar, util cuando tenes un archivo que se llama igual que tu rama (ya que por defecto checkout prioriza cambiar de rama antes que restaurar un archivo)
- **`<hash-de-commit-deseado> <nombre-del-archivo>`**: Permite cambiar la version de un archivo dado el hash del commit especifico deseado
- **`<hash-de-un-commit>`**: Nos pondrá en Detached Head y restaurará el área de trabajo a como estaba en el commit especificado. Para salir de este estado y restaurar el puntero (HEAD) podemos hacer `git checkout <nombre-de-rama-main>`
- **`-f`** o **`--force`**: Fuerza el cambio de rama o la restauración de archivos, ignorando y descartando cualquier cambio local que no haya sido stageado. Por defecto git no deja cambiar a una rama si tus cambios locales hacen conflicto con la rama de destino, pero al hacer `git checkout -f <nombre-rama>` lo obligas, perdiendo cualquier modificacion local que chocaban con la rama. Mientras que si haces `git checkout -f` sin especificar un archivo o rama el comando "limpia" el working directory, restaurando todos los archivos trackeados (los no trackeados son ignorados) y los archivos stageados a como estaban en el commit más reciente, destruyendo cualquier cambio que hayas hecho. Cabe mencionar que ambos usos de `-f` son irreversibles


</details>










**`git switch <nombre-de-rama>`**: Sirve para cambiar entre ramas, similar a checkout pero menos ambiguo y más seguro (se recomienda usarlo junto con `git restore` si se desea imitar las funciones de `checkout`).




<details>
<summary>Opciones</summary>


- **`-c <branch_name>`**: Creará una rama con el nombre dado como argumento


</details>










**`git merge <nombre-de-rama-fuente>`**: Sirve para fusionar dos ramas distintas, para esto primero hay que pararse en la rama que va a recibir los cambios, por ejemplo primero hacer `git switch main` seguido de `git merge second` (esto resultaria en los cambios de `second` aplicandose a `main`).  

<!--INFORMACION-->

<div style="margin-top: -12px;">
<details>
<summary>Más información</summary>


Si la rama destino y fuente tuvieron commits por separado antes del merge, git hará el merge como un commit nuevo en vez de un _fast-forward_. Pero si se genera un conflicto, el merge se detendrá y el archivo con el conflicto tendrá el siguiente bloque de texto cubriendo a las lineas problemáticas:  

```txt
<<<<<<< HEAD             <-- tu puntero
<codigo-de-arriba>       <-- tu codigo (normalmente)
=======                  <-- el separador
<codigo-de-abajo>        <-- el codigo entrante
>>>>>>> NOMBRE-RAMA      <-- la rama entrante
```

Para solucionar esto hay que borrar las marcas (`<=>` y `HEAD`/`NOMBRE-RAMA`) y quedarse con el codigo que mejor convenga (o combinarlos, el punto es que hay que editar y que quede solo uno). Luego de guardar el archivo con el código resuelto hay que hacer `git add <archivo_con_el_problema.txt>`, después de eso se puede usar `git merge --continue` para finalizar el merge.


</details>




<div style="margin-top: 0px;">
<details>
<summary>Opciones</summary>


- **`--continue`**: Permite finalizar un merge una vez resueltos los conflictos manualmente, esta opción es preferible antes que hacer un `git commit` porque tiene más funcionalidades (verifica si hay un merge en proceso y avisa si dejaste algun conflicto o si no guardaste los archivos)
- **`--abort`**: Si el conflicto es muy complejo esta opción revierte el repositorio a como estaba antes de hacer el merge, util como boton de pánico en caso de un conflicto crítico


</details>








<!-- DEFINICION -->

**`git reset <hash-de-commit>`**: Sirve para volver en el tiempo y "borrar" commits. Seria como un deshacer forzoso (así que cuidado, ver `git revert` para una opción más segura y amigable cuando se trabaja en grupo). Se puede indicar el nombre de un archivo en vez de un hash, esto hará que el archivo sea removido del staging area (aunque es preferible usar `git restore --staged`).




<details>
<summary>Opciones</summary>


- **`--soft`**: Va atras en el tiempo pero mantiene los cambios que tengas stageados. (ej. `git reset --soft HEAD~1` haria un deshacer al ultimo commit, pero también se puede especificar un hash)
- **`--mixed`**: Va atras en el tiempo y saca del staging area a los cambios que tengas (mantiene los archivos en tu disco intactos). Este es el que Git usa por defecto, es decir, si ingresas `git reset` sin nada se considera un `--mixed HEAD`, util para cuando queres deshacer un `git add .`
- **`--hard`**: Va atras en el tiempo y no solo saca del staging area sino que tambien borra a los cambios de tu disco


</details>










**`git revert <hash-de-commit-deseado>`**: Revierte los cambios creando un nuevo commit, en lugar de volver en el tiempo. Ideal para ramas compartidas con equipos, preferible antes que usar `reset`.









**`git stash`**: Util para guardar temporalmente los cambios no confirmados (staged o no) para poder trabajar en otras ramas o realizar una tarea de emergencia.




<details>
<summary>Opciones</summary>


- **`pop`**: Permite retomar el ultimo stash y lo elimina de la lista de stashes
- **`push -m <mensaje>`**: Guarda un stash con un mensaje dado, util para identificar el stash
- **`-u`**: UNTRACKED — El stash incluirá archivos nuevos no añadidos a git
- **`list`**: Muestra la lista de stashes con sus numeros y mensajes si tienen
- **`apply stash@{n}`**: Aplica un stash sin eliminarlo de la lista como hace `pop`
- **`drop stash@{n}`**: Elimina un stash especifico con el numero de stash
- **`clear`**: Elimina todos los stashes guardados


</details>










**`git rm <nombre-archivo>`**: GIT REMOVE — Elimina del área de preparación y también del worktree al archivo pasado como argumento. Opciones\:




<details>
<summary>Opciones</summary>


- **`--cached <nombre-archivo>`**: borra el archivo (o carpeta si se combina con `-r`) solo del área de preparación y NO de tu computadora, util para sacar archivos o carpetas que añadiste por error y querés agregar a tu .gitignore
- **`-f`** o **`--force`**: Por defecto git no te deja borrar un archivo que tenga cambios locales sin guardar en un commit, esta opción ignora esos cambios y elimina el archivo de todas formas (tanto del staging como del working directory)
- **`-r <nombre-carpeta/>`**: RECURSIVE — Permite borrar carpetas y todos sus contenidos dentro


</details>








## Misceláneos a saber



**`code`**: Abre Visual Studio Code, se le puede indicar qué abrir (ej. `code .` para abrir la carpeta actual, `code archivo.txt` para abrir un archivo en particular)









**`git show`**: Por defecto sirve para visualizar detalles (adiciones, modificaciones o eliminaciones en cada archivo que fue modificado) linea por linea del último commit, pero en realidad sirve para ver detalles de cualquier objeto git (por ejemplo una tag anotada usando `git show <version>`)









**`git shortlog`**: Muestra el nombre del usuario, la cantidad de commits al lado de su nombre y una lista de solo los mensajes de los commits









**`git diff`**: Sirve para ver las diferencias linea por linea entre versiones, de ya sea de commits, archivos o lo que esté en el área de preparación. El comando solo sin argumentos mostrará los cambios locales hechos (lo que no esté stageado). Las lineas rojas indican lo que fue modificado o borrado, mientras que las verdes indican lo que fue agregado.




<details>
<summary>Opciones</summary>


- **`--stat`**: Muestra de forma resumida los archivo modificados y cuales fueron sus cambios en cada uno
- **`--numstat`**: Muestra de forma incluso más resumida los cambios de cada archivo que haya sido modificado, mostrando solamente las lineas que fueron agregadas (izquierda) y eliminadas (derecha)
- **`--staged`**: Muestra los cambios que entrarán en el próximo commit
- **`<nombre_de_otra_rama>`**: Mostrará las diferencias entre la rama actual y la rama dada, si ingresas el nombre de la rama actual simplemente mostrará los cambios locales hechos (si es que hay)
- **`<nombre-rama-1>..<nombre-rama-2>`**: Muestra qué tiene la rama 2 que no tenga la rama 1
- **`<hash1> <hash2>`**: Compara dos commits


</details>

