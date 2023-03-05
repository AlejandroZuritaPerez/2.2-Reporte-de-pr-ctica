package ejercicio1;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Alumno {
    //Declarar las variables o propiedades de la clase Alumno
    //Nombre = String
    //Apellidos = String
    //Edad = int
    //Carrera = String
    //NoControl = String
    //Semestre = int
    
    public String Nombre;
    public String Apellidos;
    public int Edad;
    public String Carrera;
    public String NoControl;
    public int Semestre;
    
    public String Calificaciones (double Calificacion){
        //Aquí le decimos al programa que si nuestra variable de tipo double es mayor o igual a 70 
        //Que muestre el mensaje en pantalla que este REPROBADO o APROBADO
        //Dependiendo de las calificaciones del Alumno
        if (Calificacion >= 70){
            return "El alumno: " +Nombre+" "+Apellidos+ ", "
                    + "De la carrera: "+Carrera + ", con No. Control: "
                    + NoControl + ", Del semestre: "+Semestre+ ", esta APROBADO";
        } else
            return "El alumno: " +Nombre+" "+Apellidos+ ", "
                    + "De la carrera: "+Carrera + ", con No. Control: "
                    + NoControl + ", Del semestre: "+Semestre+ ", esta REPROBADO";
    }
}
