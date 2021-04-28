package com.test.question.q27;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
public class Q005 {
	
	public static void main(String[] args) {
		
		//D:\class\java\파일_디렉토리_문제\확장자별 카운트
		
		String path = "D:\\class\\java\\파일_디렉토리_문제\\확장자별 카운트";
		
		File dir = new File(path);
		File[] list = dir.listFiles();

		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		for(File file : list) {
			int pos = file.getName().lastIndexOf(".");
			String ext = file.getName().substring(pos+1);

			map.put(ext, 1);
		}
		System.out.println(map);
	}

}
