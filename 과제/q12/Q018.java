package com.test.question.q12;

public class Q018 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i=1; i<=100; i++) {
			
			for (int j=1; j<=i; j++) {
				
				if (i%j==0) sum+=j;
				
			}
			
			if ((sum-i)==i) { //약수더한값-자기자신
				
				System.out.printf("\n%d = ",i); //완전수
				
				for(int k=1; k<i; k++) { 
					
					//완전수의 약수
					if(i%k==0) {
						
						System.out.print(k+" ");
					
					} 
					
				}
			}
			sum=0;
		}
		
	}
	
}
