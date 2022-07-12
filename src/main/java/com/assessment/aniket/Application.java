package com.assessment.aniket;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		int leastNumber;
		int[] input = new int[] {9,7,5,3,1,2,4,6,7};
		if(input == null || input.length==0) {
			leastNumber = -1;
		} else {
			leastNumber = findLeastNumber(input, input.length);
		}
		System.out.println("Least Number:" +leastNumber);
	}

	public static int findLeastNumber(int[] args, int pointer) {
		
		if(args.length<2) {
			return args[0];
		} else if(args.length<3) {
			return args[0]>args[1]?args[1]:args[0];
		}
		pointer = Math.floorDiv(args.length, 2);
		if((args[pointer+1]+args[pointer])>(args[pointer-1]+args[pointer])) {
			return findLeastNumber(Arrays.copyOf(args, pointer),pointer);
		} else if((args[pointer+1]+args[pointer])<(args[pointer-1]+args[pointer])) {
			return findLeastNumber(Arrays.copyOfRange(args, pointer, args.length),pointer);
		} else{
			int number1 = findLeastNumber(Arrays.copyOf(args, pointer),pointer);
			int number2 = findLeastNumber(Arrays.copyOfRange(args, pointer, args.length),pointer);
			return number1>number2?number1:number2;
		}
	}
}
