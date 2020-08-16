package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<Employees> list = new ArrayList<>();
		
		System.out.print("How many employees will be regsitred?");
		int  n = sc.nextInt();
		
		for(int i = 0; i< n; i++) {
			
			System.out.println("Employees #"+(i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			
			
			
			Employees emp = new Employees(id, name, salary);
			
			list.add(emp);
			
		}
		System.out.print("Enter the employees id that will have salary increase: ");
		int idsalary = sc.nextInt();
		

	}
	public int hasId(List<Employees> list, int id) {
		for(int i= 0; i<list.size(); i++) {
			
		}
		
	}

}

