
package senasalud2;

import java.util.Scanner;





public class Senasalud2 {

    
    public static void main(String[] args) {
        
    String nombre,apellido;
    int edad;
    Scanner nomb= new Scanner (System.in);
        System.out.println("Digite su nombre");
       nombre=nomb.next();
        System.out.println("Su nombre es:"+""+nombre);
        
     Scanner apelli= new Scanner (System.in);
        System.out.println("Digite su apellido");
        apellido=apelli.next();
        System.out.println("Su apellido es:"+""+apellido);
        
     Scanner eda= new Scanner (System.in);
        System.out.println("Digite su edad");
        edad=eda.nextShort();
        System.out.println("Su edad es:"+""+edad);
    
        
        
    
    }
    
}
