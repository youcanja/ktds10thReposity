package com.ktds.ibj.User;

import java.util.Scanner;

import com.ktds.ibj.VendingMachine.Item;
import com.ktds.ibj.VendingMachine.VendingMachine;

public class User {
	
	private int hasMoney; // 가진돈
	private Item[] itemList; // 물건 리스트
	private int productNumber; //물건 산 개수
	private final int LIST_SIZE=10;
	
	public User(int hasMonay){
		
		this.hasMoney=hasMonay;
		itemList = new Item[LIST_SIZE];
		productNumber=0;
		
	}
	
	public void buy(VendingMachine vm){
		vm.printInfoOfVendingMachine();
		int index=0;
		int quanities;
		
		Scanner input = new Scanner(System.in);
		System.out.print("구매할 목록 선택(번호입력) : ");
		
		index=input.nextInt();
		
		Item tempItem = vm.getItem()[index-1];
		System.out.println(tempItem.getItemName()+" 을 선택 하셨습니다.");
		
		System.out.println("수량을 선택하세요!");
		quanities=input.nextInt();
		
		if(tempItem.getItemValue()*quanities < hasMoney){
				itemList[productNumber] = new Item();
				itemList[productNumber].setItemName(tempItem.getItemName());
				itemList[productNumber].setItemQuantity(quanities);
				itemList[productNumber].setItemValue(tempItem.getItemValue());
				vm.sell(this);
		}
		else
		{
			System.out.println("잔액부족");
		}
		
		
		
		
	}
	public void pay(){
		
		
		this.hasMoney -=itemList[productNumber].getItemQuantity()*itemList[productNumber].getItemValue();
		productNumber++;
		System.out.println("거래후 USER 상태");
		printUserInfo();
		
	}
	public Item[] getUserItemList(){
		return itemList;
	}
	public int getProductNuber(){
		return productNumber;
	}
	
	public void printUserInfo(){
		System.out.println("USER 정보 입니다.");
		System.out.println("가진돈  : "+ hasMoney +" 물건 개수 : " +productNumber);
		for(int i=0; i<productNumber;i++){
			System.out.println("["+i+1 +"]"+ "품목이름 : " +itemList[i].getItemName()+ ", 갯수 : " +itemList[i].getItemQuantity());
		}
	}

}
