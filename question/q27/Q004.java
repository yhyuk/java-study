package com.test.question.q27;

import java.io.File;

public class Q004 {
	
	public static void main(String[] args) {
		
		//D:\class\java\파일_디렉토리_문제\음악 파일
		
		
		String path = "D:\\class\\java\\파일_디렉토리_문제\\음악 파일";
		File dir = new File(path);
		File[] music = dir.listFiles();
		
		//방법1
		for(int i=0; i<music.length; i++) {
			File file = music[i];
			path = String.format("D:\\class\\java\\파일_디렉토리_문제\\음악 파일\\[%03d]%s", i+1, file.getName());
			
			File file2 = new File(path);
			file.renameTo(file2);
		}
		
		//방법2 향상된 for문 사용, count
	    if(dir.exists()) {
	          
	        File[] list = dir.listFiles(); 
	        int count = 1;
	          
	        for(File sub : list) {
	           if(sub.isFile()) {
	        	   System.out.printf("[%03d] %s\n", count, sub.getName());
	           }
	            count++;
	         }
	     }
	}
}
