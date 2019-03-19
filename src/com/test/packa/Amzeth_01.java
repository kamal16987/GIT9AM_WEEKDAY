package com.test.packa;

public class Amzeth_01 {
	
	public static void main(String[] args) {
		int a=153,i=0,j=0,sum=0,temp=a;
		while(a>0) {
			i=a%10;
			sum=sum+(i*i*i);
			a=a/10;
		}
		
		if(temp==sum) {
			System.out.println("Armstrong Number");
		}
		
		else {
			System.out.println("Not an Armstrong Number");
		}
	}

}
