package com.day2;

public class MyAverage 
{
	public static void main(String[] args) {
		 
        // create an array
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
 
        // length
        int length = array.length;
 
        // default sum 
        int sum = 0;
 
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
 
        double average = sum / length;
         
        System.out.println("Average of array : "+average);
 
    }
}