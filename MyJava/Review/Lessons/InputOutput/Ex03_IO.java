package Review.Lessons.InputOutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex03_IO {
	
	public static void main(String[] args) {
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		System.out.println("Input Source: " + Arrays.toString(inSrc));
		
		
		try {
			
			while(input.available() > 0) {
				input.read(temp);
				output.write(temp);
				
				outSrc = output.toByteArray();
				
				System.out.println("temp         : " + Arrays.toString(temp));
				System.out.println("Output Source: " + Arrays.toString(outSrc));
			}
			
		} catch (Exception e) {}
		
		
	}


}
