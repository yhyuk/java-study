package Review.Lessons.Flow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowEx9 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("별찍기 원하는 라인 수");
		int num = Integer.parseInt(reader.readLine());
		
		for (int i=0; i<num; i++) {
			
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
