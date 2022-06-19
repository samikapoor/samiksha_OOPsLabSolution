package oops.samiksha.service;

import java.util.Random;

import oops.samiksha.modal.Employee;

public class CredentialService {
	public char[] generatePassword() {
		int length,i;
		length = 8;
		String capLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetter = capLetter.toLowerCase();
		String numb = "0123456789";
		String symb = "!@#$%^&*()_+-?<>";
		
		String combinedString = capLetter + smallLetter + numb + symb;
		
		Random getRandom = new Random();
		
		char[] sysGeneratedPassword = new char[length];
		
		for(i=0; i<length; i++) {
			sysGeneratedPassword[i] = combinedString.charAt(getRandom.nextInt(combinedString.length()));
		}
		return sysGeneratedPassword;
	}
	
	public String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName + lastName + "@" + department + ".abc.com";
	}

	public void showCredentials(Employee empObj, String email, char[] getPassword) {
		System.out.println("Dear" + " " + empObj.getFirstName() + " " + "your generated credentials are as follows");
		System.out.println("Email -->" + " " + email);
		System.out.print("Password -->" + "");
		System.out.print(getPassword);
	}
}
