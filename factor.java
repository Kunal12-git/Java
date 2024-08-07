import java.util.Scanner;

public class factor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no:");
		int n = sc.nextInt();
		System.out.print("The factor of no is ");
		int sum =0;
		for(int i =2;i<n;i++) {
			if(n%i==0) {
				System.out.print(i + " ");
				sum=sum+i;
			}
		}
			if(sum==0) {
			System.out.println("-1");
		
		}
	}

}
