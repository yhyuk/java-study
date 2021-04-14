package com.test.question.q15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q007 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		// 배열에 요소삽입

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("삽입 위치 : ");
		int idx = Integer.parseInt(reader.readLine());
		System.out.print("값 : ");
		int value = Integer.parseInt(reader.readLine());
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) { // 1~10 랜덤수
			arr[i] = (int) (Math.random() * 9) + 1; //arr[] 에 랜덤수 넣기
		}

		System.out.print("원본: ");
		System.out.println(output(arr));
		
		insert(arr, idx, value); //삽입
		
		System.out.print("결과: ");
		System.out.println(output(arr));
		
	}
	
	private static void insert(int[] arr, int idx, int value) {
		
		for (int i=arr.length-2; i>=idx; i--) { //오른쪽 이동
			arr[i+1] = arr[i];
		}
		arr[idx] = value;
		
	}

	private static String output(int[] arr) {
		
		String temp = "[";
		
		for (int i=0; i<arr.length; i++) {
			temp += arr[i] + ",";
		}
		temp = temp.substring(0, temp.length()-1);
		temp += "]";
		
		return temp;
	}

}
