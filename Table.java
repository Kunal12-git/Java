import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		
				Scanner s = new Scanner(System.in);
				System.out.println("Enter no for table:");		
				int n = s.nextInt();
				for (int i=0;i<=10;i++) {
					int ans = n*i;
					System.out.println(n + "x"+ i + "=" + ans);
				}
			}

		}


	


