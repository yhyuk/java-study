# JAVA Error List

---
### ;(세미콜론) Error

```
int a = 10 

Error: Syntax error, insert ";" to complete LocalVariableDeclarationStatement
```

- Cause: 자바는 모든 문장의 끝에 ;(세미콜론)을 기재해야 한다. 빼먹으면 컴파일 오류 발생  


- Solution: ;(세미콜론)을 적는다

### import Error

```
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

Error : BufferedReader cannot be resolved to a type
```

- Cause : 컴파일 문제, BufferedReader를 찾을 수 없어서 Error 발생


- Solution : 필요한 클래스를 import 해서 가져온다.  
	-> import java.io.*; 입력, 또는 밑의 2개의 코드 입력   
	-> import java.io.BufferedReader;      
	-> import java.io.InputStreamReader;
	

### Exception(예외처리) Error

```
String data = reader.readLine();

Error : Unhandled exception type IOException
```
- Cause : 처리되지 않은 IOException (예외처리) 오류


- Solution : main 코드 끝에 throws IOException를 입력 시킨다.  
	-> public static void main(String[] args) throws IOException


### Type(자료형) Error

```
int num1 = reader.readLine();

Error : Type mismatch: cannot convert from String to int
```
- Cause : reader.readLine();은 String 문자만 가능한데, int 정수형이 입력됨


- Solution : int 타입을 String 타입으로 수정한다.


### 띄어쓰기, 공백 Error

```
System.out.pri nt("test");

Error : System.out cannot be resolved to a type, Syntax error on token "nt", = expected after this token
```
- Cause : print에 띄어쓰기가 잘 못 되어있다.


- Solution : print 띄어쓰기를 지운다	


### Type(자료형) Error (2)

```
short s2 = 10;
byte b2;
				
b2 = s2; // 에러 나온 부분

Error : Type mismatch: cannot convert from short to byte
```
- Cause : byte는 short보다 작기때문에 대입 불가로 Error 발생


- Solution :    
	-> 1. 크기가 큰것에 작은것을 대입하면 안되고, 크기가 작은 byte를 크기가 큰 short에 대입한다.	  
	-> 2. 명시적으로 b2 = (byte)s2;


### method 오타 Error 

```

System.out.printl();

Error : The method printl(int) is undefined for the type PrintStream

```
- Cause : println에서 n이 빠짐


- Solution : println 수정


### 실행 시 오류(ArithmeticException) Error

```
System.out.println(3/0);

java.lang.ArithmeticException: / by zero
```
- Cause : 피연산자가 정수형인 경우, 나누는 수로 0을 사용 할 수 없다.


- Solution : 값 0 을 다른 수로 변경한다.


### 대입 연산자 Error

```
int i = 0;
3 = i + 3;
i + 3 = i;

Error : The left-hand side of an assignment must be a variable
```
- Cause : LValue는 리터럴, 상수같이 값을 저장할수 없는 것들은 올 수 없다.


- Solution :   
	-> 3 = i + 3; 에서 LValue은 3이므로,값을 저장할 수 있는 공간이 아님.   
	-> i + 3 = i; 에서 LValue은 i+3이므로 연산결과가 리터럴   
	-> 두 코드 전부 삭제
	

### 입력 값 공백 Error

```
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
System.out.print("숫자 입력 : ");
int num = Integer.parseInt(reader.readLine());

Error : java.lang.NumberFormatException: For input string: " "
```
- Cause : int(정수)값을 입력해야 하는데, 공백을 입력함


- Solution : int(정수)값 입력하기   


### 변수명 중복 Error

```
int a;
int a;

Error : Exception in thread "main" java.lang.Error: Unresolved compilation problem: Duplicate local variable a
```
- Cause : 변수명 a가 중복됨


- Solution : 변수명 a 2개 중에 한개를 다른 변수명으로 변경한다.


### 메소드 내의 변수 중복 Error

```
public static void hi(String name) {
		
		String name = "홍길동"; // Error : Duplicate local variable name
		
		System.out.printf("'%s'님 안녕하세요.\n", name);
	
}

Error : Duplicate local variable name
```
- Cause : 매소드 hi()의 매개변수가 name 이므로, 메소드 내의 변수 String name과 중복


- Solution : 매개변수 name 이나 메소드 내의 변수 name 둘 중에 하나를 변경한다.


### 메소드 호출시 Error

```
hi();

Error : The method hi(String) is not applicable for the arguments ()
```
- Cause : 메소드에 String 매개변수(가인자)가 있으므로, 호출시에 hi(); 안에 실인자를 입력 해줘야 한다. 


- Solution : hi(); --> ()안에 String 문자열을 입력한다. 


### 메소드 선언시 Error

```
public static int test() {

}

Error : This method must return a result of type int
```
- Cause : 메소드의 반환타입이 int로 해줬으므로 반환값(return)을 써야한다.


- Solution : 메소드 코드 안에 원하는 int형 return값을 입력한다.


### 메소드 return 값 Error (1)

```
public static void test() {
	return 100;
}

Error : Void methods cannot return a value
```
- Cause : 메소드의 반환타입이 void이므로 반환값이 없어야 한다.


- Solution : return값을 지우거나, 반환타입을 void에서 원하는 데이터타입을 넣어준다.


### 메소드 return 값 Error (2)

```
public static int test() {

	System.out.println("테스트1");
	
	return 100;
	
	System.out.println("테스트2"); // Error 발생 부분 
}

Error : Unreachable code
```
- Cause : 매소드의 반환타입이 int이므로 return값 이후에 오는 코드는 실행되지 않는다.


- Solution : 맨밑의 코드를 지우거나 return값 위로 수정한다.


### 재귀 메소드 Error

```
public static void test();{
	
	System.out.println("TEST");
	test();
}

Error 발생 : StackOverflowError
```
- Cause : 자기 자신 메소드안에 자기를 호출로 print("TEST") 계속 출력(무한 루프) 하다가 StackOverflow 발생


- Solution : 호출 스택에 함수 공간이 계속 쌓여서 문제가 생기므로, 함수 공간이 쌓이지 않도록 한다.  
	-> 반환값을 넣어줘서 스택공간을 사라지게 한다.
	-> 꼬리 재귀
