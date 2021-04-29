package Review.Lessons.Flow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowEx7 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("당신의 주민번호를 입력하세요.");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String regNo = reader.readLine();
		 
		char gender = regNo.charAt(7); // 입력받은 번호의 8번째 문자를 gender에 저장
		
		switch(gender) {
			case '1': case '3':
				System.out.println("당신은 남자입니다.");
				break;
			case '2': case '4':
				System.out.println("당신은 여자입니다.");
				break;
			default:
				System.out.println("유요하지 않은 주민등록번호입니다.");
		
		}
		
	}
	
}
