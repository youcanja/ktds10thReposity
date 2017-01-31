package com.ktds.ibj.buyer;

import com.ktds.ibj.seller.Seller;

public class Buyer {
	
	//가지고 있는 돈
	private int hasMoney;
	
	//살 과일 개수
	private int numbersOfFruit;
	
	public Buyer(int hasMoney,int numbersOfFruit){
		
		
		this.hasMoney=hasMoney;
		this.numbersOfFruit=numbersOfFruit;
		System.out.println("BUYER을 생성합니다.");
		System.out.println(this);
		
	}
	
	//구매자가 판매자로부터 과일을 BUY 함
	public void buy(Seller seller){
		System.out.println("BUYER가 SELLER 로부터 과일을 구매하려 합니다");
		seller.sell(this);
		
	}
	//구매자는 과일의 가격을 지불함
	public void pay(int fruitMoney){
		if(hasMoney-fruitMoney >0){
			System.out.println(fruitMoney+"짜리 과일을 구입합니다.");
			numbersOfFruit++;
			System.out.println("\n구매자 지불후 정보");
			System.out.println(this);
		}
		else{
			System.out.println("잔액 부족");
		}
	}
	
	
	@Override
	public String toString(){
		
		String message = String.format("\n구매한 상품 개수 :  %d\n구매자가 가진 금액 : %d\n",this.numbersOfFruit,this.hasMoney);
		return message;
		
	}
	
}
