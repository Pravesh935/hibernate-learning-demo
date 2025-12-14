package Task;


/* 
 * one to one bidirectional
 * 1: Perform save operation
 * 2: perform find operation
 * 3: Perform update operation
 * 4: Exit
 * 
 * */


import java.util.Scanner;



public class Controller{
 public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DAO dao = new DAO();
		
		boolean flag = true;
		
		while(flag) {
			
			System.out.println("Enter your choice :" );
			
			System.out.println(" 1: To save");
			System.out.println(" 2: To find");
			System.out.println(" 3: To update");
			System.out.println(" 4: EXIT");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: {
				
				System.out.println("Enter id:");
				int id = sc.nextInt();
				System.out.println("Enter Model name: ");
				String model = sc.next();
				
				System.out.println("Enter sim id:");
				int sid = sc.nextInt();
				System.out.println("Enter Provider name:");
				String provider = sc.next();
				System.out.println("Enter mobile number");
				long mob = sc.nextLong();
				
				dao.saveDetails( id,  model,  sid,  provider,  mob);
				
				
				break;
			}
			
			case 2: {
				System.out.println("Enter id");
				int id = sc.nextInt();
				
				dao.find(id);
				break;
				
			}
			
			case 3: {
				System.out.println("Enter id where you want to update:");
				int id = sc.nextInt();
				
				dao.update(id);
				
				break;
			}
			
			case 4: {
				System.out.println("T hankyou for visiting--> come again 🙏");
				flag=false;
				break;
			}
			
			
			
			
			
			}
		}
		
		
		
		
		
		
}
}
