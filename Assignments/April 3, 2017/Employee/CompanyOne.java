package corejavamultipleclasses;

import java.util.Scanner;

public class CompanyOne {
	
		public static void main(String[] args) {
			        
			        int length;
					Scanner input = new Scanner(System.in);
					System.out.println("How many employees you want to enter?");
					length = input.nextInt();
								
					Employee employees [] = new Employee [length];
					int num;
					String name;
					String gend;
					int ageX;
					
					int i = 0;
					
					while(i < employees.length){
						
						System.out.println("Enter the Employee ID:   ");
						num = input.nextInt();
						System.out.println("Enter the Employee Name:   ");
						name = input.next();
					    System.out.println("Enter the Employee Gender:  ");
					    gend = input.next();
					    System.out.println("Enter the Employee Age: "); 
					    ageX = input.nextInt();	
											
						employees[i] = new Employee();
						employees[i].setNumber(num);
						employees[i].setFirstName(name);
						employees[i].setGender(gend);
						employees[i].setAge(ageX);
						
						i++;
						
					}
					           		
					for (i = 0; i < employees.length; i++){
						
						System.out.println("Employee ID: " + employees[i].getNumber() + "\n" + "Name: " + employees[i].getFirstName() + "\n" + "Gender: " + employees[i].getGender() + "\n" + "Age: "+ employees[i].getAge());
					    System.out.println("-------------------------------");
						
	}
	                  
			        						
	}
	}
		


