package oops.samiksha.driver;

import java.util.Scanner;

import oops.samiksha.modal.Employee;
import oops.samiksha.service.CredentialService;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empObj = new Employee("Samiksha", "Mehendiratta");
		CredentialService service = new CredentialService();
		
		String getEmail;
		Employee employeeName;
		char[] getPassword;
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner inputValue = new Scanner(System.in);
		int userInput = inputValue.nextInt();
		
		switch(userInput) {
			case 1:
				getEmail = service.generateEmailAddress(empObj.getFirstName().toLowerCase(), empObj.getLastName().toLowerCase(), "technical");
				getPassword = service.generatePassword();
				service.showCredentials(empObj,getEmail, getPassword);
			break;
			case 2:
				getEmail = service.generateEmailAddress(empObj.getFirstName().toLowerCase(), empObj.getLastName().toLowerCase(), "admin");
				getPassword = service.generatePassword();
				service.showCredentials(empObj,getEmail, getPassword);
			break;
			case 3:
				getEmail = service.generateEmailAddress(empObj.getFirstName().toLowerCase(), empObj.getLastName().toLowerCase(), "hr");
				getPassword = service.generatePassword();
				service.showCredentials(empObj,getEmail, getPassword);
			break;
			case 4:
				getEmail = service.generateEmailAddress(empObj.getFirstName().toLowerCase(), empObj.getLastName().toLowerCase(), "legal");
				getPassword = service.generatePassword();
				service.showCredentials(empObj,getEmail, getPassword);
			break;
			default:
				System.out.println("Invaild entry! Please provide mentioned input only.");
			break;
		}
	}

}
