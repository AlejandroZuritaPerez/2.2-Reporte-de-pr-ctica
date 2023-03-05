package ejercicio4;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Gato extends Animal{
    
    public Gato(String Nombre, String Raza, String Tipo_Alimentacion, int Edad) {
        super(Nombre, Raza, Tipo_Alimentacion, Edad);
    }
    
    //METODOS O FUNCIONES
    public String Caracteristicas(){
        return "\nNombre del Gato: "+getNombre()+
                "\n Raza del Gato: "+getRaza()+
                "\n Tipo de Alimentacion del Gato: "+getTipo_Alimentacion()+
                "\n Edad del Gato: "+getEdad();
    }
    
}
