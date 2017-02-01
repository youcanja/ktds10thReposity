package com.ktds.mcj;

public class Cafe2 {

	public static void main(String[] args) {
		
		CoffeeMachine coffeeMachine = new EspressoMachine();
		CoffeeMachine latteMachine = new LatteMachine();
		CoffeeMachine chocoLatteMachine = new ChocoLatteMachine();
		
		Barista barista = new Barista();
		barista.coffee(coffeeMachine);
		barista.coffee(latteMachine);
		barista.coffee(chocoLatteMachine);
		
	}
	
}
