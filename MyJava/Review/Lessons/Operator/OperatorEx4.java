package Review.Lessons.Operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		
		// 부호 연산자 +, -
		// --> - 연산자는 피연산자의 부호를 반대로 변경한 결과를 반환
		// --> + 연산자는 똑같은 결과이므로 안쓰임
		
		int i = -10;
		i = +i;
		System.out.println(i);
		
		i = -10;
		i = -i;
		System.out.println(i);
		
	}
	
}
