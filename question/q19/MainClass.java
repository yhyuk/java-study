package com.test.question.q19;

public class MainClass {
	
	public static void main(String[] args) throws Exception {
		
		Bugles snack = new Bugles();
		snack.setWeight(500);
		snack.setCreationTime("2021-04-01");
		System.out.println("가격: " + snack.getPrice() + "원");
		System.out.println("유통기한이 " + snack.getExpiration() + "일 남았습니다.");
		
		snack.eat();
	}

}
