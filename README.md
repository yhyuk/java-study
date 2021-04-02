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
