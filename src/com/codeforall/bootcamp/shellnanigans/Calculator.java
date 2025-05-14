package com.codeforall.bootcamp.shellnanigans;

public class Calculator {

    private String brand;
    private String color;


    private Brain brain;
    private Display display;

    public Calculator(String brand, String color){
        this.brand = brand;
        this.color = color;

        brain = new Brain();
        display = new Display();
    }


    public void executeOperation(Operation operation, int number1, int number2){

        int result = brain.getResult(operation, number1, number2);

        display.showResult(result);
    }
}
