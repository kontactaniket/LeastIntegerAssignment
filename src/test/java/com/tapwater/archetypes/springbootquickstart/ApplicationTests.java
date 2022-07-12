package com.tapwater.archetypes.springbootquickstart;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.assessment.aniket.LestIntegerAssessment.springbootquickstart.Application;

public class ApplicationTests {
	
	@Test
	public void findLeastNumber1() {
		int[] input = new int[] {9,7,5,3,1,2,4,6,7};
		assertEquals(Application.findLeastNumber(input, input.length), 1);
	}
	
	@Test
	public void findLeastNumber2() {
		int[] input = new int[] {8};
		assertEquals(Application.findLeastNumber(input, input.length), 8);
	}
	
	@Test
	public void findLeastNumber3() {
		int[] input = new int[] {9,7,5,3,2,2,2,2,2,2,4,6,7};
		assertEquals(Application.findLeastNumber(input, input.length), 2);
	}
	
	@Test
	public void findLeastNumber4() {
		int[] input = new int[] {3,4,5,6,7,8,9};
		assertEquals(Application.findLeastNumber(input, input.length), 3);
	}
	
	@Test
	public void findLeastNumber5() {
		int[] input = new int[] {9,8,7,6,5,4,3,2};
		assertEquals(Application.findLeastNumber(input, input.length), 2);
	}
	
	@Test
	public void findLeastNumber6() {
		int[] input = new int[] {5,5,5,5,5,5,5,5,5};
		assertEquals(Application.findLeastNumber(input, input.length), 5);
	}
	
	@Test
	public void findLeastNumber7() {
		int[] input = new int[] {10,9,8,7,6,5,4,3,2,1,0,-10,-9,-8,-7,-6,-5,-4,-3,-2,-1};
		assertEquals(Application.findLeastNumber(input, input.length), -10);
	}
	
	@Test
	public void findLeastNumber8() {
		int[] input = new int[] {10,-8,-7,-6,-5,-4,-3,-2,-1,20};
		assertEquals(Application.findLeastNumber(input, input.length), -8);
	}
}
