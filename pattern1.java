package patterns;
import java.util.Scanner;
public class pattern1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int n = sc.nextInt();
		if(n<=3) {
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
				System.out.print("#");
			}
			System.out.println();
		}		

	}
		else {
			for(int i =1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					
					System.out.print(n);
				}
				System.out.println();
			}
	}
}
}


