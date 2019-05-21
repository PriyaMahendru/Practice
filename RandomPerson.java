package com.random;

public class RandomPerson {
	boolean randomIsHuman;
	int randomAge;
	String randomName;
	public RandomPerson() {
		
	}
	
	public RandomPerson(boolean randomIsHuman,int randomAge,String randomName) {
		
		this.randomAge=randomAge;
		this.randomIsHuman=randomIsHuman;
		this.randomName=randomName;
		
		// TODO Auto-generated constructor stub
	}
      long milli=System.currentTimeMillis();
	 
	public   boolean randomIsHuman()
	{         long milli=System.currentTimeMillis();
long miilii=milli+milli;
		System.out.println(milli);
		Boolean[] isHumanValues= { false,false,true,false};
		int isHumanValuesLength=isHumanValues.length;
		randomIsHuman=isHumanValues[(int) (miilii%isHumanValuesLength)];
	    System.out.println(randomIsHuman);
        return randomIsHuman;
	}
	
	public   int randomAge()
	{       long milli=System.currentTimeMillis();
	long miilii=milli+milli;

        int[] ageValues= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		int AgeValuesLength=ageValues.length;
        randomAge=ageValues[(int) (miilii%AgeValuesLength)];
	    System.out.println(randomAge);
	    return randomAge;
	}
	
	public  String randomName()
	{         long milli=System.currentTimeMillis();
	long miilii=milli+milli;
		String[] nameValues= {"priya","shivam","himanshu","riya","rajat","kirtika","ashima","bikram","anil","jestin","rajat","komal","jay","priya","shivam","himanshu","riya","kanchan","kirtika","ashima","bikram","anil","jestin","rajat","komal","jay"};
		int nameValuesLength=nameValues.length;
        randomName= nameValues[(int) (miilii%nameValuesLength)];
	    System.out.println(randomName);
        return randomName;
	}
	public String toString() {
		return (randomName+","+randomAge+","+randomIsHuman);
	}
	}
