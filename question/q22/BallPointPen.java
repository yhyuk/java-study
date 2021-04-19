package com.test.question.q22;

public class BallPointPen {
	
	private double thickness;
	private String color;

	public void setThickness(double thickness) throws Exception {
		if(	thickness == 0.3 || thickness == 0.5 || thickness == 0.7 || 
			thickness == 1 || thickness == 1.5) this.thickness = thickness;
		else throw new Exception("잘못된 볼펜입니다.");
	}

	public void setColor(String color) throws Exception {
		if(	color.equals("red") || color.equals("blue") || 
			color.equals("green") || color.equals("black")) this.color = color; 
		else throw new Exception("잘못된 볼펜입니다.");
		
	}


	public String info() {
		return String.format("%s 색상 %.1fmm 볼펜입니다.\n", this.color, this.thickness);
	}

}
