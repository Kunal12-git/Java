import java.util.Scanner;

public class Total_Salary {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic Salary");
		int basic = sc.nextInt();
		System.out.println("Enter grade ");
		char grade = sc.next().charAt(0);
		double HRA = basic*0.2;
		double DA = basic*0.5;
	    double PF = basic*0.11;
	    int Allow;
	    if(grade=='A') {
	    	 Allow=1700;
	    }
	    else if(grade=='B') {
	    	 Allow = 1500;
	    }
	    else {
	    	 Allow=1300;
	    	
	    }
	    double Total=basic+HRA+DA+Allow-PF;
	    int Total_Salary=(int)Total;
	    System.out.println("The total Salary is " + Total_Salary);
	    
		
	}

}
