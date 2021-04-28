package com.test.question.q27;

import java.io.*;
public class Q001 {
	
	public static void main(String[] args) throws IOException {
		
		//D:\class\java\file\AAA\test.txt
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("파일 경로: ");
		String path = reader.readLine();
		
		File file = new File(path);
		
		if (file.exists()) {
			System.out.printf("파일명: %s\n종류: %s\n파일크기: %dB, %dKB, %dMB, %dGB, %dTB"
							, file.getName()
							, path.substring(path.lastIndexOf(".")+1)
							, file.length()
							, file.length()/1024
							, file.length()/1024/1024
							, file.length()/1024/1024/1024
							, file.length()/1024/1024/1024/1024);
			
		} else {
			System.out.println("파일이 없습니다.");
		}
	}

}
