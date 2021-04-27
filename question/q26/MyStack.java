package com.test.question.q26;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack {
	
	private String[] list;
	private int index;
	
	public MyStack() { 
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
	
	public void push(String value) {
		
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

	public String pop() {
		
		if (this.index == 0) {
			throw new EmptyStackException();
		}
		String temp = this.list[this.index-1];
		
		this.list[this.index-1] = null;
		
		this.index--;
		return temp;
	}
	
	public int size() {
		return this.index;
	}
	
	public String peek() {
		return this.list[this.index-1];
	}
	
	public void clear() {
		
		for (int i=0; i<this.index; i++) {
			this.list[i] = null;
		}
		this.index = 0;
	}
	
	//필요없는방 지우기
	public void trimToSize() {
		
		String[] temp = new String[this.index];
		
		for (int i=0; i<temp.length; i++) { 
			temp[i] = this.list[i];
		}
		this.list = temp;
		
	}
}
