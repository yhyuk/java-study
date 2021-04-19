package com.test.question.q22;

public class Eraser {
	
	private String size;
	
	public void setSize(String size) throws Exception {
		if(size.equals("Large") || size.equals("Medium") || size.equals("Small")) this.size = size;
		else throw new Exception("잘못된 사이즈입니다.");
	}
	
	public String info() {
		return String.format("%s 사이즈 연필입니다.\n", this.size);
	}

}
