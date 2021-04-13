package com.test.question.q14;

public class Q005 {
	
	public static void main(String[] args) {
		
		//특정 단어가 문장내에 총 몇회있는지?
		
		
		
		String content = "안녕~ 길동아~ 잘가~ 길동아~";
		String word = "길동";
		
		
		int search = -1; // 찾을 위치
		int cnt = 0;
		while ((search = content.indexOf(word, search+1)) >= 0) {
		      cnt++;
		}

		System.out.printf("'길동'을 총 %d회 발견했습니다\n", cnt);

		
	}

}
