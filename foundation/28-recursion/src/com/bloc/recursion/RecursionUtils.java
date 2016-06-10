package com.bloc.recursion;

import java.util.*;

public class RecursionUtils extends Object {
	/*
	 * findMaxRecursively
	 *
	 * Takes a list of numbers and finds the largest among them
	 * using recursive calls.
	 *
	 * @param numbers a list of numbers, can be odd or even numbered
	 * @return the largest number in the list
	 *
	 * Hint: your base case may be a comparison of 2 numbers
	 */
	public static final int findMaxRecursively(List<Integer> numbers) {
		/************************************************
	 	 *	ASSIGNMENT:
	 	 *	Implement this method, the return value must
	 	 *	change
		/************************************************/
		//Base case
		if(numbers.size() == 1){
			return numbers.get(0);
		}
		while(numbers.size() > 1){
			if(numbers.get(0) < numbers.get(numbers.size() - 1)){
				numbers.set(0, numbers.get(numbers.size() - 1));
			}
			return findMaxRecursively(numbers.subList(0, (numbers.size() - 1)));
		}
		return numbers.get(0);

		/*
		//Base case
		if(numbers.size() == 1){
			return numbers.get(0);
		} else{
			int max1 = findMaxRecursively(numbers.subList(0, numbers.size() / 2));
			int max2 = findMaxRecursively(numbers.subList(numbers.size() / 2, numbers.size()));
			return max1 > max2 ? max1 : max2;
		}
		*/
		
		/* 
		int tempMax = numbers.get(0);
		
		//Base case
		if(numbers.size() == 1){
			return numbers.get(0);
		} else{
			List<Integer> numbersList = new ArrayList<Integer>(numbers);
			tempMax = (numbers.get(0) > numbers.get(numbers.size() - 1) ? numbers.get(0) : numbers.get(numbers.size() - 1));
			return findMaxRecursively(numbers.subList(0, numbers.siz() - 1));
			
		} */
		
		/* int tempMax = numbers.get(0);
		
		while(numbers.size() > 1){
			if(tempMax < numbers.get(numbers.size() - 1)){
				tempMax = numbers.get(numbers.size() - 1);
				System.out.println("tempMax = " + tempMax);
			}
			return findMaxRecursively(numbers.subList(0, (numbers.size() - 1)));
		}
		return tempMax; */
	}
}