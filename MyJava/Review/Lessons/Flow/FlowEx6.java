package Review.Lessons.Flow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowEx6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요!!!");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int user = Integer.parseInt(reader.readLine());
		String user_game = " ";
		
		int com = (int) (Math.random() *3) + 1; // 1, 2, 3중 하나가 com에 저장됨 
		String com_game = " ";

		switch(user) {
			case 1:
				user_game = "가위";
				break;
			case 2:
				user_game = "바위";
				break;
			case 3:
				user_game = "보";
				break;
		}
		
		switch(com) {
		case 1:
			com_game = "가위";
			break;
		case 2:
			com_game = "바위";
			break;
		case 3:
			com_game = "보";
			break;
	}
		
		
		System.out.printf("당신은 %s 입니다.\n", user_game);
		System.out.printf("컴퓨터는 %s 입니다.", com_game);
		
		
		switch(user-com) {
			case 2: case -1:
				System.out.println("당신이 졌습니다.");
				break;
			case 1: case -2:
				System.out.println("당신이 이겼습니다.");
				break;
			case 0:
				System.out.println("비겼습니다.");
				break;
		}
	}
	
}
