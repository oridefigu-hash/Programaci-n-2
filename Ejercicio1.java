/*Tema 1: clases, objetos y constructores
Ejercicio 1: Modelar la clase Persona con atributos privados nombre(string), dni(int) y edad(int), un constructor 
parametrizado que inicialice los 3 y un método toString()sobreescrito que devuelva una representación legible de la persona.
 Instanciar almenos 3 objetos de la clase Persona distintos de un main y mostrarlos por consola.
*/

public class Ejercicio1{
    private String nombre;
    private int dni;
    private int edad;

    // Constructor parametrizado
    public Ejercicio1(String nombre, int dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
    
    // Método toString() sobreescrito
    @Override
    public String toString() { //toString() es un método que devuelve una representación en forma de cadena de texto del objeto.
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", edad=" + edad +
                '}';
    } 

    public static void main(String[] args) {
        Ejercicio1 persona1 = new Ejercicio1("Ana", 12345678, 25);
        Ejercicio1 persona2 = new Ejercicio1("Luis", 23456789, 30);
        Ejercicio1 persona3 = new Ejercicio1("Marta", 34567890, 22);

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
    }

}
