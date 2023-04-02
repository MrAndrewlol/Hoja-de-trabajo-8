import java.io.File;
import java.util.Scanner;

public class UI {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        boolean ejecucion = true;

        priorityQ<Integer> queue = new priorityQ<Integer>();

        while(ejecucion){
            System.out.println("\nIndique la implementación del Heap a utilizar: " +
            "\n1: Java Collections FrameWork" +
            "\n2: Java Structures\n");
            try {
                int rpa = in.nextInt();
                in.nextLine();

                Object heap = queue.getInstance(rpa);
                ejecucion = false;
            } catch (Exception e) {
                in.nextLine();
                System.out.println("Debe elegir entre 1 o 2");
                // TODO: handle exception
            }
        }

        try {
            File myFile = new File("procesos");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }

            myReader.close();
        } catch (Exception e) {
            // TODO: handle exception
        }


        
    }
}
