package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex54_exec {

	public static void main(String[] args)  throws Exception {
	
		//Ex54_exec.java
		
		/*
		 *  자바프로그램에서 외부프로그램 호출하기
		 *  
		 */
		
		
		/*
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.print("선택");
			
			String sel = reader.readLine();
			
			if(sel.equals("1")) {
				Process p1 = new ProcessBuilder("notepad.exe").start();
			} else if (sel.equals("2")) {
				Process p1 = new ProcessBuilder("mspaint.exe").start();
			} else if (sel.equals("3")) {
				Process p1 = new ProcessBuilder("msedge.exe").start();
			} else if (sel.equals("4")) {
				Process p1 = new ProcessBuilder("explorer.exe").start();
			} else if (sel.equals("5")) {
				Process p1 = new ProcessBuilder("calc.exe").start();
			}
		}
		*/
		
		//Process p1 = new ProcessBuilder("notepad.exe", ""
				//+ "D:\\class\\java\\Question\\src\\com\\test\\question\\q14\\Q012.java").start();
		//Process p2 = new ProcessBuilder("explorer.exe", "D\\class\\java").start();
		
		Process p3 = new ProcessBuilder("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs").start();
	}	
	
}
