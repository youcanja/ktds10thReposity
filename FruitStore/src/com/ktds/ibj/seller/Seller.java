package com.ktds.ibj.seller;

import com.ktds.ibj.buyer.Buyer;

public class Seller {
	
	private int hasMoney;
	
	private int hasNumbersOfFruits;
	
	public final int APPLE =500;

	public Seller(int hasMoney, int hasNumbersOfFruits){
		
		this.hasMoney=hasMoney;
		this.hasNumbersOfFruits=hasNumbersOfFruits;
		System.out.println("SELLER을 생성합니다.");
		System.out.println(this);
	}
	
	public void sell(Buyer buyer){
		
		System.out.println("SELLER 가 과일을 팔려합니다.");
		if(isRemain()){
			hasMoney += APPLE;
			hasNumbersOfFruits--;
			buyer.pay(APPLE);
			
			System.out.println("판매자 지불후 정보");
			System.out.println(this);
		}
		else
		{
			System.out.println("재고 없음");
		}
		
	}
	@Override
	public String toString(){
		
		String message = String.format("\n현재 상품 개수 :  %d\n판매자가 가진 금액 : %d\n",this.hasNumbersOfFruits,this.hasMoney);
		return message;
		
	}
	public boolean isRemain(){
		if(hasNumbersOfFruits!=0)
			return true;
		return false;
	}

}
