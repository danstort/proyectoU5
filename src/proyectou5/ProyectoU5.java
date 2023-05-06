/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectou5;

/**
 *
 * @author danie
 */
public class ProyectoU5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CCuenta Cuenta1;
        double saldoActual;
        
        operativa_cuenta(0);
    }

    public static void operativa_cuenta(float cantidad) {
        CCuenta Cuenta1;
        double saldoActual;
        Cuenta1 = new CCuenta("Manuel Mantecas","0000-1234-55-123456789",3000,0);
        try 
        {
            Cuenta1.retirar(2300);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }
        try
        {
            System.out.println("Ingreso en cuenta");
            Cuenta1.ingresar(695);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
        saldoActual = Cuenta1.getEstado();
        System.out.println("El saldo actual es"+ saldoActual );
    }

    
}
