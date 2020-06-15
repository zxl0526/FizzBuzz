package com.thoughtworks;

/**
 * FizzBuzz
 * @author adminzxl
 */
public class FizzBuzz {
    public String say(int number) {
        String fizz="Fizz";
        String buzz="Buzz";
        String whizz="Whizz";
        int three = 3;
        int five = 5;
        int seven = 7;
        if(number % three ==0 && number % five != 0 && number % seven != 0 ){
            return fizz;
        }
        if(number % five == 0  && number % three != 0){
            return buzz;
        }
        if(number % three ==0 && number % five == 0){
            return fizz+buzz;
        }
        if(number % seven ==0 && number % three !=0 ){
            return whizz;
        }
        if(number % seven ==0 && number % three ==0 ){
            return fizz+whizz;
        }
        return String.valueOf(number);
    }
}
