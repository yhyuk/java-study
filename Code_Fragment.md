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

#### 메소드(Method) 선언 및 호출