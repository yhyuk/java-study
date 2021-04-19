package com.test.question.q22;

public class Pencil {
	
	private String hardness;
	
	public void setHardness(String hardness) throws Exception {
		if(		hardness.equals("4B") || hardness.equals("3B") || hardness.equals("2B") ||
				hardness.equals("B") || hardness.equals("HB") || hardness.equals("H") ||
				hardness.equals("2H") || hardness.equals("3H") || hardness.equals("4H")) this.hardness = hardness;
		else throw new Exception("잘못된 연필입니다.");
	}

	public String info() {
		return String.format("%s 사이즈 연필입니다.\n", this.hardness);
	}
	
}
