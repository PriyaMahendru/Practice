package com.random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RandomTest {

    List<String> inputStringList=null;
    List<Integer> inputIntegerList=null;
    List<Boolean> inputBooleanList=null;
    Random random=null;
    @Before
    public void setUp() throws Exception {
    this.inputStringList= Arrays.asList("xyz","abc","pqr");
    this.inputBooleanList=Arrays.asList(true,false);
    this.inputIntegerList=Arrays.asList(1,2,3,4,5,6,7,8,9,30);
    }

    @Test
    public void getRandomValue_ForStringTypeList() {
        random=new Random();
    String firstRandomValue=this.random.getRandomValue(this.inputStringList);
        random=new Random();
    String secondRandomValue=this.random.getRandomValue(this.inputStringList);
    assertNotEquals("Both the values should not match",firstRandomValue,secondRandomValue);
    }
    @Test
        public void getRandomValue_ForBooleanTypeList() {
        boolean firstRandomValue=this.random.getRandomValue(this.inputBooleanList);
        boolean secondRandomValue=this.random.getRandomValue(this.inputBooleanList);
        assertNotEquals("Both the values should not match",firstRandomValue,secondRandomValue);
    }
    @Test
        public void getRandomValue_ForIntegerTypeList() {
        int firstRandomValue=this.random.getRandomValue(this.inputIntegerList);
        int secondRandomValue=this.random.getRandomValue(this.inputIntegerList);
        assertNotEquals("Both the values should not match",firstRandomValue,secondRandomValue);
    }


    @After
    public void tearDown() throws Exception {
    inputStringList=null;
       inputIntegerList=null;
       inputBooleanList=null;
       random=null;
    }
}