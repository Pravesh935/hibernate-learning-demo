package company;

import java.util.Scanner;

public class EmpController {
public static void main(String[] args) {
	DAO dao = new DAO();
	Scanner sc = new Scanner(System.in);
	
	while(true)
	{
		
		System.out.println("Enter your choice");
		System.out.println(" 1: Insert Employee");
		System.out.println(" 2: Update Employee Details");
		System.out.println(" 3: Find Employee");
		System.out.println(" 4: Delete Employee");
		System.out.println(" 5: EXIT");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:{
			 System.out.println("Enter id:");
			 int id = sc.nextInt();
			 
			 System.out.println("Enter Name:");
			 String name = sc.next();
			 
			 System.out.println("Enter Salary:");
			 int sal = sc.nextInt();
			 
			 Employee e = new Employee(id, name, sal);
			 dao.InsertEmployee(e);
		
			break;
		}
		
		case 2:{
			System.out.println("Enter the id where you want to update");
			int id = sc.nextInt();
			System.out.println("Enter salary");
			int sal=sc.nextInt();
			dao.UpdateEmp(id,sal);
			
			
			break;
		}
		
		case 3:{
			System.out.println("Enter the to find Employee");
			int id = sc.nextInt();
			
			dao.FindEmp(id);
			
			break;
		
		}
		
		case 4:{
			
			System.out.println("Enter the id which you want to delete");
			int id = sc.nextInt();
			
			dao.DeleteEmp(id);
			break;
		}
		
//		case 5:{
//			dao.Exit();
//			break;
//		}
		
		
		}
		sc.close();
	}
	
}
}
