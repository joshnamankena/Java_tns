package com.tnsif.demo;

		public class Sample {

			public static void main(String[] args) {
				Samp obj = new Samp();
				System.out.println(obj.a);
				obj.show();

			}

		}
		class Samp {
			int a=10;
			String s = "Java";
			public void show()
			{
				System.out.println("The String value is: "+s);
			}
		}
	
