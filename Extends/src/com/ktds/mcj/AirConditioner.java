package com.ktds.mcj;

public class AirConditioner extends AirCleaner {

	/**
	 * 냉방 설정 온도
	 */
	private int temp = 26;
	
	/**
	 * 전원 켬
	 */
	@Override
	public void powerOn() {
		System.out.println("에어컨을 켭니다.");
		System.out.println("시원해 s집니다.");
		
		cooling();
		
		System.out.println("공기청정기 제조사 : " + super.manufactor);
		System.out.println("공기청정기 제조국가 : " + super.origin);
		
		super.powerOn();
	}
	
	/**
	 * 온도 낮추기
	 */
	public void cooling() {
		temp--;
		System.out.println("현재 설정 온도는 "+ temp + "도 입니다.");
	}
	
}





