import java.util.Scanner;
public class sum_of_even {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no");
		int N = sc.nextInt();
		int sum =0;
		for(int i=1;i<=N;i++) {
			if(i%2==0) {
				sum=sum+i;				
			}		
		}
		System.out.println("The Sum of even no between 1 and "+N + " is =  "+sum);
	}

}
