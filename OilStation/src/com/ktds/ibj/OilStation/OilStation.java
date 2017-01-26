package com.ktds.ibj.OilStation;


public class OilStation {

	private int oilTong;	   //주유소 기름 통
	private int currentValue;//주유소 리터당 가격
	private int budget; //주유소 예산
	
	
	/**
	 * 초기화
	 * 기름통 =50000000
	 * 리터당 가격 =1450
	 * 주유소 예산 =0
	 */
	public OilStation(){
		this.oilTong =50000000;
		this.currentValue=1450;
		this.budget=0;
		
	}
	
	
	public int getOilTong(){
		return oilTong;
	}
	public int getCurrentValue(){
		return currentValue;
	}
	public int getBudget(){
		return budget;
	}
	public String getCurrentValueLiterPerWon(){
		return getCurrentValue()+"Liter/Won";
	}
	public void addOilToOilStation(int oil){
		 oilTong+=oil;
		 System.out.println(oil+"충원함"+ "현재 :"+oilTong);
	}
	public String getCurrentOilTongLitter(){
		return oilTong+"Liter";
	}
	public void setCurrentValue(int currentValue){
			int temp=this.currentValue;
			this.currentValue=currentValue;
			 System.out.println(temp+"에서"+currentValue+" 으로 변경됐습니다.");
			
	}
}
