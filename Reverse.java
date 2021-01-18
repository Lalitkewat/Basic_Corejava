package basic;


/**
 * @author Lalit.
 *Write a program to reverse digits of a given number.
 */
public class Reverse {
	public static void main(String[] args) {
		int num=12345;
		int reverse=0;
		int rem;
		 while(num>0)    
		  {    
		     rem=num%10;    
		     reverse=reverse*10+rem;    
		     num=num/10;    
		  }  
		 System.out.println(reverse);
		
		}

}
