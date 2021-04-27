package com.test.java.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex67_Stack {
	
	public static void main(String[] args) {
		
		//Ex67_Stack.java
		
		/*
		 *  Queue, Stack
		 *  
		 *  Queue, 큐
		 *  - 선입선출
		 *  - FIFO (First Input First Output)
		 *  - 줄서기
		 *  
		 *  Stack, 스택
		 *  - 후입선출
		 *  - LIFO (Last Input First Output)
		 *  - 메모리 영역, 히스토리
		 * 
		 * 
		 *  큐와 스택의 다른점
		 *  큐는 들어간 처음부터 나온다.
		 *  스택은 들어간 마지막부터 나온다.
		 */
		
		
		//m1();
		m2();
		
	}//main

	private static void m2() {
		
		/*
		 *  큐(Queue)
		 *  
		 *  		이해하기 쉽게 파이프라고 생각하자
		 *  		==============================
		 *   	=> 		노랑	파랑	빨강 	  =>
		 *  		==============================
		 * 
		 */
		
		//큐는 클래스가 아닌 인터페이스기때문에 객체 생성 X 
		//Queue<String> queue = new Queue<String>; --> 안됨 XX
		//때문에 자식클래스로 열어야함
		Queue<String> queue = new LinkedList<String>();
		
		//요소 추가(Enqueue)
		queue.add("빨강"); //first
		queue.add("파랑");
		queue.add("노랑"); //last
		System.out.println(queue.size()); //3
		
		//요소 읽기(+삭제) - Dequeue
		System.out.println(queue.poll()); //빨강
		System.out.println(queue.size());

		System.out.println(queue.poll()); //파랑
		System.out.println(queue.size());
		
		System.out.println(queue.poll()); //노랑
		System.out.println(queue.size());
		
		//공이 다 빠졋는데 더 꺼낸다면?
		//큐는 null값이 반환됨
		System.out.println(queue.poll()); //null
		
		//---------------------------------------------------------
		
		queue.add("빨강"); 
		queue.add("파랑");
		queue.add("노랑");

		System.out.println(queue.peek());
		System.out.println(queue.size());
		
		
		while (queue.size() > 0) {
			System.out.println(queue.poll());
		}
		
	}

	private static void m1() {
		
		/*
		 *  스택(Stack)
		 *  
		 *  		이해하기 쉽게 파이프라고 생각하자
		 *  		==============================
		 *   	<=>  	노랑	파랑	빨강 	  =
		 *  		==============================
		 *  
		 */
		Stack<String> stack = new Stack<String>();
		
		//요소 추가
		stack.push("빨강"); //first
		stack.push("파랑");
		stack.push("노랑"); //last
		
		//요소 개수
		System.out.println(stack.size()); //3
		
		//요소 읽기(+삭제)  
		//읽는건 파이프에서 꺼내는것이기 때문에 삭제된다. 없어진다고 생각하면됨
		/*
		//방법1
		System.out.println(stack.pop());//노랑
		System.out.println(stack.size());//2
		
		System.out.println(stack.pop());//파랑
		System.out.println(stack.size());//1
		
		System.out.println(stack.pop());//빨강
		System.out.println(stack.size());//0
		*/
		//공이 다 빠졋는데 더 꺼낸다면?
		//error : Exception in thread "main" java.util.EmptyStackException
		//System.out.println(stack.pop());
		
		
		//방법2. 루프
		//while (stack.size() > 0) {
			//System.out.println(stack.pop());
		//	System.out.println(stack.size());
		//}
		
		//방법3. 루프(isEmpty)
		//while(!stack.isEmpty()) {
		//	System.out.println(stack.pop());
		//	System.out.println(stack.size());	
		//}
		
		
		//요소에서 읽을 공 확인(조사)
		//공을 꺼내진 않고, 마지막 공이 무엇인지 확인만 한다.
		System.out.println(stack.peek()); //3, 노랑
		System.out.println(stack.size()); //3 --> 그대로 3????
		
		System.out.println(stack.peek()); //3, 노랑
		System.out.println(stack.size()); //3 --> 그대로 3????
		
		System.out.println(stack.peek()); //3, 노랑
		System.out.println(stack.size()); //3 --> 그대로 3????
		
	}

}
