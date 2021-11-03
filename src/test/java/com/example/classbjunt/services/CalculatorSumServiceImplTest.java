package com.example.classbjunt.services;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorSumServiceImplTest {

 @Test
    public void calcSum_emptyList() {
        CalculatorSumServiceImpl calcServiceImpl = new CalculatorSumServiceImpl();

        int actualResult = calcServiceImpl.calcSum(new int[] {});
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void calcSum_manyElement() {
        CalculatorSumServiceImpl calcServiceImpl = new CalculatorSumServiceImpl();

        int actualResult = calcServiceImpl.calcSum(new int[] {1,2,-3});
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void calcSum_oneElement() {
        CalculatorSumServiceImpl calcServiceImpl = new CalculatorSumServiceImpl();
        int actualResult = calcServiceImpl.calcSum(new int[] {4});
        int expectedResult = 4;
        assertEquals(expectedResult, actualResult);
    }
}
