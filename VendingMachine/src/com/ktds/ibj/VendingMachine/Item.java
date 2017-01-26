package com.ktds.ibj.VendingMachine;

/**
 *  자판기 판매 상품 정보
 * @author Admin
 *
 */
public class Item {

		private String itemName;
		private int itemValue;
		private int itemQuantity;
		public Item(){
			
		}
		public Item(String itemName, int itemValue,int itemQuantity){
		
				this.itemName=itemName;
				this.itemValue = itemValue;
				this.itemQuantity=itemQuantity;
		}
		public String getItemName(){
			return itemName;
		}
		public int getItemValue(){
			return itemValue;
		}
		public int getItemQuantity(){
			return itemQuantity;
		}
		public void setItemName(String itemName){
				this.itemName=itemName;
		}
		public void setItemValue(int itemValue){
				this.itemValue=itemValue;
		}
		public void setItemQuantity(int itemQuantity){
				this.itemQuantity=itemQuantity;
		}
		
		@Override
		public String toString(){
			
			String message = String.format("\n 종류 :  %s , 판매 금액 : %d , 재고수량  : %d \n",this.itemName,this.itemValue,this.itemQuantity);
			return message;
			
		}
}
