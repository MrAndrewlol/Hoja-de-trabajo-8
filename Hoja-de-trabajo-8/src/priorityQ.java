/*
 * The Author of this arbolbinario @Andre Jo
 */
import java.util.PriorityQueue;
import structure5.VectorHeap;




public class priorityQ<E>{

    public Object getInstance(int instance) {
        Object priority = null;

        if (instance == 1){
            priority = new PriorityQueue<E>(); 
        } else if (instance == 2){
            priority = new VectorHeap<>();
        }

        return priority;

    }
    
    
}