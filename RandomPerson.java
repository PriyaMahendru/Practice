package com.random;

public class RandomPerson {

     static long milli=System.currentTimeMillis();

	 
	public static  boolean randomIsHuman()
	{
	   System.out.println(milli);
		Boolean[] isHumanValues= {false,false,true,false};
		int isHumanValuesLength=isHumanValues.length;
		boolean randomIsHuman=isHumanValues[(int) (milli%isHumanValuesLength)];
	    System.out.println(randomIsHuman);
        return randomIsHuman;
	}
	
	public  static int randomAge()
	{
        int[] ageValues= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		int AgeValuesLength=ageValues.length;
        int randomAge=ageValues[(int) (milli%AgeValuesLength)];
	    System.out.println(randomAge);
	    return randomAge;
	}
	
	public static String randomName()
	{
		String[] nameValues= {"priya","shivam","himanshu","riya","rajat","kirtika","ashima","bikram","anil","jestin","rajat","komal","jay","priya","shivam","himanshu","riya","ketan","kirtika","ashima","bikram","anil","jestin","rajat","komal","jay"};
		int nameValuesLength=nameValues.length;
        String randomName= nameValues[(int) (milli%nameValuesLength)];
	    System.out.println(randomName);
        return randomName;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean randomisHumanValue=randomIsHuman();
		int randomAgeValue=randomAge();
		String randomNameValue=randomName();
		}
}
