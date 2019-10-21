package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

class testclassgreater extends TestCase {
	private int x,y;
	
	testclassgreater() {
		System.out.println("test");
	}

	
	testclassgreater(int x, int y) {
		super();
		this.x=x;
		this.y=y;
		
	}
	@Test
	 junit.framework.Test testFindGreater() {
		Greater g = new Greater(x,y);
		boolean res = g.findGreater();
		assertEquals(true,res);
		TestSuite test =null;
	//	fail("Not yet implemented");
		return test;
		
	}

}
