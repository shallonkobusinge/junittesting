package com.example.classbjunt.services;

public class CalculatorSumServiceImpl {
    CalculatorService calculatorService;

    int sum=0;
    public int calcSum(int[] data){
        for(int value:data){
            sum+=value;
        }
        return sum;
    }

}
