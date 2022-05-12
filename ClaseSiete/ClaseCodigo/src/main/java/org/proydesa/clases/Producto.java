package org.proydesa.clases;

import java.util.Objects;


public class Producto implements Comparable<Producto> {

    private String nombreP;
    private int precio;

    public Producto(String nombreP, int precio) {
        this.nombreP = nombreP;
        this.precio = precio;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
      public void subirPrecio(){
    
          this.precio+=10;
          
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("nombreP=").append(nombreP);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.nombreP);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.precio != other.precio) {
            return false;
        }
        return Objects.equals(this.nombreP, other.nombreP);
    }

    @Override
    public int compareTo(Producto o) {
        
        return this.getPrecio()-o.getPrecio();
    }

    
    
    
    
    

    
}
