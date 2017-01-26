package com.ktds.ibj.item;

public class Item {
	
	private String itemName;
	private int itemValue;
	
	public Item(String itemName,int itemValue){
		this.itemName=itemName;
		this.itemValue=itemValue;
	}
	public Item(){
		itemName="noName";
		itemValue=0;
	}
	public void setMenuItem(String itemName){
			this.itemName=itemName;
	}
	public void setMenuitemValue(int itemValue){
			this.itemValue=itemValue;
	}
	public String getItemName(){
		return itemName;
	}
	public String getItemValueWon(){
		return itemValue+"원";
	}
	public int getItemValue(){
		return itemValue;
	}
	
	
}
