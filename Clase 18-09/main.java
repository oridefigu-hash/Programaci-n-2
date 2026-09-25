public class main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 123);
        Empleado empleado2 = new Empleadoxhoras("Maria", 456, 20.0, 40);
        Empleado empleado3 = new EmpleadoxComision("Pedro", 789, 10000.0, 0.1);

        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
    }
}