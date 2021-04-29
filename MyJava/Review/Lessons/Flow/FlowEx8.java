package Review.Lessons.Flow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowEx8 {

	public static void main(String[] args) throws IOException {
		
		int score = 0;
		char grade = ' ';
		
		System.out.print("당신의 점수를 입력하세요.");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String tmp = reader.readLine();
		score = Integer.parseInt(tmp);
		
		switch(score/10) {
			case 10: case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			default:
				grade = 'F';
		}
		
		System.out.printf("당신의 학점은 %c 입니다.", grade);
		
		for(int i=1, j=1; i<=5; i++) { 
			
		}
		
	}
	
}
