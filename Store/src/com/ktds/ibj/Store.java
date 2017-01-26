package com.ktds.ibj;

import com.ktds.ibj.buyer.Buyer;
import com.ktds.ibj.seller.Seller;

public class Store {

	
	/**
	 * Main 은 예외없이 start()
	 */
	public void start(){
		/*
		Buyer ljs = new Buyer(0, 5000000);
		Buyer jgu = new Buyer(0, 4000000);
		
		ljs.buy();
		System.out.println(ljs);
		System.out.println(jgu);
		*/
		Buyer lyj = new Buyer(0,50000);
		Seller nym = new Seller(500,500000);
		
		//판매자가 구매자에게 구매한다.
		lyj.buy(nym);
		
		System.out.println(lyj);
		System.out.println(nym);
		
//		System.out.println("장터에 오신것을 환영합니다!");
//		Buyer jjh = new Buyer(0, 5000000);
//		Seller mjk = new Seller(100, 500000000);
//		
//		System.out.println("\n바이어 :  상품 좀 살께욥. 이 상품 1개 주세욥");
//		mjk.sell();
//		jjh.buy();
//		
//		System.out.println("셀러 : 2500원 입니다.");
//		jjh.pay(2500);
//		
//		System.out.println(mjk);
//		System.out.println(jjh);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Store().start();
	
	}

}
