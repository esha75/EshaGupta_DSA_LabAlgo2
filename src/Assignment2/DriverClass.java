package Assignment2;

//import java.util.Arrays;
import java.util.Scanner;

public class DriverClass {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter Number Of Currency Notes in Your Country:");
			int size=sc.nextInt();
			
			int currency[]=new int[size];
			System.out.println("Please Enter the Note Denominations Value:");
			for (int i = 0; i < currency.length; i++) {
				currency[i] = sc.nextInt();
			}
			
			//System.out.println("Before Sorting "+Arrays.toString(currency));
			
			InsertionSort is=new InsertionSort();
			is.sort(currency);
			//System.out.println("After Sorting : "+Arrays.toString(currency));
			
			System.out.println("Enter Amount you wish to exchange");
			int amount=sc.nextInt();
			
			NoteCount nc=new NoteCount();
			nc.counting(currency,amount);
			sc.close();
			}
		}










