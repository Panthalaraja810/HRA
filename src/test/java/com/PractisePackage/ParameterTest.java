package com.PractisePackage;

import org.testng.annotations.Test;

public class ParameterTest
{
	
	@Test
	public void test()
	{
	String URL = System.getProperty("url");
	String ENV = System.getProperty("Env");
	String BROWSER = System.getProperty("browser");
	String USERNAME = System.getProperty("username");
	String PASSWORD = System.getProperty("password");
	
	System.out.println(ENV+" "+URL+" "+BROWSER+" "+USERNAME+" "+PASSWORD);
	}
	

}
