package com.test.packa;

public class Devika_01 {
	public static void main(String[] args) {
		int a=234, i=0, j=0;
		while(a>0) {
			i=a%10;
			j=j*10+i;
			a=a/10;
		}
		System.out.println(j);
		}
		
	}


