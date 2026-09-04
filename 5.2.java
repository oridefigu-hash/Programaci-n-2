/**
 * 5.2 Visualizando la pila de llamadas: cuenta regresiva
Antes de seguir con ejercicios más complejos, conviene ver cómo se apilan y desapilan las
llamadas, porque es la clave para entender por qué la recursividad “funciona” y también por
qué puede fallar. Agregar a Recursividad.java:

 */

// Cada llamada queda "pendiente" en el Stack hasta que la siguiente llamadaretorna
public static void cuentaRegresiva(int n) {
    if (n <= 0) { // caso base
        System.out.println("¡Despegue!");
        return;
    }
    System.out.println("Apilando llamada -> n = " + n);
    cuentaRegresiva(n - 1); // caso recursivo: la ejecución "espera"
    System.out.println("Desapilando llamada -> n = " + n);
}

public static void main(String[] args) {
    cuentaRegresiva(10);
}