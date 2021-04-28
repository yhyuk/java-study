package com.test.question.q27;

import java.io.*;
public class Q003 {
	
	public static void main(String[] args) throws IOException {
		
		//D:\class\java\file\AAA\test.txt
		//D:\class\java\file\BBB\test.txt
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("파일 이동을 실행합니다.");
		
		
		System.out.print("이동시킬 파일 경로 입력: ");
		String path = reader.readLine();
		File file = new File(path);
		
		System.out.print("이동할 파일 경로 입력: ");
		String path2 = reader.readLine();
		File file2 = new File(path2);
		
		if (file.exists()) {			
			if (file2.exists()) {
				
				System.out.println("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n)");
				char temp = (char)reader.read();
				
				if(temp == 'y' || temp == 'Y') {
					file2.delete();
					file.renameTo(file2);
					System.out.println("파일을 덮어썼습니다.");
					
				} else {
					System.out.println("작업을 취소합니다.");
				}
				
			} else {
				System.out.println("파일을 이동하였습니다.");
				file.renameTo(file2);
			}
		} else {
			System.out.println("파일이 없습니다.");
		}
	}
}
