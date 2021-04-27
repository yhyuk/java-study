package com.test.question.q26;

public class MyQueue {
	
	private String[] list;
	private int index;
	
	public MyQueue() {
		this.list = new String[4];
		this.index = 0;
	}
	
	public void add(String value) {

		doubling();
		this.list[this.index] = value;
		this.index++;
		
	}
	
	private void doubling() {
		
		if (this.index >= this.list.length) {
			String[] temp = new String[this.list.length*2];
			for (int i=0; i<this.list.length; i++) {
				temp[i] = this.list[i];
			}
			this.list = temp;
		}
	}

	public String poll() {
		
		if (this.index == 0) {
			return null;
		}
		
		String temp = this.list[0];
		
		for(int i=0; i<this.index; i++) {
			this.list[i] = this.list[i+1];
		}
		
		this.index--;
		return temp;
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
	
	public void trimToSize() {
		
		String[] temp = new String[this.index];
		for (int i=0; i<temp.length; i++) {
			temp[i] = this.list[i];
		}
		this.list = temp;
	}

}
