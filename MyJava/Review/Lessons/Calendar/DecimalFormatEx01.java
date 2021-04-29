package Review.Lessons.Calendar;

import java.text.DecimalFormat;

public class DecimalFormatEx01 {
	
	public static void main(String[] args) {
		
		/*
		 *  형식화 클래스
		 *  DecimalFormat(숫자 형식화)
		 *  - 숫자 데이터를 정수, 부동소수점, 금액등 다양한 형식으로 표현
		 *  - 반대로 일정한 형식의 텍스트 데이터를 숫자로 쉽게 변환 가능
		 * 
		 */
		double number = 1234567.89;
		String[] parttern = {
				"0",
				"#",
				"0.0",
				"#.#",
				"00000000.0000",
				"########.####",
				"#.#-",
				"-#.#",
				"#,###.##",
				"#,####.##",
				"#E0",
				"0E0",
				"##E0",
				"00E0",
				"####E0",
				"0000E0",
				"#.#E0",
				"0.0E0",
				"0.0000000E0",
				"00.000000E0",
				"000.00000E0",
				"#.#######E0",
				"###.#####E0",
				"####.####E0",
				"#,###.##+;#,###.##-",
				"#.#%",
				"#.#\u2030",
				"\u00A4 #,###",
				"'#'#,###",
				"''#,###"
		};
		
		for(int i=0; i<parttern.length; i++) {
			DecimalFormat df = new DecimalFormat(parttern[i]);
			System.out.printf("%19s : %s\n", parttern[i], df.format(number));
		}
	}

}
