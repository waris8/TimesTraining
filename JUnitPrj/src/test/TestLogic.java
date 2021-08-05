package test;
import source.*;

import static org.junit.Assert.*;

import org.junit.Test;
//import static org.junit.Assert.*;
public class TestLogic {

	@Test
	public void test() {
		assertEquals(4,MainClass.findMax(new int[]{1,3,4,2}));
	}

}
