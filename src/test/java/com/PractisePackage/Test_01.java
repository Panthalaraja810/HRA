package com.PractisePackage;

import org.testng.annotations.Test;

public class Test_01 {

	@Test(groups = "regression")
	public void SampleTest01()
	{
		System.out.println("Sampke maven");
	}
	
	@Test(groups = "smoke")
	public void SampleTest02()
	{
		System.out.println("Sample maven2");
	}
}
