/*
 * The Author of this arbolbinario @Andre Jo
 */
import java.util.PriorityQueue;

public class priorityQ<E>{

    public PriorityQueue<Integer> getInstance(int instance) {
        PriorityQueue<Integer> priority = null;

        if (instance == 1){
            priority = new PriorityQueue<Integer>();  
        } else if (instance == 2){
            priority = new VectorHeap<>();
        }

        return priority;

    }
    
    
}