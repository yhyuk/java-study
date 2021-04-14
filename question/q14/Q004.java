package com.test.question.q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q004 {

	public static void main(String[] args) throws IOException {
		
		//파일명 10개를 입력받아 각 확장자별 총 개수 구하기
		//확장자명 : gif, jpg, png, hwp, doc
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int gifResult = 0; 
		int jpgResult = 0; 
		int pngResult = 0;
		int hwpResult = 0; 
		int docResult = 0;
		
		for (int i=0; i<10; i++) {
			
			System.out.print("파일명 : ");
			String fileName = reader.readLine();
			
			int pos = fileName.lastIndexOf(".");
			String ext = fileName.substring(pos+1);
			
			switch(ext) {
				case "gif":
					gifResult+=1;
					break;
				case "jpg":
					jpgResult+=1;
					break;
				case "png":
					pngResult+=1;
					break;
				case "hwp":
					hwpResult+=1;
					break;
				case "doc":
					docResult+=1;
					break;
			}

		}
		System.out.println("gif : " + gifResult + "개");
		System.out.println("jpg : " + jpgResult + "개");
		System.out.println("png : " + pngResult + "개");
		System.out.println("hwp : " + hwpResult + "개");
		System.out.println("doc : " + docResult + "개");
		
		
	}
}
