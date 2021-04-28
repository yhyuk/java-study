package com.test.question.q27;

import java.io.File;

public class Q006 {
	
	public static void main(String[] args) {
		
		//파일크기 0byte인 파일삭제
		//D:\class\java\파일_디렉토리_문제\파일 제거
		
		String path = "D:\\class\\java\\파일_디렉토리_문제\\파일 제거";
		
		File dir = new File(path);
		File[] list = dir.listFiles();
		int cnt = 0;
		
		for (File file : list) {
			if (file.length() == 0) {
				file.delete();
				cnt++;
			} 
		}
		System.out.printf("총 %d개의 파일을 삭제했습니다.", cnt);
	}
}
