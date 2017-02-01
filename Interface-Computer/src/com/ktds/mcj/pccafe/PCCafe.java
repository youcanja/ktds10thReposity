package com.ktds.mcj.pccafe;

import com.ktds.mcj.AppleComputer;
import com.ktds.mcj.Computer;
import com.ktds.mcj.LGComputer;
import com.ktds.mcj.SamsungComputer;

public class PCCafe {

	public static void main(String[] args) {
		
		Computer[] computers = new Computer[5];
		
		computers[0] = new SamsungComputer();
		computers[1] = new LGComputer();
		computers[2] = new SamsungComputer();
		computers[3] = new AppleComputer();
		computers[4] = new LGComputer();
		
		for (Computer computer : computers) {
			computer.input();
			computer.compute();
			computer.store();
			if ( computer instanceof AppleComputer ) {
				((AppleComputer) computer).faceTime();
			}
		}
		
	}
	
}
