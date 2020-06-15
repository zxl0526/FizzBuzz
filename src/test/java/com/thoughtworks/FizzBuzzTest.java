package com.thoughtworks;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void  should_return_String_when_given_1(){
        should_return_String_when_given_number(1,"1");
    };
    @Test
    public void  should_return_String_when_given_3(){
        should_return_String_when_given_number(3,"Fizz");
    };
    @Test
   /* public void  should_return_String_when_given_5(){
        should_return_String_when_given_number(5,"Buzz");
    };*/
    public void  should_return_String_when_given_5(){
        should_return_String_when_given_number(5,"BuzzWhizz");
    };
    @Test
    /*public void  should_return_String_when_given_15(){
        should_return_String_when_given_number(15,"FizzBuzz");
    };*/
    public void  should_return_String_when_given_15(){
        should_return_String_when_given_number(15,"BuzzWhizz");
    };
    @Test
    /*public void  should_return_String_when_given_7(){
        should_return_String_when_given_number(7,"Whizz");
    };*/
    public void  should_return_String_when_given_7(){
        should_return_String_when_given_number(7,"Fizz");
    };
    @Test
    public void  should_return_String_when_given_21(){
        should_return_String_when_given_number(21,"FizzWhizz");
    };
    @Test
    /*public void  should_return_String_when_given_105(){
        should_return_String_when_given_number(105,"FizzBuzzWhizz");
    };*/
    public void  should_return_String_when_given_105(){
        should_return_String_when_given_number(105,"BuzzWhizz");
    };
    @Test
    public void  should_return_String_when_given_13(){
        should_return_String_when_given_number(13,"Fizz");
    };
    @Test
    public void  should_return_String_when_given_35(){
        should_return_String_when_given_number(35,"BuzzWhizz");
    };

    @Test
    /*public void  should_return_String_when_given_75(){
        should_return_String_when_given_number(75,"BuzzWhizz");
    };*/
    public void  should_return_String_when_given_75(){
        should_return_String_when_given_number(75,"Fizz");
    };
    @Test
    public void  should_return_String_when_given_375(){
        should_return_String_when_given_number(375,"Fizz");
    };

    @Test
    public void  should_return_String_when_given_210(){
        should_return_String_when_given_number(210,"FizzBuzzWhizz");
    };

    public void  should_return_String_when_given_number(int num,String resultA){

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(num);
        assertEquals(resultA,result);
    }


}