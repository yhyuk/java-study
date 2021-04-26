package com.test.question.q25;

public class MyHashMap {
	
	//Case A.
	private String[] keys; //키를 담을 배열
	private String[] value; //값을 담을 배열
	private int index; // ***여전히 중요, 역할 동일
	
    public MyHashMap() {
        this.index = 0;
        this.keys = new String[4];
        this.value = new String[4];
    }
    
	@Override
	public String toString() {
		
		String temp = "[";
		String temp2 = "[";
		for(String n : this.keys) {
			temp += String.format("%s,", n);
		}
		for(String n : this.value) {
			temp2 += String.format("%s,", n);
		}
		temp = temp.substring(0, temp.length()-1);
		temp += "]";
		temp2 = temp2.substring(0, temp2.length()-1);
		temp2 += "]";
		
		return String.format("length: %d\nindex: %d\n%s\n%s\n"
							, this.keys.length
							, this.index
							, temp
							, temp2);
	}
	
    public int getIndex(String key) { //동일값찾기
        for (int i = 0; i < this.index; i++) {
            if(this.keys[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
    
    public void put(String key, String value) { 
    	
		if(!containKey(key)) {
		   	doubling();
            this.keys[this.index] = key;
            this.value[this.index]= value;
            this.index++;
		} else {
			this.value[getIndex(key)] = value;
		}
    }
    
    private void doubling() {
    	
		if(this.index >= this.keys.length) {
			String[] newKeys = new String[this.keys.length*2];
			String[] newValue = new String[this.value.length*2];
			
			for(int i=0; i<this.keys.length; i++) {
				newKeys[i] = this.keys[i];
				newValue[i] = this.value[i];
			}
			this.keys = newKeys;
			this.value = newValue;
		} 
	}

	//불러오기
    public String get(String key) {
        if(this.getIndex(key) > -1) { 
            return value[getIndex(key)];
        }
        return null;
    }
    
    //데이터 개수
    public int size() {
        return this.index;
    }
    
    //삭제
    public void remove(String key) {
    	
    	if(this.getIndex(key) == -1) {
    		return;
    	}
    	
        for(int i=this.getIndex(key); i<this.index-1;i++) {
            this.keys[i]=this.keys[i+1];
            this.value[i]=this.value[i+1];
        }
        
        this.index--;
    }
    
    //KEY찾기
    public boolean containKey(String key) {
    	
        if(getIndex(key)>-1) {  //getIndex 값이 있으면 true
            return true;
        }
        return false;
        
    }
    
    //VALUE찾기
    public boolean containsValue(String value) {
        
        for(int i =0; i<=this.index;i++) {  
            if(this.value[i].equals(value)) { 
                return true;
            }
        }
        
        return false;
    }
    
    //초기화
    public void clear() {
		for(int i=0; i<this.index; i++) {
			keys[i] = null;
			value[i] = null;
		}
        this.index=0;
    }
}
