package Week3Day1;

public class overloading {

	public void add(int add1 ,int add2)
	{
		int a =add1 + add2;
		System.out.println("Add :" +a);
		
	}
	
	public void add(int add1 ,int add2,int add3)
	{
		int a =add1 +add2 + add3;
		System.out.println("Add 1 :" +a);
		
	}
	public void sub(int sub1 ,int sub2)
	{
		int s =sub1 - sub2;
		System.out.println("sub :" +s);
		
	}
	
	public void sub(double sub1 ,double sub2)
	{
		double s =sub1 - sub2;
		System.out.println("sub :" +s);
		
	}
	
	public void mul(int mul1 ,int mul2)
	{
		int m = mul1 * mul2;
		System.out.println("Mul :" +m);
		
	}
	
	public void mul(double mul1 ,double mul2,double mul3)
	{
		double m =mul1 * mul2 * mul3;
		System.out.println("Mul :" +m);
		
	}
	
	public void mul(int mul1 ,int mul2,int mul3)
	{
		int m =mul1 * mul2 * mul3;
		System.out.println("multiply 1 :" +m);
		
	
	}
	
	public void div(int div1, int div2) {
		int d = div1/div2;
		System.out.println("Divide :" +d);
		
	}
	
	public void div(double div1, int div2) {
		double d1 = div1/div2;
		System.out.println("Divide :" +d1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        overloading obj = new overloading();
        obj.add(20, 10);
        obj.add(20,10,10);
        obj.sub(20, 10);
        obj.sub(50.5, 10.7);
        obj.mul(2, 4);
        obj.mul(2.1, .10, 20);
        obj.div(20, 5);
        obj.div(20.2, 2);
	}

}
