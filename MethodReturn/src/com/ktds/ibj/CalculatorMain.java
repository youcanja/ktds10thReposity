package com.ktds.ibj;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calculator = new Calculator();
		calculator.printComputeResult();
		calculator.printCoumputeResult(10, 50);
		
		int result =calculator.getAndprintMultiplecationResult(10,7);
		
		String message = String.format("%d * %d = %d " ,10,7,result);
		System.out.println(message);
		

	}

}
