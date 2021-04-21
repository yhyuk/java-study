# Code Fragment

#### 변수 선언하기
```
//자료형 변수명 = 상수;
int a = 10;
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
	// 반환값이 있다면 public static int, double... 
	// 반환값이 없다면 public static void
	// 반환값이 있다면 마지막 줄return 값 설정 
}
```

#### 메소드(Method) 호출
```
class() {

	main() {
	
		메소드명(실인자); //호출
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

#### if 조건문 (1)
```
1. if - else
if (조건식) {
	실행문;
} else {
	실행문;
}

2. if - else if
if (조건식) {
	실행문;
} else if (조건식) {
	실행문;
}

3. if - else if - else
if (조건식) {
	실행문;
} else if (조건식) {
	실행문;
} else {
	실행문;
}
```

#### switch 조건문 (2)
```
switch (조건) {
	case 값:
		 실행문;
		 break;
	[case 값:
		 실행문;
		 break;] * N (여러개 쓸 수 있다.)
	default: //if문의 else절과 같은 역할
		실행문;
		break;
 }
```

#### for 반복문
```
for (초기식; 조건식; 증감식) {
	
	실행문;
	
}
//실행문안에 분기문(break, continue) 및 조건문(if, switch) 사용가능
//초기식, 조건식, 증감식을 사용안하고 for(;;) 하게되면 무한루프
```

#### while 반복문
```
while (조건식) {
	실행문;
}
```

#### 문자열 길이 구하기 (int length())
```
String txt = "ABCDEF"
System.out.println(txt.length());

----> "ABCDEF"의 문자길이 6 출력
```

#### 문자열에서 문자 추출 방법 (char charAt(int index))
```
String txt = "ABCDEF"
System.out.println(txt.charAt(4);

----> "ABCDEF"의 4번째에 위치한 E 출력

//컴퓨터는 0부터 시작한다.
//for문에 이용하게 되면 i값을 0으로 해두는게 좋다.
```

#### System.arraycopy() 배열의 복사
```
System.arraycopy(num, 0, newNum, 0, num.length);
//num[0] 에서 newNum[0]으로 num.length개의 데이터를 복사
```

#### enum() 열거형
```
/*
 *  열거형, Enumeration
 *  - 클래스의 일종(자료형)
 *  - 열거값을 가지는 자료형 > 사용자가 임의의 값을 생성할 수 없고,
 *    주어진 값들 중 1개를 선택해서 사용 가능한 자료형
 * 	
 */
 
public static void main() {

	Test temp1 = Test.aaa;
	Test temp2 = Test.bbb;
	
	System.out.println(temp1)
	System.out.println(temp2)
}

enum Test { //변수만 가질수 있음 (자료형X, 값X, 이름 O)
	aaa,
	bbb,
	ccc,
	ddd,
}
```

#### final 수정불가
```
/*
 *  final
 *  - 값을 한번 초기화 한 뒤에는 수정불가
 *  - 변수/메소드/클래스 적용가능
 *  - 상수명(final 변수명)은 되도록 대문자로 작성.
 */
 
//변수
final int A = 10;

//메소드
public final static int TEST {
	//나중에 수정 불가한 코드
}

//클래스
final class TEST {  //더이상 자식을 가질수 없는 최종 클래스.
}
```


