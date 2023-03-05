package ejercicio4;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        //Perro(String Nombre, String Raza, String Tipo_Alimentacion, int Edad)
        Perro p1 = new Perro ("Peludito", "Pit Bull", "Croquetas PRO PLAN", 1);
        Gato g1 = new Gato ("Tiger", "Bengali", "Croquetas ROYAL CANIN", 2);
        Caballo c1 = new Caballo("Pegaso", "Pura Sangre", "Alfafa", 3);
        
        System.out.println("_______________________________________");
        System.out.println(p1.Caracteristicas());
        System.out.println("_______________________________________");
        System.out.println(g1.Caracteristicas());
        System.out.println("_______________________________________");
        System.out.println(c1.Caracteristicas());
        System.out.println("_______________________________________");
    }
    
}
