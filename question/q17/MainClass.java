package com.test.question.q17;

public class MainClass {
	
	public static void main(String[] args) throws Exception {
		
		/*
		Book b1 = new Book();
		
		b1.setTitle("Java의 정석");
		b1.setAuthor("홍길동");
		b1.setPublisher("달나라");
		b1.setIsbn("ISBN 입니다.");
		b1.setPage(120);
		b1.setPrice(350000000);
		
		System.out.println(b1.info());
		*/
		
		/*
		Note note = new Note();
		
		note.setSize("A5");
		note.setColor("흰색");
		note.setPage(100);
		note.setOwner("김영혁바보멍청이");
		System.out.println(note.info());
		*/
		
		Bugles snack = new Bugles();
		snack.setWeight(500);
		snack.setCreationTime("2021-04-01");
		System.out.println("가격: " + snack.getPrice() + "원");
		System.out.println("유통기한이 " + snack.getExpiration() + "일 남았습니다.");
		
		snack.eat();
	}

}
