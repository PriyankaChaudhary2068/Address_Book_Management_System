package com.bridgelabz.addressBookSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


public class AddressBook {
	
	        static Scanner scanner = new Scanner(System.in);
	    	static ArrayList<Contact> contacts = new ArrayList<Contact>();

	    	public static void main(String[] args) throws Exception {
	    		System.out.println("Welcome to the Address Book Problem");
	    		AddressBook addressBookList = new AddressBook();
	    		boolean condition = true;

	    		while (condition == true) {
	    			System.out.println("1.AddContact & Write The File" + "\n" + "2.Read The File" + "\n" );
	    			int option = scanner.nextInt();

	    			switch (option) {
	    			case 1:
	    				addressBookList.addContactDetails();
	    				addressBookList.FileWriterToText();
	    				break;
	    			case 2:
	    				addressBookList.FileReaderFromText();
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
	    	}
	    	public void FileWriterToText() throws Exception  {
	    		FileOutputStream foutput = new FileOutputStream("file.text");
	    		PrintStream print = new PrintStream(foutput);
	    		print.println(contacts);
	    		print.close();
	    		foutput.close();
	    	}
	    	public void FileReaderFromText() throws IOException {
	    		File infile= new File("file.text");
	    		FileReader freader = null;
	    		try {
	    			freader = new FileReader(infile);
	    			int ch;
	    			while((ch=freader.read())!= -1) {
	    				System.out.print((char)ch);
	    			}
	    		}
	    		catch (FileNotFoundException fnfe)
	            {
	                System.out.println("NO Such File Exists");
	            }
	            catch (IOException except)
	            {
	                System.out.println("IOException Occurred");
	            }
	    		  finally {freader.close(); 
	    		}
	    		}
	    			}