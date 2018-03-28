package com.play.bdd.calculator;

public class Calculator {

    private int result;

    public void subtract(int arg1, int arg2) {
        result = arg1 - arg2;
    }

    public int getResult() {
        return result;
    }
}
