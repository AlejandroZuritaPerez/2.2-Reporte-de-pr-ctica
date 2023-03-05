package ejercicio4;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Caballo extends Animal {
    
    public Caballo(String Nombre, String Raza, String Tipo_Alimentacion, int Edad) {
        super(Nombre, Raza, Tipo_Alimentacion, Edad);
    }
    
    //METODOS O FUNCIONES
    public String Caracteristicas(){
        return "\nNombre del Caballo: "+getNombre()+
                "\n Raza del Caballo: "+getRaza()+
                "\n Tipo de Alimentacion del Caballo: "+getTipo_Alimentacion()+
                "\n Edad del Caballo: "+getEdad();
    }
    
}
