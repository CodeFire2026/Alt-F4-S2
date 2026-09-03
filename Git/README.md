# Comandos y Tips de Git

<span style="font-size:1.2em;">Listado de (casi) todos los comandos que hemos visto y usado en clases.</span>

<span style="font-size:0.92em;">_⚠️ OJO: cualquier `<cosa-entre-flechas>` es a modo de ejemplo y debe reemplazarse con su respectivo nombre/comando/aclaración sin incluir las flechas (a menos que se indique lo contrario). Si hay comillas `"` en el comando es porque **sí** deben incluirse (si no funciona, probar sin comillas)._</span>

<div style="margin-top: 35px;"></div>

## Las bases de Bash (CLIs)

<span style="font-size:15px;"><b>`tab` (tecla)</b>:</span>&ensp;permite autocompletar nombres de archivos, directorios, comandos e incluso opciones

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`↑`</b> o <b>`↓` (teclas)</b>:</span>&ensp;permite volver a usar rapidamente comandos previamente ingresados

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`pwd`</b>:</span>&ensp;PRINT WORKING DIRECTORY — Nos muestra por consola el directorio en el que estamos situados

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`cd`</b>:</span>&ensp;CHANGE DIRECTORY — Permite movernos de directorio. Se puede ingresar el comando sin nada (`cd`) para ir directamente a la dirección "~" ("virgulilla", por defecto es `C:/users/tu_usuario/`) o ingresar un nombre/ruta completa del directorio para ir ahí (ej. `cd tecnicatura2026/`)

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`mkdir`</b>:</span>&ensp;MAKE DIRECTORY — Crea un directorio con el nombre que le siga al comando (ej. `mkdir tecnicatura2026`)

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`clear`</b>:</span>&ensp;Limpia la consola

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`touch`</b>:</span>&ensp;Crea un archivo con el nombre y extension que le siga al comando (ej. `touch readme.txt`). Solo crea el archivo si no existe, si ya existe entonces no se crea ni se sobreescribe nada

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`.`</b>:</span>&ensp;Un solo punto quiere decir "el directorio actual". (ej. `cd .` nos mueve a la carpeta actual, basicamente no nos movemos. No solo aplica para `cd`, sino cualquier caso donde se requiera indicar una ruta).

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`..`</b>:</span>&ensp;Dos puntos quiere decir "el directorio anterior". (ej. `cd ..` nos moverá a la carpeta anterior a la que estemos parados. No solo aplica para `cd`, sino cualquier caso donde se requiera indicar una ruta).

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`cat`</b>:</span>&ensp;CONCATENATE — Muestra los contenidos de un archivo dado como argumento. (ej. `cat usuarios.txt` mostrará por pantalla los caracteres que contenga ese archivo).

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`--help`</b>:</span>&ensp;Opcion universal para la mayoria de comandos, devuelve instrucciones de uso, opciones e información sobre el comando que se haya indicado (ej. `mkdir --help` mostrará información detallada del comando `mkdir`, mientras que `rm --help` mostrará información del comando `rm`).

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`ls`</b>:</span>&ensp;LIST — Muestra por pantalla todos los archivos y directorios de la ruta actual (al ingresar el comando solo), aunque también se le puede pasar una ruta completa y mostrará su contenido (por ej. si estamos en `~` e ingresamos el comando `ls tecnicatura2026/2do_Semestre/python/Clase5`, la consola mostrará todos los ejercicios de la clase 5).

<!--OPCIONES-->

<div style="margin-top: -10px;">
<details>
<summary>&emsp;Opciones</summary>
<span>

- <span style="font-size:15px;"><b>`-a`</b></span>:&ensp;ALL — Mostrará también los archivos ocultos
- <span style="font-size:15px;"><b>`-l`</b></span>:&ensp;LONG LISTING FORMAT — Mostrará también los permisos, dueño, tamaño y fecha de modificación de los archivos, es decir, más detalle

</span>
</details>
</div>

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`history`</b>:</span>&ensp;Muestra el historial completo de los comandos que hemos utilizamos en la consola previamente (es decir, los que podemos acceder con la flecha arriba `↑`).

<!--OPCIONES-->

<div style="margin-top: -10px;">
<details>
<summary>&emsp;Opciones</summary>
<span>

- <span style="font-size:15px;"><b>`-c`</b></span>:&ensp;CLEAR — Borra todos los comandos que se han ido guardando en el historial

