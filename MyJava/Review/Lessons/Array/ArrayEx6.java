package Review.Lessons.Array;

import java.util.Arrays;

public class ArrayEx6 {

	public static void main(String[] args) {
		
		//ArrayEx 임의의 값으로 배열 채우기
		
		int[] code = { -4, -2, -1, 3, 39, -10};
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int tmp = (int)(Math.random() * code.length);
			arr[i] = code[tmp];
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
}
