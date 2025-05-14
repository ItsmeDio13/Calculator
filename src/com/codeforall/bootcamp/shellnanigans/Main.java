package com.codeforall.bootcamp.shellnanigans;

import com.codeforall.bootcamp.shellnanigans.Calculator;

public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator("Casio","hot Pink");
        calculator.executeOperation(Operation.DIVIDE,5,7);
        calculator.executeOperation(Operation.ADD,19,2);
    }
}