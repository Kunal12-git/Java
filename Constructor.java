package programs;
class rectangle{
	int length;
	int width;
	int area;
	
	rectangle(int l, int w){
		length=l;
	    width=w;
	}
	rectangle(int l){
		length=width =l;
	}
	rectangle(){
		length = 5;
		width =6;
	             
	}
	int rectarea() {
		area = length*width;
		return area;
	}
}

public class Constructor {
	public static void main(String[]args) {
		rectangle r1 =new rectangle(6,7);
		rectangle r2= new rectangle(9);
		rectangle r3 = new rectangle();
		System.out.println(r1.rectarea());
		System.out.println(r2.rectarea());
		System.out.println(r3.rectarea());
	}

}
