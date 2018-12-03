/*
package kolokwium.appl;

import kolokwium.excp.NothingToSubstractFromException;
import kolokwium.excp.TooBigNumberException;

import java.io.*;

public class StringCalculator extends Calculator {

    private String result;

    public StringCalculator() {
        this.result = null;
    }

    public StringCalculator(String result) {
        this.result = result;
    }

    public String getResult() {
        return this.result;
    }

    @Override
    public void SaveToFile (String nazwa) {
        PrintWriter file = new PrintWriter(nazwa);
        file.print(result);
        file.close();
    }

    @Override
    public void Add(String string1) {
        StringBuilder sB = new StringBuilder(this.result);
        sB.append(string1);
        this.result = sB.toString();
    }

    @Override
    public void Substract(String string1) throws NothingToSubstractFromException{
        if (result.isEmpty()) {
            throw new NothingToSubstractFromException();
        }
        result = result.replace(string1, "");
    }

    @Override
    public void Multiply(int x) throws TooBigNumberException {
        if (x > 5) {
            throw new TooBigNumberException(x);
        }
        String tmp = result;
        for (int i = 0; i < x - 1; i++) {
            result += tmp;
        }

    }

}
*/