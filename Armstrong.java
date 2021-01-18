package basic;

/**
 * @author Lalit
 * Write a program to find whether the given number is Armstrong or not.
 */
public class Armstrong {

	public static void main(String[] args) {
		int c=0,a,n,t;
		n=371;
		t=n;
		while(n>0){
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(t==c)
			System.out.println(c+" is a Armstrong no.");
		else
			System.out.println(t+" is not a Armstrong no.");

	}

}
