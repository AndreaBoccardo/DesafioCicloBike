# DesafioCicloBike
Se trabaja con spinner y filtros

Descripción
La versión anterior de Ciclobike fue todo un éxito, el municipio pidió una versión 2.0 con ciertas
mejoras en funcionalidades.
Lo primero es actualizar el código anterior a los view bindings con Kotlin Android Extensions y
también usar la función lambdas para los listener de los botones actuales, para dejar un código
más legible, ya que es un requerimiento de un experto del gobierno.
Se va agregar un Spinner al lado de los botones, que contenga los nombres primero diga
mostrar todo y luego contenga los nombres de todas las comunas, si se selecciona la opción
todo, se muestra la lista completa, si se selecciona alguna comuna en particular se filtra por el
nombre de la comuna seleccionada.
Los filtros deben usar la opción filter .
Además que los 2 botones, que ya no tienen uso, se reemplazarán por solo 1 botón que dirá
Invertir orden, el cual invertirá el orden de la lista o lo dejará como estaba si se presiona.
De manera opcional , agregaremos un EditText y otro botón que se llamará Filtrar, entonces, lo
que hará este botón es que cada vez que se presione obtendrá el valor del EditText y filtrará por
las ciclovías que comiencen con el string que tenga a ese EditText.
Este nuevo filtro que creamos que se basa en el valor del EditText, es case sensitive (o sea qué
importa si escribimos con mayúsculas o no), así que hay que hacerlo que no importa si se
escribe con mayúscula o minúscula, que filtre igual.

Ahora agregaremos otro filtro igual al anterior, pero que nos permitirá filtrar según el nombre de
la ciclovía. Luego haremos otro filtro más, igual a los 2 anteriores, donde ingresamos un
número y este será el largo de caracteres del nombre de comunas que filtraremos usando la
función Partitioning, o sea si ingresamos el número 8, filtraremos por la lista que contenga una
comuna con un nombre de un largo mayor a 8. Y es necesario que no se caiga, si no se le
ingresa un número en el campo editText.
Finalmente haremos el mismo filtro anterior, filtrando nombre de la ciclovías.
Instrucciones
Para la realización de este desafío, debes descargar el .zip que se encuentra en plataforma,
llamado Apoyo Desafío - Ciclobike2.0 donde encontrarás, el material base para poder
desarrollar los siguientes puntos:
1. Actualizar la Activity del desafío 1, usando los view bindings.
2. Actualizar los listener de los botones a las funciones lambdas de kotlin.
3. Modificar la interfaz a lo nuevo requerido que incluye spinner
4. Ahora usar la función filter para filtrar.
5. Agregar botón que invierte el orden de la lista.

Opcional:
6. Agregar EditText más botón filtrar, que filtra según lo escrito en el editText.
7. Hacer que el filtro anterior no sea sensible a mayúsculas y minúsculas.
8. Hacer otro filtro igual que el anterior, pero que filtre por el nombre de la ciclovía.
9. Hacer otro filtro igual que el anterior, pero donde se ingrese un número y se filtrara si la
comuna tiene un largo mayor a ese que se ingresó, además la app no debe caerse si se
ingresa un valor no numérico.
10.Hacer otro filtro igual que el anterior, pero donde se ingrese un número y se filtrara si la
nombre de la ciclovía.
