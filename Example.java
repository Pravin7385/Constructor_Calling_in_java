package com.constr.chianng;
// Constructor chaining -->  constructor called from another constructor is known as...
public class Example  {
	
		Example() {
			this(5);
			System.out.println("this is default constructor");
	}
		Example(int a){
			this("Java");
			System.out.println(a);
	}
		Example(String s){
			System.out.println(s);
	}
	
		public static void main(String[] args) {
			
			Example example = new Example();
		}

}
