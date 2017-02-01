package com.ktds.ibj.seller;

import com.ktds.ibj.buyer.Buyer;

public class Seller {

		/**
		 * 상품가격
		 */
	    private final int PRICE = 2500;
		/**
		 * 판매자가 가진 금액
		 */
	    private int money;
		/**
		 * 판매자가 가진 상품의 개수
		 */
		private int productQuantity;
		
		public Seller(int productivity,int money){
			System.out.println("판매자를 생성합니다.");
			
			setProductQuantity(productivity);
			setMoney(money);
			
			System.out.println(this);
		}
		/**
		 * 판매하기
		 */
		public void sell(Buyer buyer){
			
			
			//판매자가 가진 상품의 개수에서 하나를 뺀다.
			this.productQuantity--;
			//구매자는 돈을 지불한다.
			buyer.pay(PRICE);
			//판매자가 가진 금액에서 상품의 가격만큼 더한다.
			this.money += PRICE;
			
		}
		/**
		 * 재고 파악하기
		 * @return : boolean  재고가 있으면 true, 재고가 없으면 false;
		 */
		public boolean isSoldOut(){
			boolean isSoldOut = this.productQuantity==0;
			return isSoldOut;
			
		}
		/**
		 * 현황파악하기
		 * 
		 */
		@Override
		public String toString(){
			String message= String.format("\n판매자의 상품개수 : %d , 판매자가 가진 금액 : %d", this.productQuantity,this.money);
			return message;
		}
		
		public void setMoney(int moeny){
			this.money=moeny;
		}
		public int getMoney(){
			return this.money;
		}
		public void setProductQuantity(int productQuantity){
			this.productQuantity=productQuantity;
		}
		public int getProductQuantity(){
			return this.productQuantity;
		}
}
