
package org.proydesa.clases;

import java.io.Serializable;


public class Prueba implements Serializable{
    
        
        public static void main(String[] args) {
        
            
            extra e1= new extra();
            
            e1.setA("Jeremias");
            e1.setB(22);
            
            System.out.println("El nombre de e1:"+e1.getA());
            System.out.println("La edad de e1:"+e1.getB());
            
            
            
            
    }
        
        
        
    
    
}
class extra{
    
      private String a;
        
      private int b;

        
    
    public extra(){}
        
    public extra(String a, int b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("extra{");
        sb.append("a=").append(a);
        sb.append(", b=").append(b);
        sb.append('}');
        return sb.toString();
    }
        
    
       


}