package com.clc.selenium.seleniumdemo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class First {

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		
		v.add(10);
		v.add(20);
		v.add(30);
		System.out.println(v);
	Enumeration e	=v.elements();
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
		v.add(50);
	}
    System.out.println(v);
	}

}
