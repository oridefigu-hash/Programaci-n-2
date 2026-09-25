class persona{ // Definición de la clase persona
    public String nombre;
    public int edad;
    public String direccion;

    public static void main(String[] args){
        persona p = new persona();// Crear un objeto de la clase persona
        p.nombre = "Juan";
        p.edad = 30;
        p.direccion = "Calle 123";

        System.out.println("Nombre: " + p.nombre);
        System.out.println("Edad: " + p.edad);  
        System.out.println("Direccion: " + p.direccion);

    }
}