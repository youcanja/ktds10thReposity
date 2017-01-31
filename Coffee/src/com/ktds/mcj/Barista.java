package com.ktds.mcj;

public class Barista {

	public void coffee(CoffeeMachine coffeeMachine) {
		
		if ( coffeeMachine instanceof EspressoMachine ) {
			System.out.println("에스프레소 머신");
		}
		else if ( coffeeMachine instanceof LatteMachine ) {
			System.out.println("라떼 머신");
		}
		else if ( coffeeMachine instanceof ChocoLatteMachine ) {
			System.out.println("초코라떼 머신");
		}
		
		coffeeMachine.espresso();
		coffeeMachine.latte();

	}
	
}
