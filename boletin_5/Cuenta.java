
package boletin_5;

/**
 *
 * @author emendezduran
 */
public class Cuenta {
    
    private String nombreDelCliente;
    private static int numeroDeCuenta;
    private double saldo;
    public static int codCuenta = 1000;
            
    public Cuenta (){
    numeroDeCuenta = ++ codCuenta; 
    }
    
    public Cuenta (String  nombreDelCliente, int numeroDeCuenta, double saldo){
        this.nombreDelCliente= nombreDelCliente;
        this.saldo= saldo;   
        this.numeroDeCuenta = ++ codCuenta;
        
    }    
    
    public void setNombreCliente(String nombreDelCliente){
    this.nombreDelCliente= nombreDelCliente;
    }   
    
    public void setNumeroCuenta(int numeroDeCuenta){ 
    this.numeroDeCuenta= numeroDeCuenta;
    }
    
    public void setIngreso(double sumar){   
    saldo = saldo + sumar;
    }
    
    public void setReintegro(double restar){   
        if (restar<=0){
        System.out.println("ERROR");
        }
        if (saldo<restar){
        System.out.println("Saldo Insuficiente");
        }
        else{
        System.out.println("Efectuando Operacion...");
        saldo = saldo - restar;
        }
    }
    
    public String getNombreCliente(){ 
    return nombreDelCliente;
    }   
    
    public int getNumeroCuenta(){ 
    return numeroDeCuenta;
    }
    
    public double getSaldo(){ 
    return saldo;
    }
    
    public void visualizar(){
    System.out.println("Nombre: " + nombreDelCliente + "Numero de cuenta: " + numeroDeCuenta + "Saldo Disponible: " + saldo);       
    }
       
    
    
    
    /*public void trasferencia(cuentaDestino, importe){
    String cuentaDestino;
    double importe;     
    }*/
                  
        
}
