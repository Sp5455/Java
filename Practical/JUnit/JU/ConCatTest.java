package JU;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class ConCatTest {

	@Test
	public void Concattest() 
	{
		//Creating a object class
		MyJUnitClass mju = new MyJUnitClass();
		String result = mju.ConCat("Shubham", "Pawar");
		assertEquals("ShubhamPawar", result);
	}

}
