5.4 Recursividad sobre los dígitos de un número

Acá el “problema más chico” no se obtiene restando 1, sino sacándole un dígito al número
mediante división entera. La pregunta clave de diseño es: ¿cómo separo “una parte que ya
puedo resolver directamente” del “resto, que resuelvo con una llamada recursiva”? El dígito
de las unidades (numero % 10) se puede calcular sin recursividad; el resto del número
(numero / 10, que tiene un dígito menos) se resuelve con la llamada recursiva.
Analisis del problema
---------------------
Entrada: nro 
Variables: locales
Salida: la suma de los digitos
Prueba: que el valor logre llegar al caso base

ejemplo: 432

432 % 10 = 2
432 / 10 = 43

43 % 10 = 3
43 / 10 = 4

4 < 10 → caso base

Diseño en pseudocodigo
----------------------
FUNCION sumarDigitos(numero)

    SI numero < 10 ENTONCES
        RETORNAR numero
    FIN SI

    RETORNAR (numero MOD 10) + sumarDigitos(numero DIV 10)// llama tantas veces a la función, dentro de la misma función, hasta que cumpla con el caso base

FIN FUNCION




		
Testing
----------------------

134 %10 y 134 div 10	4	13
13 %10 y 13 div 10	3	1
4+3+1			9	-

	