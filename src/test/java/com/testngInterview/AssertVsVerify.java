package com.testngInterview;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVsVerify {
	@Test
	public void AssertTest() {
		// Hard Assertion
		System.out.println(" before assertion");
		Assert.fail(); // Assert.assertEquals(true, false);
		System.out.println(" after assertion");
	}

	@Test
	public void VerifyTest() {
		// Soft Assertion
		SoftAssert assert1 = new SoftAssert();
		System.out.println(" before assertion");
		assert1.fail();
		System.out.println(" after assertion");
	}
}
