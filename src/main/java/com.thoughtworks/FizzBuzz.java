package com.thoughtworks;

/**
 * FizzBuzz
 * @author adminzxl
 */
public class FizzBuzz {
    public String say(int number) {
        int three = 3;
        int five = 5;
        if(number % three ==0 && number % five != 0 ){
            return "Fizz";
        }
        if(number % five == 0  && number % three != 0){
            return "Buzz";
        }
        if(number % three ==0 && number % five == 0){
            return "FizzBuzz";
        }

        return String.valueOf(number);
    }
}
