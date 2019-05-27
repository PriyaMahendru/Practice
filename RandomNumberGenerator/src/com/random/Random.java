package com.random;

import java.util.List;

public class Random {
		
		public <T> T getRandomNumber(List<T> randomList)
		{
			long time=System.nanoTime();
			int length=randomList.size();
			int randomIndex=(int) (time%length);
			return randomList.get(randomIndex);
		}
		
}