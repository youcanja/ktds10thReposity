package com.ktds.mcj;

public class AirCleaner {

	public String manufactor = "휘센";
	protected String origin = "한국";
	private int power = 3;
	
	public void powerOn() {
		System.out.println("공기청정기를 가동합니다.");
		System.out.println("공기가 맑아집니다.");
	}
	
	@Override
	public String toString() {
		return "에어 클리너 입니다.";
	}
	
}
