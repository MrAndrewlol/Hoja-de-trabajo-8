/*
 * The Author of this arbolbinario @Andre Jo
 */
import java.util.PriorityQueue;
import java.util.HashMap;



public class priorityQ<E>{
    

    public PriorityQueue<Integer> getInstance(int instance) {
        PriorityQueue<Integer> priority = null;

        if (instance == 1){
            priority = new PriorityQueue<Integer>();  
         
        } else if (instance == 2){
            priority = new VectorHeap<Integer>();
        }

        return priority;

    }

    public void addpriority(int ni, String dataString, HashMap<Integer,String> heap){
        heap.put(ni, dataString);
    }

    public void sacardata(int ni){
        

    }
    
    



    
}