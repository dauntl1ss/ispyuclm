/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ispychallenge;

/**
 *
 * @author Admin
 */
import java.util.*;
public class ISpyChallenge {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
  Multiples();
        
        
    }
    
    public static void Multiples(){
    	int a = 0;
		int b = 0;
		int c = 0;
		int sum = 0;
		int number = 1;
		for(int start = 1; start <= 1000; start++){		
		if(number % 5 == 0 || number % 3 == 0){
		 a = number % 10;
		 b = number % 100;
		 c = number % 1000;
		sum = a + b + c + sum;
		sum = sum;
		}
		number++;
				//System.out.println(sum);

		}
					System.out.println(sum);
    
    }
    
    
    public static void isPalindrome(){
    
    System.out.print("Enter a String: ");
  	String input = sc.nextLine();
	
	int length = input.length();
	String Palindrome[] = new String[length];
  
   
   char getElement[] = new char[length];
	for(int start = 0; start<length - 2; start++){
		getElement[start] = input.charAt(start);			
	System.out.println(getElement[start]);
	}
	
	

	for(int start = 2; start<length; start++){
				getElement[start] = input.charAt(start);			
		System.out.print(getElement[start]);
	}

    }
}
