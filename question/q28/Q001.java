package com.test.question.q28;

import java.io.*;
public class Q001 {
	
	public static void main(String[] args) {
		
		/*
		 *  파일내에서 특정이름을 찾아 다른이름으로 변환 후 해당파일 -> 다른이름으로 저장
		 *  '유재석' -> '메뚜기'
		 */
		
		String data = "D:\\class\\java\\파일_입출력_문제\\이름수정.dat";
		String data2 = "D:\\class\\java\\파일_입출력_문제\\이름수정_변환.dat";
		
		String line, cLine;
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(data));
			BufferedWriter writer = new BufferedWriter(new FileWriter(data2));
	
			while ((line = reader.readLine()) != null) {
				cLine = line.replace("유재석", "메뚜기") + "\r\n";
				writer.write(cLine);
				//System.out.println(cLine);
			}
			writer.close();
			System.out.println("변환 후 다른이름으로 저장하였습니다.");
		} catch (Exception e) {}
		
		
	}

}
