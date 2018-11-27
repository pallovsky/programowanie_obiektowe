package kolokwium.appl;

import kolokwium.excp.NothingToSubstractFromException;
import kolokwium.excp.TooBigNumberException;
import java.io.FileNotFoundException;

public abstract class Calculator {

    public abstract void SaveToFile(String filename);
    public abstract void Add(String string1);
    public abstract void Substract(String string1) throws NothingToSubstractFromException;
    public abstract void Multiply(int x) throws TooBigNumberException;

}