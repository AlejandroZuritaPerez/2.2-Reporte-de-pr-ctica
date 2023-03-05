package ejercicio4;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Perro extends Animal {
    
    public Perro(String Nombre, String Raza, String Tipo_Alimentacion, int Edad) {
        super(Nombre, Raza, Tipo_Alimentacion, Edad);
    }
    
    //METODOS O FUNCIONES
    public String Caracteristicas(){
        return "\nNombre del Perro: "+getNombre()+
                "\n Raza del Perro: "+getRaza()+
                "\n Tipo de Alimentacion del Perro: "+getTipo_Alimentacion()+
                "\n Edad del Perro: "+getEdad();
    }
}
