package com.fish;

import java.util.Scanner;

public class Fish {

	public static void main(String[] args) {

		float  i, j , t;
		double s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of fish\n");
		float n = sc.nextFloat();
		n = n+14;
		s= n/10;
		t=(float) (4.72/n);
		for(j=(float) Math.floor(s);j>=-Math.ceil(s);j--) {
			for(i=0;i<=4;i=i+t) {
				if((j<s/2 && j>s/4 && i<1 && i>0.8||j==0 && i<0.6)||(Math.pow(j/s, 2)>=Math.pow(Math.sin(i), 2))) {
					System.out.print(" ");
				}else {
					System.out.print("@");
				}
			}
			System.out.println();
			
		}
		

	}

}
