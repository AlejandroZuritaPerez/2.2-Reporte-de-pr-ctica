package ejercicio4;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Animal {
    //Declarando los atributos de la clase
    //ATRIBUTOS O PROPIEDADES
    //nombre = String
    //edad = int 
    //raza = String
    //tipo de alimentación = String
    
    //Van hacer private por que se van a hacer contructores
    
    private String nombre;
    private String raza;
    private String tipo_alimentacion;
    private int edad;
    
    //CONSTRUCTOR DE LA CLASE
    public Animal (String Nombre, String Raza, String Tipo_Alimentacion, int Edad){ //Parametros o variables del constructor
        
        //Nuestro atributo va hacer igual a nuestro parametro
        this.nombre = Nombre;
        this.raza = Raza;
        this.tipo_alimentacion = Tipo_Alimentacion;
        this.edad = Edad;
        
    }
    
    //METODOS (los que reciben nadamas)O FUNCIONES (los que reciben y mandan a la vez)
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getRaza() {
        return this.raza;
    }
    
    public String getTipo_Alimentacion(){
        return this.tipo_alimentacion;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    
}
