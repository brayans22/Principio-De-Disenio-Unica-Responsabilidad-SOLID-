import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class empleadoTest {

    @Test
    void test01SeCalculaCorrectamenteElSueldoDeUnEmpleado(){
        Calculo c = new Calculo(10, 9);
        Id i = new Id ("1");
        int sueldo =  (10 + 9) - ( (10 - 9)/10 );
        Empleado e = new Empleado( c, i );
        assertEquals(e.calcularSueldo(), sueldo);
    }

    @Test
    void test02SeMuestraCorrectamenteElSueldoDeUnEmpleado(){
        Calculo c = new Calculo(10, 9);
        Id i = new Id ("1");
        Empleado e = new Empleado( c, i );
        assertEquals(e.mostrarSueldo(), "Soy un empleado que gana un sueldo de: 19 $");
    }

    @Test
    void test03SeCalculaCorrectamenteElSueldoTotalDeLosEmpleados(){

        // Empleado 1
        Calculo c = new Calculo(10, 9);
        Id i = new Id ("1");
        Empleado e = new Empleado( c, i );

        // Empleado 2
        Calculo ca = new Calculo(10, 9);
        Id id = new Id ("2");
        Empleado em = new Empleado( c, i );

        // Empresa
        ArrayList<Empleado> emp = new ArrayList<>();
        emp.add(e);
        emp.add(em);
        Empresa empresa = new Empresa(emp);
        assertEquals(empresa.calcularSueldoTotalEmpleados(), 38);
    }

    @Test
    void test04SeBuscaUnEmpleadoYSeEncuentra(){

        // Empleado 1
        Calculo c = new Calculo(10, 9);
        Id i = new Id ("1");
        Empleado e = new Empleado( c, i );

        // Empleado 2
        Calculo ca = new Calculo(10, 9);
        Id id = new Id ("2");
        Empleado em = new Empleado( c, i );

        // Empresa
        ArrayList<Empleado> emp = new ArrayList<>();
        emp.add(e);
        emp.add(em);
        Empresa empresa = new Empresa(emp);
        assertTrue(empresa.empleadoExistente(i));
    }

    @Test
    void test05SeBuscaUnEmpleadoYNoSeEncuentraPorQueNoExiste(){

        // Empleado 1
        Calculo c = new Calculo(10, 9);
        Id i = new Id ("1");
        Empleado e = new Empleado( c, i );

        // Empleado 2
        Calculo ca = new Calculo(10, 9);
        Id id = new Id ("2");
        Empleado em = new Empleado( c, i );

        // Empresa
        ArrayList<Empleado> emp = new ArrayList<>();
        emp.add(e);
        emp.add(em);
        Empresa empresa = new Empresa(emp);
        assertFalse(empresa.empleadoExistente( new Id("5") ) );
    }

}
