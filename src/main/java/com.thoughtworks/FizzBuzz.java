package com.thoughtworks;

/**
 * FizzBuzz
 * @author adminzxl
 */
public class FizzBuzz { public String say(int number) {
    String fizz="Fizz";
    String buzz="Buzz";
    String whizz="Whizz";
    int three = 3;
    int five = 5;
    int seven = 7;

    // 处理包含7关系
    if (String.valueOf(number).contains("7")) {
        return "Fizz";
    }else if (String.valueOf(number).contains("5")) {// 处理包含5关系
        // 处理包含3关系
        return "BuzzWhizz";

    }else if (String.valueOf(number).contains("3")) {
        return "Fizz";
    }



    if(number % three ==0 && number % five != 0 && number % seven != 0 ){
        return fizz;
    }
    if(number % five == 0  && number % three != 0){
        return buzz;
    }
    if(number % three ==0 && number % five == 0 && number % seven != 0  ){
        return fizz+buzz;
    }
    if(number % seven ==0 && number % three !=0 ){
        return whizz;
    }
    if(number % seven ==0 && number % three ==0 && number % five != 0  ){
        return fizz+whizz;
    }
    if(number % seven ==0 && number % five ==0  && number % three ==0){
        return fizz+buzz+whizz;
    }

    return String.valueOf(number);
}
}
