package ejercicio2;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        Cuenta Cliente1 = new Cuenta ("Pablo Hernandez Ortiz");
        Cuenta Cliente2 = new Cuenta ("Fernanda Dominguez Acevedo", 8000);
        
        Cliente1.ingresar(85000);
        Cliente2.ingresar(92000);
        
        Cliente1.retirar(10000);
        Cliente2.retirar(15000);
        
        System.out.println(Cliente1.ConsultaSaldo());
        System.out.println(Cliente2.ConsultaSaldo());
        
    }
    
}
