package Assignment1;
import java.util.Scanner;

public class TransactionTarget {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Number of Days Shop Was Open:");
		int noOfDays=sc.nextInt();
		
		int revenue[]=new int[noOfDays];
		System.out.println("Please Enter The Collection Of Money For Each Day:");
		for (int i = 0; i < revenue.length; i++) {
			revenue[i]=sc.nextInt();
		}
		
		System.out.println("Please Enter Number of Targets");
		int totaltargets=sc.nextInt();
		int sum;
		int flag;
		for(int i=1;i<=totaltargets;i++)
		{
			sum=0;
			flag=0; //if target not achieved
			System.out.println("Please Enter Value of Target "+i);
			int target=sc.nextInt();
			
			for(int j=0;j<revenue.length;j++)
			{
				sum+=revenue[j];
				if(sum>=target)
				{
				System.out.println("Target Achieved Of Day "+(j+1));
				flag=1; //if target achieved
				break;
				}
			}
			if(flag==0)
			System.out.println("Target Not Achieved");	
			
		}
		
		sc.close();

	}


}
