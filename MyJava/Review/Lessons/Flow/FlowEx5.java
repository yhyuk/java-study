package Review.Lessons.Flow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowEx5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.print("현재 월을 입력하세요 : ");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int month = Integer.parseInt(reader.readLine());
		
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("현재의 계절은 봄입니다.");
				break;
			
			case 6: case 7: case 8:
				System.out.println("현재의 계절은 여름입니다.");
				break;
				
			case 9: case 10: case 11: 
				System.out.println("현재의 계절은 가을입니다.");
				break;
			
			default: //caes 12: case 1: case 2:
				System.out.println("현재의 계절은 겨울입니다.");
			
		}
		
	}
	
}
