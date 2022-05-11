//Max Value
import java.util.Scanner;
public class MaxValue{
	
 public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=s.nextInt();
		System.out.println("Enter second number:");
		int b=s.nextInt();
		System.out.println("Enter third number:");
		int c=s.nextInt(); 
		if(a>b && a>c){
			System.out.println("Max Value:"+a);
		}
		else if(b>a && b>c){
			System.out.println("Max Value:"+b);
		}
		else if(c>a && c>b){
			System.out.println("Max Value:"+c);
		}
		else{
			System.out.print("All numbers are equal");
		}
	} 

}
