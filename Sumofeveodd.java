import java.util.Scanner;
public class Sumofeveodd {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum1 =0;
		int sum2=0;
		int r;
		while(n!=0) {
			r=n%10;
			if(r%2==0) {
				sum1=sum1+r;
				n=n/10;
			}
			else if(r%2!=0) {
				sum2=sum2+r;
				n=n/10;
			}
			
		}
		System.out.println("Sum of Even digit is = "+sum1);
		System.out.println("sum of odd digit is ="+sum2);
		
		
	}

}
