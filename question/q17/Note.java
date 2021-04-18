package com.test.question.q17;

public class Note {

	private String size;
	private String color;
	private int page;
	private String owner="";
	private int price;
	
	
	public void setSize(String size) throws Exception {
		
		if(size == "A3" || size == "A4" || size == "A5"
		|| size == "B3" || size == "B4" || size == "B5") this.size = size;
		else throw new Exception("잘못된 용지입니다.");
		
	}

	public void setColor(String color) throws Exception {
		
		if(color == "검정색" || color == "흰색" 
		|| color == "노란색" || color == "파란색") this.color = color;
		else throw new Exception("잘못된 색깔입니다.");
		
	}
	
	public void setPage(int page) throws Exception {
		
		//10 ~ 200페이지 이내
		if		(page >= 10 && page <= 50) this.page = page;
		else if (page <= 100) this.page = page;
		else if (page <= 200) this.page = page;
		else throw new Exception("잘못된 페이지입니다.");
		
	}
	
	public void setOwner(String owner) throws Exception { 
		
		// 2~5자 이내(한글만 가능, 필수값)
		if(owner.length() >= 2 && owner.length() <= 5) {
		
			for(int i=0; i<owner.length(); i++) {
				char c = owner.charAt(i);
				if (c < '가' || c > '힣') throw new Exception("잘못된 소유자입니다.");
			}
			
			this.owner = owner; 
			
		} else throw new Exception("잘못된 소유자입니다.");
		
	}
	
	
	public String info() {
		
		//두께당 표현
		String pageThickness = "";
		if (page >= 10 && page <= 50)  	pageThickness = "얇은";
		else if (page <= 100)  			pageThickness = "보통";
		else if (page <= 200)  			pageThickness = "두꺼운";
		
		//색깔 가격
		if (color== "검은색") this.price += 100;
		else if (color == "노란색" || color == "파란색") this.price += 200;
		
		//용지 가격
		if (size == "A3") this.price += 400;
		else if (size == "A4") this.price += 200;
		else if (size == "B3") this.price +=500;
		else if (size == "B4") this.price += 300;
		else if (size == "B5") this.price +=100;
		
		//페이지당 가격
		this.price += page*10;
		
		
		//출력
		String output = "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■";
	
		System.out.println("■■■■■■■■■■■ 노트정보 ■■■■■■■■■■■");
		if (owner.length() >= 2 && owner.length() <= 5) {
			System.out.printf("소유자: %s\n", owner);
			System.out.printf("특성 : %s %s %s노트\n" , color,  pageThickness, size);
			System.out.printf("가격 : %,d원\n", this.price + 500);
		} else {
			System.out.print("주인없는 노트\n");
		}
		
		return output;
	}
}
