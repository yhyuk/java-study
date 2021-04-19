package com.test.question.q22;

public class Ruler {
	
	private int length;
	private String shape;
	
	public void setLength(int length) throws Exception {
		if(length==30 || length==50 || length==100) this.length = length;
		else throw new Exception("잘못된 길이입니다.");
	}
	public void setShape(String shape) throws Exception {
		if(shape.equals("줄자") || shape.equals("운형자") || shape.equals("삼각자")) this.shape = shape;
		else throw new Exception("잘못된 길이입니다.");
	}
	
	public String info() {
		return String.format("%dcm %s입니다.\n", this.length, this.shape);
	}
	
	
	

}
