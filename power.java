import java.util.Scanner;
import java.lang.Math;
public class power {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no :");
		double X = sc.nextInt();
		System.out.print("enter power:");
		double n = sc.nextInt();
	    double ans = Math.pow(X, n);
	    int ans1=(int)ans;
	    System.out.println(ans1);
	}

}
