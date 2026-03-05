package com.tnsif.demo;


	import java.util.*;
	import java.lang.*;
	class amstrong
	{
	public static void main(String args[])
	{
	for(int i=1;i<=1000;i++)
	{
	int n=i,Am=0,copy=n,count=0;
	while(n!=0)
	{
	count+=1;
	n/=10;
	}
	n=copy;
	while(n!=0)
	{
	int r=n%10;
	Am+=(int)Math.pow(r,count);
	n/=10;
	}
	if(copy==Am)
		System.out.println(copy);
     
	}
	}
	}


