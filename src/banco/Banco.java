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
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuenta c1 = new Cuenta();
        System.out.println("Cuenta 1:\n"+ c1.toString());
        
        Cuenta c2 = new Cuenta("Pepito", "51548", 1, 1500);
        System.out.println("Cuenta 2:\n"+ c2.toString());
        
        if(c1.ingreso(2000))
        {
               System.out.println("ingreso correcto: \n"+ c1.toString());
        }else{
            System.out.println("ingreso incorrecto");
        }
        
        if(c1.retiro(600))
        {
               System.out.println("retiro correcto: \n"+ c1.toString());
        }else{
            System.out.println("retiro incorrecto");
        }
     
        if(c1.transferencia(c2, 250))
        {
            System.out.println("TRANSFERENCIA EXITOSA: \n"+"C1: "+ c1.toString()+"\n"
            +"c2: "+c2.toString());

        }else{
            System.out.println("No se pudo realizar la operación. Revise los saldos");
        }
            
        
        
    }
    
}
