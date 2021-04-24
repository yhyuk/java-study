package com.test.question.q17;

public class MainClass {
	
	public static void main(String[] args) throws Exception {
		

		Book b1 = new Book();
		
		b1.setTitle("Java의 정석");
		b1.setAuthor("홍길동");
		b1.setPublisher("달나라");
		b1.setIsbn("ISBN 입니다.");
		b1.setPage(120);
		b1.setPrice(350000);
		
		System.out.println(b1.info());

		
	}

}