</span>
</details>
</div>

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`rm`</b>:</span>&ensp;REMOVE — Borra de forma permanente el archivo que se le ingrese como argumento. Sín la opcion `-r` no puede borrar directorios. (ej. `rm archivo.txt`, esto borraría sin vuelta atrás a archivo.txt).

<!--OPCIONES-->

<div style="margin-top: -10px;">
<details>
<summary>&emsp;Opciones</summary>
<span>

- <span style="font-size:15px;"><b>`-r`</b></span>:&ensp;RECURSIVE — Eliminará los archivos y directorios que encuentre de manera recursiva, es decir que puede eliminar un directorio y los contenidos de éste. (ej. `rm -r tecnicatura2026/`, borraria de forma permanente todos los contenidos de ese directorio)
- <span style="font-size:15px;"><b>`-f`</b></span>:&ensp;FORCE — Ignora los archivos que no existen y no pide confirmación antes de borrar, incluso si el archivo está protegido

</span>
</details>
</div>

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

## Configuración e información de Git

<!--DEFINICION-->

<span style="font-size:15px;"><b>`git config`</b>:</span>&ensp;Sirve para obtener y establecer variables de configuración que controlan el funcionamiento, la apariencia y el comportamiento de Git (principalmente para establecer nombre e email).

<!--OPCIONES-->

<div style="margin-top: -10px;">
<details>
<summary>&emsp;Opciones</summary>
<span>

- <span style="font-size:15px;"><b>`--list`</b> o <b>`-l`</b></span>:&ensp;Muestra en forma de lista por pantalla las configuraciones actuales de tu Git, incluyendo información como Usuario e Email (si es que fueron ingresados antes)
- <span style="font-size:15px;"><b>`--local <variable>`</b></span>:&ensp;configuraciones que solo estarán disponibles para el repositorio actual, sobreescribe a `global` y a `system` (por ej. `--local user.name "Juan Perez"` para ingresar tu nombre o `--local user.email "juanp@gmail.com"` para ingresar tu mail)
- <span style="font-size:15px;"><b>`--global <variable>`</b></span>:&ensp;configuraciones que estarán disponible para todos los repositorios del usuario actual
- <span style="font-size:15px;"><b>`--system <variable>`</b></span>:&ensp;configuraciones que estarán disponible para todos los usuarios del SO y todos los repositorios (requiere permisos de administrador)

