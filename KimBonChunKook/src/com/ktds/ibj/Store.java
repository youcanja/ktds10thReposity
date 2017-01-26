package com.ktds.ibj;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

import com.ktds.ibj.item.Item;
import com.ktds.ibj.user.User;

public class Store {
	
	private Item[] itemList;
	private int itemNum;
	private int totalBudget;
	private static  final int MAX_ITEM_NUM =40;
	public Store(){
		
		itemList = new Item[MAX_ITEM_NUM];
		itemNum=0;
		//메뉴 2개 등록
		
		// 김밥 , 2500 등록
		itemList[itemNum]= new Item();
		itemList[itemNum].setMenuItem("김밥");
		itemList[itemNum].setMenuitemValue(2500);
		
		itemNum++;
		// 라뽂이, 2500 등록
		itemList[itemNum]= new Item();
		itemList[itemNum].setMenuItem("라볶이");
		itemList[itemNum].setMenuitemValue(3500);
		itemNum++;
		
		
	}
	public void printStoreMenu(){
		System.out.println("-----------------깁밥천국 MENU------------------");
		for(int i=0; i<itemNum;i++){
			System.out.println("["+(i+1)+"]"+ "  "+itemList[i].getItemName()+"   "+itemList[i].getItemValueWon());
		}
	}
	public void printAdminMenu(){
		
		
		System.out.println("1. Menu Add");
		System.out.println("2. Menu Modify");
		System.out.println("3. Show buget\n>>");
		
		
		
		
	}
	public void selectMenu(){
		Scanner input= new Scanner(System.in);
		int select= input.nextInt();
		
		if(select==1){
			this.addMenuList();
			//Menu Add
		}
		else if(select==2){
			this.modifyMenuList();
			//Menu Modify
		}
		else if(select==3){
			this.showBudget();
			//Show Budget
		}
	}
	private void showBudget() {
		
		System.out.println("현재 김밥천국의 총 budget = "+ totalBudget+" 원입니다.");
		// TODO Auto-generated method stub
		
	}
	private void modifyMenuList() {
		printStoreMenu();
		Scanner input= new Scanner(System.in);
		System.out.print("Input! Do you want number >>");
		
		int select;
		select=input.nextInt();
		
		int index=select-1;
		System.out.println(itemList[index].getItemName()+" 선택 하셨습니다.");
		
		System.out.print("가격을 변경합니다.\n 가격 입력 >> ");
		int value=input.nextInt();
		
		System.out.print(itemList[index].getItemValueWon() +"에서 ");
		itemList[index].setMenuitemValue(value);
		System.out.print(itemList[index].getItemValueWon() +"으로 변경합니다. ");
		
		// TODO Auto-generated method stub
		
	}
	private void addMenuList() {
		printStoreMenu();
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("메뉴를 추가합니다.");
		
		System.out.print("Input! Do you want ItemName >>");
		String newItem =input.next();
		System.out.print("Input! Do you want ItemValue >>");
		int newItemValue = input.nextInt();
		
		System.out.println("-----------------추가중------------------");
		itemList[itemNum++]=new Item(newItem,newItemValue);
		System.out.println("-----------------추가완료------------------");
		printStoreMenu();
		
	}
	public void selectedItemPrint(int index){
		System.out.println(itemList[index].getItemName()+"("+itemList[index].getItemValue()+")"+" 을 선택하셨습니다.");
	}
	public Item[] getItemList(){
	 	return itemList; 
	}
	public void sell(User user, Item wantItem) {
		// TODO Auto-generated method stub
		totalBudget+=wantItem.getItemValue();
		System.out.println("김밥천국 +"+wantItem.getItemValue()+"("+wantItem.getItemName()+")");
		user.pay(wantItem);
		
		
		
	}
	
	
	
}
