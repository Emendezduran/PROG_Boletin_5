package boletin_5;

/**
 *
 * @author emendezduran
 */
public class Cuenta {
//Clase Cuenta

    /**
     * nombre del cliente
     */
    private String nombreDelCliente;
    /**
     * numero de una cuenta
     */
    private int numeroDeCuenta;
    /**
     * Saldo de una cuenta
     */
    private double saldo;
    /**
     *
     */
    public static int codCuenta = 1000;

    /**
     * Constructor sin parametros, se le asigna un numeroDeCuenta unico
     */
    public Cuenta() {
        numeroDeCuenta = ++codCuenta;
    }

    /**
     * Constructor para crear cuenta corriente
     *
     * @param nombreDelCliente define el nombre del usuario
     * @param numeroDeCuenta define el número de cuenta generado por el programa
     * @param saldo define el saldo con el que se abre la cuenta
     */
    public Cuenta(String nombreDelCliente, int numeroDeCuenta, double saldo) {
        this.nombreDelCliente = nombreDelCliente;
        this.saldo = saldo;
        this.numeroDeCuenta = ++codCuenta;

    }

    /**
     * Metodo para Cambiar el nombre del cliente
        * @param nombreDelCliente define el nombre del usuario
     */
    public void setNombreCliente(String nombreDelCliente) {
        this.nombreDelCliente = nombreDelCliente;
    }

    /**
     * Metodo para modificar el numero de cuenta
     *
     * @param numeroDeCuenta define el número de cuenta
     * @deprecated
     */
    public void setNumeroCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    /**
     * Metodo para realizar un ingreso
     *
     * @param sumar define el monto de ingreso
     */
    public void setIngreso(double sumar) {
        System.out.println("Efectuando Ingreso...");
        saldo = saldo + sumar;
    }

    /**
     * Metodo para realizar un reintegro, verifica el saldo disponible y el
     * monto para no ser negativo
     *
     * @param restar define el monto de reintegro
     */
    public void setReintegro(double restar) {
        if (restar <= 0) {
            System.out.println("ERROR");
        }
        if (saldo < restar) {
            System.out.println("Saldo Insuficiente");
        } else {
            System.out.println("Efectuando Reintegro...");
            saldo = saldo - restar;
        }
    }

    /**
     * Metodo para llamar al parametro nombreCliente
     *
     * @return nombreDelCliente
     */
    public String getNombreCliente() {
        return nombreDelCliente;
    }

    /**
     * Metodo para llamar al parametro numeroDeCuenta
     *
     * @return numeroDeCuenta
     */
    public int getNumeroCuenta() {
        return numeroDeCuenta;
    }

    /**
     * Metodo para llamar al parametro saldo
     *
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo para visualizar los datos de una cuenta
     *
     */
    public void visualizar() {
        System.out.println("Nombre: " + nombreDelCliente + " Numero de cuenta: " + numeroDeCuenta + " Saldo Disponible: " + saldo);
    }

    /**
     * Metodo para realizar una transferencia, verifica el saldo disponible y el
     * monto para no ser negativo
     *
     * @param cuentaDest define la cuenta que recibe el importe
     * @param imp define el importe a transferir
     */
    public void trasferencia(Cuenta cuentaDest, double imp) {
        Cuenta cuentaDestino = cuentaDest;
        double importe = imp;
        if (imp <= 0) {
            System.out.println("ERROR");
        }
        if (saldo < imp) {
            System.out.println("Saldo Insuficiente");
        } else {
            System.out.println("Efectuando Transferencia...");
            saldo -= importe;
            cuentaDest.setIngreso(importe);
        }
    }

}
