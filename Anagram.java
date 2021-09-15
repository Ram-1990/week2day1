package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String x="stops";
		String y="potss";
		char a[]= x.toCharArray();
		char b[]= y.toCharArray();	
		Arrays.sort(a);		
		Arrays.sort(b);
		Boolean result=Arrays.equals(a,b);
		if(result==true)	
		{
			System.out.println("The Strings are Anagrams");
		}
		else {
			System.out.println("The Strings are not Anagrams");
             }
	}}	       
