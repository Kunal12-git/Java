package programs;
	class rectangle1{
	int length;
	int width;
	int area;
	
  void	rect(int l, int w){
		length=l;
	    width=w;
	}
  void	rect(int l){
		length=width =l;
	}
	void rect(){
		length = 5;
		width =6;
	             
	}
	int rectarea() {
		area = length*width;
		return area;
	}
	int pera() {
		int p = 2*(length+width);
		return p;
	}
	}
	public class methods{
public static void main (String[]args) {
	rectangle1 r1 = new rectangle1();
	r1.rect(6, 8);
	rectangle1 r2 = new rectangle1();
	r2.rect(9);
	rectangle1 r3 =new rectangle1 () ;
	r3.rect();
	System.out.println(r1.pera());
	System.out.println(r1.rectarea());
	System.out.println(r2.pera());
	System.out.println(r2.rectarea());
	System.out.println(r3.pera());
	System.out.println(r3.rectarea());
}
}
