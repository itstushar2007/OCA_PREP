package com.cg.ocaprep;

public class Question8 {

	public static void main(String[] args) {

		 StringBuilder s = new StringBuilder(10 + 2 + "ABC" + 4 + 5); 
         s.append(s.delete(3, 6)); 
         System.out.println(s); 

	}

}
