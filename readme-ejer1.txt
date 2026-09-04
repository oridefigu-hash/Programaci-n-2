/*
Problema: Para el problema “determinar si un número entero es primo”,
documentar las fases de desarrollo: análisis del problema, diseño en pseudocódigo, y una
tabla de al menos 5 casos de prueba que incluya casos normales, casos límite (0, 1, 2) y un
caso de error (número negativo). No es necesario codificar todavía; el entregable es el
pseudocódigo y la tabla.

Analisis del problema
---------------------
Entrada: un numero entero.
Salida: indicar si el numero es primo, no es primo o es un dato invalido.

Un numero primo es un entero mayor que 1 que solo tiene como divisores exactos
al 1 y a si mismo. Los numeros negativos son considerados un caso de error.
El 0 y el 1 no son numeros primos.

Diseño en pseudocodigo
----------------------
INICIO
	LEER numero

	SI numero < 0 ENTONCES
		MOSTRAR "Error: el numero no puede ser negativo"
	SINO SI numero < 2 ENTONCES
		MOSTRAR "El numero no es primo"
	SINO
		esPrimo <- VERDADERO
		divisor <- 2

		MIENTRAS divisor * divisor <= numero Y esPrimo HACER // divisor*divisor controla que el nro sea primo, ya que si un nro es 7 por ejemplo, en el caso 									del divisor que es 2,al sumarse 1 y multiplicarse por si mismo la segunda vez, nos da como 									rtdo 9 y termina el ciclo demostrando que el nro es primo.
			SI numero MOD divisor = 0 ENTONCES // pero aca si no es primo el booleano se vuelve falso y rompe el ciclo del while
				esPrimo <- FALSO
			FIN SI
			divisor <- divisor + 1
		FIN MIENTRAS

		SI esPrimo ENTONCES    // si es primo el booleano sigue siendo verdadero y entra aca
			MOSTRAR "El numero es primo"
		SINO
			MOSTRAR "El numero no es primo" // si no es primo el booleano se vuelve falso y entra aca
		FIN SI
	FIN SI
FIN

Centro de prueba
---------------
| Entrada | Tipo de caso | Resultado esperado                     |
|---------|---------------|----------------------------------------|
| 0       | Limite        | No es primo                            |
| 1       | Limite        | No es primo                            |
| 2       | Limite        | Es primo                               |
| 7       | Normal        | Es primo                               |
| 12      | Normal        | No es primo                            |
| -5      | Error         | Error: el numero no puede ser negativo |
*/
