package kolokwium.Tests;
import kolokwium.appl.*;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringCalculatorTest {
    @Test
    public void AddTest1(){
        StringCalculator C = new StringCalculator();
        String s1 = "a";
        C.Add(s1);
        assertEquals("a",C.getResult());
    }

    @Test
    public void AddTest2(){
        StringCalculator C = new StringCalculator("a");
        String s1 = "a";
        C.Add(s1);
        assertEquals("aa",C.getResult());
    }

    @Test
    public void MultiplyTest(){
        StringCalculator C = new StringCalculator("a");
        C.Multiply(4);
        assertEquals("aaaaa",C.getResult());
    }
}
