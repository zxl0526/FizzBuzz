package com.thoughtworks;

/**
 * FizzBuzz
 * @author adminzxl
 */
public class FizzBuzz {


    public String say(int number) {
        String result = whenSaySpecialNumber(number);

        if (result.isEmpty()) {
            result = String.valueOf(number);
        }

        return result;
    }
    private String whenSaySpecialNumber(int number) {

        // 处理包含7关系
        if (String.valueOf(number).contains("7")) {
            return "Fizz";
            // 处理包含5关系
        } else if (String.valueOf(number).contains("5")) {
            // 处理包含3关系
            return "BuzzWhizz";
        } else if (String.valueOf(number).contains("3")) {
            return "Fizz";
        }

        // 处理倍数关系
        int[] special = new int[]{3, 5, 7};
        String[] strings = new String[]{"Fizz", "Buzz", "Whizz"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < special.length; i++) {
            if (number % special[i] == 0) {
                result.append(strings[i]);
            }
        }
        return result.toString();
    }




    /*if(number % three ==0 && number % five != 0 && number % seven != 0 ){
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
    }*/



}
