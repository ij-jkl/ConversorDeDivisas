# Conversor De Divisas - Java
Este conversor de Divisas fue hecho con java y utilizando la siguiente API gratuita : https://www.exchangerate-api.com/
La meta de la aplicacion es aprender a hacer uso de una API y al mismo tiempo interactuar con ella.
Cuando corremos el programa debemos ver el siguiente menu


![image](https://github.com/ij-jkl/ConversorDeDivisas/assets/49004469/da562882-a245-451a-8893-ac996f578df4)


El mismo nos da 6 opciones distintas para ver la conversion de las mismas.
Una vez elejida la opcion a convertir nos va a pedir que ingresemos el monto que queremos convertir, de la siguiente manera : 


![image](https://github.com/ij-jkl/ConversorDeDivisas/assets/49004469/6b3a45d7-7d97-44ad-bf89-ecccf5edc22a)


Luego ingresar eso vamos a evaluar la opcion ingresada por el usuario y pasarle a la api que monedas queremos cambiar
Podriamos modificar el programa para que el usuario ingrese la moneda de la siguiente manera (USD) y luego (ARS), pero queremos limitar el input del usuario
Una vez realizado eso deberiamos ver esto en la consola : 


![image](https://github.com/ij-jkl/ConversorDeDivisas/assets/49004469/b22b3afe-8ec7-4cf2-a2d6-e9efb6036a93)


Automaticamente la api recibe las monedas a convertir y devuelve el conversion rate (esto nos permite no tener que calcular el cambio nostoros y ahorrar recursos)
Funciona de la siguiente manera nuestra request : 


![image](https://github.com/ij-jkl/ConversorDeDivisas/assets/49004469/088e96d9-c3aa-48e5-bace-484f9d46d475)


Pasamos la direccion con currency1 y currency2, por ejemplo (ARS) --> (USD), de querer dar mas opciones al usuario podriamos pedir por esas variables en string y tener mas opciones de monedas.
Utilizamos el metodo try para poder observar facilmente algun tipo de error ya sea que alguien modifique el codigo o la api no funcione.

El programa nos deberia mostrar el monto convertido de la siguiente manera y desplegar nuevamente el menu, en caso de que el usuario quiera seguir probando!


![image](https://github.com/ij-jkl/ConversorDeDivisas/assets/49004469/14aac78b-be4c-48b5-8a1b-cb1029943e50)



Otro ejemplo convirtiendo el Real a Dolar : 


![image](https://github.com/ij-jkl/ConversorDeDivisas/assets/49004469/a25f9d29-2a2a-4282-a5ac-d65837190329)


Finalmente una vez ingresado la opcion numero 7 el programa se finalizara, tambien tenemos en cuenta que tenemos en cuenta que si no se ingresa un valor valido en el menu se va a seguir ejecutando.


![image](https://github.com/ij-jkl/ConversorDeDivisas/assets/49004469/9ea68a2f-fb09-4bc0-b697-da301c2db806)

