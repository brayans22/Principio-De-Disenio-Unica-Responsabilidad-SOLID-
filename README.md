# Principio-De-Disenio-Unica-Responsabilidad-SOLID-

-> CONCEPTO: Una clase debe tener una sola razon de cambio, es decir un unico rol ( unica responsabilidad o funcion ).


-> Que es una razón de cambio?: Es un cambio en los requisitos de como hacer algo, es decir, si primeramente calculabamos el sueldo
                                considerando el iva, y justo hoy cambio y ya no se considera más, bueno eso seria un ejemplo de razón
                                de cambio, porque ya el sueldo no se calcula como se calculaba antes.

-> Que No es una razón de cambio?:
   - Un bug.
   - Una reefactorización.

-> COMO SE LOGRA?: Con delegación, o creando una clase para cada razon de cambio.

-> EJEMPLO: El objetivo de este repo es mostrar el principio de Unica responsabilidad, el cual se hace a través de un ejemplo donde cada clase tiene una
            una unica responsabilidad (una unica razon de cambio), vemos que la clase empresa (tiene el registro de empleados), la clase empleado
            se encarga de mostrar al empleado y lo que no es su responsabilidad lo delega (clase id se encarga de saber si un empleado es igual al
            otro), (Calculo tiene la responsabilidad de calcular el sueldo de un empleado). Visto todo lo anterior, nos damos cuenta que cada clase
            tiene una razon de cambio:
            
            - Si cambia la forma de calcular el sueldo (hacemos los cambios correspondientes en la clase Calculo)
            - Si cambia la forma de mostrar el empleado (hacemos los cambios correspondientes en la clase empleado)
            - Si cambia la forma de registrar empleado (hacemos los cambios correspondientes en la clase Empresa)
            - Si cambia la forma de ver si un empleado es igual a otro (hacemos los cambios correspondientes en la clase Id)
