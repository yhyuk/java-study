package com.test.question.q13;

public class Q012 {
	
	public static void main(String[] args) {
		
		
		
		for (int i=1; i<=100; i++) {
			int sum=0;
			for (int j=1; j<=i; j++) 
				if (i%j==0) sum+=j;
				
			if ((sum-i)==i) { //약수더한값-자기자신
				
				System.out.printf("%d = [",i); //완전수
				
				for(int k=1; k<i; k++) { 
					if(i%k==0) System.out.printf("%d, ",k); //약수
				}
				System.out.print("\b\b]\n");
			}
		}
	}

}
