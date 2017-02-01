package com.ktds.ibj;

public class Calculator {
	
	public void printComputeResult(){
		int result = 1+1 ;
		System.out.println(result);
		
	}
	/**
	 * printComputeResult method over loading
	 * 매소드의 이름은 같지만 파라미터의 종류나 개수가 다른 매서드
	 * 
	 * @param numberOne
	 * @param numberTwo
	 */
	//primitive(8가지 char, byte, short , int , long , float, double ,boolean) + void = 9가지
	
	public void printCoumputeResult(int numberOne, int numberTwo){
		int result = numberOne + numberTwo;
		System.out.println(result);
		
	}
	/**
	 * 매서드 명명 할때, 상대가 알 수 있게 명명해야함
	 * 
	 * 숫자 두 개를 전달 받아 곱한 뒤 출력하고 반환한다.
	 * 
	 * @param numberOne : int 첫 번째 숫자.
	 * @param numberTwo : int 두 번째 숫자.
	 * @return result  : int numberOne * numberTwo
	 */
	public int getAndprintMultiplecationResult(int numberOne, int numberTwo){
		int result = numberOne* numberTwo;
		System.out.println(result);
		
		return result;
	}
}
