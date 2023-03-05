package ejercicio2;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Cuenta {
    
    //ATRIBUTOS: titular y cantidad.
    private String titular;
    private double cantidad;
    
    //Constructores
    public Cuenta (String Titular){
        
        this.titular = Titular;
        
        this.cantidad = 0;
    }
    
    public Cuenta (String Titular, double Cantidad){
        
        this.titular = Titular;
        
        this.cantidad = Cantidad;
    }
    
    //Metodos o funciones
    public void ingresar (double Cantidad){
        
        this.cantidad += Cantidad;
        
    }
    
    public void retirar (double Cantidad){
        
        double Saldo = this.cantidad - Cantidad;
        if (Saldo < 0){
            
            this.cantidad = 0;
            
        }else {
            this.cantidad -= Cantidad;
        }
    }
    
    public String ConsultaSaldo (){
        
        return "El titular; "+this.titular+
                " tiene un saldo de: $"+this.cantidad+
                " pesos.";
    }
}
