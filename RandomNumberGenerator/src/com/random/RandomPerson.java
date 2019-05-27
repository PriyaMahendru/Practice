package com.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RandomPerson {
static  List<Person> randomPersonList=new ArrayList<Person>();
static List<Person> humanSorted=new ArrayList<Person>();
static List<Person> nameSorted=new ArrayList<Person>();
static List<Person> ageSorted=new ArrayList<Person>();



	public static void main(String[] args)
	{
		List<Integer> ages=Arrays.asList(51,52,53,54,55,56,57,58,595,50,51,52,53,54,55,56,57,58,59,50,51,52,43,54,55,51);
		List<String> names=Arrays.asList("priya","shivam","himanshu","riya","rajat","kirtika","ashima","bikram","anil","jestin","raj","krantika","jaya","priyanka","shiv","ayush","rita","kanchan","kirti","aneesha","vikram","arun","mathew","surbhi","sandarbh","joy");
		List<Boolean> isHumanValues=Arrays.asList(true,false);
		

		Random r=new Random();

		for(int i=0;i<10;i++)
		{
			Person p=new Person();
			boolean randomisHuman=r.getRandomNumber(isHumanValues);
			int randomAge=r.getRandomNumber(ages);
			String randomName=r.getRandomNumber(names);
			p.setAge(randomAge);
			p.setHuman(randomisHuman);
			p.setName(randomName);
			randomPersonList.add(p);
		}
			
	}
	public static List<Person> getAllHuman()
	{

		for(Person p: randomPersonList){
			if((p.isHuman())==(true))
			{
				humanSorted.add(p);
			}
		}
		return humanSorted;
	}

	public static List<Person> getNameWitha()
	{
		for(Person p: randomPersonList){
         if(p.getName().contains("a"))
         {
        	 nameSorted.add(p);
         }
	}
	return nameSorted;
	}
	
	public static List<Person> getAgeMoreThanFifty()
	{
		for(Person p: randomPersonList){
			{
				if(p.getAge()>50)
				{
					ageSorted.add(p);
				}
			}
	}
	return ageSorted;
	}
	
}

