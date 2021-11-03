package com.example.classbjunt.services;

public class CalculatorSumServiceImpl {
    CalculatorService calcService;
    public void setCalcService(CalculatorService calcService) {
        this.calcService = calcService;
    }

    public int calcSumForServiceData() {
        int sum = 0;
        for (int value : calcService.getAll()) {
            sum += value;
        }
        return sum;
    }
//    int sum=0;
//    public int calcSum(int[] data){
//        for(int value:data){
//            sum+=value;
//        }
//        return sum;
//    }

}
