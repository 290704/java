package com.celcom.day6;

import java.util.*;

		
		class DuplicateNumberException extends Exception {
		    public DuplicateNumberException(String message) {
		        super(message);
		    }
		}

		public class  Assignment1{
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Set<Integer> numbers = new HashSet<>();
		        
		        System.out.println("Enter a list of integers (enter 'done' to finish):");
		        
		        while (true) {
		            String input = scanner.next();
		            
		            if (input.equalsIgnoreCase("done")) {
		                break;
		            }
		            
		            try {
		                int num = Integer.parseInt(input);
		                if (!numbers.add(num)) {
		                    throw new DuplicateNumberException("Duplicate number found: " + num);
		                }
		            } catch (NumberFormatException e) {
		                System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
		            } catch (DuplicateNumberException e) {
		                System.out.println(e.getMessage());
		                break;
		            }
		        }
		        
		        System.out.println("Unique numbers entered: " + numbers);
		        scanner.close();
		    }
		}

	


