package com.example.classbjunt.services;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DayOfTheWeekServiceImplServiceImplTest {
    @Test
    public void test_pass() {
        DayOfTheWeekServiceImpl dayofweek = new DayOfTheWeekServiceImpl();
        String result = dayofweek.getDay(1);
        String expected = "MONDAY";
        assertEquals(result,expected);
    }
    @Test
    public void getDay_invalidTest() {
        DayOfTheWeekServiceImpl dayofweek = new DayOfTheWeekServiceImpl();
        String result = dayofweek.getDay(8);
        String expected = "Invalid";
        assertEquals(result,expected);
    }

}
