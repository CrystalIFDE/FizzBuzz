import com.crystalifde.fizzbuzz.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void should_return_origin_index_when_given_input_not_match_any_rules() {
        Assert.assertEquals("1", FizzBuzz.of(1));
        Assert.assertEquals("2", FizzBuzz.of(2));
        Assert.assertEquals("4", FizzBuzz.of(4));
        Assert.assertEquals("8", FizzBuzz.of(8));
        Assert.assertEquals("11", FizzBuzz.of(11));
    }

    @Test
    public void should_return_Fizz_when_given_input_can_be_divided_by_3() {
        Assert.assertEquals("Fizz", FizzBuzz.of(6));
        Assert.assertEquals("Fizz", FizzBuzz.of(9));
        Assert.assertEquals("Fizz", FizzBuzz.of(12));
    }

    @Test
    public void should_return_Fizz_when_given_input_can_be_divided_by_5() {
        Assert.assertEquals("Buzz", FizzBuzz.of(10));
        Assert.assertEquals("Buzz", FizzBuzz.of(20));
        Assert.assertEquals("Buzz", FizzBuzz.of(25));
    }

    @Test
    public void should_return_Fizz_when_given_input_can_be_divided_by_7() {
        Assert.assertEquals("Whizz", FizzBuzz.of(14));
        Assert.assertEquals("Whizz", FizzBuzz.of(28));
        Assert.assertEquals("Whizz", FizzBuzz.of(49));
    }

}