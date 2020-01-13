import com.crystalifde.fizzbuzz.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void fizz_buzz() {
        assertEquals("1", FizzBuzz.of(1));
        assertEquals("2", FizzBuzz.of(2));
        assertEquals("Fizz", FizzBuzz.of(3));
        assertEquals("4", FizzBuzz.of(4));
        assertEquals("Buzz", FizzBuzz.of(5));
        assertEquals("Fizz", FizzBuzz.of(6));
        assertEquals("Whizz", FizzBuzz.of(7));
        assertEquals("8", FizzBuzz.of(8));
        assertEquals("Fizz", FizzBuzz.of(9));
        assertEquals("Buzz", FizzBuzz.of(10));
        assertEquals("11", FizzBuzz.of(11));
        assertEquals("Fizz", FizzBuzz.of(12));
        assertEquals("Fizz", FizzBuzz.of(13));
        assertEquals("Whizz", FizzBuzz.of(14));
        assertEquals("Buzz", FizzBuzz.of(15));
    }
}