/**
 * @author Jose Prince y jo
 * Algoritmos y Estructura de Datos
 * @date 24/03/2023
 */
import static org.junit.Assert.assertEquals;

import java.util.PriorityQueue;

import org.junit.Test;

public class PruebasUnitarias { 

    PriorityQueue<Integer> heap = null;
    priorityQ<Integer> queue = new priorityQ<Integer>();
    PriorityQueue<Integer> priority = null;

    //Prueba para añadir un elemento
    @Test
    public void agregardatoalvectorheap() {
        heap = queue.getInstance(2);
        heap.add(20);
        heap.add(30);
        String data = heap.peek().toString();

        assertEquals("20",data );
    }
    @Test
    public void muertealvectorheap() {
        heap = queue.getInstance(2);
        heap.add(20);
        heap.add(30);
        int numerocomparar = heap.peek();
        heap.remove();
        int numerocomparar2 = heap.peek();
        boolean val = true;
        if (numerocomparar != numerocomparar2){
            val = false;
        }
     

        assertEquals(false,val );
    }


}

   
