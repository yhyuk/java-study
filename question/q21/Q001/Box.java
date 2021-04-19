package com.test.question.q21.Q001;

public class Box {
	
	private Macaron[] list = new Macaron[10];
	
	
	public void cook() {
		
		String[] color = {"red", "blue", "yellow", "white", "pink", "purple", "green", "black"};

		for(int i=0; i<this.list.length; i++) {
			list[i] = new Macaron();
			
			list[i].setSize((int)(Math.random()*11) + 5); // 5~15 랜덤크기
			list[i].setColor(color[(int)(Math.random()*8)]); // 랜덤색깔
			list[i].setThickness((int)(Math.random()*20) +1); // 1~20 랜덤두께
		}
		System.out.printf("마카롱을 %d개 만들었습니다.\n", this.list.length);
	}
	
	public void check() {
		
		int good = 0; //합격
		for(int i=0; i<this.list.length; i++) {
			if(	(list[i].getSize() >= 8 && list[i].getSize() <= 14) && // 8 <= size <= 14
				(!(list[i].getColor()).equals("black")) && // "black"이 아닐때
				(list[i].getThickness() >= 3 && list[i].getThickness() <= 18) ) { //3 <= thick <= 18
				good++; 
			}
		}
		
		System.out.println();
		System.out.println("[박스 체크 결과]");
		System.out.printf("QC 합격 개수 : %d\n", good);
		System.out.printf("QC 불합격 개수 : %d\n", this.list.length-good);
		System.out.println();
	}
	
	public void list() {
		
		//방법1
		System.out.println("[마카롱 목록]");
		for(int i=0; i<this.list.length; i++) {
			
			if(		(list[i].getSize() >= 3 && list[i].getSize() <= 14) && 
					(list[i].getColor()!="black") &&
					(list[i].getThickness() >= 3 && list[i].getThickness() <= 18) ) {
				
				System.out.printf("%d번 마카롱 : %dcm(%s, %dmm) : 합격\n", 
						i+1, list[i].getSize(), list[i].getColor(), list[i].getThickness());
				
			} 
			else {
				System.out.printf("%d번 마카롱 : %dcm(%s, %dmm) : 불합격\n", 
						i+1, list[i].getSize(), list[i].getColor(), list[i].getThickness());
			}
		}
		
	/*	
		  
	  	방법2
	    - 합/불 변수 선언 후 카운트로 출력
	    - 비교연산자 ||, && 이용해서 조건식 사용
	  
	    String pass = "합격";
	    String fail = "불합격";
	   
	    for (int i=0; i<this.list.length; i++) {
	         
	       if( (list[i].getColor().equals("black")) 
	             || (list[i].getSize() < 8 && list[i].getSize() > 14)
	             || (list[i].getThickness() < 3 && list[i].getThickness() > 18)) {
	          System.out.printf("%d번 마카롱 : %d (%s, %dmm) : %s\n"
	                , i+1, list[i].getSize(),list[i].getColor(),list[i].getThickness(), fail);
	            
	       } else {
	          System.out.printf("%d번 마카롱 : %d (%s, %dmm) : %s\n"
	                , i+1, list[i].getSize(),list[i].getColor(),list[i].getThickness(), pass);
	       }
	    }
		    
	 */
	}
}
