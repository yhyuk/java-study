package Review.Lessons.InputOutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex01_IO {
	
	public static void main(String[] args) {
		
		//ByteArrayInputStream , ByteArrayOutputStream 이용해서
		//byte배열 inSrc를 outSrc로 복사하기
		
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data = 0;
		while((data = input.read()) != -1) {
			output.write(data);
		}
		
		outSrc = output.toByteArray(); //스트림의 내용을 byte배열로 반환한다.
		
		System.out.println("Input Source :" + Arrays.toString(inSrc));
		System.out.println("Output Source :" + Arrays.toString(outSrc));
	}

}
