package Review.Lessons.Operator;

public class OperatorEx1 {

	public static void main(String[] args) {
		
		
		// ++i; (전위형) , i++; (후위형) 
		// -> 수식이나 매서드 호출에 포함되지 않고, 독립적인 하나의 문장으로 쓰인 경우 차이가 없다
		int i = 5;
		i++;
		System.out.println(i);
		
		i = 5;
		i++;
		System.out.println(i);
		
		// 결과값 : ++i;, i++; 둘다 6
		
		
		
	}
	
}
