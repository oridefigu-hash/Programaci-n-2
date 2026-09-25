   public class EmpleadoxComision extends Empleado {
        private double ventas;
        private double porcentajeComision;

        public EmpleadoxComision(String nombre, int legajo, double ventas, double porcentajeComision) {
            super(nombre, legajo);
            this.ventas = ventas;
            this.porcentajeComision = porcentajeComision;
        }

        @Override
        public double calcularSueldo() {
            return ventas * porcentajeComision;
        }
    }