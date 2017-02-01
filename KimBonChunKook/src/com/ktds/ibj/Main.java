package com.ktds.ibj;

import java.util.Scanner;

import com.ktds.ibj.user.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store = new Store();
		new Main().operatStore(store);
		
		
		
		//store.printStoreMenu();
	}
	public void operatStore(Store store){
		
		int select=0;
		Scanner input =new Scanner(System.in);
		User user = new User(500000);
		
		
		
		while(true){
			store.printStoreMenu();
		System.out.println("Who are you 1)amdin 2)user 999)exit");
		select= input.nextInt();
		if(select==1){
			//admin
			store.printAdminMenu();
			store.selectMenu();
			
		}
		else if(select==2){
			//user
			
			user.printMyState();
			user.buy(store);
		}
		else if(select==999){
			System.out.println("종료 합니다.");
			break;
		}
		input.nextLine();
		System.out.println("\n\n\n\n\n\n\n");
		}
		
		
	}
	
	

}
