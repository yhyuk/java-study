package com.test.java.collection;

import java.util.ArrayList;

public class Ex63_ArrayList {
	
	public static void main(String[] args) {
		
		//Ex63_ArrayList.java
		
		/*
		 *  ArrayList의 정체(실체) -> 내부 구조
		 *  
		 *  배열(Array) : 배열의 길이가 불변이다.
		 *  ArrayList 	: 배열의 길이가 가변이다.
		 *  
		 * 
		 */
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		
		list.add(500); //IndexOutBoundException 발생
		
		System.out.println(list.size());
		
		// ----------------------------------------------------------------
		ArrayList<Integer> list2 = new ArrayList<Integer>(1025);
		//4칸 배열 시작
		
		
		for (int i=0; i<1025; i++) {
			
			list2.add(i);
		}
		//위 코드는 좋은 코드가 아니다?
		//4 -> 8 -> (8칸짜리 배열 생성 비용 발생 + 복사 비용 + 4칸 짜리 배열 쓰레기 처리 비용 발생)
		
		//8 -> 16 
		//16 -> 32 
		//32 -> 64
		//64 -> 128
		//128 -> 256
		//256 -> 512
		//512 -> 1024
		//1024 > 2048
		
		System.out.println(list2.size()); //1025 -> 실제배열길이 1025
		
		list2.add(100);
		
		System.out.println(list2.size()); //1026 -> 실제배열길이 2050
		
		//난 더이상 add()를 쓸일이 없다!!! > 1024방이 빈방으로 남게 된다.
		
		//2050 -> 1026 줄여줌
		list2.trimToSize(); //실제 배열의 길이를 데이터 개수와 동일하게 줄여라!!
		
	}//main

}

//내가 ArrayList를 직접 만든다고 생각해보자!
class MyArrayList { 
	
	private int[] list = new int[4]; // 0~3
	
	public void add(int n) {
		/*
		 *  추가작업
		 *  1.배열이 꽉찼는가?
		 *  	-> 안찼다. > 빈방 존재 > 빈방에 요소를 추가
		 *  	-> 꽉찼다. > 이사를 간다. 
		 *  		1) 현존하는 배열의 2배 길이의 배열을 만든다. 
		 *  			int[] temp = new int[8]
		 *  		2) 배열끼리 값을 복사한다. 
		 *  			list -> temp 복사(깊은 복사)
		 *  		3) 멤버변수를 교체한다. 
		 *  			list를 temp로 바꾼다
		 *  			this.list = temp
		 */
		
		int[] temp = new int[8];
		
		//4칸 배열 -> (교체) -> 8칸 배열
		this.list = temp;
		
		//8칸 배열 -> 0~3(기존 데이터 그대로...)
		
		list[4] = n; // error발생 -->> 위 로직으로 가능해짐
		
		//ArrayList : 그냥 추가되는게 아니라, 2배의 배열크기를 다시 만들어 복사 교체 
	}
	
}

//class ArrayList<T> {
//	
//	private T[] list;
//	
//}