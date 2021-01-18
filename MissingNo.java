package basic;


/**
 * @author Lalit.
 *Write a program to find missing number.
 */
public class MissingNo {

	public static void main(String[] args) {
		int a[]={4,7,6,9,5};
		int b[]={4,7,9,5};
		for(int i=0;i<a.length;i++){
			//boolean flag=true;
			
			int k=5;
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
				//flag=false;
					k=4;
				}
			}
			//if(flag==true){
	        	
			if (k==5){
			System.out.println("Missing number is= "+a[i]);
		}
        
		
        }
	}

}
