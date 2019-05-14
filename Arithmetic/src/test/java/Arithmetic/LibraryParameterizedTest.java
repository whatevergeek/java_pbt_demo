package Arithmetic;

import org.junit.Test;
import static org.junit.Assert.*;

import junitparams.*;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class LibraryParameterizedTest {
    @Test
    @Parameters({ "2,3,6", "3,4,12" })
    public void TestMultiplyUsingExample(int factor1, int factor2, int expected) {
        int actual = Library.Multiply(factor1, factor2);
        assertEquals(expected, actual);
    }

    @Test
    @Parameters({ "2,3", "3,4" })
    public void TestMultiplyCommutativeProperty(int factor1, int factor2) {
        assertEquals(Library.Multiply(factor1, factor2), Library.Multiply(factor2, factor1));
    }
}
