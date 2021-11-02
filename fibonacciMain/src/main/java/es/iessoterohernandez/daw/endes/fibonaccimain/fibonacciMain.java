
package es.iessoterohernandez.daw.endes.fibonaccimain;
import es.iessoterohernandez.daw.endes.fibonacci.fibonacci;
public class fibonacciMain {
    public static void main(String[] args) {
        
        fibonacci f1 = new fibonacci("fibonacci 1",20); 
        f1.mostrarSerie();
        
        fibonacci f2 = new fibonacci();
        f2.setNombre("fibonacci 2");
        f2.setTamaño(10);
        f2.mostrarSerie();
        
        
    }
}
