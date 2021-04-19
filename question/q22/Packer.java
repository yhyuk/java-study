package com.test.question.q22;

public class Packer {

	private static int pencilCount; 		//연필 포장 개수
	private static int eraserCount; 		//지우개 포장 개수
	private static int ballPointPenCount; 	//볼펜 포장 개수
	private static int rulerCount; 			//자 포장 개수 
	
	public void packing(Pencil pencil) {
		System.out.print("포장 전 검수 : " + pencil.info());
		pencilCount++;
		System.out.println("포장을 완료했습니다.");
	}
	
	public void packing(Eraser eraser) {
		System.out.print("포장 전 검수 : " + eraser.info());
		eraserCount++;
		System.out.println("포장을 완료했습니다.");
	}
	
	public void packing(BallPointPen ballpen) {
		System.out.print("포장 전 검수 : " +  ballpen.info());
		ballPointPenCount++;
		System.out.println("포장을 완료했습니다.");
	}
	
	public void packing(Ruler ruler) {
		System.out.print("포장 전 검수 : " + ruler.info());
		rulerCount++;
		System.out.println("포장을 완료했습니다.");
	}
	
	public void countPacking(int type) {
		
		System.out.println("=====================");
		System.out.println("포장 결과");
		System.out.println("=====================");
		
		if (type == 0) {
			System.out.printf("연필 %d회\n", pencilCount);
			System.out.printf("지우개 %d회\n", eraserCount);
			System.out.printf("볼펜 %d회\n", ballPointPenCount);
			System.out.printf("자 %d회\n", rulerCount);
		}
		else if (type == 1) System.out.printf("연필 %d회\n", pencilCount);
		else if (type == 2) System.out.printf("지우개 %d회\n", eraserCount);
		else if (type == 3) System.out.printf("볼펜 %d회\n", ballPointPenCount);
		else if (type == 4) System.out.printf("자 %d회\n", rulerCount);
		
	}
	
}
