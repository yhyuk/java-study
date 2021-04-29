package Review.Lessons.Operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperatorEx10 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		char ch = ' ';
		System.out.print("문자를 하나 입력하세요 : ");
		String word = reader.readLine();
		ch = word.charAt(0);
		
		if('0' <= ch && ch <= '9') {
			System.out.print("입력하신 문자는 숫자입니다.\n");
		}
		
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.print("입력하신 문자는 영문자입니다.\n");
		}
		
		
	}
}
