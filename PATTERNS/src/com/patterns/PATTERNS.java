package com.patterns;


public class PATTERNS {
    public static void main(String[] args) {
        
        int number = 9;
        int age = 17;
        double weight = 55;

        // Even or Odd check 
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
       
        }

        // Prime number check
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is NOT a Prime Number");
        }

        // Voting eligibility
        if (age >= 18) {
            System.out.println("Person is Eligible for Voting");
        } else {
            System.out.println("Person is NOT Eligible for Voting");
        }

        // Blood donation eligibility
        if (age >= 18 && age <= 60 && weight >= 50) {
        	
            System.out.println("Person is Eligible for Blood Donation");
        } else {
            System.out.println("Person is NOT Eligible for Blood Donation");
        }
    }
}
