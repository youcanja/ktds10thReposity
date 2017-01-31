package com.ktds.ibj;
public class Stand {
	
	
	//멤버  변수 : 행동을 할때, 필요한 정보들
	
	String button = "스위치";
	String lamp = "전구";
	String elec = "전기";
	int light = 0;
	
	
	/**
	 * 스탠드 켜기
	 */
	void on(){
		System.out.printf("%s가 들어옵니다.\n",elec);
		
		System.out.println("스탠드를 켭니다.");
		light =5 ;
		
		String message = String.format("%s를 눌러서 %s를 켭니다.", button,lamp);
		System.out.println(message);
		
		message = String.format("밝기는 %d입니다.",light);
		System.out.println(message);
		
	}
	/**
	 * 스탠드 끄기
	 */
	void off(){
		
		
		
		System.out.println("스탠드를 끔니다.");
		light =0 ;
		
		String message = String.format("%s를 눌러서 %s를 끔니다.", button,lamp);
		System.out.println(message);
		
		message = String.format("밝기는 %d입니다.",light);
		System.out.println(message);
		
		System.out.printf("%s가 나갑니다.\n",elec);
		
	}
	/**
	 * 불 밝기 조절
	 */
	void brightnessControlUp(){
		light++;
		System.out.printf("밝기를 조절합니다. 밝기는 %d입니다\n", light);
		
	}
	void brigthnessCOntrolDown(){
		light--;
		System.out.printf("밝기를 조절합니다. 밝기는 %d 입니다.\n",light);
		
	}

}
