package com.thoughtworks;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void  should_return_1_when_given_1(){

        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.say(1);

        // then
        assertEquals("1",result);

    }
    @Test
    public void  should_return_Fizz_when_given_3(){

        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.say(3);

        // then
        assertEquals("Fizz",result);

    }
    @Test
    public void  should_return_Buzz_when_given_5(){

        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.say(5);

        // then
        assertEquals("Buzz",result);

    }

}
