package com.thoughtworks;

/**
 * FizzBuzz
 * @author adminzxl
 */
public class FizzBuzz {
    public String say(int i) {

        if(i % 3 ==0 && i % 5 != 0 ){
            return "Fizz";
        }
        if(i % 5 == 0  && i % 3 != 0){
            return "Buzz";
        }

        return "1";
    }
}
