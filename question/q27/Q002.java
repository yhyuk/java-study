package com.test.question.q27;
import java.io.*;
public class Q002 {
	
	public static void main(String[] args) throws IOException {
		
		//D:\class\java\JavaTest\src\com\test\java
		//.java
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("폴더 선택: ");
		String path = reader.readLine();
		
		System.out.print("파일 확장자: ");
		String ext = reader.readLine();
		
		File dir = new File(path);
		File[] list = dir.listFiles();
		
		if (dir.exists()) {
			for (File file : list) {
				if(file.getName().endsWith(ext) 
				|| file.getName().endsWith(ext.toUpperCase()) ) {
					System.out.println(file.getName());
				}
			}
		} else {
			System.out.println("폴더 없음");
		}
	}
}
