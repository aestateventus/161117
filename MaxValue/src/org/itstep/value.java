package org.itstep;

public class value {

	private static String sum3;
	private static String sum2;
	private static String sum1;

	public value(String[] args) {
		
		max(16, 18, 20);	
	}
	
	public static void max (int a, long b, double c) {
		double sum1=a*b;
				double sum2=a*c;
				double sum3=b*c;
				
				if (sum1 > sum2 & sum1 > sum3) {
					System.out.println("Max value: a multiplied by b" + sum1());
				}
					
					if (sum2 > sum3 & sum2 > sum1) {
						System.out.println("Max value: a multiplied by c" + sum2());
					}
					else { 
						System.out.println("Max value: b multiplied by c" + sum3());
				}
	}

	private static String sum3() {
		return sum3;
	}

	private static String sum2() {
		return sum2;
	}

	private static String sum1() {
		return sum1;
	}

}
