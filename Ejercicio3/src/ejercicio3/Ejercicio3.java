package ejercicio3;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
        //Persona (String Nombre, int Edad, String Sexo, double Peso, double Altura)
        Persona per1 = new Persona("Javier Contreras Hernandez", 20, "H", 75, 1.75);
        System.out.println(per1.MostrarMensaje());
        
        Persona per2 = new Persona("Elisa Flores Acevedo", 22, "F", 56, 1.65);
        System.out.println(per2.MostrarMensaje());
        
    }
    
}
