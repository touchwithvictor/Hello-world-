import java.util.*;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int k;
		boolean ck=false;
		Random ran=new Random();
		int num=ran.nextInt(100);
		if(num==0){
			num+=1;
		}
		System.out.println("Guess a number between 1 and 100");
	
		for(int i=10; i>0;i--){
			System.out.println("you have "+i+"chances");
			k=in.nextInt();
			if(num<k){
				System.out.println("the number is less than "+k);
			}
			else if(num>k){
				System.out.println("the number is greater than " + k);
			}
			else if(num==k){
				ck=true;
				break;
			}
			
			
		}
		if(ck){
			System.out.println("you won!!!! :-)");
		}	
		else{
			System.out.println("you lose ,answer is " +num);
		}
	}
}