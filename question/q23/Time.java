package com.test.question.q23;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		
		this(0, 0, 0);
		
	}
	
	/*********************************************************
	 * 방법 1
	 * 
	 * 각 메소드 마다 조건식을 걸어줌
	 * 코드 복잡해짐 -> 중복되는 코드가 보임
	 * 
	public Time(int hour, int minute, int second) {
		if(minute < 60 && second < 60) {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		} 
		
		if (second > 60) {	//60초가 넘는다면?
			this.hour = hour;
			this.minute = minute + second/60;
			this.second = second%60;
		} 
		
		if (minute > 60) {	//60분이 넘는다면?
			this.hour = hour + minute/60;
			this.minute = minute%60 + second/60;
			this.second = second%60;
		} 
	}
	
	public Time(int minute, int second) {
		if(minute < 60 && second < 60) {
			this.minute = minute;
			this.second = second;
		} 
		
		if (second > 60) {
			this.minute = minute + second/60;
			this.second = second%60;
		} 
		
		if (minute > 60) {
			this.hour = hour + minute/60;
			this.minute = minute%60 + second/60;
			this.second = second%60;
		} 
	}

	public Time(int second) {
		this.hour = second/(60*60);
		this.minute = second/60-(hour*60);
		this.second = second%60;
	}
	
	public String info() {
		return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
	}
	
	*********************************************************/
	/*
	 * 방법2
	 * 
	 * 각 메소드에 조건 X
	 * info에서 각 시, 분, 초 계산 및 출력
	 * 코드 간결해짐
	 * 
	 */
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public Time(int minute, int second) {
		this.minute = minute;
		this.second = second;
	}
	public Time(int second) {
		this.second = second;
	}
	public String info() {
		int hour = this.hour + (this.minute+this.second / 60) / 60;
		int minute = (this.minute+this.second /60) % 60;
		int second = this.second % 60;
		
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
} 


