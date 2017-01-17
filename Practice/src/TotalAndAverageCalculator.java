import java.util.Scanner;

/**
 * 산술 연산자를 이용해 합계/평균 구하기
 * @author minchangjang
 *
 */
public class TotalAndAverageCalculator {

	Scanner input = new Scanner(System.in);
	
	void printTotalAndAverage() {
		
		System.out.println("합계와 평균 구하기 프로그램");
		
		System.out.println("첫 번째 숫자를 입력하세요.");
		int numberOne = input.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요.");
		int numberTwo = input.nextInt();
		
		System.out.println("세 번째 숫자를 입력하세요.");
		int numberThree = input.nextInt();
		
		System.out.println("네 번째 숫자를 입력하세요.");
		int numberFour = input.nextInt();
		
		int totalPoint = numberOne + numberTwo + numberThree + numberFour;
		System.out.println(numberOne + " + "
						+ numberTwo + " + "
						+ numberThree + " + "
						+ numberFour + " = "
						+ totalPoint);
		
		double averagePoint = totalPoint / 4.0;
		System.out.println("평균은 " + averagePoint + " 입니다.");
		
	}
	
}
