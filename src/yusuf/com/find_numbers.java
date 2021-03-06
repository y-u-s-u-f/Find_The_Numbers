package yusuf.com;

import java.util.Scanner;

public class find_numbers {
	
	public static void main(String[] args) {
		
		    System.out.println("Enter a string : ");

	        Scanner sc = new Scanner(System.in);

	        String input = sc.nextLine();
	        System.out.println("The string you have entered is : "+input);
            input = input+" ";
	        
	        
	        String numbers = "";
	        
	        for(int i=0; i<= input.length()-1; i++) {
	        	if(Character.isDigit(input.charAt(i))){
	               numbers = numbers+input.charAt(i);
	               if(input.charAt(i+1) == ' ' || Character.isLetter(input.charAt(i+1))) {
	            	   numbers = numbers+" ";
	               }
	             }
	        }
          System.out.println("The numbers in your string are: "+numbers.trim());
	    }

}
