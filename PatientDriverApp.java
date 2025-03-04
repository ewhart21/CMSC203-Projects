/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer
 * Description: PatientDriverApp is the driver which initializes the other two classes, obtains user input, and outputs the message. 
 *				The Patient class contains all the information of the patient and the Procedure class contains the information of each
 *				procedure. 
 * Due: 03/04/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ethan Hart
*/

import java.util.Scanner;
public class PatientDriverApp {
	
	public static void main(String args[]) {
		
		//Initialization of Scanner class
		Scanner scanner = new Scanner(System.in);
		
		//Declaration of variables to be used for Patient class
		String firstName;
		String middleName;
		String lastName;
		String address;
		String city;
		String state;
		String zipCode;
		String phoneNumber;
		String emergencyContact;
		
		//Declaration of variables to be used for Procedure class
		String nameOfProcedure1 = "", nameOfProcedure2 = "", nameOfProcedure3 = "";
		String date1 = "", date2 = "", date3 = "";
		String nameOfPractitioner1 = "", nameOfPractitioner2 = "", nameOfPractitioner3 = "";
		double charges1 = 0.0, charges2 = 0.0, charges3 = 0.0;
		
		//Ask user for patient information
		System.out.println("What is the first name of the patient? ");
		firstName = scanner.nextLine();
		
		System.out.println("What is the middle name of the patient? ");
		middleName = scanner.nextLine();
		
		System.out.println("What is the last name of the patient? ");
		lastName = scanner.nextLine();
		
		System.out.println("What is the address of the patient? ");
		address = scanner.nextLine();
		
		System.out.println("What is the city the patient lives in? ");
		city = scanner.nextLine();
		
		System.out.println("What is the state the patient lives in? ");
		state = scanner.nextLine();
		
		System.out.println("What is the patient's ZIP code? ");
		zipCode = scanner.nextLine();
		
		System.out.println("What is the patient's phone number? ");
		phoneNumber = scanner.nextLine();
		
		System.out.println("What is the name of the patient's emergency contact? ");
		emergencyContact = scanner.nextLine();
		
		
		//Initialization of an instance of Patient class
		Patient patient = new Patient(firstName, middleName, lastName, address, city, state, zipCode, phoneNumber, emergencyContact);
		
		
		
		//Ask user for information about the patient's three procedures
		for(int i = 1; i <= 3; i++) {
			System.out.println("Information about procedure " + i + ":\n");
			if(i == 1) {
				System.out.println("What is the name of the patient's procedure? ");
				nameOfProcedure1 = scanner.nextLine();
			
				System.out.println("What is the date of the procedure? ");
				date1 = scanner.nextLine();
				
				System.out.println("What is the name of the patient's practitioner? ");
				nameOfPractitioner1 = scanner.nextLine();
				
				System.out.println("What is the charge for this procedure? ");
				charges1 = Double.parseDouble(scanner.nextLine());
			} else if (i == 2) {
				System.out.println("What is the name of the patient's procedure? ");
				nameOfProcedure2 = scanner.nextLine();
			
				System.out.println("What is the date of the procedure? ");
				date2 = scanner.nextLine();
				
				System.out.println("What is the name of the patient's practitioner? ");
				nameOfPractitioner2 = scanner.nextLine();
				
				System.out.println("What is the charge for this procedure? ");
				charges2 = Double.parseDouble(scanner.nextLine());
			} else {
				System.out.println("What is the name of the patient's procedure? ");
				nameOfProcedure3 = scanner.nextLine();
			
				System.out.println("What is the date of the procedure? ");
				date3 = scanner.nextLine();
				
				System.out.println("What is the name of the patient's practitioner? ");
				nameOfPractitioner3 = scanner.nextLine();
				
				System.out.println("What is the charge for this procedure? ");
				charges3 = Double.parseDouble(scanner.nextLine());
			}
		}
		
		
		//Initialization of instances of Procedure class using all 3 constructors
		Procedure procedure1 = new Procedure();
		procedure1.setNameOfProcedure(nameOfProcedure1);
		procedure1.setDate(date1);
		procedure1.setNameOfPractitioner(nameOfPractitioner1);
		procedure1.setCharges(charges1);
		
		Procedure procedure2 = new Procedure(nameOfProcedure2, date2);
		procedure2.setNameOfPractitioner(nameOfPractitioner2);
		procedure2.setCharges(charges2);
		
		Procedure procedure3 = new Procedure(nameOfProcedure3, date3, nameOfPractitioner3, charges3);
		
		
		//Prints out information of patient
		System.out.println("Patient info:");
		displayPatient(patient);
		
		//Prints out information of each procedure
		displayProcedure(procedure1);
		displayProcedure(procedure2);
		displayProcedure(procedure3);
		
		
		//formats and prints total charges of all procedures
		double total = calculateTotalCharges(procedure1, procedure2, procedure3);
		String formattedNum = String.format("%,.2f", total);
		System.out.println("Total Charges: $" + formattedNum);
		
		
		//Closing message
		System.out.println("\nStudent Name: Ethan Hart");
		System.out.println("MC#: M21146813");
		System.out.println("Due Date: 03/04/2025");
		
		scanner.close();
	}
	
	public static void displayPatient(Patient patient) {
		System.out.println(patient);
	}
	
	public static void displayProcedure(Procedure procedure) {
		System.out.println(procedure);
	}
	
	public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
		return procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges();
	}
}