</span>
</details>
</div>

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`ssh-keygen -t ed25519 -C "<email>"`</b>:</span>&ensp;Permite generar una clave ssh guardandola por defecto en una carpeta oculta llamada `.ssh` en `~` (esto se combina con el [script para iniciar el agente al abrir bash](https://docs.github.com/en/authentication/connecting-to-github-with-ssh/working-with-ssh-key-passphrases#auto-launching-ssh-agent-on-git-for-windows)), el nombre del archivo por defecto depende de tu algoritmo, en este caso seria `id_ed25519`. Al crear la clave te pedirá dónde guardarla, presionar enter para dejar por defecto. Al igual que preguntará por una contraseña (y otra vez para confirmarla), esto se puede dejar en blanco si se quiere.

<!--OPCIONES-->

<div style="margin-top: -10px;">
<details>
<summary>&emsp;Opciones</summary>
<span>

- <span style="font-size:15px;"><b>`-t <algoritmo>`</b></span>:&ensp;TYPE — Define el tipo de algoritmo criptográfico para crear la clave. El algoritmo ed25519 es el más seguro, moderno y eficiente actualmente. Aunque hay algunos sistemas que no soportan este algoritmo
- <span style="font-size:15px;"><b>`-C <email>`</b></span>:&ensp;COMMENT — Agrega un comentario de texto dentro del archivo de la clave pública para identificar a qué cuenta o máquina le pertenece esa clave, comunmente va el mail
- <span style="font-size:15px;"><b>`-b <bits>`</b></span>:&ensp;En caso de no poder usar `ed25519` y tener que usar `rsa` esta opción define la longitud de la clave en bits, para asegurar la máxima seguridad usando `rsa` se debe hacer `-b 4096`

</span>
</details>
</div>

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`df`</b>:</span>&ensp;DISK FREE — Muestra por pantalla la dirección y el disco donde está instalado Git, y cuánto espacio consume en nuestro disco (mostrando cuánto hay disponible y cuánto consume en porcentaje).

<!--OPCIONES-->

<div style="margin-top: -10px;">
<details>
<summary>&emsp;Opciones</summary>
<span>

- <span style="font-size:15px;"><b>`-h`</b></span>:&ensp;HUMAN-READABLE — Mostrará los datos de una forma más amigable para nosotros, con Terabytes, Gigabytes, Megabytes, etc. en lugar de solo Kilobytes

</span>
</details>
</div>

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

## Día a día con Git

<span style="font-size:15px;"><b>`git <subcomando>`</b>:</span>&ensp;Nombre del ejecutable "git.exe". Con éste podemos acceder a todas las funciones de git (es decir, seguirle con un `status`, `push`, `pull`, `commit`, etc.)

<span style="font-size:15px;"><b>`git init`</b>:</span>&ensp;GIT INITIALIZE — Crea un repositorio Git (carpeta oculta llamada `.git`) en la carpeta que estemos parados (`pwd`)

<span style="font-size:15px;"><b>`git clone <https-url/clave-ssh>`</b>:</span>&ensp;Permite descargar y copiar un repositorio remoto a tu espacio local (la carpeta con los archivos se crearán en la carpeta que estés parado)

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`git pull`</b>:</span>&ensp;Descarga e integra de inmediato los cambios en el servidor a tu espacio local. Es técnicamente la combinación de `git fetch` + `git merge`.

<!--OPCIONES-->

<div style="margin-top: -10px;">
<details>
<summary>&emsp;Opciones</summary>
<span>

- <span style="font-size:15px;"><b>`origin <nombre-de-rama>`</b></span>:&ensp;Es más bien un alias. Por defecto es la dirección URL del servidor remoto que hayamos clonado o ya pusheado antes, la rama se indica para que git sepa de qué rama traer los cambios
- <span style="font-size:15px;"><b>`-u`</b> o <b>`--set-upstream`</b></span>:&ensp;Esta opción le indica a Git que recuerde la dirección del servidor remoto ingresada como argumento (normalmente se usa el nickname `origin`, ej. `-u origin`), ya que por defecto Git <b>no</b> sabe de dónde sacar los cambios. Tener en cuenta que solo se debe usar una vez y ya queda guardado, aunque si se usa de nuevo no pasa nada. Ésta opción debe ser seguida de la palabra `origin` (o la dirección URL del servidor remoto) y se aconseja usarla con `git push` en vez de `git pull`

</span>
</details>
</div>

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`git fetch`</b>:</span>&ensp;Se usa para descargar _solamente_ el historial más reciente del servidor, sin hacer cambios inmediatos a tu zona de trabajo, permite revisar los cambios o ramas nuevas que se han hecho antes de integrarlos localmente, a diferencia de `git pull` que intenta mergear automaticamente.

<!--OPCIONES-->

<div style="margin-top: -10px;">
<details>
<summary>&emsp;Opciones</summary>
<span>

- <span style="font-size:15px;"><b>`origin <nombre-de-rama>`</b></span>:&ensp;Es más bien un alias. Por defecto es la dirección URL del servidor remoto que hayamos clonado o ya pusheado antes. Sepase que `fetch` no tiene `-u`, por lo tanto este paso debe hacerse previo o se debe incluir manualmente `origin`
- <span style="font-size:15px;"><b>`-p`</b> o <b>`--prune`</b></span>:&ensp;Normalmente, si se borraron ramas de forma remota, vas a seguir viendolas localmente. Usando esta opción esas ramas fantasmas se limpian

</span>
</details>
</div>

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`git status`</b>:</span>&ensp;Muestra los cambios hechos en el área de trabajo, los cambios añadidos al área de preparación y qué archivos son nuevos y todavía no trackeados (todo en el repositorio actual).

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`git ignore`</b>:</span>&ensp;Permite ignorar archivos pasados como argumentos. (Por ej. `git ignore archivo.py`).

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`git add`</b>:</span>&ensp;Añade un archivo al área de preparación, puede usarse un punto `.` para indicar que _todo_ lo que se encuentra en el directorio actual (en el que estamos parados) sea añadido al área de preparación (ej. estamos parados en el directorio `python/`, e ingresamos el comando `git add .`, esto añadirá todos los archivos y cambios hechos en `python/` al área de preparación listos a ser commiteados).

<!--OPCIONES-->

<div style="margin-top: -10px;">
<details>
<summary>&emsp;Opciones</summary>
<span>

- <span style="font-size:15px;"><b>`-A`</b></span>:&ensp;stagea todos los cambios (archivos nuevos, modificados y eliminados) de **todo** el repositorio, sin importar desde qué carpeta se ejecute el comando

</span>
</details>
</div>

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`git restore`</b>:</span>&ensp;Lo opuesto a add, revierte los cambios hechos a un archivo/directorio para que vuelvan a estar como estén en el commit más reciente.

<!--INFORMACION-->

<div style="margin-top: -12px;">
<details>
<summary>&emsp;Más información</summary>
<span>

Se le puede especificar un archivo con `git restore <nombre_archivo>` o directamente se puede revertir todo lo que no esté stageado con `git restore .`. También se le puede especificar qué estado revertir, por defecto se interpreta que es `--worktree`, es decir que la restauracion se aplicará a los archivos locales (en el working directory).

</span>
</details>
</div>

<!--OPCIONES-->

<div style="margin-top: 0px;">
<details>
<summary>&emsp;Opciones</summary>
<span>

- <span style="font-size:15px;"><b>`--staged <nombre-archivo>`</b></span>:&ensp;Saca al archivo del staging area sin tocar al archivo local, puede combinarse con `--worktree` para sacar del staging al archivo Y restaurarlo a como estaba en el ultimo commit
- <span style="font-size:15px;"><b>`--source=<hash/HEAD/branch> -- <nombre-archivo>`</b></span>:&ensp;Permite restaurar el archivo al estado que tenia en el commit especificado o al estado que tenia en otra rama, hay que hacer un `git add` y un commit despues de usar este comando para guardar los cambios (el comando completo usando el nombre de la rama seria `git restore --source=rama2 -- archivo.txt`, se puede usar `--` como en `checkout` para indicar que lo que sigue es una ruta de archivo y no una rama)

</span>
</details>
</div>

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`git commit`</b>:</span>&ensp;Toma todos los cambios que hay en el área de preparación (los que fueron añadidos con `git add`) y los graba permanentemente en el historial del repositorio actual, si no se ingresa ninguna opción entonces se abrirá el editor de texto que tengas (puede ser _vim_ o _nano_) para escribir el mensaje de commit.

<!--OPCIONES-->

<div style="margin-top: -10px;">
<details>
<summary>&emsp;Opciones</summary>
<span>

- <span style="font-size:15px;"><b>`-m "mi mensaje"`</b></span>:&ensp;MESSAGE — Nos permite ingresar un comentario para el commit sin tener que abrir el editor de texto
- <span style="font-size:15px;"><b>`-a`</b> o <b>`--all`</b></span>:&ensp;Añade al commit todos los archivos que ya estén trackeados y que hayan sido modificados o eliminados, ahorrandote la necesidad de hacer `git add` (ojo, esta opción no incluye archivos nuevos)

</span>
</details>
</div>

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`git push`</b>:</span>&ensp;Se usa para subir los cambios locales al repositorio remoto vinculado. Para el primer push se debe indicar la rama usando `git push -u origin <rama>` (`-u` es upstream, origin lo estableces con `git remote`).

<!--OPCIONES-->

<div style="margin-top: -10px;">
<details>
<summary>&emsp;Opciones</summary>
<span>

- <span style="font-size:15px;"><b>`--all`</b></span>:&ensp;Sube todos los cambios de todas las ramas, no solo de la que estas parado
- <span style="font-size:15px;"><b>`--tags`</b></span>:&ensp;Le indicas al push que incluya TODAS las tags locales que no estén en el servidor, OJO no se puede combinar con `--all` en la misma linea, deben hacerse dos push por separado
- <span style="font-size:15px;"><b>`-f`</b> o <b>`--force`</b></span>:&ensp;Si el servidor rechaza el push, se lo puede forzar con esta opción. Sobreescribe el remoto con tu local, se puede pisar progreso cuidado
- <span style="font-size:15px;"><b>`--force-with-lease`</b></span>:&ensp;Preferible antes que `-f`, fuerza tu push al servidor sin borrar los cambios nuevos de otros
- <span style="font-size:15px;"><b>`origin --delete <rama>`</b></span>:&ensp;Permite eliminar del servidor la rama pasada como argumento

</span>
</details>
</div>

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`git tag <version> <hash-del-commit>`</b>:</span>&ensp;Permite crear punteros en el historial de commits (ej. `git tag v1.0 <hash>`).

<!--OPCIONES-->

<div style="margin-top: -10px;">
<details>
<summary>&emsp;Opciones</summary>
<span>

- <span style="font-size:15px;"><b>`-a <version> -m "mensaje de etiqueta anotada"`</b></span>:&ensp;ANNOTATED — Le indica a git a crear una etiqueta anotada en vez de una ligera, la diferencia es que la ligera es un simple puntero a un commit sin información detallada, como si fuera una rama que no se mueve, mientras que una etiqueta anotada es un objeto completo e independiente dentro de git el cual guarda quién la creó y cuándo se creó. Pide si o si un mensaje si se usa esta opcion
- <span style="font-size:15px;"><b>`-d <version>`</b></span>:&ensp;DELETE — Elimina la etiqueta que le indiquemos como argumento, por ej. `git tag -d version_2.4`

</span>
</details>
</div>

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`git log`</b>:</span>&ensp;Muestra todos los commits hechos para el repositorio actual, se le puede especificar un archivo (`git log archivo.txt`) para ver el historial de commits para ese archivo.

<!--OPCIONES-->

<div style="margin-top: -10px;">
<details>
<summary>&emsp;Opciones</summary>
<span>

- <span style="font-size:15px;"><b>`--oneline`</b></span>:&ensp;Muestra de forma más resumida los commits (solo un hash corto por linea)
- <span style="font-size:15px;"><b>`--graph`</b></span>:&ensp;Muestra de forma grafica con arte ASCII los commits y sus ramas
- <span style="font-size:15px;"><b>`--all`</b></span>:&ensp;Por defecto `git log` solo muestra los commits en la rama actual, con esta opcion podemos forzar a que muestre _todos_ los commits, incluyendo de otras ramas locales o remotas
- <span style="font-size:15px;"><b>`--decorate`</b></span>:&ensp;"decora" la lista de commits con parentesis indicando punteros y dónde están situados
- <span style="font-size:15px;"><b>`--raw`</b></span>:&ensp;Muestra de forma resumida y en lista qué archivos se modificaron y cómo (M modified, A added, D deleted, R renamed, C copied) en cada commit
- <span style="font-size:15px;"><b>`-n <numero>`</b> o <b>`-<numero>`</b></span>:&ensp;Permite especificar la cantidad de commits a mostrar (por ej. hacer `git log -n 4` es util cuando necesitas copiar un hash reciente sin tener que scrollear hasta arriba)
- <span style="font-size:15px;"><b>`-p`</b></span>:&ensp;Muestra de forma detallada los mensajes de commit junto con el diff de cada uno, util para ver qué archivos fueron modificados y cómo línea por línea. Tiene subopciones: `-p -<numero>` limita la cantidad de commits a mostrar dependiendo de `<numero>`, `-p <ruta-archivo>` permite los cambios de un archivo especifico
- <span style="font-size:15px;"><b>`--after="YYYY-MM-DD/today"`</b> o <b>`--before=<lo-mismo>`</b></span>:&ensp;Para localizar los commits por fecha
- <span style="font-size:15px;"><b>`--author="<nombre>"`</b></span>:&ensp;Muestra los commits hechos por el usuario ingresado, resaltando su nombre con color
- <span style="font-size:15px;"><b>`--grep="<palabra-clave>"`</b></span>:&ensp;Busca y muestra los commits que contengan en sus mensajes el texto ingresado. Ejemplo: `--grep="Java"`. También se puede agregar `-i` para que sea case insensitive, ejemplo: `--grep="modify" -i`
- <span style="font-size:15px;"><b>`-S "<palabras-clave>"`</b></span>:&ensp;Muestra los commits cuyos archivos contengan las palabras ingresadas. Ejemplo: `-S "if __name__"`

</span>
</details>
</div>

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`git branch`</b>:</span>&ensp;Sirve para ver las ramas existentes y en cuál estamos parados.

<!--OPCIONES-->

<div style="margin-top: -10px;">
<details>
<summary>&emsp;Opciones</summary>
<span>

- <span style="font-size:15px;"><b>`-a`</b></span>:&ensp;Lista todas las ramas incluyendo las remotas
- <span style="font-size:15px;"><b>`-m <nuevo-nombre>`</b></span>:&ensp;Cambia el nombre de la rama actual al nombre dado como argumento
- <span style="font-size:15px;"><b>`-d <nombre-rama>`</b></span>:&ensp;Elimina de forma segura una rama (solo permite eliminar si la rama ya fue mergeada con main)
- <span style="font-size:15px;"><b>`-D <nombre-rama>`</b></span>:&ensp;Elimina de forma forzada una rama (no importa si fue mergeada con main o no)

</span>
</details>
</div>

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`git checkout`</b>:</span>&ensp;Principalmente se usa para cambiar de rama, aunque también puede crear nuevas ramas o restaurar archivos a una version anterior (a una versión de un commit específico o del commit anterior).

<!--INFORMACION-->

<div style="margin-top: -12px;">
<details>
<summary>&emsp;Más información</summary>
<span>

Para cambiar a otra rama el comando seria `git checkout <nombre-rama>`, mientras que para restaurar un archivo a como estaba en el commit anterior de la rama actual seria `git checkout <nombre-archivo>`. Ojo: hacer checkout puede hacer que cualquier cambio local (en el working directory) que no haya sido stageado sea eliminado o perdido (si solo cambias de rama no debería haber ningun problema, pero por las dudas nunca olvides stashear tu trabajo no stageado antes de hacer checkout).

</span>
</details>
</div>

<!--OPCIONES-->

<div style="margin-top: 0px;">
<details>
<summary>&emsp;Opciones</summary>
<span>

- <span style="font-size:15px;"><b>`-b <nombre-de-nueva-rama>`</b>:</span>&ensp;Permite crear y cambiarse a una nueva rama ingresando un nombre como argumento
- <span style="font-size:15px;"><b>`<nombre-rama> -- <nombre-del-archivo>`</b>:</span>&ensp;Permite que el estado o version de un archivo vuelva al estado que tenia en la rama especificada, hay que hacer un commit despues de este comando para guardar el cambio. El `--` le aclara a Git que lo que sigue es el nombre de un archivo y no el nombre de una rama a la que queres cambiar, util cuando tenes un archivo que se llama igual que tu rama (ya que por defecto checkout prioriza cambiar de rama antes que restaurar un archivo)
- <span style="font-size:15px;"><b>`<hash-de-commit-deseado> <nombre-del-archivo>`</b>:</span>&ensp;Permite cambiar la version de un archivo dado el hash del commit especifico deseado
- <span style="font-size:15px;"><b>`<hash-de-un-commit>`</b>:</span>&ensp;Nos pondrá en Detached Head y restaurará el área de trabajo a como estaba en el commit especificado. Para salir de este estado y restaurar el puntero (HEAD) podemos hacer `git checkout <nombre-de-rama-main>`
- <span style="font-size:15px;"><b>`-f`</b> o <b>`--force`</b></span>:&ensp;Fuerza el cambio de rama o la restauración de archivos, ignorando y descartando cualquier cambio local que no haya sido stageado. Por defecto git no deja cambiar a una rama si tus cambios locales hacen conflicto con la rama de destino, pero al hacer `git checkout -f <nombre-rama>` lo obligas, perdiendo cualquier modificacion local que chocaban con la rama. Mientras que si haces `git checkout -f` sin especificar un archivo o rama el comando "limpia" el working directory, restaurando todos los archivos trackeados (los no trackeados son ignorados) y los archivos stageados a como estaban en el commit más reciente, destruyendo cualquier cambio que hayas hecho. Cabe mencionar que ambos usos de `-f` son irreversibles

</span>
</details>
</div>

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`git switch <nombre-de-rama>`</b>:</span>&ensp;Sirve para cambiar entre ramas, similar a checkout pero menos ambiguo y más seguro (se recomienda usarlo junto con `git restore` si se desea imitar las funciones de `checkout`).

<!--OPCIONES-->

<div style="margin-top: -10px;">
<details>
<summary>&emsp;Opciones</summary>
<span>

- <span style="font-size:15px;"><b>`-c <branch_name>`</b></span>:&ensp;Creará una rama con el nombre dado como argumento

</span>
</details>
</div>

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`git merge <nombre-de-rama-fuente>`</b>:</span>&ensp;Sirve para fusionar dos ramas distintas, para esto primero hay que pararse en la rama que va a recibir los cambios, por ejemplo primero hacer `git switch main` seguido de `git merge second` (esto resultaria en los cambios de `second` aplicandose a `main`).  

<!--INFORMACION-->

<div style="margin-top: -12px;">
<details>
<summary>&emsp;Más información</summary>
<span>

Si la rama destino y fuente tuvieron commits por separado antes del merge, git hará el merge como un commit nuevo en vez de un _fast-forward_. Pero si se genera un conflicto, el merge se detendrá y el archivo con el conflicto tendrá el siguiente bloque de texto cubriendo a las lineas problemáticas:  

```txt
<<<<<<< HEAD             <-- tu puntero
<codigo-de-arriba>       <-- tu codigo (normalmente)
=======                  <-- el separador
<codigo-de-abajo>        <-- el codigo entrante
>>>>>>> NOMBRE-RAMA      <-- la rama entrante
```

Para solucionar esto hay que borrar las marcas (`<=>` y `HEAD`/`NOMBRE-RAMA`) y quedarse con el codigo que mejor convenga (o combinarlos, el punto es que hay que editar y que quede solo uno). Luego de guardar el archivo con el código resuelto hay que hacer `git add <archivo_con_el_problema.txt>`, después de eso se puede usar `git merge --continue` para finalizar el merge.

</span>
</details>
</div>

<!--OPCIONES-->

<div style="margin-top: 0px;">
<details>
<summary>&emsp;Opciones</summary>
<span>

- <span style="font-size:15px;"><b>`--continue`</b></span>:&ensp;Permite finalizar un merge una vez resueltos los conflictos manualmente, esta opción es preferible antes que hacer un `git commit` porque tiene más funcionalidades (verifica si hay un merge en proceso y avisa si dejaste algun conflicto o si no guardaste los archivos)
- <span style="font-size:15px;"><b>`--abort`</b></span>:&ensp;Si el conflicto es muy complejo esta opción revierte el repositorio a como estaba antes de hacer el merge, util como boton de pánico en caso de un conflicto crítico

</span>
</details>
</div>

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!-- DEFINICION -->

<span style="font-size:15px;"><b>`git reset <hash-de-commit>`</b></span>:&ensp;Sirve para volver en el tiempo y "borrar" commits. Seria como un deshacer forzoso (así que cuidado, ver `git revert` para una opción más segura y amigable cuando se trabaja en grupo). Se puede indicar el nombre de un archivo en vez de un hash, esto hará que el archivo sea removido del staging area (aunque es preferible usar `git restore --staged`).

<!--OPCIONES-->

<div style="margin-top: -10px;">
<details>
<summary>&emsp;Opciones</summary>
<span>

- <span style="font-size:15px;"><b>`--soft`</b></span>:&ensp;Va atras en el tiempo pero mantiene los cambios que tengas stageados. (ej. `git reset --soft HEAD~1` haria un deshacer al ultimo commit, pero también se puede especificar un hash)
- <span style="font-size:15px;"><b>`--mixed`</b></span>:&ensp;Va atras en el tiempo y saca del staging area a los cambios que tengas (mantiene los archivos en tu disco intactos). Este es el que Git usa por defecto, es decir, si ingresas `git reset` sin nada se considera un `--mixed HEAD`, util para cuando queres deshacer un `git add .`
- <span style="font-size:15px;"><b>`--hard`</b></span>:&ensp;Va atras en el tiempo y no solo saca del staging area sino que tambien borra a los cambios de tu disco

</span>
</details>
</div>

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`git revert <hash-de-commit-deseado>`</b>:</span>&ensp;Revierte los cambios creando un nuevo commit, en lugar de volver en el tiempo. Ideal para ramas compartidas con equipos, preferible antes que usar `reset`.

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`git stash`</b>:</span>&ensp;Util para guardar temporalmente los cambios no confirmados (staged o no) para poder trabajar en otras ramas o realizar una tarea de emergencia.

<!--OPCIONES-->

<div style="margin-top: -10px;">
<details>
<summary>&emsp;Opciones</summary>
<span>

- <span style="font-size:15px;"><b>`pop`</b></span>:&ensp;Permite retomar el ultimo stash y lo elimina de la lista de stashes
- <span style="font-size:15px;"><b>`push -m <mensaje>`</b></span>:&ensp;Guarda un stash con un mensaje dado, util para identificar el stash
- <span style="font-size:15px;"><b>`-u`</b></span>:&ensp;UNTRACKED — El stash incluirá archivos nuevos no añadidos a git
- <span style="font-size:15px;"><b>`list`</b></span>:&ensp;Muestra la lista de stashes con sus numeros y mensajes si tienen
- <span style="font-size:15px;"><b>`apply stash@{n}`</b></span>:&ensp;Aplica un stash sin eliminarlo de la lista como hace `pop`
- <span style="font-size:15px;"><b>`drop stash@{n}`</b></span>:&ensp;Elimina un stash especifico con el numero de stash
- <span style="font-size:15px;"><b>`clear`</b></span>:&ensp;Elimina todos los stashes guardados

</span>
</details>
</div>

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`git rm <nombre-archivo>`</b>:</span>&ensp;GIT REMOVE — Elimina del área de preparación y también del worktree al archivo pasado como argumento. Opciones\:

<!--OPCIONES-->

<div style="margin-top: -10px;">
<details>
<summary>&emsp;Opciones</summary>
<span>

- <span style="font-size:15px;"><b>`--cached <nombre-archivo>`</b></span>:&ensp;borra el archivo (o carpeta si se combina con `-r`) solo del área de preparación y NO de tu computadora, util para sacar archivos o carpetas que añadiste por error y querés agregar a tu .gitignore
- <span style="font-size:15px;"><b>`-f`</b> o <b>`--force`</b></span>:&ensp;Por defecto git no te deja borrar un archivo que tenga cambios locales sin guardar en un commit, esta opción ignora esos cambios y elimina el archivo de todas formas (tanto del staging como del working directory)
- <span style="font-size:15px;"><b>`-r <nombre-carpeta/>`</b></span>:&ensp;RECURSIVE — Permite borrar carpetas y todos sus contenidos dentro

</span>
</details>
</div>

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

## Misceláneos a saber

<!--DEFINICION-->

<span style="font-size:15px;"><b>`code`</b>:</span>&ensp;Abre Visual Studio Code, se le puede indicar qué abrir (ej. `code .` para abrir la carpeta actual, `code archivo.txt` para abrir un archivo en particular)

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`git show`</b>:</span>&ensp;Por defecto sirve para visualizar detalles (adiciones, modificaciones o eliminaciones en cada archivo que fue modificado) linea por linea del último commit, pero en realidad sirve para ver detalles de cualquier objeto git (por ejemplo una tag anotada usando `git show <version>`)

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`git shortlog`</b>:</span>&ensp;Muestra el nombre del usuario, la cantidad de commits al lado de su nombre y una lista de solo los mensajes de los commits

<!-- ========================= -->

<div style="margin-top: 35px;"></div>

<!-- ========================= -->

<!--DEFINICION-->

<span style="font-size:15px;"><b>`git diff`</b>:</span>&ensp;Sirve para ver las diferencias linea por linea entre versiones, de ya sea de commits, archivos o lo que esté en el área de preparación. El comando solo sin argumentos mostrará los cambios locales hechos (lo que no esté stageado). Las lineas rojas indican lo que fue modificado o borrado, mientras que las verdes indican lo que fue agregado.

<!--OPCIONES-->

<div style="margin-top: -10px;">
<details>
<summary>&emsp;Opciones</summary>
<span>

- <span style="font-size:15px;"><b>`--stat`</b></span>:&ensp;Muestra de forma resumida los archivo modificados y cuales fueron sus cambios en cada uno
- <span style="font-size:15px;"><b>`--numstat`</b></span>:&ensp;Muestra de forma incluso más resumida los cambios de cada archivo que haya sido modificado, mostrando solamente las lineas que fueron agregadas (izquierda) y eliminadas (derecha)
- <span style="font-size:15px;"><b>`--staged`</b></span>:&ensp;Muestra los cambios que entrarán en el próximo commit
- <span style="font-size:15px;"><b>`<nombre_de_otra_rama>`</b></span>:&ensp;Mostrará las diferencias entre la rama actual y la rama dada, si ingresas el nombre de la rama actual simplemente mostrará los cambios locales hechos (si es que hay)
- <span style="font-size:15px;"><b>`<nombre-rama-1>..<nombre-rama-2>`</b></span>:&ensp;Muestra qué tiene la rama 2 que no tenga la rama 1
- <span style="font-size:15px;"><b>`<hash1> <hash2>`</b></span>:&ensp;Compara dos commits

</span>
</details>
</div>
