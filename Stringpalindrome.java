	package week2.day1;

public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String x="MADAM";
      char y[]=	x.toCharArray();
      int size=y.length;
      char a[]=new char[size];
      int i=0;
      while(i!=size)
      {
    	  	a[size-1-i]=y[i];
    	  	++i		;
      }
      i=0;
      while(i!=size)
      {	
    	  if(a[i]!=y[i])
	{
			System.out.println("Not a Palindrome");
				
	}
	else
	{	++i;
	   continue;
	 }
      }
      	System.out.println("Palindrome");
	}

}	
