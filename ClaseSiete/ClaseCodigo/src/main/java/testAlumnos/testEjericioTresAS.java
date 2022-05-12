package testAlumnos;

import java.util.ArrayList;
import java.util.List;
import org.proydesa.clases.Empleado;
import org.proydesa.clases.Producto;


public class testEjericioTresAS {
    
    public static void main(String[] args) {

        List<Empleado> trabajadores = new ArrayList<>();

        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Jabon", 100));
        productos.add(new Producto("Shampoo", 150));
        productos.add(new Producto("Crema enjuage", 170));
        productos.add(new Producto("Crema", 110));
        productos.add(new Producto("Quita Manchas", 350));

        trabajadores.add(new Empleado(3, "Jere"));
        trabajadores.add(new Empleado(1, "Matias"));
        trabajadores.add(new Empleado(4, "Jose"));
        trabajadores.add(new Empleado(2, "Maxi"));
        trabajadores.add(new Empleado(8, "Quesito"));
        trabajadores.add(new Empleado(11, "Jesús"));

	// RESPUESTA III
          
          trabajadores.forEach(System.out::println);
          productos.forEach(System.out::println);
          
          casoTresE (trabajadores);
          casoTresP (productos);

         }// Fin de la main
    
    
        public static void casoTresE (List<Empleado> listado){
     
        listado.stream().map(x->x.getNombre()+" - ProydesaEmpleado").forEach(System.out::println);
    }
        
    public static void casoTresP (List<Producto> aumento){
        
        aumento.stream().map(x->x.getPrecio()*1.1).forEach(System.out::println);
    }
    
}
