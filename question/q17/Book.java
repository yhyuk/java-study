package com.test.question.q17;

public class Book {
	
	private String title;
	private String author;
	private String publisher;
	private String pubYear= "2021";
	private String isbn;
	private int page;
	private int price;
	
	
	// getter 읽기 list
	public String getTitle() { return this.title; } //제목
	public String getAuthor() { return this.author; } //저자
	public String getIsbn() { return this.isbn; } //ISBN
	public String getpubYear() { return this.pubYear; }	//발행년도
	public int getPage() { return this.page; } //페이지수
	public int getPrice() { return this.price; } //책 가격
	
	
	// setter 쓰기 list
	public void setTitle(String title) throws Exception { 
		
		//최대 50자이내(한글,영어,숫자만 가능)
		if (title.length() < 1 || title.length() > 50) throw new Exception("잘못된 제목입니다.");
		
		for(int i=0; i<title.length(); i++) {
			char titleC = title.charAt(i);
			if ((titleC < 'a' || titleC > 'z') && 
				(titleC < 'A' || titleC > 'Z') &&
				(titleC < '가' || titleC > '힣') && 
				(titleC != ' ')) {
				throw new Exception("잘못된 제목입니다.");
			}
		}
		this.title = title;
	}

	
	public void setAuthor(String author) { //저자
		this.author = author;
	}
	
	public void setPublisher(String publisher) { //출판사
		this.publisher = publisher;
	}
	
	public void setIsbn(String isbn) { //ISBN
		this.isbn = isbn;
	}

	public void setPage(int page) throws Exception { //페이지
		if (page > 0) this.page = page;
		else throw new Exception("잘못된 페이지입니다.");
	}

	public void setPrice(int price) throws Exception { // 가격
		//1~1000000원(백만)
		if(price > 0 && price <= 1000000) this.price = price;
		else throw new Exception("잘못된 가격입니다.");
	}

	
	public String info() {
		String result = "제목: " + title + "\n" + 
						"저자: " + author + "\n" + 
						"출판사: " + publisher + "\n" + 
						"발행년도: " + pubYear + "\n" + 
						"ISBN: " + isbn + "\n" + 
						"페이지수: " + page + "\n" + 
						"가격: " + price;
		return result;
	}
}
