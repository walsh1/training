package com.qa.tests;

public class MyArrayUtils {
	public static java.lang.Integer findHighest(int[] numbers){
		int highestSoFar = Integer.MIN_VALUE;
		if(numbers.length == 0){
			return null;
		}
		for (int i =0; i < numbers.length; i++){
			if (numbers[i]>highestSoFar)
				highestSoFar = numbers[i];
		}
		return highestSoFar;
	}
	

}
