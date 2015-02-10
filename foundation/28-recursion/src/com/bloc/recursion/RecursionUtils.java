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
	 * 
	 */
	
	
	public static final int findMaxRecursively(List<Integer> numbers) {

		if(numbers.size() == 1) {
			return numbers.get(0);
		}
		Integer valueOne = numbers.get(0);
		Integer valueTwo = numbers.get(1);
		if(valueOne > valueTwo) {
			numbers.remove(1);
		}
		else {
			numbers.remove(0);
		}
		
		return findMaxRecursively(numbers);

		
		/************************************************
	 	 *	ASSIGNMENT:
	 	 *	Implement this method, the return value must
	 	 *	change
		/************************************************/
 }
	
}	