package Review.Lessons.Flow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int input;
		
		System.out.print("숫자를 하나 입력하세요 : ");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		input = Integer.parseInt(reader.readLine());
		
		if (input==0) {
			System.out.println("입력하신 숫자는 0 입니다.");
		}
		
		if (input!=0) {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d입니다.", input);
		}
		
	}
	
}
