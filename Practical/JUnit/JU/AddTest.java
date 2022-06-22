package JU;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	public void Addtest() 
	{
		//Creating a object of class
		MyJUnitClass mju = new MyJUnitClass();
		int result = mju.add(50, 60);
		assertEquals(110, result);
	}

}
