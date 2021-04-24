package com.test.question.q18;

public class MainClass {
	
	public static void main(String[] args) throws Exception {
		

		Note note = new Note();
		
		note.setSize("A5");
		note.setColor("흰색");
		note.setPage(100);
		note.setOwner("김영혁이");
		System.out.println(note.info());

	}

}
