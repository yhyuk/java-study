package com.test.question.q17;

import java.util.Calendar;

public class Bugles {
	
	private int price;
	private int weight;
	private int expiration;
	private Calendar creationTime = Calendar.getInstance();
	
	// getter 읽기 list
	public int getPrice() { 
		
		//무게당 가격
		if (this.weight == 300) this.price = 850;
		else if	(this.weight == 500) this.price = 1200;
		else if	(this.weight == 850) this.price = 1950; 
		
		return this.price; 
		
	}
	
	public int getExpiration() {
		
		//무게당 유통기한
		if (this.weight == 300) this.expiration = 7;
		else if	(this.weight == 500) this.expiration = 10;
		else if	(this.weight == 850) this.expiration = 15; 
		
		Calendar now = Calendar.getInstance();
		
		//먹을 수 있는 날 = 유통기한(getExpiration) - 현재(now) - 제조시간(setCreationTime)
		long eatResult = (this.expiration * 24 * 60 * 60 * 1000 //일->초
				- (now.getTimeInMillis() - this.creationTime.getTimeInMillis())) 
				/ 1000 / 60 / 60 / 24; //초->일
		
		return (int)eatResult;
		
	}
	
	
	// setter 쓰기 list
	public void setWeight(int weight) throws Exception {
		
		if(weight == 300 || weight == 500 || weight == 850) this.weight = weight;
		else throw new Exception("잘못된 용량입니다.(300g, 500g, 850g)"); 
		
	}
	
	public void setCreationTime(String creationTime) throws Exception { 
		
		if (creationTime.length() == 10) {
			String[] dateCheck = creationTime.trim().replace(" ", "").split("-");
			this.creationTime.set(Integer.parseInt(dateCheck[0]), 
								Integer.parseInt(dateCheck[1])-1, 
								Integer.parseInt(dateCheck[2]));
		} else throw new Exception("날짜 형식을 YYYY-MM-DD 형식으로 입력하세요.");
		
	}
	

	public void eat() {
		
		if(getExpiration() < 0) System.out.println("유통기한이 지나 먹을 수 없습니다.");
		else System.out.println("과자를 맛있게 먹습니다.");

	}

}
