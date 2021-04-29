package Review.Lessons;

public class CastingEx1 {

	public static void main(String[] args) {
		
		// 정수 <--> 정수 형변환 
		int i = 10;
		byte b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d\n", i, b);
		
		i = 300;
		b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d\n", i, b);
		
		b = 10;
		i = (int)b;
		System.out.printf("[byte -> int] i=%d -> b=%d\n", b, i);
		
		b = -2;
		i = (int)b;
		System.out.printf("[byte -> int] i=%d -> b=%d\n", b, i);
		
		System.out.println("i="+Integer.toBinaryString(i));

		
		
		// 실수 <--> 실수 형변환
		float f = 9.1234567f;
		double d = 9.1234567;
		double d2 = (double)f;
		
		System.out.printf("f = %20.18f\n", f);
		System.out.printf("d = %20.18f\n", d);
		System.out.printf("d2 = %20.18f\n", d2);

		
		
	}
	
}
