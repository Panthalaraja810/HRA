package com.PractisePackage;

import org.testng.annotations.Test;

public class Test_02 {

	@Test(groups ="smoke")
	public void SampleTest03()
	{
		System.out.println("Sampke maven3");
	}
	
	@Test(groups = "regression")
	public void SampleTest04()
	{
		System.out.println("Sample maven4");
	}
}
