package Arithmetic;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitQuickcheck.class)
public class LibraryRandomizedPropertyTest {
    @Property(trials = 10)
    public void TestCommutativeProperty(int factor1, int factor2) {
        System.out.println("Generated factor1: " + factor1 + ", factor2: " + factor2);
        assertEquals(Library.Multiply(factor1, factor2), Library.Multiply(factor2, factor1));
    }
}
