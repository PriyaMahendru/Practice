package com.random;

import java.util.List;


/**
 *To facilitate a functionality of randomizer
 */
public class Random {
	/**
	 * To get a random value from a list
	 * @param inputList
	 * @param <T>
	 * @return Return a value type T
	 */
		public <T> T getRandomValue(List<T> inputList)
		{   assert(inputList!=null);
			long time=System.nanoTime();
			time=time+time;
			System.out.print(time);
			int length=inputList.size();
			int randomIndex=(int) (time%length);
			return inputList.get(randomIndex);
		}
		
}