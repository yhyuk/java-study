package Review.Lessons.Operator;

public class OperatorEx2 {

	public static void main(String[] args) {
		
		// ++i; (전위형) , i++; (후위형) 
		// -> 다른 수식에 포함 및 매서드의 매개변수로 사용
		// -> 즉, 단독으로 사용되지 않은 경우 전위형(++i) 과 후위형(i++)의 결과는 다르다.
		
		int i = 5, j = 0;
		
		j = i++;
		System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);
		
		// 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 초기화
		i = 5;
		j = 0;
		
		j = ++i;
		System.out.println("j=++i; 실행 후, i=" + i + ", j=" + j);
		
		
		// 결과값 : i++은 i값 5를 먼저 불러온 다음 i를 증가 시킴으로, i=5, j=5
		//        ++i은 i값 5를 먼저 증가 시킴으로, i=6, j=6
		
		
	}
	
}
