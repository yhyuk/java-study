package Review.Lessons.InputOutput;

import java.io.*;

public class Ex05_Buffered {
	
	public static void main(String args[]) throws IOException {
		
		try {
			
			FileOutputStream fos = new FileOutputStream("123.txt");
			//BufferedOutputStream의 버퍼크기를 5로한다.
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			//파일 123.txt에 1부터 9까지 출력한다.
			for(int i ='1'; i<='9'; i++) {
				bos.write(i);
			}
			bos.close();
			fos.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
