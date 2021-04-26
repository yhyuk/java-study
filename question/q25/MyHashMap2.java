package com.test.question.q25;

import java.util.Arrays;

public class MyHashMap2 {
	
	
	//Case B.
	private Entry[] list;
	private int index;
	
	public MyHashMap2() {
		this.list = new Entry[4];
		this.index=0;
	}
	
	
	@Override
	public String toString() {
		return String.format("length: %d\nindex: %d\n%s\n"
							, this.list.length
							, this.index
							, Arrays.toString(this.list));
	}
	
	public void put(String key, String value) {
		
		doubling();
		
		if (!containKey(key)) {
			
			Entry e = new Entry();
			e.key = key;
			e.value = value;
			
			this.list[this.index] = e;
			this.index++;
			
		} else {
			this.list[getIndex(key)].value = value;
		}
	}
	
	private void doubling() {
		
		if (this.index >= this.list.length) {
			Entry[] newEntry = new Entry[this.list.length*2];

			for (int i=0; i<this.list.length; i++) {
				newEntry[i] = this.list[i];
			}
			this.list = newEntry;
		}
	}

	public String get(String key) {
		
		int index = getIndex(key);
		if (index > -1) return this.list[index].value;
		else return null;
		
	}
	
	private int getIndex(String key) {

		for (int i=0; i<this.index; i++) {
			if(this.list[i].key.equals(key)) {
				return i;
			}
		}
		return -1;
	}

	public int size() {
		return this.index;
	}
	
	public void remove(String key) {
		
		if (this.getIndex(key) == -1) return;
		
		for (int i=getIndex(key); i<this.index; i++) {
			this.list[i] = this.list[i+1];
		}
		
		this.index--;
	}
	
	public boolean containKey(String key) {
		
        if (getIndex(key) > -1) return true;
        else return false;
		
	}
	
	public boolean containsValue(String value) {
		
		for (int i=0; i<this.index; i++) {
			if (this.list[i].value.endsWith(value)) {
				return true;
			}
		}
		return false;
	}
	
	public void clear() {
		this.index = 0;
	}
}

class Entry {
	public String key;
	public String value;
	
	@Override
	public String toString() {
		return String.format("(%s, %s)", this.key, this.value);
	}
}

