/**
5.1 Caso base y caso recursivo: factorial
N! = N × (N-1)!, con caso base 0! = 1 (y 1! = 1).
Aplicando la guía de 4 preguntas: (1) el caso base es n <= 1, porque 0! y 1! valen 1 y no
dependen de ningún factorial anterior; (2) factorial(n) se relaciona con factorial(n-1)
multiplicando por n; (3) el argumento pasa de n a n-1, así que se acerca al caso base en cada
llamada; (4) al escribir n * factorial(n - 1), confiamos en que factorial(n - 1) ya
calcula correctamente el factorial de n-1, sin necesidad de rastrear manualmente toda la
cadena.
 */

class Recursividad {
// Caso base: 0! = 1 y 1! = 1. Caso recursivo: n! = n * (n-1)!
    public static long factorial(int n) {
        if (n <= 1) {
            return 1; // caso base: no hay más llamadas
        }
        return n * factorial(n - 1); // caso recursivo: se acerca al caso base
    }
    public static void main(String[] args) {
        System.out.println("factorial(5) = " + factorial(5)); // 120
    }
}