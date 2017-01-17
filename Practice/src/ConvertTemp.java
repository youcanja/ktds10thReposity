import java.util.Scanner;

/**
 * 섭씨를 입력받아 화씨로 변환하기
 * 화씨를 입력받아 섭씨로 변환하기
 * 
 * @author minchangjang
 *
 */
public class ConvertTemp {

	Scanner input = new Scanner(System.in);
	
	void convertAndPrintCelToFah() {
		
		System.out.println("섭씨에서 화씨로 변환합니다.");
		System.out.println("섭씨를 입력해 주세요.");
		double cel = input.nextDouble();
		double fah = (cel * 1.8) + 32;
		
		System.out.println("섭씨 " + cel + 
				"은 화씨" + fah + "입니다.");
		
	}
	
	void convertAndPrintFahToCel() {
		
		System.out.println("화씨에서 섭씨로 변환합니다.");
		System.out.println("화씨를 입력해 주세요.");
		double fah = input.nextDouble();
		double cel = (fah - 32) / 1.8;
		
		System.out.println("화씨 " + fah + 
				"은 섭씨" + cel + "입니다.");
		
	}
	
}
