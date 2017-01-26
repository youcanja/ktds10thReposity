package com.ktds.ibj;

import java.util.Scanner;

import com.ktds.ibj.OilStation.OilStation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Main().operate();
		
	}
	
	private void operate(){
		
		OilStation oilStation = new OilStation();
		
		while(true){
			oilStationMenu(oilStation);
		}
	}
	private void oilStationMenu(OilStation oilstation){
		System.out.println("---------------Oil Station-------------------");
		System.out.println("* 리터당 가격(L/Won) : "+ oilstation.getCurrentValueLiterPerWon());
		System.out.println("* 현재 보유한 기름 :" + oilstation.getOilTong());
		selectFromCarToOilBank(oilstation);
		
	}
	
	public void selectFromCarToOilBank(OilStation oilstation){
		int select =0;
		System.out.println("1.관리자\n2.사용자\n 입력>>");
		Scanner input = new Scanner(System.in);
		
		if( (select=input.nextInt())==1){
			//관리자\
			adminModeModifyOilBankInfo(oilstation);
			
		}
		else if(select==2){
			//사용자
		
		}
	}
	public void adminModeModifyOilBankInfo(OilStation oilstation){
		int select=0;
		Scanner input = new Scanner(System.in);
		System.out.println("((((관리자))))");
		System.out.println("1.기름 채우기");
		System.out.println("2. 리터당 가격 변경");
		System.out.println("3. 종료");
		System.out.print("입력>>");
		
		if( (select= input.nextInt())==1){
			System.out.println("기름 채우기 \n 보충할 기름 입력>>");
			int oil = input.nextInt();
			oilstation.addOilToOilStation(oil);
		}
		else if(select ==2){
			System.out.println("리터당 가격을 변경합니다.\n>>");
			int modifyListerPerWon =input.nextInt();
			oilstation.setCurrentValue(modifyListerPerWon);
			
		}
		else if(select==3){
			System.out.println("돌아가기");
		}
		
	}

	
}
