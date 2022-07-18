public class Empleado {

    private Id id;
    private Calculo sueldo;

    public Empleado(Calculo sueldo, Id id){
        this.id = id;
        this.sueldo = sueldo;
    }

    public int calcularSueldo(){
        return sueldo.calcular();
    }

    public String mostrarSueldo(){
        return ("Soy un empleado que gana un sueldo de: " + calcularSueldo() + " $");
    }

    public boolean sosIgual(Id id){
        return ( id.sosIgual(this.id) );
    }

}
