# Code Fragment

#### 변수 선언하기
```
//자료형 변수명 	= 상수;
int 	a  	= 10;
```

#### 개행하기(라인 바꾸기)
```
// 1. println() 매소드 자체가 개행
System.out.println();

// 2. 특수문자를 통해서 개행
System.out.print("\n");
```

#### 키보드로 데이터 입력받기
```
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
int code = reader.read(); // 문자 1개 읽기 -> 코드값(int) 반환
String line = reader.readLine(); // 1줄 읽기 -> 문장(String) 반환
```

#### 키보드 입력 받은 데이터가 문자열이 아닐 때
```
// int
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
int num = Integer.parseInt(reader.readLine());

// double
double num2 = Double.parseDouble(reader.readLine());

// char
char c1 = (char)reader.readLine(); // 방법1, 권장***

char c2 = reader.readLine().charAt(0); // 방법2, 권장*
```

#### 명시적 형변환, 큰형 -> 작은형
```
int a;
long b;

// 바꿀자료형 = (바꿀자료형)대상
a = (int)b;  
```

#### 메소드(Method) 선언
```
class() {

	main() {
	
	}
	
	public static 반환값 메소드명(가인자변수) {
		코드입력
		return 코드;
	} 
	// 반환값이 있다면 int, double... 
	// 반환값이 없다면 void
	// 반환값이 있다면 return 값 설정 
}
```

#### 메소드(Method) 호출
```
class() {

	main() {
	
		메소드명(실인자);  	//호출
								//실인자가 없다면 메소드명();
								//main에서 선언한 변수를 메소드와 대입하려면 데이터타입이 같아야함
	}
	
	public static 반환값 메소드명(가인자변수) {
		코드입력
		return 코드;
	} 
}
```

#### 3항연산자 ( ? : )
```
String str;
String result = (str == "A") "B" : "C";

System.out.println(result)
// str이 A와 똑같을때 B를 출력
// str이 A와 다르다면 C를 출력
// 3항연산자는 2가지 값 형태로 boolean(true, false)이다. 
``` 
