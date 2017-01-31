package com.ktds.ibj.user;

import java.util.Scanner;

import com.ktds.ibj.Store;
import com.ktds.ibj.item.Item;

public class User {
	
	private Item[] itemList;
	private int itemNum;
	private int buget;
	
	
	private static final int MAX_SIZE =10;
	
	
	
	public User(int buget){
		
		itemList = new Item[MAX_SIZE];
		itemNum=0;
		this.buget=buget;
	}
	
	public void printMyState(){
		System.out.println("-------------------나의 구매 내역------------------");
		int total=0;
		for(int i=0; i<itemNum;i++)
		{
			System.out.println("["+(i+1)+"]"+ itemList[i].getItemName()+" "+itemList[i].getItemValueWon());
			total +=itemList[i].getItemValue();
		}
		System.out.println("사용 금액    "+ total+" 원 "
				+ "남은 buget ="+ this.buget);
	}
	
	public void buy(Store store){
		Scanner input = new Scanner(System.in);
		System.out.println("메뉴를 보고 원하는 것을 선택하세요 ");
		store.printStoreMenu();
		System.out.print(">>");
		int selectItemNum= input.nextInt()-1;
		store.selectedItemPrint(selectItemNum);
		
		Item selectedItem[] =store.getItemList();
		
		Item wantItem = selectedItem[selectItemNum];
		String selectedItemName = wantItem.getItemName();
		int selectedItemPrice = wantItem.getItemValue();
		
		if(buget-selectedItemPrice >0){
			
			store.sell(this,wantItem);
		}
		else{
			System.out.println("잔액이 부족합니다. ");
		}
	}

	public void pay(Item wantItem) {
		// TODO Auto-generated method stub
		System.out.println("구매자 -"+wantItem.getItemValue()+"("+wantItem.getItemName()+")");

		
		this.itemList[itemNum]= new Item(wantItem.getItemName(),wantItem.getItemValue());
		
		//System.out.println(itemList[itemNum].getItemName());
		
		this.buget -= wantItem.getItemValue();
		this.itemNum++;
		printMyState();
		
	}
	
	
}
