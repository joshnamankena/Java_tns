
	package com.tnsif.demo.accessmod;

     class sameCl{
		int defvar = 10;  
		private int privar = 20;   
		protected int protvar = 30;
		public int pubvar=40;
		
		public void defaultmethod()
		{
			System.out.println("the default value is: "+defvar);
		}
		public void privatemethod()
		{
			System.out.println("the private value is: "+privar);
		}
		public void protmethod()
		{
			System.out.println("the protected value is: "+protvar);
		}
		public void publicmethod()
		{
			System.out.println("the public value is: "+pubvar);
		}
		
	}


public class sameClass{
	public static void main(String args[])
	{
		sameCl s=new sameCl();
		s.defaultmethod();
		s.privatemethod();
		s.protmethod();
		s.publicmethod();
	}
}