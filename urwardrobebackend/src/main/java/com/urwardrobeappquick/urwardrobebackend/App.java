package com.urwardrobeappquick.urwardrobebackend;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App 
{
	private static AnnotationConfigApplicationContext context;

	public static void main(String args[])
	{
	
	context = new AnnotationConfigApplicationContext();
		
		context.scan("com.urwardrobe.confiig");
		 
	context.refresh();
	}
	}

	
	

