package com.ktds.ibj;

public class ArmyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Army army = new Army();
		Person kdj =army.makeArmy("김도준"); // Person 클래스 를 사용하면서 new 를 사용하지 않음, 이러한 방식으로 실행됨
		
		//kdj.introduce();
		System.out.println(kdj.getName());
		System.out.println(kdj.getJob());
		
		
		Person jsm = army.makeArmy("조성만");
		System.out.println(jsm.getName());
		System.out.println(jsm.getJob());
	}

}
