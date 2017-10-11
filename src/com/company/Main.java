package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String firstInitial="";
	String lastName="";
	int houseNumber=0;
	String streetName="";
	String streetType="";
	String city="";
	Scanner keyboard=new Scanner(System.in);
	System.out.print("Enter first initial: ");
	firstInitial=keyboard.next();
	System.out.print("Enter last name: ");
	lastName=keyboard.next();
	System.out.print("Enter house number: ");
	houseNumber=keyboard.nextInt();
	System.out.print("Enter street name: ");
	streetName=keyboard.next();
	System.out.print("Enter street type: ");
    streetType=keyboard.next();
    System.out.print("Enter city: ");
    city=keyboard.next();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
