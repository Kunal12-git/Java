import java.util.Scanner;
public class Temperature {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting Fahrenheit value");
		float S = sc.nextFloat();
		System.out.println("Enter Ending Fahrenheit value");
		float E = sc.nextFloat();
		System.out.println("Enter gap between:");
		int W=sc.nextInt();
		float Celsius;
		for(float i=S;i<=E;i+=W) {
			Celsius=(5*(i-32))/9;
			System.out.println("Fahernheit "+i+" in "+"Celsius"+" is = "+Celsius);
		}
		
	}

}
