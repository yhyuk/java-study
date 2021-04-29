package com.test.question.q27;

import java.io.File;
import java.util.ArrayList;
public class Q007 {
	
	public static void main(String[] args) {
		
		//D:\class\java\파일_디렉토리_문제\동일 파일\MusicA
		//D:\class\java\파일_디렉토리_문제\동일 파일\MusicB
		String pathA = "D:\\class\\java\\파일_디렉토리_문제\\동일 파일\\MusicA";
		String pathB = "D:\\class\\java\\파일_디렉토리_문제\\동일 파일\\MusicB";
		
		File dirA = new File(pathA);
		File dirB = new File(pathB);
		
		File[] listA = dirA.listFiles();
		File[] listB = dirB.listFiles();
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println("■■■■■■■■■■■■■ 중복된노래 ■■■■■■■■■■■■■");
		for (File fileA : listA) {
			for (File fileB : listB) {
				if (fileA.getName().equals(fileB.getName())) {
					list.add(fileA.getName());
					System.out.println(fileA.getName());
				} 
			}
		}
		System.out.println();
		System.out.println();

		System.out.println("■■■■■■■■■■■■■ 중복없는 A ■■■■■■■■■■■■■");
		for (File fileA : listA) {
			boolean isExist=false;
			for (String name : list) {
				if (fileA.getName().equals(name)) {
					isExist = true;
				}
			}
			if (!isExist) {
				System.out.println(fileA.getName());
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.println("■■■■■■■■■■■■■ 중복없는 B ■■■■■■■■■■■■■");
		for (File fileB : listB) {
			boolean isExist=false;
			for (String name : list) {
				if (fileB.getName().equals(name)) {
					isExist = true;
				}
			}
			if (!isExist) {
				System.out.println(fileB.getName());
			}
		}		
	}

}
