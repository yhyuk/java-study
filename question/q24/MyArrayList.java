package com.test.question.q24;

import java.util.Arrays;

public class MyArrayList {
	
	private String[] list;
	private int index; //*** 중요한 역할(요소가 들어갈 방의 번호)
	
	public MyArrayList() {
		this.list = new String[4];
		this.index = 0;
	}
	
	public int size() { return this.index; }
	public String get(int index) { return this.list[index]; }
	public void set(int index, String value) { list[index] = value; }
	
	public void add(String s) {
		
		if (this.index >= this.list.length) {
			String[] temp = new String[this.index*2];
			
			for(int i=0; i<this.list.length; i++) {
				temp[i] = this.list[i];
			}
			
			this.list=temp;
		}
		
		this.list[this.index] = s;
		this.index++;
	}
	
	public void add(int index, String value) { 
		
		if (this.index >= this.list.length) {
			String[] temp = new String[this.index*2];
			
			for(int i=0; i<this.list.length; i++) {
				temp[i] = this.list[i];
			}
			
			this.list=temp;
		}
		
		for(int i=this.index; i>index; i--) {
			list[i] =list[i-1];
		}
		
		list[index] = value;
		this.index++;
	}
	
	public void remove(int index) {
		
		for(int i=index; i<this.index-1; i++) {
			list[i] = list[i+1];
		}
		this.index--;
	}

	public int indexOf(String value) {
		
		for(int i=0; i<this.index; i++) {
			if(value.equals(list[i])) {
				return i;
			}
		} 
		
		return -1;
	}
	
	public int lastIndexOf(String value) {
		
		for(int i=this.index-1; i>=0; i--) {
			if(value.equals(list[i])) {
				return i;
			}
		} 
		
		return -1;
	}
	
	public void clear() {
		
		for(int i=0; i<this.index; i++) {
			list[i] = null;
		}
		
		this.index = 0;
	}
}
