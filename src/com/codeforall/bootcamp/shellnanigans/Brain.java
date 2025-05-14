package com.codeforall.bootcamp.shellnanigans;


public class Brain {

    public int getResult (Operation operation, int number1, int number2){
        int result = 0;
        switch (operation){
            case ADD:
                result = number1 + number2;
                break;
            case SUBTRACT:
                result = number1 + number2;
                break;
            case MULTIPLY:
                result = number1 + number2;
                break;
            case DIVIDE:
                result = number1 / number2;
                break;
        }
        return result;
    }
}
