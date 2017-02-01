package com.ktds.ibj.buyer;

import com.ktds.ibj.seller.Seller;

/**
 * Seller에게 상품을 구매하고 금액을 Seller 에게 지불한다.
 * 
 * @author 
 *
 */
public class Buyer {

	/**
	 * 상품갯수
	 */
	private int productQuantity;
	/**
	 * 구매자가 가진 금액
	 */
	private int money;
	/**
	 * 상품 개수를 초괴화 또는 갱신함
	 * @param productQuantity
	 */
	
	public Buyer(int productQuantity, int money){
		System.out.println("구매자를 생성합니다.");
		
		//초기값 세팅
		setProductQuantity(productQuantity);
		setMoney(money);
		
		//현황 - > 자동으로 오버라이딩한 toString을 호출한다.
		System.out.println(this);
	}
	
	public void setProductQuantity(int productQuantity){
		this.productQuantity=productQuantity;
	}
	/**
	 * 상품 개수를 반환함 (출력용)
	 * @return
	 */
	public int getProductQuantity(){
		return this.productQuantity;
	}
	/**
	 * 구매자가 가진 돈을 초기화 또는 갱신함
	 * @param money
	 */
	public void setMoney(int money){
		this.money=money;
	}
	/**
	 * 구매자가 가진 돈을 반환함 (출력용)
	 */
	public int getMoney(){

		return this.money;
	}
	
	public void buy(Seller seller){
		/**
		 * 구매하기
		 * 구매자가 가진 상품 개수에 1을 더해준다.
		 */
		//판매자가 팝니답
		
		seller.sell(this);
		this.productQuantity++;
	}
	/**
	 * 지불하기
	 * 구매자가 가진 돈에서 지불할 돈을 뺀다.
	 * @param money
	 */
	public void pay(int money){
		this.money -=money;
	}
	
	/**
	 * 구매자 현황 파악하기
	 */
	@Override
	public String toString(){
		
		String message = String.format("\n구매한 상품 개수 :  %d\n구매자가 가진 금액 : %d\n",this.productQuantity,this.money);
		return message;
		
	}
}
