package com.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {
	private boolean isHuman;
	private int age;
	private String name;
	
	public boolean isHuman() {
		return isHuman;
	}
	public void setHuman(boolean isHuman) {
		this.isHuman = isHuman;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Person() {
		
	}
	
	public Person(boolean randomIsHuman,int randomAge,String randomName) {
		
		this.age=randomAge;
		this.isHuman=randomIsHuman;
		this.name=randomName;
		}
	public static void main(String[] args)
	{
	List<Integer> ages=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25);
	List<String> names=Arrays.asList("priya","shivam","himanshu","riya","rajat","kirtika","ashima","bikram","anil","jestin","raj","krantika","jaya","priyanka","shiv","ayush","rita","kanchan","kirti","aneesha","vikram","arun","mathew","surbhi","sandarbh","joy");
	List<Boolean> isHumanValues=Arrays.asList(true,false);
	
    List<Person> randomPersonList=new ArrayList<Person>();

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
		for(Person p: randomPersonList){
		System.out.println(p.getAge()+" "+p.getName()+" "+p.isHuman());
	}

}
}