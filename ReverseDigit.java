package basic;

public class ReverseDigit {
	public static void main(String[] args) {
		int n,d,r=0;
		n=123456;
		for(; n!=0;n/=10){
			d=n%10;
			r=r*10+d;
		}
		System.out.println(r);
	}

}
