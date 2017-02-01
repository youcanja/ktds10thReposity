package com.ktds.ibj;

import com.ktds.ibj.User.User;
import com.ktds.ibj.VendingMachine.VendingMachine;

public class SmallWorld {

	public static void main(String[] args){
		
		VendingMachine vm = new VendingMachine();
		vm.printInfoOfVendingMachine();
		User user = new User(7000);
		
		
		while(true){
		user.printUserInfo();
		user.buy(vm);
		}
		
	
		

	}
}
