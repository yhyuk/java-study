package com.test.question.q27;

import java.io.File;
import java.util.ArrayList;

public class Q009 {
	
	private static ArrayList<File> arr = new ArrayList<File>();
	public static void main(String[] args) {
		
		
		
		//D:\class\java\파일_디렉토리_문제\크기 정렬
		
		String path = "D:\\class\\java\\파일_디렉토리_문제\\크기 정렬";
		File dir = new File(path);
		
		countFile(dir);
		bubbleSort();
		
		System.out.println("[파일명]\t\t\t[크기]\t[폴더]");
		
		for (int i=0; i<arr.size(); i++) {
			String dirName = arr.get(i).getPath();
			dirName = dirName.substring(0, dirName.lastIndexOf("\\"));
			dirName = dirName.substring(dirName.lastIndexOf("\\")+1);
			System.out.printf("%-24s\t%dKB\t%s\n"
					, arr.get(i).getName()
					, arr.get(i).length()/1024
					, dirName);
		}
		
	}
	
	public static void countFile(File dir) {
		
		File[] list = dir.listFiles();
		for (File sub : list) {
			if (sub.isFile()) arr.add(sub);
		}
		
		for (File sub : list) {
			if (sub.isDirectory()) countFile(sub);  
		}
	}
	
	public static void bubbleSort() {
		for (int i=0; i<arr.size()-1; i++) {
			for (int j=0; j<arr.size()-(i+1); j++) {
				if(arr.get(j).length() < arr.get(j+1).length())	{
					File temp = arr.get(j);
					arr.set(j, arr.get(j+1));
					arr.set(j+1, temp);
				}
					
			}
		}
	}
}

