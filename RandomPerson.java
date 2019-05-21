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
	 
	public   boolean randomIsHuman(int s)
	{         long time=System.nanoTime();
              time=time+s;
		//System.out.println(time);
		Boolean[] isHumanValues= { false,true};
		int isHumanValuesLength=isHumanValues.length;
		randomIsHuman=isHumanValues[(int) (time%isHumanValuesLength)];
	  //  System.out.println(randomIsHuman);
        return randomIsHuman;
	}
	
	public   int randomAge(int s)
	{       long time=System.nanoTime();
	time=time+s;

        int[] ageValues= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		int AgeValuesLength=ageValues.length;
        randomAge=ageValues[(int) (time%AgeValuesLength)];
	   // System.out.println(randomAge);
	    return randomAge;
	}
	
	public  String randomName(long s)
	{         long time=System.currentTimeMillis();
	time=time+s;
		String[] nameValues= {"priya","shivam","himanshu","riya","rajat","kirtika","ashima","bikram","anil","jestin","raj","krantika","jaya","priyanka","shiv","ayush","rita","kanchan","kirti","aneesha","vikram","arun","mathew","surbhi","sandarbh","joy"};
		int nameValuesLength=nameValues.length;
        randomName= nameValues[(int) (time%nameValuesLength)];
	   // System.out.println(randomName);
        return randomName;
	}
	public String toString() {
		return (randomName+","+randomAge+","+randomIsHuman);
	}
	}
