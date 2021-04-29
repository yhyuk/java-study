package Review.Lessons.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//ArrayEx 섞기(shuffle)
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 입력 : ");
		int cnt = Integer.parseInt(reader.readLine());
		
		
		int[] ball = new int[cnt];
		
		for(int i=0; i<ball.length; i++) {
			
			ball[i] = i+1; 
		}
		
		int temp = 0; 
		
		for(int i=0; i<ball.length; i++) {
			
			temp = (int)(Math.random() * cnt) +1; 
			ball[i] = temp;
			
			for(int j=0;j<i;j++) {
				if(ball[j] == temp) {
					i--;
					break;
				}
			}
			
		}
		
		
		for(int i=0; i<ball.length; i++) {
			System.out.printf("ball[%d]=%d\n", i, ball[i]);
		}
		
		
		
		
		//shuffle1();
		//shuffle2();
		
	}
	
	public static void shuffle1() {
		
		int[] numArr = new int[10];
		
		int max = numArr[0];
		int min = numArr[0];
		
		for (int i=0; i<numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for (int i=0; i<numArr.length; i++) {
			int n = (int) (Math.random() * 10) + 1; // 0~9
			int tmp = numArr[i];
			numArr[i] = numArr[n];
			numArr[n] = tmp;
		}
		
		for (int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] + ", ");
		}
		
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
		
	}
	
	public static void shuffle2() {
		
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++) {
			
			ball[i] = i+1; // ball[0]에 1저장됨
		}
		
		int temp = 0; //두 값을 바꾸는데 사용할 임시변수
		int j = 0; //임의의 값을 얻어서 저장할 변수
		
		//배열의 i번째 요소와 임시의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
		//0번째부터 5번째 요소까지 모두 6개만 바꾼다.
		
		for(int i=0; i<6; i++) {
			
			j = (int)(Math.random() *45); //0~44
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
			
		}
		
		//배열 ball의 앞에서부터 6개의 요소를 출력한다.
		
		for(int i=0; i<6; i++) {
			System.out.printf("ball[%d]=%d\n", i, ball[i]);
		}
		
	}
	
}
