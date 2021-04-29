package Review.Lessons.Flow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowEx4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		char grade = ' ', opt = '0';	
	
		System.out.print("점수를 입력해주세요 : ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int score = Integer.parseInt(reader.readLine());
		
		System.out.printf("당신의 점수는 %d 입니다.\n", score);
		
		if (score >= 90) { // score가 90점보다 같거나 크면 A학점
			grade = 'A';
			if (score >= 98) { // 90점 이상 중에서도 98점 이상 : A+
				opt = '+';
			} else if (score < 94) { // 90점 이상 94점 미만은 A-
				opt = '-';
			}
		} else if (score >= 80) { // score가 80점 보다 크거나 같으면 B학점
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84) {
				opt = '-';
			}
		} else {
			grade = 'C';
		}
		
		
		System.out.printf("당신의 합은 %c%c입니다.\n", grade, opt);
	}
	
	
}
