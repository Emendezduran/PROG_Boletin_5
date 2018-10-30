package boletin_5;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class BOLETIN_5 {

        public static void main(String[] args) {

        //Cuenta1    
        System.out.println("Teclee el nombre del titular:");
        Scanner scanNO = new Scanner(System.in);
        String nombre = scanNO.next();

        System.out.println(nombre + "le regalamos 100€ por abrir su cuenta:");
        Double saldo = 100d;

        int numeroCuenta = Cuenta.codCuenta;

        Cuenta cuenta1 = new Cuenta(nombre, numeroCuenta, saldo);
        cuenta1.visualizar();

        //Cuenta2
        System.out.println("Teclee el nombre del titular:");
        Scanner scanNO2 = new Scanner(System.in);
        String nombre2 = scanNO2.next();

        System.out.println(nombre2 + "le regalamos 100€ por abrir su cuenta:");
        Double saldo2 = 100d;

        int numeroCuenta2 = Cuenta.codCuenta;

        Cuenta cuenta2 = new Cuenta(nombre2, numeroCuenta2, saldo2);
        cuenta2.visualizar();
        
         //Cuenta3
        System.out.println("Teclee el nombre del titular:");
        Scanner scanNO3 = new Scanner(System.in);
        String nombre3 = scanNO3.next();

        System.out.println(nombre3 + "le regalamos 100€ por abrir su cuenta:");
        Double saldo3 = 100d;

        int numeroCuenta3 = Cuenta.codCuenta;

        Cuenta cuenta3 = new Cuenta(nombre3, numeroCuenta3, saldo3);
        cuenta3.visualizar();
        
        cuenta1.setIngreso(900);
        cuenta2.setIngreso(700);
        cuenta3.setIngreso(600);
        
        cuenta1.visualizar();
        cuenta2.visualizar();
        cuenta3.visualizar();
        
        cuenta1.setReintegro(50);
        cuenta2.setReintegro(50);
        cuenta3.setReintegro(50);
        
        cuenta1.visualizar();
        cuenta2.visualizar();
        cuenta3.visualizar();
        
        cuenta1.trasferencia(cuenta3, 25);
        cuenta2.trasferencia(cuenta3, 25);
        cuenta3.trasferencia(cuenta2, 5);
        
        cuenta1.visualizar();
        cuenta2.visualizar();
        cuenta3.visualizar(); 
    }

}
