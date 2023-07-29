package javapractice;

public class Assignmentno2 {

	public static void main(String[] args) {
		// Assignmentno2 : ((((10+2)+)-2)*2)/2) =?
		Assignmentno2 ass2 = new Assignmentno2();
		int m = ass2.sum(10,2);
		System.out.println("Sum of (10+2) is --->"+m);
        int n = ass2.sum(m, 2);
        System.out.println("Sum of ((10+2)+2) is --->"+n);
        int o = ass2.substraction(n, 2);
        System.out.println("Sum of (((10+2)+2)-2) is --->"+o);
        int p = ass2.multiplication(o, 2);
        System.out.println("Sum of ((((10+2)+2)-2)*2) is --->"+p);
        ass2.division(p, 2);
	}
	public int sum(int a,int b)
	{
		int c ;
		c=a+b;
		return c;
	}
	public int substraction(int d, int e)
	{
		int f;
		f=d-e;
		return f;
	}
	public int multiplication(int g, int h)
	{
		int i;
		i= g*h;
		return i;
	}
	public void division(int j,int k)
	{
		int l;
		l=j/k;
		System.out.println("Final value of expression (((((10+2)+2)-2)*2)/2) is = "+l);
	}

}
