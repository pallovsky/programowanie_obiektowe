package lab7;


import java.io.File;
import java.io.PrintWriter;

public class GenerateRandoms {

    public static void fill(){
        try {
            int r;
            File numbers = new File("numbers.txt");
            PrintWriter writer = new PrintWriter(numbers);
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 10000; j++) {
                    r = (int) (Math.random() * 100 + 1);
                    writer.print(r + " ");
                }
                writer.print("\n");
            }
            writer.close();
        }catch (Exception e){

        }

    }
}