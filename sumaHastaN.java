//*     5.3 Recursividad que acumula un resultado: suma de los primeros N

/*El mismo patrón de 5.1 (reducir el problema en 1 y combinar el resultado en el camino de
vuelta), aplicado a otro caso. Respondiendo la guía de 4 preguntas: caso base n <= 0 (la
suma de “los primeros 0 números” es 0); caso recursivo, sumaHastaN(n) es n más la suma
de los primeros n-1; el argumento baja de n a n-1, acercándose al caso base. */

// Caso base: sumar hasta 0 da 0. Caso recursivo: n + suma de los primeros
// (n - 1)
public class sumaHastaN {
    public static int sumaHastaN(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumaHastaN(n - 1);
    }
}

