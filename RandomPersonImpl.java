package com.random;

import java.util.ArrayList;
import java.util.List;

public class RandomPersonImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RandomPerson rdmprsn=new RandomPerson();
		
		
		List<RandomPerson> randomPersonList=new ArrayList<RandomPerson>();
		for(int i=0;i<10;i++)
		{   long s=System.nanoTime();
		    int j=100;
			boolean randomisHumanValue=rdmprsn.randomIsHuman(j);
			int randomAgeValue=rdmprsn.randomAge(j);
			String randomNameValue=rdmprsn.randomName(s);
			RandomPerson e=new RandomPerson(randomisHumanValue,randomAgeValue,randomNameValue);
		randomPersonList.add(e);
		}
		
		for(RandomPerson s: randomPersonList){
			System.out.println(s);
		}
		
		}
}
