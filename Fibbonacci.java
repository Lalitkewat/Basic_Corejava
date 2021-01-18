package basic;

/**
 * @author Lalit
 * Write a program to find fibonacci series of a given number.
 */
public class Fibbonacci {
	public static void main(String[] args) {
		int f,f1=0,f2=1;
		System.out.print(f1);
		for(int i=0;i<10;i++)
		{
			System.out.print(" "+f2+" ");
			f=f1;
			f1=f2;
			f2=f+f1;
		}
	}

}
