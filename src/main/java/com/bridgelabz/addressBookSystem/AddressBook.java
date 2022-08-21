package com.bridgelabz.addressBookSystem;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class AddressBook {
	
	        static Scanner scanner = new Scanner(System.in);
	        static StringBuilder stringBuilder=new StringBuilder();
	    	static ArrayList<Contact> contacts = new ArrayList<Contact>();

	    	public static void main(String[] args) throws Exception {
	    		System.out.println("Welcome to the Address Book Problem");
	    		stringBuilder.append("First Name").append(",").append("Last Name").append(",").append("Address").append(",").append("City").append(",").append("State").append(",").append("Email Id")
	    		.append(",").append("Zip").append(",").append("Mobile Number").append("\n");
	    		AddressBook addressBookList = new AddressBook();
	    		boolean condition = true;

	    		while (condition == true) {
	    			System.out.println("1.AddContact & Write The File" + "\n"  );
	    			int option = scanner.nextInt();

	    			switch (option) {
	    			case 1:
	    				addressBookList.addContactDetails();
	    				break;
	    			default:
	    				System.out.println("Invalid Input");
	    			}
	    		}
	    	}
	    	
	    	// Method to add contact
	    	public void addContactDetails()  {
	    		Contact details = new Contact();
	    		System.out.println("Enter a first name:");
	    		details.setFirstName(scanner.next());
	    		System.out.println("Enter a last name:");
	    		details.setLastName(scanner.next());
	    		System.out.println("Enter a Address:");
	    		details.setAddress(scanner.next());
	    		System.out.println("Enter a City name:");
	    		details.setCity(scanner.next());
	    		System.out.println("Enter a state:");
	    		details.setState(scanner.next());
	    		System.out.println("Enter a email:");
	    		details.setEmail(scanner.next());
	    		System.out.println("Enter a zip code:");
	    		details.setZip(scanner.next());
	    		System.out.println("Enter a phone number:");
	    		details.setPhoneNumber(scanner.next());

	    		contacts.add(details);
	    		System.out.println(contacts);
	    		System.out.println("successfully added new contacts");
	    		
	    		stringBuilder.append(details.getFirstName()).
	    		append(",").append(details.getLastName()).append(",").append(details.getAddress()).append(",").append(details.getCity()).append(",").append(details.getState()).append(",").append(details.getEmail())
	    		.append(",").append(details.getZip()).append(",").append(details.getPhoneNumber()).append("\n");
	    		contacts.add(details);
	    		System.out.println(contacts);
	    		System.out.println("successfully added new contacts");
	    		
	    		//    ENTER THE PATH TO STORE THE .CSV FILE
	    		try (FileWriter writer = new FileWriter("D:\\Java Learning\\addressbook.csv"))  {
	    		    writer.write(stringBuilder.toString());
	    		    System.out.println("CSV file created......");
	    		}   catch (Exception e)  
	    		{		
	    		}
	    }
	    }