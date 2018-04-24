import static org.junit.Assert.*;

import org.junit.Test;

public class optTest {

	@Test
	public void test() {
		options op = new options("Testing",1000);
		assertEquals(1000, op.price);
	}

}