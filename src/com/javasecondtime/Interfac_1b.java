package com.javasecondtime;

public class Interfac_1b extends Abstracttion_1a implements Interfac_1a,Extra   {

	@Override
	public void employeeId() {
		System.out.println("subi amazon");
	}

	@Override
	public void empoyeeName() {
		System.out.println("subi nivas");
		
	}

	@Override
	public void employeeSalary() {
		System.out.println("25k");
		
	}

	@Override
	public void employeeChilds() {
		System.out.println("5 girls ");
	}
	//this from abstraction class
	
	@Override
	void employeeName() {
	   
		System.out.println("vignesh");
		
	}
    //this also
	@Override
	void employeeAddress() {
		System.out.println("======================Abstration===============");
		System.out.println("kanyakumari");
		
	}
	//from interface class
	@Override
	public void acCompany(String string) {
		System.out.println(string);
		
	}
    
	@Override
	public void acEmployees() {
		System.out.println("frank");
		
	}

	@Override
	public void acBikes() {
		System.out.println("============Interface extra methods========");
		System.out.println("royal enfield");
		
	}

	@Override
	public void acCars() {
		System.out.println("swift");
	}//till this from interface class
	
	public static void main(String[] args) {
		
		Interfac_1b dh = new Interfac_1b();
		
		dh.employeeId();
		dh.empoyeeName();
		dh.employeeSalary();
		dh.employeeChilds();
		dh.employeeAddress();
		dh.employeeName();
		dh.acBikes();
		dh.acCars();
		dh.acEmployees();
		dh.acCompany("rwereer");
		
		
	}

	@Override
	public void acCompany() {
		// TODO Auto-generated method stub
		
	}




		
	}

	

	


