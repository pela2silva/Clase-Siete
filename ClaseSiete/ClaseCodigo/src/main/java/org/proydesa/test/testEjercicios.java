
package org.proydesa.test;

import java.util.ArrayList;
import java.util.List;


public class testEjercicios {

    
     public static void main(String[] args) {
        
         
         System.out.println("Valida:"+validaDni("351 0314564"));
         
         System.out.println("Valida:"+validaDni("3510314564"));
         
         System.out.println("Valida:"+validaDni("351314564"));
         
         System.out.println("Valida:"+validaDni("351 a314564"));
    
     
         System.out.println("Valida:"+validaDni("35 0314564"));
         
         
         
         List<String> nombres=new ArrayList<>();
         
         nombres.add("Jere");
         nombres.add("Jeremia");
         nombres.add("marcos");
         nombres.add("ke vin");
         nombres.add("jorge");
         
         
       
        
         for (String nombre : nombres) {
             
            
             if (validaNombre(nombre)) {
                 
                 System.out.println("El nombre("+nombre+")es un nombre valido");
                 break;
                 
             }
             
         }
         
         
         
         
         
         
     }
     
     
     public static boolean validaDni(String texto){
     
         //Si aclaro entre un margen numerico las linea tambiene s valido
         return texto.matches("^[0-9]{2,3}+[ ]+[0-9]{7}$");
     
     }
     
     public static boolean validaNombre(String texto){
     
     
         return texto.matches("^[A-Z]{1}+[a-z]{6,7}$");
         
     }
     
     
     public static void buscar(List<String> lista){
    
         int contador=0;
         
         while(true){
         
             if (validaNombre(lista.get(contador))) {
                 
                 System.out.println("El nombre("+lista.get(contador)+") esta en la lista");
                 break;
                 
             }
             
         
         }
     
     }

    
}



     

    



