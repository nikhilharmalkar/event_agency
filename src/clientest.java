import static org.junit.Assert.*;

import org.junit.Test;

public class clientest {

	@Test
	public void test() {
		client person = new client("Narendra");
		assertEquals("Narendra", person.name);
	}

}