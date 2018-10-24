package boletin_5;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class BOLETIN_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    System.out.println("Teclee el nombre del titular:");
    Scanner scanNO = new Scanner(System.in);
    String nombre = scanNO.next();  
    
    System.out.println("Con cuanto dinero abriremos la cuenta?:");
    Scanner scanSA = new Scanner(System.in);
    Double saldo = scanSA.nextDouble();  
    
    System.out.println("Numero de cuenta generado:" + Cuenta.codCuenta);
    System.out.println("Teclee el codigo generado:");
    Scanner scanNU = new Scanner(System.in);
    int numeroCuenta = scanNU.nextInt();  
    
    Cuenta cuenta1 = new Cuenta(nombre,numeroCuenta,saldo);
    cuenta1.visualizar();
    
    cuenta1.visualizar();
    //cuenta1.setIngreso(100);
    //cuenta1.setReintegro(-50);
    //cuenta1.setReintegro(200);
    //cuenta1.setReintegro(50);
    
    
        
    }
    
}
