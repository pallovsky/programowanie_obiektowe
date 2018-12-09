/*
package lab2.Cryptographer;

import java.io.BufferedReader;
import java.io.FileReader;

public class Cryptographer {
    public void cryptFile(String input, String output, Algorithm szyfr){

        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader(input));
            String line = fileReader.readLine();
            szyfr.crypt(line);

        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }

    }
    public void decryptFile(String input, String output){

    }
}
*/
