/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplorepositorios;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre, mensaje;
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cual es tu nombre? ");
        nombre = teclado.nextLine();
        System.out.print("Introduce un mensaje para empezar la práctica de repositorios: ");
        mensaje = teclado.nextLine();
        System.out.println( nombre+ " te manda un mensaje: "+mensaje); 
        
       
        CCuenta c1 = new CCuenta("Rita La Cantaora","344-55-11",0,12.5);
        c1.ingresar(200);
        
        System.out.println("Ya tenemos "+c1.estado()+" en nuestra cuenta");
    }
    
}
