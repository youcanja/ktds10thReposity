import java.util.Scanner;

/**
 * 입력받은 구구단 출력하기
 * @author minchangjang
 *
 */
public class MultiplyCalculator {

	Scanner input = new Scanner(System.in);
	
	void printMultiply() {
		
		System.out.println("구구단 출력 프로그램입니다.");
		System.out.println("원하는 단을 입력하세요.");
		
		int number = input.nextInt();
		
		int multiplyResult = number * 1;
		System.out.println( number + " X " + 1 + " = " + multiplyResult );
		
		multiplyResult = number * 2;
		System.out.println( number + " X " + 2 + " = " + multiplyResult );
		
		multiplyResult = number * 3;
		System.out.println( number + " X " + 3 + " = " + multiplyResult );
		
		multiplyResult = number * 4;
		System.out.println( number + " X " + 4 + " = " + multiplyResult );
		
		multiplyResult = number * 5;
		System.out.println( number + " X " + 5 + " = " + multiplyResult );
		
		multiplyResult = number * 6;
		System.out.println( number + " X " + 6 + " = " + multiplyResult );
		
		multiplyResult = number * 7;
		System.out.println( number + " X " + 7 + " = " + multiplyResult );
		
		multiplyResult = number * 8;
		System.out.println( number + " X " + 8 + " = " + multiplyResult );
		
		multiplyResult = number * 9;
		System.out.println( number + " X " + 9 + " = " + multiplyResult );
	}
	
}
