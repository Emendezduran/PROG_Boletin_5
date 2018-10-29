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

        //Cuenta1    
        System.out.println("Teclee el nombre del titular:");
        Scanner scanNO = new Scanner(System.in);
        String nombre = scanNO.next();

        System.out.println("Con cuanto dinero abriremos la cuenta?:");
        Scanner scanSA = new Scanner(System.in);
        Double saldo = scanSA.nextDouble();

        int numeroCuenta = Cuenta.codCuenta;

        Cuenta cuenta1 = new Cuenta(nombre, numeroCuenta, saldo);
        cuenta1.visualizar();

        //Cuenta2
        System.out.println("Teclee el nombre del titular:");
        Scanner scanNO2 = new Scanner(System.in);
        String nombre2 = scanNO.next();

        System.out.println("Con cuanto dinero abriremos la cuenta?:");
        Scanner scanSA2 = new Scanner(System.in);
        Double saldo2 = scanSA.nextDouble();

        int numeroCuenta2 = Cuenta.codCuenta;

        Cuenta cuenta2 = new Cuenta(nombre2, numeroCuenta2, saldo2);
        cuenta1.visualizar();
        

        cuenta1.trasferencia(cuenta2, 100);

        cuenta1.visualizar();
        cuenta2.visualizar();

    }

}
