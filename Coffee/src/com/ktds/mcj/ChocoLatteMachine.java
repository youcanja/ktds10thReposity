package com.ktds.mcj;

public class ChocoLatteMachine extends CoffeeMachine {

	@Override
	public void latte() {
		System.out.println(atm + "기압으로 라떼를 추출합니다.");
		System.out.println("초코시럽을 듬뿍 넣습니다.");
		System.out.println("생크림을 듬뿍듬뿍 넣습니다.");
		System.out.println("시나몬도 적당히 뿌려줍니다.");	
		System.out.println("5000원입니다.");
	}

}
