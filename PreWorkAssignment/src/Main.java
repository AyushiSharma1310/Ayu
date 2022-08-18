import java.util.Scanner;
public class Main {

	Scanner hp = new Scanner(System.in);
	
	//function to check Palindrome

	public void checkPalindrome() {
		int a;
		int b;
		int n;
		
		int value=0;
		
	      	System.out.println("Enter the number to check if it is a Palindrome--->");
		
		         b=hp.nextInt();
		
			     a=b;
			
	     	while(b>0) {

			
			n=b%10;
			value=(value*10)+n;
			
			b=b/10;
			
		}
		
	     if(a==value) {
		
		    System.out.println("This is a palindrome number.");
	    }else {
		
		    System.out.println("This is not a palindrome number.");
	    }
	     System.out.println("\n");
	        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");				
	}
	
	//function to print Pattern
	
	public void printPattern() {
		
		int count;
	
		System.out.println(" Enter the value for input (greater than 1)--->");
				
			count=hp.nextInt();	
			
			int i=count+1;
		
				
				boolean spacingNeeded = true;
				
				boolean emptySpaceCondition = false;
				
				    for (int outerIndex = 1; outerIndex <=i; outerIndex ++ ) {

					for (int innerIndex = 1; innerIndex <=i; innerIndex ++) {
						
						int temp1 = i - innerIndex;
						
						if (outerIndex <= temp1) {
							emptySpaceCondition = false;
							
						}else {
							emptySpaceCondition = true;
						}
						
						
						if (emptySpaceCondition) {
							System.out.print(" ");
						}else {
							System.out.print("* ");									
						}
						
						if (spacingNeeded) {
							System.out.print("  ");
						}
						
					}	
					System.out.println("\n");
										
				}

				   		
				   
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
		}            
		
	//function to check no is prime or not
	
	public void checkPrimeNumber() {
		
		System.out.println("Enter number to check as a prime number--->");
			 
		int a=hp.nextInt();
		
		int b=0,value=0;      
		
		b= a/2;
			  
			  if(a==0||a==1){ 
				  
			       System.out.println(a+" is not a prime number.");      
			  
			  }else {
				  
			   for(int i=2;i<=b;i++){
				   
			   if(a%i==0){
			    	  
			       System.out.println(a+" is not a prime number.");      
			   value=1;
			     
			   break;
			     
		 }      
	  }      
			   if(value==0)  { System.out.println(a+" is a prime number."); }  
	  }
			  System.out.println("\n");  
		  System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");  
	}  
	//function to print Fibonacci series
	
	public void printFibonacciSeries() {
		//initialize the first and second value as 0,1 respectively.
		int first = 0, second = 1;
		int a,i,count=0;
		
		
		System.out.println("Enter the number upto where the series is to be displayed--->");
		
		count=hp.nextInt();
		
		System.out.print(first+","+second);
		
		    for(i=3; i<=count; ++i) {
			
		    	a=first+second;
			
		    	System.out.print(","+a);
			
		    	first=second;
			
		    	second=a;
		}		
		    System.out.println("\n");
		    
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
	}
	
	//main method which contains switch and do while loop
	   public static void main(String[] args) {
		   Main obj = new Main();
		   int choice;
		   Scanner hp = new Scanner(System.in);
		   
     do {
    	 
    	 System.out.println("Enter your choice from below list--->\n"+
    	 "1. Find palindrome of number.\n"+
         "2. Print Pattern for a given no.\n"+
    	 "3. Check whether the no is a prime number.\n"+
         "4. Print Fibonacci Series.\n"+
    	 "---> Enter 0 to Exit.\n");
    	 System.out.println();
    	 
    	 choice = hp.nextInt();
    	 switch(choice) {
    	 
    	 case 0:
    		 choice=0;
    		 break;
    		 
    	 case 1:{
    		 obj.checkPalindrome();
    	 }
    	 break;
    	 
    	 case 2:{
    		 obj.printPattern();
    	 }
    	 break;
    	 
    	 case 3:{
    		 obj.checkPrimeNumber();
    	 }
    	 break;
    	 
    	 case 4:{
    		 obj.printFibonacciSeries();
    	 }
    	 break;
    	 
    	 default:
    		 System.out.println("Invalid Choice.. Enter a valid nummber! *_*\n");
     }
    	 
    	 
     }while(choice!=0);
     
    
    	 System.out.println("Exited Successfully!!!");
    	 System.out.println("-----------------------------------------");
	
    	 hp.close();
	   

	}
	}
	



