package com.test.question.q16;

public class Q008 {
	
	public static void main(String[] args) {
		
		/*
		 *  1 : (0,0)
		 *  2 : (0,1)(1,0)
		 *  3 : (0,2)(1,1)(2,0)
		 *  4 : (0,3)(1,2)(2,1)(3,0)
		 *  5 : (0,4)(1,3)(2,2)(3,1)(4,0)
		 *  6 : (1,4)(2,3)(3,2)(4,1)
		 *  7 : (2,4)(3,3)(4,2)
		 *  8 : (3,4)(4,3)
		 *  9 : (4,4)
		 * 
		 */
		
		int[][] arr = new int[5][5];
		
		int n = 1;
		
		for(int diagonalLine=0; diagonalLine<9; diagonalLine++) { // 0~8 => 대각선 9번
			for(int i=0; i<arr.length; i++) {  // 0~4 => 5행
				
				int j=diagonalLine-i; // 5열
				if(j>=0 && j<5) { // 0 <= j < 5
					arr[i][j] = n;
					n++;
				}
			
			}
		}
		
		
		//output
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}

}
