package fizzbuzz;

import org.junit.*;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void fizzBuzz() {
        assertEquals(FizzBuzz.fizzBuzz(2), "2");

        assertEquals(FizzBuzz.fizzBuzz(3), "Fizz");

        assertEquals(FizzBuzz.fizzBuzz(5), "Buzz");

        assertEquals(FizzBuzz.fizzBuzz(15),"FizzBuzz");
    }
}
