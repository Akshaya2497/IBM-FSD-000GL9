package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

class TestGreater extends TestCase{
	private int x,y;
	public TestGreater() {
		
	}
	public TestGreater(int x, int y)  {
		super();
		this.x=x;
		this.y=y;
	}

	/*@Test
	void testFindGreater() {
		
		boolean res = new Greater(x,y).findGreater();
		assertEquals(true,res);
	//	fail("Not yet implemented");
		 
	}
	@Test
	void testFindLesser() {
		
		boolean res = new Greater(x,y).findLesser();
		assertEquals(true,res);
	//	fail("Not yet implemented");
	}
	@Test
	void testadd() {
		
		assertEquals(5, new Greater(x,y).add());
	//	fail("Not yet implemented");
	}
	@Test
	void testsub() {
		
		//boolean res = new Greater(x,y).findGreater();
		assertEquals(1,new Greater(x,y).sub());
	//	fail("Not yet implemented");
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestRunner.run(TestGreater.class);
		junit.textui.TestRunner.run(createTestSuite());

	}
	public static TestSuite createTestSuite() {
		TestSuite testsuite = new TestSuite();
		testsuite.addTest(new test());
		return testsuite;
		
	}


}
