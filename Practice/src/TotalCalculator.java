import java.util.Scanner;

/**
 * 산술 연산자를 이용해 합계 구하기
 * @author minchangjang
 *
 */
public class TotalCalculator {

	Scanner input = new Scanner(System.in);
	
	void printTotalPoint() {
		
		System.out.println("합계 구하기 프로그램");
		
		System.out.println("첫 번째 숫자를 입력하세요.");
		int numberOne = input.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요.");
		int numberTwo = input.nextInt();
		
		System.out.println("세 번째 숫자를 입력하세요.");
		int numberThree = input.nextInt();
		
		int totalPoint = numberOne + numberTwo + numberThree;
		
		System.out.println(numberOne + " + "
						+ numberTwo + " + "
						+ numberThree + " = "
						+ totalPoint);
		
		
	}
	
}
