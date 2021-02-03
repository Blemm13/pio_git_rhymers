package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;
import edu.kis.vh.nursery.stacks.IntArrayStack;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RhymersJUnitTest {


	@Test
	public void testCountIn() {
		IntArrayStack rhymer = new IntArrayStack();
		int testValue = 4;
		rhymer.countIn(testValue);

		int result = rhymer.peekaboo();
		assertEquals(testValue, result);
	}


	@Test
	public void testCallCheck() {
		IntArrayStack rhymer = new IntArrayStack();
		boolean result = rhymer.callCheck();
		Assert.assertTrue(result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertFalse(result);
	}

	@Test
	public void testIsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertFalse(result);
			rhymer.countIn(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertTrue(result);
	}

	@Test
	public void testPeekaboo() {
		IntArrayStack rhymer = new IntArrayStack();
		final int EMPTY_STACK_VALUE = 0;

		int result = rhymer.peekaboo();
		assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.peekaboo();
		assertEquals(testValue, result);
		result = rhymer.peekaboo();
		assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {
		IntArrayStack rhymer = new IntArrayStack();
		final int EMPTY_STACK_VALUE = 0;

		int result = rhymer.countOut();
		assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		assertEquals(testValue, result);
		result = rhymer.countOut();
		assertEquals(EMPTY_STACK_VALUE, result);
	}

}
