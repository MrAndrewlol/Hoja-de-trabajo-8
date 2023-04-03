import java.io.File;
import java.util.PriorityQueue;
import java.util.Scanner;


public class UI {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        boolean ejecucion = true;

        PriorityQueue<Integer> heap = null;

        priorityQ<Integer> queue = new priorityQ<Integer>();

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
        String ruteFile = in.nextLine();

        try {
            File myFile = new File(ruteFile);
            Scanner myReader = new Scanner(myFile);
    
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
                String[] datos = data.split(",");
                Integer ni = Integer.valueOf(datos[2]) + 120;
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

        
    }
}
