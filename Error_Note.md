# Java Error Note

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
	- import java.io.*; 입력, 또는 밑의 2개의 코드 입력   
	- import java.io.BufferedReader;      
	- import java.io.InputStreamReader;
	

### Exception(예외처리) Error

```
String data = reader.readLine();

Error : Unhandled exception type IOException
```
- Cause : 처리되지 않은 IOException (예외처리) 오류


- Solution : main 코드 끝에 throws IOException를 입력 시킨다.  
	- public static void main(String[] args) throws IOException


### Type(자료형) Error (1)

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
	- 1. 크기가 큰것에 작은것을 대입하면 안되고, 크기가 작은 byte를 크기가 큰 short에 대입한다.	  
	- 2. 명시적으로 b2 = (byte)s2;


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
	- 3 = i + 3; 에서 LValue은 3이므로,값을 저장할 수 있는 공간이 아님.   
	- i + 3 = i; 에서 LValue은 i+3이므로 연산결과가 리터럴   
	- 두 코드 전부 삭제
	

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
	- 반환값을 넣어줘서 스택공간을 사라지게 한다.
	- 꼬리 재귀
	

### 산술 연산자 Error
```
Calendar now = Calendar.getInstance();
Calendar birthday = Calendar.getInstance();
birthday.set(1995, 11, 28, 15, 30, 50);

System.out.println(now - birthday); // Error 발생

Error : The operator - is undefined for the argument type(s) java.util.Calendar, java.util.Calendar	
```
- Cause : 산술 연산자에서 피연산자는 원시형밖에 가질 수 없는데(특히 숫자형만 가능), 참조형이 들어감	


- Solution : println() 안에있는 산술 연산자를 제거 하거나, 피연산자를 원시형(숫자형)으로 변환한다.  


### 가운데 줄표시 Error
```
Date now = new Date();

System.out.println(now.getHours());  // getHours에 밑줄의미는 위에서 말한 deprecated(소멸 예정)
System.out.println(now.getMinutes());

Error : The method getHours() from the type Date is deprecated
```
- Cause : 곧 소멸될 메소드 이므로, 변경 권함


- Solution : 컴파일, 프로그램 에러는 아니므로 수정은 할 필요없지만, 추후 나중을 위해서 다른 방식으로 하는게 더 좋다.  


### if 결합순서 Error 

```
int age = 25;

if (19 <= age < 60) { //Error 발생 line
	
}

Error : The operator < is undefined for the argument type(s) boolean, int
```
- Cause : 
	- 19 <= age < 60    
	- true(19<=age) < 60    
	- -> error


- Solution : 조건식 변경 (age >= 19 && age < 60) 
	- age라는 주최가 앞으로 오는것이 바람직하다.
	

### 초기화 error	
	
```
int a;
for(int i=1; i<=10; i++) {
	
	a = a + i; // Error 발생 line

}
Error : The local variable sum may not have been initialized	
```
- Cause : 정수형 변수 a값을 초기화를 안함


- Solution : int a;를 int a=0; 으로 초기화하거나 값을 넣어준다.
	
	
### index 범위초과 Error

```
String txt = "안녕하세요";

for (int i=0; i<14; i++) { 
	System.out.println(txt.charAt(i));
}

Error : Exception in thread "main" java.lang.StringIndexOutOfBoundsException: index 5, length 5
```
- Cause : charAt()가 범위에서 벗어남.


- Solution : txt안에 있는 문자를 조건식 i<14; 보다 증가를 시키거나, 조건식 i<14;을 i<5로 변경한다. 


### 원시형, 참조형 간의 형변환 Error

```
char c = 'A'; //값형, 원시형
String s = "A"; //참조형
		
System.out.println((int)c);
System.out.println((int)s); //Error 발생 line
Error : Cannot cast from String to int
```
- Cause : 문자열로부터는 형변환을 통해서 문자코드값을 얻어낼 수 없다.


- Solution : String s 의 문자열 값을 구하려면 charAt()을 이용한다.


### 배열 크기 Error
```
int[] test = new int[10]; // 0~9
System.out.println(test[10]) // 값 존재안하기 떄문에 런타임 에러 발생

Error : Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
```
- Cause : test의 배열 방의 개수 범위 초과


- Solution : 컴퓨터는 0부터 읽기때문에 배열의 크기를 [11]로 수정하거나 출력 값을 test[9]로 줄인다.
