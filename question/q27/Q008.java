package com.test.question.q27;

import java.io.*;

public class Q008 {
	
	private static int count = 0;
	private static int dirCount = 0;
	private static long size = 0;
	public static void main(String[] args) {
		
		/*
		 *  D:\class\java\파일_디렉토리_문제\폴더 삭제\delete
		 *  - delete 폴더삭제 (안에 폴더/파일까지 전부 다)
		 *  - 크기:25.2KB (25,833 바이트)
		 *  - 내용:파일 6, 폴더 4
		 */
		
		String path = "D:\\class\\java\\파일_디렉토리_문제\\폴더 삭제";
		
		File dir = new File(path);
		
		if (dir.exists()) {
			countFile(dir);
			System.out.printf("삭제된 폴더: %d개\n", dirCount-1);
			System.out.printf("삭제된 파일: %d개\n", count);
			System.out.printf("삭제된 폴더 크기: %.0fKB\n"
								, (double)size/1024);
		}
	}
	
	public static void countFile(File dir) {
		
		File[] list = dir.listFiles();
		for (File sub : list) {
			if (sub.isFile()) {
				size += sub.length();
				count++;
				sub.delete();
			}
		}
		
		for (File sub : list) {
			if (sub.isDirectory()) {
				countFile(sub); //재귀 호출
			}
			sub.delete();
		}
		dirCount++;
	}

}
