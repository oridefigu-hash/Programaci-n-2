Ejercicio 2 (intermedio). Se entrega el siguiente pseudocódigo, que pretende clasificar un
triángulo según sus lados (equilátero, isósceles o escaleno) a partir de tres valores a, b, c:
Aplicar el proceso de verificación con casos de prueba: encontrar al menos un caso
concreto de valores para los que el pseudocódigo da un resultado incorrecto o no
contemplado (pista: no valida que los lados formen un triángulo válido), documentar ese
caso y corregir el pseudocódigo para que lo maneje.

Analisis del problema
---------------------
Entrada: nro real, 3
Variables: a, b, c
Salida: determinar qué tipo de triángulo es.
Prueba: el dato no válido es un negativo y 0 

Un triangulo con dos de sus lados iguales es un isóseles, con todos sus lados distintos es un escaleno y con sus 3 lados iguales es un equilátero.

Diseño en pseudocodigo
----------------------
Esc("Ingrese los 3 valores del triángulo")
Leer(a)
Leer(b)
Leer(c)
	Si (a<1 || b<1 || c<1) entonces
		Esc("Error: valor ingresado no válido") 
	Sino si (a=b || a=c  || b=c ) entonces // posibilidades: a y b a y c, b y c
		Esc("Es un triángulo isóseles")
	sino si (a=b && b=c) entonces
		Esc("Es un triángulo equilatero")

	sino 
		Esc("Es un triángulo escaleno")
	FS



		
Testing
----------------------

a	b	c	Output
-1	2	2	Error
0	2	4	Error
2	2	3	isóseles
4	4	4	equilatero

	