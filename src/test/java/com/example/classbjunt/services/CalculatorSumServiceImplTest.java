package com.example.classbjunt.services;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorSumServiceImplTest {

    CalculatorSumServiceImpl calcServiceImpl = new CalculatorSumServiceImpl();

        class CalculatorServiceOneElements implements CalculatorService {
        @Override
        public int[] getAll() {
            return new int[] {4};
        }
        }
        class CalculatorServiceManyElements implements CalculatorService {

        @Override
        public int[] getAll() {
            return new int[] {1,2,4};
        }
    }

        class CalculatorServiceEmptyElements implements CalculatorService{

            @Override
            public int[] getAll() {
                return new int[] {};
            }
        }

    @Test
    public void calcSum_emptyList() {
        calcServiceImpl.setCalcService(new CalculatorServiceEmptyElements());
        int actualResult = calcServiceImpl.calcSumForServiceData();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void calcSum_oneElement() {
        calcServiceImpl.setCalcService(new CalculatorServiceOneElements());
        int actualResult = calcServiceImpl.calcSumForServiceData();
        int expectedResult = 4;
        assertEquals(expectedResult, actualResult);
    }
        @Test
    public void calcSum_manyElement() {
        calcServiceImpl.setCalcService(new CalculatorServiceManyElements());
        int actualResult = calcServiceImpl.calcSumForServiceData();
        int expectedResult = 7;
        assertEquals(expectedResult, actualResult);
    }

// @Test
//    public void calcSum_emptyList() {
//        CalculatorSumServiceImpl calcServiceImpl = new CalculatorSumServiceImpl();
//
//        int actualResult = calcServiceImpl.calcSum(new int[] {});
//        int expectedResult = 0;
//        assertEquals(expectedResult, actualResult);
//    }
//@Test
//public void calcSum_manyElement() {
//    CalculatorSumServiceImpl calcServiceImpl = new CalculatorSumServiceImpl();
//
//    calcServiceImpl.setCalcService(new CalculatorServiceManyElements());
//
//    int actualResult = calcServiceImpl.calcSumForServiceData();
//    int expectedResult = 7;
//    assertEquals(expectedResult, actualResult);
//}

//    @Test
//    public void calcSum_manyElement() {
//        CalculatorSumServiceImpl calcServiceImpl = new CalculatorSumServiceImpl();
//
//        int actualResult = calcServiceImpl.calcSum(new int[] {1,2,-3});
//        int expectedResult = 0;
//        assertEquals(expectedResult, actualResult);
//    }

//
//    @Test
//    public void calcSum_oneElement() {
//        CalculatorSumServiceImpl calcServiceImpl = new CalculatorSumServiceImpl();
//        int actualResult = calcServiceImpl.calcSum(new int[] {4});
//        int expectedResult = 4;
//        assertEquals(expectedResult, actualResult);
//    }
}
