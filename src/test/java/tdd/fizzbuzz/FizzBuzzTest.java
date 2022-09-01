package tdd.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;
    @BeforeEach
    void setUpForEach() {
        fizzBuzz = new FizzBuzz();
    }
    @Test
    void should_return_fizz_when_countOf_given_input_3() {
        //given
        String expected = "Fizz";
        int input = 3;
        //when
        String result = fizzBuzz.countOf(input);
        //then
        assertEquals(expected, result);
    }
    
    @Test
    void should_return_buzz_when_countOf_given_input_5() {
        //given
        String expected = "Buzz";
        int input = 5;
        //when
        String result = fizzBuzz.countOf(input);
        //then
        assertEquals(expected, result);
    }
    
    @Test
    void should_return_whizz_when_countOf_given_input_7() {
        //given
        String expected = "Whizz";
        int input = 7;
        //when
        String result = fizzBuzz.countOf(input);
        //then
        assertEquals(expected,result);
    }

    @Test
    void should_return_fizzbuzz_when_countOf_given_15() {
        //given
        String expected = "FizzBuzz";
        int input = 15;
        //when
        String result = fizzBuzz.countOf(input);
        //then
        assertEquals(expected,result);
    }

}
