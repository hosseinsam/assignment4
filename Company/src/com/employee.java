package com;

import java.util.ArrayList;
import java.util.Scanner;

public class employee extends UserPass{

	public employee(String name, String lastName, int age, int yearsThatWork,
			String userName, String password, boolean vaziat , int trye) {
		super(name, lastName, age, yearsThatWork, userName, password, vaziat , trye);
		// TODO Auto-generated constructor stub
	}



	private int i = 0;
	private int j = 0;
	private int rt = 0 ;
	
	
	

	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	public int getRt() {
		return rt;
	}
	public void setRt(int rt) {
		this.rt = rt;
	}
	public ArrayList<UserPass> getEu() {
		return eu;
	}
	public void setEu(ArrayList<UserPass> eu) {
		this.eu = eu;
	}

	

	
	ArrayList<UserPass> eu = new ArrayList<>();
	
	public void manageEmployee(){
		Scanner sc = new Scanner(System.in);
		System.out.println("*****if you want to sign up again press -0- else press what intger else");
		int rch = sc.nextInt();
		if(rch == 0){
			signUp();
		}else{
			join();
		}
	}
	public void signUp(){
		System.out.print("****** please enter your information to signup ******");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name : ");
		String name1 = sc.nextLine();
		
		System.out.println("enter lastname : ");
		String lastName1 = sc.nextLine();
		
		System.out.println("enter username : ");
		String userName1 = sc.nextLine();
		
		System.out.println("enter password : ");
		String password1 = sc.nextLine();
		
		System.out.println("enter age : ");
		int age1 = sc.nextInt();
		
		System.out.println("enter yearsThatWork : ");
		int yearsThatWork1 = sc.nextInt();
		eu.add(new UserPass(name1, lastName1, age1, yearsThatWork1, userName1, password1 , true ,0));

	}
	
	public void join(){
	Scanner sc = new Scanner(System.in);	
	System.out.println("*_* join with enter username and password *_*");
		System.out.println("enter username : ");
		String userName2 = sc.nextLine();
		

		
		for( i = 0; i < eu.size(); i++){
			if(eu.get(i).getUserName().matches(userName2)&&eu.get(i).isVaziat() == true){
				
				System.out.println("user is true ");
				System.out.println("enter password : ");
				String password2 = sc.nextLine();
				if (eu.get(i).getPassword().matches(password2)){
				System.out.println("enjoy !!!");
				int a = 0;
				while(true){
				System.out.println("chosse one \n"
						+ "1.reservation\n"
						+ "2.send free day request\n"
						+ "3.exit");
				
				Scanner ch = new Scanner(System.in);
				a = ch.nextInt();
				switch (a){
				case 1:
					reservation();
					break;
				case 2:
					requestNumbers();
					break;
				case 3:
					
					return;
				}
				}
				
			}else{
				if (eu.get(i).getTrye() <= 3){
				System.out.println("false ----"+(3-eu.get(i).getTrye())+" times you can try");
				eu.get(i).setTrye(eu.get(i).getTrye() + 1);
				manageEmployee();
				}else if(eu.get(i).getTrye()>3){
					System.out.println("accounte "+userName2+" gheire faal shod");
					eu.get(i).setVaziat(false);;
				}
			}
				
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
	
	public void requestNumbers(){
		if(rt<=3){
		rt++;
		System.out.println("darkhaste shoma baraye bare "+rt+" om sabt shod");
		}else if (rt > 3){
			System.out.println("error!!!!darkhaste shoma bish az had sabt shode");
		}
		
	}
}
