package com.ktds.ibj.VendingMachine;

import com.ktds.ibj.User.User;

public class VendingMachine {
	
	//아이템 품목
	private Item[] item;
	private int itemNumber; // 자판기 아이템 갯수
	private int totalSum;
	public VendingMachine() {
		
		item = new Item[10];
		
		itemNumber=0;
		//기본 품목 3개
		
		
		item[itemNumber++]=new Item("콜라",500,1000);
		item[itemNumber++]=new Item("사이다",400,850);
		item[itemNumber++]=new Item("환타",600,1250);
		totalSum=0;
		
	}
	
	public void printInfoOfVendingMachine(){
		System.out.println("-------------------자판기----------------------");
		for(int i=0; i<itemNumber;i++)
			System.out.print("["+(i+1)+"]"+item[i]);
	}
	public int getItemNumber(){
		return itemNumber;
	}
	public Item[] getItem(){
		return item;
	}
	
	
	public void sell(User user){
		int userIndex= user.getProductNuber();
		int userWantQuantites = user.getUserItemList()[userIndex].getItemQuantity();
		
		//Item tempItem =user.getUserItemList()[userIndex];
		Item tempItem =item[userIndex];
		
		if( tempItem.getItemQuantity() >= userWantQuantites){
			
			tempItem.setItemQuantity(tempItem.getItemQuantity()-userWantQuantites);
			totalSum += tempItem.getItemValue()*userWantQuantites;
			
			System.out.println("거래후 자판기 상태");
			printInfoOfVendingMachine();
			user.pay();
		}
		else
		{
			System.out.println("수량 부족");
		}
		
	}
	
	

}
