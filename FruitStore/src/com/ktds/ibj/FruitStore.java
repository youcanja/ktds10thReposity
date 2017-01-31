package com.ktds.ibj;

import com.ktds.ibj.buyer.Buyer;
import com.ktds.ibj.seller.Seller;

public class FruitStore {
	
	public static void main(String[] args){
		
		Buyer buyer = new Buyer(10000,0); 
		Seller seller = new Seller(0,1000);
		
		
		buyer.buy(seller);
		
		
		
	}

}
