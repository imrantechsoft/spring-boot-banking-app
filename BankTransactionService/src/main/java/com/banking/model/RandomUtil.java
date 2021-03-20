package com.banking.model;

import java.util.Random;

public class RandomUtil {


	public static Long generateRandomNumber() {

		Random random = new Random();
		Long rand = Math.round(random.nextFloat() * Math.pow(10,12));
		return rand;
	}
	
	
	public static Double generateDoubleNumber() {
		
		Random random = new Random();
		Double rand = (double) Math.round(random.nextDouble() * Math.pow(2,12));
		return rand;
	}



	public static void main(String[] args) {
		System.out.println(generateRandomNumber());
		System.out.println(generateDoubleNumber());
		
	}

}
