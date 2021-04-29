package Review.Lessons.InputOutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex04_IO {
	
	public static void main(String[] args) {
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		try {
			
			//available() ?
			//블락킹(blocking)없이 읽어 올 수 있는 바이트의 수를 반환
			//블락킹? 데이터를 읽어 올 때 데이터를 기다리기 위해 멈춰있는 것
			while(input.available() > 0) {
				int len = input.read(temp); //읽어 온 데이터의 개수를 반환한다.
				output.write(temp, 0, len); //읽어 온 만큼만 write한다.
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		outSrc = output.toByteArray();
		
		System.out.println("Input Soruce : " + Arrays.toString(inSrc));
		System.out.println("temp         : " + Arrays.toString(temp));
		System.out.println("Output Source: " + Arrays.toString(outSrc));
	}

}
