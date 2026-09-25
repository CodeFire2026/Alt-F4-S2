## ¿Qué sucede al intentar duplicar una tag?
Git directamente dará error, tanto en local como en remoto, no te permite continuar con la creación o el push si detecta que la tag ya existe

## ¿Qué problemas *SÍ* pueden haber?
Algo que si puede suceder es que haya una tag remota que apunta a otro commit distinto al que apunta en tu local, de ahí hay tres caminos a elegir:
1. **Borrar del remoto la tag**: si queres borrar la tag del remoto y luego pushear la tuya, harías `git push origin --delete <nombre_tag>` seguido de `git push origin <nombre_tag>`
1. **Reasignar tu tag local hacia otro commit**: para reasignar la tag hacia el commit más reciente, harías `git tag -f <nombre_tag>`, si no, para traerlo a uno especifico haces `git tag -f <nombre_tag> <hash_del_commit>`
1. **Borrar tu tag local**: directamente borras tu tag local con `git tag -d <nombre_tag>`, de ahí podés traerte las tags correctas del remoto (`git fetch --tags -f`, ojo, con ``-f o --force`` te sobreescribe las duplicadas de forma local, sin `-f` solo traerá tags nuevas. Las que son iguales se ignoran.) o intentar crear una nueva tag evitando el problema en sí

## Luego de solucionar
Sí o sí hacer y pedirle a tus compañeros que también hagan `git fetch --prune --prune-tags` para eliminar cualquier rama y tag fantasma (o 'huérfana') que haya quedado localmente