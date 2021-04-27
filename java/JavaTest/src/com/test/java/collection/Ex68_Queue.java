package com.test.java.collection;

import java.util.Arrays;

public class Ex68_Queue {
	
	public static void main(String[] args) {
		
		//Ex68_Queue.java
		
		MyQueue queue = new MyQueue();
		
		System.out.println(queue);
		
		queue.add("빨강");
		System.out.println(queue);
		
		queue.add("파랑");
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
		
	}//main

}

class MyQueue {
	
	private String[] list;
	private int index;
	
	public MyQueue() {
		this.list = new String[4];
		this.index = 0;
	}
	
	@Override
	public String toString() {
		return String.format("length: %d\nindex: %d\n%s\n"
								, this.list.length
								, this.index
								, Arrays.toString(this.list));
	}
	
	public void add(String value) {
		
		doubling();
		this.list[this.index] = value;
		this.index++;
	}

	private void doubling() {

		if (this.index >= this.list.length) {
			String[] temp = new String[this.list.length *2];
			for (int i=0; i<this.list.length; i++) {
				temp[i] = this.list[i];
			}
			this.list = temp;
		}
		
	}
	
	public String poll() {
		
		//부정 전처리 - 잘못된 상황을 먼저 발견해서 업무 중지
		if (this.index == 0) {
			return null;
		}
		
		String temp = this.list[0]; // first 공 미리꺼내기
		
		//좌측 시프트
		for (int i=0; i<this.index; i++) {
			this.list[i] = this.list[i+1];
		}
		
		this.index--;
		return temp;
		
		//위와 아래의 차이? 어떤게 더 보기 좋은가?
		//밑에는 if 조건안에 비지니스 코드와 예외코드가 있는데 가독성이 떨어짐
		//위에는 필요한 조건은 먼저 뺌으로써 가독성이 더좋다.
		//위에것이 더 이용 많이 하긴함
		
		/*
		if (this.index == 0) {
			
			//업무 블럭
			
			
			String temp = this.list[0]; // first 공 미리꺼내기
			
			//좌측 시프트
			for (int i=0; i<this.index; i++) {
				this.list[i] = this.list[i+1];
			}
			
			this.index--;
			return temp;
		} else {
			return null;
		}
		*/
		
	}
	
	public int size() {
		return this.index;
	}
	
	public String peek() {
		return this.list[0];
	}
	
	public void clear() {
		this.index = 0;
	}
	
	
}
