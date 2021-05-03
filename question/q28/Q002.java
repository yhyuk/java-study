package com.test.question.q28;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q002 {
	
	public static void main(String[] args) {
		
		String data = "D:\\class\\java\\파일_입출력_문제\\숫자.dat";
		String data2 = "D:\\class\\java\\파일_입출력_문제\\숫자_변환.dat";
		
		String line, cLine;
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(data));
			BufferedWriter writer = new BufferedWriter(new FileWriter(data2));
	
			while ((line = reader.readLine()) != null) {
				cLine = line.replace("0", "영").replace("1", "일").replace("2", "이")
							.replace("3", "삼").replace("4", "사").replace("5", "오")
							.replace("6", "육").replace("7", "칠").replace("8", "팔")
							.replace("9", "구") + "\r\n";
				writer.write(cLine);
				//System.out.println(cLine);
			}
			writer.close();
			System.out.println("변환 후 다른이름으로 저장하였습니다.");
		} catch (Exception e) {}
		
	}

}
