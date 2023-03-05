package ejercicio1;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        //Mandamos a llamar al metodo o funcion Alumno()
        //Con un nombre asignado, en mi caso a1
        Alumno a1 = new Alumno();
        a1.Nombre = "Carlos";
        a1.Apellidos = "Hernandez Rodriguez";
        a1.Edad = 25;
        a1.Carrera = "Ing. Sistemas Computacionales";
        a1.NoControl = "221Z0201";
        a1.Semestre = 6;
        
        //Mandamos a llamar al metodo o funcion Alumno()
        //Con un nombre asignado, en mi caso a2
        Alumno a2 = new Alumno();
        a2.Nombre = "Francisco Manuel";
        a2.Apellidos = "Perez Rendón";
        a2.Edad = 19;
        a2.Carrera = "Ing. Sistemas Computacionales";
        a2.NoControl = "223Z0203";
        a2.Semestre = 4;
        
        //Mandamos a llamar al metodo o funcion Alumno()
        //Con un nombre asignado, en mi caso a3
        Alumno a3 = new Alumno();
        a3.Nombre = "Humberto";
        a3.Apellidos = "Flores Magon";
        a3.Edad = 31;
        a3.Carrera = "Ing. Industrial";
        a3.NoControl = "204Z0305";
        a3.Semestre = 8;
        
        //Mandamos a llamar al metodo o funcion Alumno()
        //Con un nombre asignado, en mi caso a4
        Alumno a4 = new Alumno();
        a4.Nombre = "Ramon";
        a4.Apellidos = "Gonzalez Hernandez";
        a4.Edad = 35;
        a4.Carrera = "Ing. Industrial";
        a4.NoControl = "204Z0305";
        a4.Semestre = 7;
        
        //Imprimimos en pantalla, llamando al metodo o funcion 
        //calificaciones()
        //Con el System.out.println(a1.Calificaciones(la calificacion del alumno1));
        //System.out.println(a1.Calificaciones(70));
        System.out.println(a1.Calificaciones(70));
        
        System.out.println(a2.Calificaciones(65));
        
        System.out.println(a3.Calificaciones(85));
        
        System.out.println(a4.Calificaciones(48));
    }
    
}
