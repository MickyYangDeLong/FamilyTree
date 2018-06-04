package manager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserTest {
	
	final User user = User.newInstance();
	
	@Test
	public void testUsetPojo() {
		user.setAge("18");
		user.setName("micky");
		user.setId("001");
		
		assertEquals("18", user.getAge());
		assertEquals("micky", user.getName());
		assertEquals("001", user.getId());
	}
}
