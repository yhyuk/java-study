package _for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star_Triangle {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		 *  Date : 2021.04.26
		 *  Title : 다중 for문 별 찍기 - 직각삼각형 예제 4개
		 *  
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("원하는 행 입력 : ");
		int row = Integer.parseInt(reader.readLine());
		
		//1
		for (int i=0; i<row; i++) {
			for (int j=0; j<i; j++) System.out.print(" "); //왼쪽정렬, 빈칸채우기
			for (int j=0; j<row-i; j++) System.out.print("*"); //1개씩 --
			System.out.println();
		}
		
		//2
		for(int i=0; i<row; i++) {
			for(int j=i; j<row; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//3
		for(int i=0; i<row; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//4
		for(int i=0; i<row; i++) {
			for(int j=i; j<row-1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
