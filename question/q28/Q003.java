package com.test.question.q28;

import java.io.BufferedReader;
import java.io.FileReader;

public class Q003 {
	
	public static void main(String[] args) {
		
		/*
		 *  파일내 성적 확인 후 합격자/불합격자 출력
		 *  합격조건: 3과목 평균 60점이상
		 *  과락조건: 1과목 40점미만
		 *  
		 */
		
		
		String data = "D:\\class\\java\\파일_입출력_문제\\성적.dat";
		String name;
		
		int kor=0, eng=0, math=0;
		int avg=0;
		
		String ok = "";
		String no = "";
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(data));
			
			String temp;
			while ((temp = reader.readLine()) != null) {
				String[] str = temp.split(",");
				name = str[0];
				kor = Integer.parseInt(str[1]);
				eng = Integer.parseInt(str[2]);
				math = Integer.parseInt(str[3]);
				avg = (kor+eng+math)/3;
				
				if (avg >= 60 && kor >= 40 && eng >=40 && math >= 40) {
					ok += str[0] + "\n";
				} else {
					no += str[0] + "\n";
				}
			         
			}
			reader.close();
		} catch (Exception e) {}
		
		System.out.println("[합격자]");
		System.out.println(ok);
		System.out.println("[불합격자]");
		System.out.println(no);
	}

}
