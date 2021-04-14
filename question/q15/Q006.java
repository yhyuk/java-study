package com.test.question.q15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q006 {

	   public static void main(String[] args) throws NumberFormatException, IOException {
	      
	      //중복되지 않는 임의의 숫자 5개를 만드시오.
	      //조건
	      // - 숫자의 범위: 1 ~ 9
	      //추가조건
	      // - 숫자의 범위를 입력받으시오.
	      // - 숫자의 개수를 입력받으시오.
	      
	      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	      
	      System.out.print("숫자의 범위(최대값): ");
	      int max = Integer.parseInt(reader.readLine());
	      
	      System.out.print("숫자의 범위(최소값): ");
	      int min = Integer.parseInt(reader.readLine());
	      
	      System.out.print("숫자의 개수: ");
	      int count = Integer.parseInt(reader.readLine());
	      
	      int[] list = new int[count]; //입력한 숫자의 개수 크기의 배열 선언
	      
	      for (int i=0; i<list.length; ) {
	         boolean overlapped = false;
	         list[i] = (int)(Math.random() * (max-min + 1)) + min; //입력한 숫자의 범위 난수 생성
	         
	         for (int j=0; j<i; j++) {
	            if (list[i] == list[j]) {
	               overlapped = true;
	               break;
	            }
	         }
	         
	         if (!overlapped) {
	            i++;
	         }
	         
	      }
	      
	      System.out.print("[");
	      for (int i=0; i<list.length; i++) {
	         if (i == list.length-1) {
	            System.out.print(list[i] + "]");
	         } else {
	            System.out.print(list[i] + ", ");
	         }
	      }
	      
	 }
	   
}

