package com.test.question.q24;

public class MyArrayList2 {
	
	private String[] list;
	private int index;
	
	//초기공간 기본 [4]
	public MyArrayList2() {
		this.list = new String[4];
		this.index = 0;
	}
	
	//초기공간 직접 [num]
	public MyArrayList2(int num) {
		this.list = new String[num];
		this.index = 0;
	}
	
	private void sizeCheck() {
		
		//list 용량 꽉참 (이사, 깊은복사)
		if (index == list.length) {
			String[] newList = new String[list.length*2];
			for(int i=0; i<list.length; i++) { 
				newList[i] = list[i]; 
			}
			
			list = newList;
			return;
		}
		
		//list 용량의 절반 X (메모리 낭비)
		if (index < list.length / 2) {
			String[] newList = new String[list.length/2];
			for(int i=0; i<newList.length; i++) {
				newList[i] = list[i];
			}
			
			list = newList;
			return;
		}
	}
	
	//기본값
	public void add(String str) { 
		addEnd(str); 
	}
	
	//마지막에 값 추가
	public void addEnd(String str) {
		if(index == list.length) sizeCheck();
		
		list[index] = str;
		index++;
	}
	
	//첫번째에 값 추가
	public void addStart(String str) { 
		add(0,str); 
	}
	
	//중간에 값 추가
	public void add(int num, String str) {
		
		if(num < 0 || num > index) {
			throw new IndexOutOfBoundsException();
		}
		
		if (num == index) {
			addEnd(str); 
		} 
		else {
			
			if(index == list.length) { //list용량 꽉참
				sizeCheck();  
			}
			
			for(int i=index; i>num; i--) { //num 기준 한칸씩 밀기 (->) 
				list[i] = list[i-1]; 
			}
			
			list[num] = str;
			index++;
		}
	}
	
	//값 불러오기
	public String get(int num) {
		
		if(num < 0 || num >= index) {
			throw new IndexOutOfBoundsException();
		} 
		
		return list[num];

	}
	
	//값 수정
	public void set(int num, String str) {
		
		if(num < 0 || num >= index) {
			throw new IndexOutOfBoundsException();
		} 
		
		list[num] = str;
	}
	
	//값 크기
	public int size() {
		return index;
	}
	
	//값 삭제(밀기)
	public void remove(int num) {
		
		if(num < 0 || num >= index) {
			throw new IndexOutOfBoundsException();
		} 
		
		for(int i=num; i<index-1; i++) {
			list[i] = list[i+1];
		}
		
		index--;
	}	
	
	//값 찾기
	public int indexOf(String str) {
		
		for(int i=0; i<index; i++) {
			if(list[i].equals(str)) {
				return i;
			}
		}
		
		return -1;
	}
	
	//마지막값 부터 찾기
	public int lastIndexOf(String str) {
		
		for(int i=index-1; i>=0; i--) {
			if(list[i].equals(str)) {
				return i;
			}
		}
		
		return -1;
	}
	
	//list 모든 값 초기화(0)
	public void clear() {
		
		for(int i=0; i<index; i++) {
			list[i] = null;
		}
		
		index=0;
	}
	

}
