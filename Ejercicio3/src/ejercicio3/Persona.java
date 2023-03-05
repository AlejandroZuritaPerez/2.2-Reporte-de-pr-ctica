package ejercicio3;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Persona {
    
    //ATRIBUTOS: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura.
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    
    //CONSTRUCTOR
    public Persona (String Nombre, int Edad, String Sexo, double Peso, double Altura){
        
        this.nombre = Nombre;
        this.edad = Edad;
        this.sexo = Sexo;
        this.peso = Peso;
        this.altura = Altura;
        
    }
    //Propiedades, Metodos o funciones
    //metodo para calcular IMC
    private String CalcularIMC (){
        
        
        double indice = this.peso / (Math.pow(this.altura, 2)); //Formula IMC = peso / (altura^2)
        
        //Segun el peso, devuelve un codigo
        if (indice >= 20 && indice <= 25) {
            return "Peso Normal";
        } else if (indice < 20) {
            return "Desnutricion";
        } else {
            return "SobrePeso";
        }
        
        //Desnutrición IMC <= 18.5
        //Normal IMC >= 18.5 && IMC <=24.9
        //SobrePeso IMC >= 25 && IMC <=29.9
    }
    
    private String CalcularEdad(){
        
        if (this.edad >= 18){
            return "ES MAYOR DE EDAD";
        }else {
            return "ES MENOR DE EDAD";
        }
    }
    
    public String MostrarMensaje(){
        
        return "NOMBRE: "+this.nombre+
                ". EDAD: "+this.edad+
                ". SEXO: "+this.sexo+
                ". PESO: "+this.peso+
                " kg. ALTURA: "+this.altura+
                " cm. IMC: " +CalcularIMC()+
                ". "+CalcularEdad();
    }
    
}
