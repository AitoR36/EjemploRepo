
package ejemplorepositorios;

import java.util.Scanner;

/**
 * Clase para realizar una serie de operaciones matemáticas más o menos complejas
 * @author Aitor
 * @version 25-03-2019
 * <a href="https://es.wikipedia.org/wiki/Matem%C3%A1ticas">Referencia Wikipedia</a> 
    */
public class Operaciones1 {
    private int numero1;
    
    /**
     * Constructor parametrizado 
     * @param n
     */
    public Operaciones1(int n){
       numero1 = n;
    }
    
    /* Método para sumar los dos números de la clase*/
    public int suma(){
       int n2 = 7;
       return numero1+n2;
    }
    
    /**
     * Método para calcular la media de los dos números de la clase 
     * @return (numero1+n2)/2
     */
    public int media(){
       int n2 = 7;
       return (numero1+n2) / 2;
    }
    
    /*
    * Este método calcula el máximo común divisor (mcd) de dos números introducidos por teclado
    * Luego hace lo mismo con otros dos números pedidos por teclado (calcula su mcd).
    * Por ultimo, te dice cuál de los dos mcd es mayor.
    */
    public void metodolargo(){
        int primernumero, segundonumero;
        int mcd1, mcd2, mcdaux;
        Scanner bool = new Scanner(System.in);
        
        // Primero pedimos dos números por teclado:
        System.out.println("Primera pareja de números.\n Ingresa el primer número: ");
        primernumero = bool.nextInt();
        System.out.println(pedirsegundonumero);
        segundonumero = bool.nextInt();
                
        mcdaux = calcularmaximocomundivisor(primernumero, segundonumero);
        
        mcd1 = mcdaux;
        
        
        // Ahora pedimos otros dos nuevos números por teclado:
        System.out.println("Segunda pareja de números.\n Ingresa el primer número: ");
        primernumero = bool.nextInt();
        System.out.println(pedirsegundonumero);
        segundonumero = bool.nextInt();
                
        // A continuación calculamos el máximo común divisor de estos numeros
        mcdaux = calcularmaximocomundivisor(primernumero, segundonumero);
        //hasta aquí
        
        mcd2 = mcdaux;
        
        // Por último, compruebo cual de los dos maximos comunes divisores es mayor
        if(mcd1>mcd2)
            System.out.println ("El mcd de los dos primeros números es mayor");
        else 
            System.out.println ("El mcd de los dos segundos números es mayor");
    
    }
    private static final String pedirsegundonumero = "Ingresa el segundo número: ";
    
    /**
     * Método privado
     */
    private int calcularmaximocomundivisor(int aa, int bb) {
        int mcdaux;
        // A continuación calculamos el máximo común divisor de estos dos numeros
        if ( (aa<=0)  ||  (bb<=0) ){
            System.out.println("Los número han de ser positivos");
            mcdaux = -1;
        }
        if  (aa==1  || bb==1){
            mcdaux = 1;
        }
        while  (aa!=bb){
            if  (aa>bb)
                aa = aa-bb;
            else
                bb = bb-aa;
        }
        mcdaux = aa;
        // hasta aquí
        return mcdaux;
    }
    

    
    
    
    
    
}
