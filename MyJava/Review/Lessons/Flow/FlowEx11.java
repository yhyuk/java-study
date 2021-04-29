package Review.Lessons.Flow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowEx11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum=0;
		System.out.print("숫자를 입력하세요 : ");
		int num = Integer.parseInt(reader.readLine());
		
		while(num!=0) {
			
			
			sum += num%10; //num을 10으로 나눈 나머지를 sum에 더함
			System.out.printf("sum = %3d num=%d\n", sum, num);
			
			num /= 10; //num을 10으로 나눈 값을 다시 num에 저장
			
		}
		
		System.out.println("각 자리수의 합: " + sum);
	}
	
}
