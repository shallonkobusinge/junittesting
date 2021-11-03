package com.example.classbjunt.services;

public class CalculatorSumImpl {
    int sum=0;
    public int calcSum(int[] data){
        for(int value:data){
            sum+=value;
        }
        return sum;
    }

}
