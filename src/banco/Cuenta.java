/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author ema_2
 */
public class Cuenta {
    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public Cuenta() {
        this.nombreCliente = "Nombre por defecto";
        this.numeroCuenta = "1234560";
    }
    
    public Cuenta(Cuenta c)
    {
        this.nombreCliente = c.getNombreCliente();
        this.numeroCuenta = c.getNumeroCuenta();
        this.tipoInteres = c.getTipoInteres();  
        this.saldo = c.getSaldo();
        
    }

    @Override
    public String toString() {
        return "nombrecliente: "+this.getNombreCliente()+
                " - numeroCuenta: "+this.getNumeroCuenta()+
                " - tipoInteres: "+this.getTipoInteres()+
                " - saldo "+this.getSaldo();
    }
    
    public boolean ingreso(double importe)
    {
        if(importe>0)
        {
            this.saldo += importe;
            return true;
        }
        return false;
    }
    
    public boolean retiro(double importe)
    {
       if(this.saldo >= importe)
       {
           this.saldo -= importe;
           return true;
       }
       
       return false;
           
    }
    
    public boolean transferencia(Cuenta cuentaDestino, double importe)
    {
        if(this.retiro(importe))
        {
            cuentaDestino.ingreso(importe);
            return true;
        }
        
        return false;
    }
    

   
    
    
}
