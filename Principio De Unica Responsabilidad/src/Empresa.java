import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa(ArrayList<Empleado> empleados){
        this.empleados = empleados;
    }

    public int calcularSueldoTotalEmpleados(){
        int sueldoTotal = 0;
        for( Empleado e : this.empleados){
            sueldoTotal += e.calcularSueldo();
        }
        return sueldoTotal;
    }

    public boolean empleadoExistente(Id id ){
        int sueldoTotal = 0;
        for( Empleado e : this.empleados){
            if( e.sosIgual(id) ){
                return true;
            }
        }
        return false;
    }

}
