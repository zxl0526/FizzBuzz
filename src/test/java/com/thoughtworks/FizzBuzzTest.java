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

}
