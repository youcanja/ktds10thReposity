package com.ktds.ibj;

public class Army {
	
	public final String JOB = "직업군인"; //public static final String JOB ="직업군인"
	
	
	public Person makeArmy(String name){
		
		// 1.외부에서 전달 받은 이름을 이용해 Person 클래스를 생성한다.
		Person army = new Person(name,"직업군인");
		
		// 2.생성된 Person 객체를 반환한다.
		return army;
		
	}

}
