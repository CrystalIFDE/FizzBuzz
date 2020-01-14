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
    public void should_return_Buzz_when_given_input_can_be_divided_by_5() {
        Assert.assertEquals("Buzz", FizzBuzz.of(10));
        Assert.assertEquals("Buzz", FizzBuzz.of(20));
        Assert.assertEquals("Buzz", FizzBuzz.of(25));
    }

    @Test
    public void should_return_Whizz_when_given_input_can_be_divided_by_7() {
        Assert.assertEquals("Whizz", FizzBuzz.of(14));
        Assert.assertEquals("Whizz", FizzBuzz.of(28));
        Assert.assertEquals("Whizz", FizzBuzz.of(49));
    }

    @Test
    public void should_return_FizzBuzz_when_given_input_can_be_divided_by_3_and_5() {
        Assert.assertEquals("FizzBuzz", FizzBuzz.of(60));
        Assert.assertEquals("FizzBuzz", FizzBuzz.of(90));
        Assert.assertEquals("FizzBuzz", FizzBuzz.of(120));
    }

    @Test
    public void should_return_BuzzWhizz_when_given_input_can_be_divided_by_5_and_7() {
        Assert.assertEquals("BuzzWhizz", FizzBuzz.of(70));
        Assert.assertEquals("BuzzWhizz", FizzBuzz.of(140));
        Assert.assertEquals("BuzzWhizz", FizzBuzz.of(280));
    }

    @Test
    public void should_return_FizzWhizz_when_given_input_can_be_divided_by_3_and_7() {
        Assert.assertEquals("FizzWhizz", FizzBuzz.of(21));
        Assert.assertEquals("FizzWhizz", FizzBuzz.of(42));
        Assert.assertEquals("FizzWhizz", FizzBuzz.of(84));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_given_input_can_be_divided_by_3_5_and_7() {
        Assert.assertEquals("FizzBuzzWhizz", FizzBuzz.of(210));
        Assert.assertEquals("FizzBuzzWhizz", FizzBuzz.of(420));
        Assert.assertEquals("FizzBuzzWhizz", FizzBuzz.of(840));
    }


}