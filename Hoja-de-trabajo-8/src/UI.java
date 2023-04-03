import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;


public class UI {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        boolean ejecucion = true;

        PriorityQueue<Integer> heap = null;

        priorityQ<Integer> queue = new priorityQ<Integer>();
        ArrayList<String> listacola = new ArrayList<String>(); 

        while(ejecucion){
            System.out.println("\nIndique la implementación del Heap a utilizar: " +
            "\n1: Java Collections FrameWork" +
            "\n2: Java Structures\n");
            try {
                int rpa = in.nextInt();
                in.nextLine();

                heap = queue.getInstance(rpa);
                ejecucion = false;

            } catch (Exception e) {
                in.nextLine();
                System.out.println("Debe elegir entre 1 o 2");
                // TODO: handle exception
            }
        }

        System.out.println("Ingrese la ruta de acceso del archivo: ");
        // Quitar C:\Users\andre\OneDrive\Escritorio\CODING Code\Java_Projects\Java\src\Hoja-de-trabajo-8\Hoja-de-trabajo-8\src\procesos
        String ruteFile = in.nextLine();

        try {
            File myFile = new File(ruteFile);
            Scanner myReader = new Scanner(myFile);
    
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
                String[] datos = data.split(",");
                Integer ni = Integer.valueOf(datos[2]) + 120;
                data = data + ",PR=" +ni; 
                listacola.add(data);
                
                heap.add(ni);
               
            }

            System.out.println(heap.toString());
            System.out.println(heap.peek());
    
            myReader.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
            // TODO: handle exception
        }

        System.out.println("Bienvenido Vamos a realizar los procesos del CPU con su respectivo Priority");
        boolean jk = false;
        while(jk == false){
            jk = true;
            for(int l = 0; l < listacola.size()-1; l ++){
                if(listacola.get(l).contains(String.valueOf(heap.peek()))){
                    System.out.println("Se esta realizando el siguiente proceso en la cola: " + listacola.get(l));
                    heap.remove();
                    listacola.remove(l);
                    jk = heap.isEmpty();
                }
                
            }
            
        } 
        System.out.println("Se esta realizando el siguiente proceso en la cola: " + listacola.get(0));
            System.out.println("Se termino el proceso del CPU");
        



        
    }
}
