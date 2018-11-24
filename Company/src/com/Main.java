package com;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("***** welcome *****");
		// TODO Auto-generated method stub
		employee n = new employee(null, null, 0, 0, null, null , true,0);
		manager m = new manager(null, null, 0, 0, null, null, true, 0);
		while(true){
			System.out.println("***** if you are employee 0\n"
					+ "***** or you are manager 1");
			Scanner scs = new Scanner(System.in);
			int changer = scs.nextInt();
			if(changer == 0){
				n.manageEmployee();
			}else if(changer == 1){
				m.add();
				System.out.println("fuck you wait");
			}else{
				
			}
		}
	}
}
