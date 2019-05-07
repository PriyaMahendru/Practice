package com.random;

import java.time.LocalTime;

public class RandomBoolean {

	 
	public static boolean randomIsHuman()
	{
	    LocalTime thisTime=LocalTime.now();
	    int nano=thisTime.getNano();
	    System.out.println(nano);
		Boolean[] isHumanValues= {false,false,false,true};
		int isHumanValuesLength=isHumanValues.length;
		System.out.println(nano%4);
		boolean randomIsHuman=isHumanValues[(int)nano%isHumanValuesLength];
	    System.out.println(randomIsHuman);

        return randomIsHuman;
	}
	
	public static int randomAge()
	{
	    LocalTime thisTime=LocalTime.now();
	    int nano=thisTime.getNano();
	    System.out.println(nano);

        int[] ageValues= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		int AgeValuesLength=ageValues.length;
        int randomAge=ageValues[nano%AgeValuesLength];
        return randomAge;
	}
	
	public static String randomName()
	{
	    LocalTime thisTime=LocalTime.now();
	    int nano=thisTime.getNano();
	    System.out.println(nano);

		String[] nameValues= {"priya","shivam","himanshu","riya","rajat","kirtika","ashima","bikram","anil","jestin","rajat","komal","jay","priya","shivam","himanshu","riya","ketan","kirtika","ashima","bikram","anil","jestin","rajat","komal","jay"};
		int nameValuesLength=nameValues.length;
        String randomName= nameValues[nano%nameValuesLength];
        return randomName;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean randomisHumanValue=randomIsHuman();
		int randomAgeValue=randomAge();
		String randomNameValue=randomName();
		System.out.println(randomAgeValue);
			}
}
