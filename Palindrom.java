package basic;


/**
 * @author Lalit.
 * Write a program to find whether the given number is Palindrome or not.
 */
public class Palindrom {
	public static void main(String[]args){
		int or,n,ri,r;
		n=14341;
		or=n;
		ri=0;
		for(; n!=0; n/=10){
			r=n%10;
			ri=ri*10+r;
		}
		if(or==ri)
			System.out.println(or+" is a palindrom");
		else
			System.out.println(or+" is not a palindrom");
	}

}
