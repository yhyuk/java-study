package Review.Lessons.Array;

public class ArrayEx4 {

	public static void main(String[] args) {
		
		//ArrayEx 최대값, 최소값 구하기
		
		int[] score = {79, 80, 91, 33 , 100, 55, 95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i<score.length; i++) {
			
			if(score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
			
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	
	
}
