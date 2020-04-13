package com.java8;

import java.util.Scanner;
import java.util.function.Function;

public class FuctionChaining {
	
	public static void main(String[] args) {
	Function<String,String> f1= s->s.toLowerCase();
	Function<String,String> f2= s->s.substring(0,4);
	
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter username ");
	String username = sc.next();
	
	System.out.println("EnterPassword:");
	String pwd = sc.next();
	if(f1.andThen(f2).apply(username).equals("user")&&pwd.equals("pass"))
	{
		System.out.println("ValidUser");
		}
	else
	{
		System.out.println("InvalidUser");
		}
	sc.close();
	
	}
}
