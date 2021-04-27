package _for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star_Diamond {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("원하는 행 입력: ");
		int row = Integer.parseInt(reader.readLine());
		
		//상단~중간
		for (int i=0; i<row; i++) {
			for (int j=1; j<row-i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<i*2+1; j++) { 
				System.out.print("*");
			}
			System.out.println();
		}
		
		//하단
		for (int i=row-1; i>0; i--) {
			for (int j=row-i; j>0; j--) {
				System.out.print(" ");
			}
			
			for (int j=i*2-1; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
