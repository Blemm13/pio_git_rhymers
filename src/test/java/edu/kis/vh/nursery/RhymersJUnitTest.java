package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;
import edu.kis.vh.nursery.stacks.IntArrayStack;
import org.junit.Assert;
import org.junit.Test;

import java.util.function.ToDoubleBiFunction;

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

	@Test
	public void testStandardRhymerCallcheck(){
		RhymersFactory testFac = new DefaultRhymersFactory();
		DefaultCountingOutRhymer rhymer = testFac.getStandardRhymer();
		boolean result = rhymer.callCheck();
		Assert.assertTrue(result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertFalse(result);
	}

	@Test
	public void testFalseRhymerCallcheck(){
		RhymersFactory testFac = new DefaultRhymersFactory();
		DefaultCountingOutRhymer rhymer = testFac.getFalseRhymer();
		boolean result = rhymer.callCheck();
		Assert.assertTrue(result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertFalse(result);
	}

	@Test
	public void testFIFORhymerCallcheck(){
		RhymersFactory testFac = new DefaultRhymersFactory();
		DefaultCountingOutRhymer rhymer = testFac.getFIFORhymer();
		boolean result = rhymer.callCheck();
		Assert.assertTrue(result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertFalse(result);
	}

	@Test
	public void testHanoiRhymerCallcheck(){
		RhymersFactory testFac = new DefaultRhymersFactory();
		DefaultCountingOutRhymer rhymer = testFac.getHanoiRhymer();
		boolean result = rhymer.callCheck();
		Assert.assertTrue(result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertFalse(result);
	}

	@Test
	public void testStandardRhymerCountIn(){
		RhymersFactory testFac = new DefaultRhymersFactory();
		DefaultCountingOutRhymer rhymer = testFac.getStandardRhymer();
		int testValue = 4;
		rhymer.countIn(testValue);
		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testFalseRhymerCountIn(){
		RhymersFactory testFac = new DefaultRhymersFactory();
		DefaultCountingOutRhymer rhymer = testFac.getFalseRhymer();
		int testValue = 4;
		rhymer.countIn(testValue);
		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testFIFORhymerCountIn(){
		RhymersFactory testFac = new DefaultRhymersFactory();
		DefaultCountingOutRhymer rhymer = testFac.getFIFORhymer();
		int testValue = 4;
		rhymer.countIn(testValue);
		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testHanoiRhymerCountIn(){
		RhymersFactory testFac = new DefaultRhymersFactory();
		DefaultCountingOutRhymer rhymer = testFac.getHanoiRhymer();
		int testValue = 4;
		rhymer.countIn(testValue);
		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	/* Line just to make it easier to navigate ##################################*/

	@Test
	public void testStandardRhymerIsFull(){
		RhymersFactory testFac = new DefaultRhymersFactory();
		DefaultCountingOutRhymer rhymer = testFac.getStandardRhymer();
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
	public void testFalseRhymerIsFull(){
		RhymersFactory testFac = new DefaultRhymersFactory();
		DefaultCountingOutRhymer rhymer = testFac.getFalseRhymer();
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
	public void testFIFORhymerIsFull(){
		RhymersFactory testFac = new DefaultRhymersFactory();
		DefaultCountingOutRhymer rhymer = testFac.getFIFORhymer();
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
	public void testHanoiRhymerIsFull(){
		RhymersFactory testFac = new DefaultRhymersFactory();
		DefaultCountingOutRhymer rhymer = testFac.getHanoiRhymer();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertFalse(result);
			rhymer.countIn(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertTrue(result);
	}

	/* Another line to make it easier to navigate ######################*/

	@Test
	public void testStandardRhymerPeekaboo(){
		RhymersFactory testFac = new DefaultRhymersFactory();
		DefaultCountingOutRhymer rhymer = testFac.getStandardRhymer();
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
	public void testFalseRhymerPeekaboo(){
		RhymersFactory testFac = new DefaultRhymersFactory();
		DefaultCountingOutRhymer rhymer = testFac.getFalseRhymer();
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
	public void testFIFORhymerPeekaboo(){
		RhymersFactory testFac = new DefaultRhymersFactory();
		DefaultCountingOutRhymer rhymer = testFac.getFIFORhymer();
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
	public void testHanoiRhymerPeekaboo(){
		RhymersFactory testFac = new DefaultRhymersFactory();
		DefaultCountingOutRhymer rhymer = testFac.getHanoiRhymer();
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

	/* Another line to make it easier to navigate ######################*/

	@Test
	public void testStandardRhymerCountOut(){
		RhymersFactory testFac = new DefaultRhymersFactory();
		DefaultCountingOutRhymer rhymer = testFac.getStandardRhymer();
		final int EMPTY_STACK_VALUE = 0;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testFalseRhymerCountOut(){
		RhymersFactory testFac = new DefaultRhymersFactory();
		DefaultCountingOutRhymer rhymer = testFac.getFalseRhymer();
		final int EMPTY_STACK_VALUE = 0;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testFIFORhymerCountOut(){
		RhymersFactory testFac = new DefaultRhymersFactory();
		DefaultCountingOutRhymer rhymer = testFac.getFIFORhymer();
		final int EMPTY_STACK_VALUE = 0;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}//TODO Ask teacher for a reason this doesn't work if possible



	@Test
	public void testHanoiRhymerCountOut(){
		RhymersFactory testFac = new DefaultRhymersFactory();
		DefaultCountingOutRhymer rhymer = testFac.getHanoiRhymer();
		final int EMPTY_STACK_VALUE = 0;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
