package com.test.java.collection;

public class Ex64_ArrayList {
	
	public static void main(String[] args) {
		
		//Ex_ArrayList.java
		
		MyList list = new MyList();
		
		System.out.println(list);
		
		list.add(100);
		System.out.println(list); //배열 초기 4개
		list.add(200);
		System.out.println(list);
		list.add(300);
		System.out.println(list);
		list.add(400);
		System.out.println(list);
		
		list.add(500);
		System.out.println(list); //배열 2배 증가 -> 8개
		list.add(600);
		System.out.println(list);
		list.add(700);
		System.out.println(list);
		list.add(800);
		System.out.println(list);
		
		list.add(900);
		System.out.println(list); //배열 2배 증가 -> 16개
		
		System.out.println("list.get(0) : " + list.get(0));
		System.out.println("list.get(0) : " + list.get(3));
		System.out.println("list.get(0) : " + list.get(5));
		
		//for (int i=0; i<16; i++) {
		//	System.out.println(list.get(i));
		//} 
		//System.out.println(list.get(20)); 	//문제발생1 - 실제 방크기보다 훨씬 커짐.
		
		System.out.println("size: " + list.size());
		
		list.set(0, 1234);
		System.out.println(list);
		list.set(8, 9000);
		System.out.println(list);
		System.out.println(list.size()); //방에 들어있는 데이터 개수 : 9개

		//만약 빈방을 건너뛰고, 값을 넣는다면? 방 개수(index)가 똑같이 9개임.. 
		//list.set(14, 10000);
		System.out.println(list);
		//System.out.println(list.size()); //문제발생2 - 방에 들어있는 데이터 개수 : 9개 
		
		list.remove(8);
		System.out.println(list);
		list.add(900);
		
		list.add(5,5);
		System.out.println(list);
		
		list.add(5,5);
		list.add(5,5);
		list.add(5,5);
		list.add(5,5);
		list.add(5,5);
		list.add(5,5);
		list.add(5,5);
		System.out.println(list);
		
		
		list.check();
		System.out.println(list); //개발 + 디버깅 -> 출력결과는 개발자만 볼 수 있음
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println(list);
		list.trimToSize();
		System.out.println(list);
	}
}

class MyList {
	
	private int[] list; //내부배열 
	private int index; //현재 데이터를 넣을 방의 위치
	
	public MyList() {
		this.list = new int[4]; //초기 배열 크기
		this.index = 0; //처음 넣은 방 번호
	}
	
	//추가하기(Append)
	public void add(int n) {
		
		//1. 방의 갯수 확인 -> 2배로 늘리기
		
		check();
		this.list[this.index] = n;
		this.index++;
	}
	
	public void check() {
		if (this.index >= this.list.length) {
			
			int[] temp = new int[this.list.length*2]; //현재크기의 2배
			
			//깊은 복사(바꿀 배열 길이만큼 반복)
			for (int i=0; i<this.list.length; i++) {
				temp[i] = this.list[i];
			}
			
			this.list = temp; //배열 교체
			
		}
	}
	
	@Override
	public String toString() {
		
		//toString을 한번 작성해두면 나중에 개발이 수월해짐
		//-> 직접 눈으로 확인 가능
		
		// 개발자용
		String temp = "[";
		for(int n : this.list) {
			temp += String.format("%d,", n);
		}
		temp = temp.substring(0, temp.length()-1);
		temp += "]";
		
		return String.format("length: %d\nindex: %d\n%s\n"
							, this.list.length
							, this.index
							, temp);
		
		
		//배포용 버전
		/*
		String temp = "[";
		for(int i=0; i <this.list.length;) {
			temp += String.format("%d,", i);
		}
		temp = temp.substring(0, temp.length()-1);
		temp += "]";
		
		return String.format("length: %d\nindex: %d\n%s\n"
							, this.list.length
							, this.index
							, temp);
		*/
		
	}
	
	//가져오기(get)
	public int get(int index) {
		
		if (index >= 0 && index < this.index) { //문제해결1 - 실제방크기 범위 벗어나면 예외처리
			return this.list[index];
		} else {
			throw new IndexOutOfBoundsException(); //예외 던지기
		}
		
	}
	
	//수정하기
	public void set(int index, int n) {
		
		if (index >= 0 && index < this.index) { //문재해결2 - 빈방을 무시하고 건너뛰고 생성 X
			this.list[index] = n;
		} else {
			throw new IndexOutOfBoundsException(); 
		}
		
	}
	
	
	//현재 요소 개수 반환
	// - 배열의 길이(X)
	// - 배열의 길이와 상관없이 넣은 데이터의 개수(O)
	public int size() {
		return this.index;
	}
	
	public void remove(int index) {
		
		if (index >= 0 && index < this.index) { //문재해결2 - 빈방을 무시하고 건너뛰고 생성 X
			
			//좌측 시프트
			for (int i=index; i<this.index; i++) {
				this.list[i] = this.list[i+1];
			}
		} else {
			throw new IndexOutOfBoundsException(); 
		}
		
		this.index--; //***요소 하나 제거 됬으니 그 다음 방 번호도 하나 감소
		
	}
	
	public void add(int index, int n) {
		
		check();
		
		if (index >= 0 && index < this.index) { //문재해결2 - 빈방을 무시하고 건너뛰고 생성 X
			
			//우측 시프트
			for (int i=this.index-1; i>=index; i--) {
				this.list[i+1] = this.list[i];
			}
			
			//비어있는 방에 새로운 값을 대입
			this.list[index] = n;
			this.index++;
			
		} else {
			throw new IndexOutOfBoundsException(); 
		}
		
	}
	
	public int indexOf(int n) {
		
		for (int i=0; i<index; i++) {
			 if (this.list[i] == n) {
				 return i;
			 }
		}
		
		return -1;
	}
	
	public int lastIndexOf(int n) {
		
		for (int i=this.index-1; i>=0; i--) {
			 if (this.list[i] == n) {
				 return i;
			 }
		}
		
		return -1;
	}
	
	public void clear() {
		
		this.index = 0;
	}
	
	//길어진 배열을 데이터 개수만큼 줄이기
	public void trimToSize() {
		
		//현재 길이 -> size
		int[] temp = new int[this.index]; //현재 데이터 개수만큼의 길이를 가지는 배열
		
		for (int i=0; i<temp.length; i++) {
			temp[i] = this.list[i];
		}
		
		this.list = temp; //짧은 배열로 바꾸기
	}
	
	//비어있는지 확인 
	public boolean isEmpty() {
		return this.index == 0 ? true : false;
	}
	
	
	
	
}


