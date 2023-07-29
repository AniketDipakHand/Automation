package javapractice;
// Assignment2
//(((((10*2)-2)+2)-2)/2)

public class Assignment3 {

	public static void main(String[] args) {
              Assignment3 ass3 = new Assignment3();
              int m = ass3.multiplication(10,2);
              System.out.println("multication of (10*2) is ---->"+m);
              int n = ass3.substraction(m, 2);
              System.out.println("multication of ((10*2)-2) is ---->"+n);
              int o = ass3.sum(n, 2);
              System.out.println("multication of (((10*2)-2)+2) is ---->"+o);
              int p = ass3.substraction(o, 2);
              System.out.println("multication of ((((10*2)-2)+2)-2) is ---->"+p);
              ass3.division(p, 2);

	}public int sum(int a,int b)
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
		System.out.println("Final value of expression (((((10*2)-2)+2)-2)/2) is = "+l);
	}

}
