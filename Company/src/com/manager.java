package com;

import java.util.ArrayList;
import java.util.Scanner;

public class manager extends UserPass{
	employee emp = new employee(null, null, 0, 0, null, null, true, 0);
	public manager(String name, String lastName, int age, int yearsThatWork,
			String userName, String password, boolean vaziat, int trye) {
		super(name, lastName, age, yearsThatWork, userName, password, vaziat, trye);
		// TODO Auto-generated constructor stub
	}
	ArrayList<UserPass> mu = new ArrayList<>();
	public void add() {
		mu.add(new manager("hossein", "samadi", 20, 5, "hossein","hossein" , true, 10000));
		login();
	}
	
	public void login(){
		for(int i = 0; i < mu.size(); i++){
			Scanner scanner = new Scanner(System.in);
	        System.out.println("Enrer username : ");
	        String username = scanner.nextLine();
	        if(mu.get(i).getUserName().matches(username)){
	        	System.out.println("Enrer password : ");
		        String password = scanner.nextLine();
	        		if (mu.get(i).getPassword().matches(password)){
	    				while(true){
	    					System.out.println("chosse one \n"
	    							+ "1.reservation\n"
	    							+ "2.avaiable disable accounts\n"
	    							+ "3.add or remove employee\n"
	    							+ "4.exit");
	    					
	    					Scanner ch = new Scanner(System.in);
	    					int a = ch.nextInt();
	    					switch (a){
	    					case 1:
	    						reservation();
	    						break;
	    					case 2:
	    						vaziateEmployee();
	    						break;
	    					case 3:
	    					    addRemove();
	    						break;
	    					case 4:
	    						
	    						return;
	    					}
	    					}
	        }else{
	        	System.out.println("password is false");
	        }
		}else{
			System.out.println("username is false");
		}
	}
	}
	
	
	private void addRemove() {
		Scanner cha = new Scanner(System.in);
		System.out.println("chosse one \n"
	    						+ "1.add Employee\n"
	    						+ "2.remove Employee :");
		int key = cha.nextInt();
		switch (key) {
		case 1:
			emp.signUp();
			break;
		case 2:
			for(int j = 0; j < emp.eu.size(); j++){
				System.out.printf("%duser name : %s\n",j,emp.eu.get(j).getUserName());
			}
			System.out.print("enter id to remove :");
			Scanner scan = new Scanner(System.in);
			String removeId = scan.nextLine();
			for(int i = 0; i < emp.eu.size(); i++){
				if(removeId.matches(emp.eu.get(i).getUserName())){
					emp.eu.remove(i);
				}else{
					System.out.println("we didnt have this id");
				}
			}
			
			break;
		}
		
	}

	public void vaziateEmployee() {
		
		for(int j = 0; j < emp.getEu().size(); j++){
			if (emp.getEu().get(j).isVaziat() == false){
				System.out.println("disable users: "+emp.getEu().get(j).getUserName());
				emp.eu.get(j).setVaziat(true);
				emp.eu.get(j).setTrye(0);
				System.out.println("now all users are aviable");
				
			}else{
				System.out.println("all users are aviable");
			}
				
		}
		
	}

	public void reservation(){
		Scanner res = new Scanner(System.in);
		System.out.println("enter 1to31 days of month :");
		int d = res.nextInt();
		
		System.out.println("choose one food for lunch :");
		System.out.println("1.ghormesabzi\n"
				+ "2.gheyme\n"
				+ "3.kabab");
		int n =0;
		n = res.nextInt();
		
		switch (n) {
		case 1:
			System.out.printf("food is ghormesabzi for %d of month\n", d);
			break;
		case 2:
			System.out.printf("food is    gheyme   for %d of month\n", d);
			break;
		case 3:
			System.out.printf("food is    kabab    for %d of month\n", d);
			break;
		}
	}

	


}
