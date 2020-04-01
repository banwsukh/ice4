/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vicba
 */
public class ProgramTest {
	
	public ProgramTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}

	/**
	 * GOOD Test of numOfOccurences method, of class Program.
	 **/ 
	@Test
	public void testNumOfOccurences() {
		System.out.println("numOfOccurences");
		char c = 'e';
		String s = "treets";
		Program instance = new Program();
		int expResult = 2;
		int result = instance.numOfOccurences(c, s);
		assertEquals(expResult, result);
	}	
	/**
	 * BAD Test of numOfOccurences method, of class Program.
	**/ 
	/**
	@Test
	public void testNumOfOccurences() {
		System.out.println("numOfOccurences");
		char c = 't';
		String s = "treets";
		Program instance = new Program();
		int expResult = 5;
		int result = instance.numOfOccurences(c, s);
		assertEquals(expResult, result);
	}
//**/ 
	
	/*
	 * BOUNDARY Test of numOfOccurences method, of class Program.
	**/
	/**
	@Test
	public void testNumOfOccurences() {
		System.out.println("numOfOccurences");
		char c = 'e';
		String s = "";
		Program instance = new Program();
		int expResult = 0;
		int result = instance.numOfOccurences(c, s);
		assertEquals(expResult, result);
	}

	/**/

	/**
	 * GOOD Test of maxChar method, of class Program.
	 **/ 
	@Test
	public void testMaxChar() {
		System.out.println("maxChar");
		String s = "abc";
		Program instance = new Program();
		char expResult = 'c';
		char result = instance.maxChar(s);
		assertEquals(expResult, result);
	}
/**/
	/**
	 * BAD Test of maxChar method, of class Program.
	 */
	/**
	@Test
	public void testMaxChar() {
		System.out.println("maxChar");
		String s = "abc";
		Program instance = new Program();
		char expResult = 'a';
		char result = instance.maxChar(s);
		assertEquals(expResult, result);
	}
**/

	/**
	 * BOUNDARY Test of maxChar method, of class Program. 
	 * 
	 */ 
	/**
	@Test
	public void testMaxChar() {
		System.out.println("maxChar");
		String s = "cba";
		Program instance = new Program();
		char expResult = 'c';
		char result = instance.maxChar(s);
		assertEquals(expResult, result);
	}
/**/

	/**
	 *GOOD Test of charExists method, of class Program.
	 **/
	@Test
	public void testCharExists() {
		System.out.println("charExists");
		char c = 's';
		String s = "super";
		Program instance = new Program();
		boolean expResult = true;
		boolean result = instance.charExists(c, s);
		assertEquals(expResult, result);
	}
/**/	
	/**
	 *BAD Test of charExists method, of class Program. There is no relevant boundary test for this method.
	 */
	/**
	@Test
	public void testCharExists() {
		System.out.println("charExists");
		char c = 's';
		String s = "super";
		Program instance = new Program();
		boolean expResult = false;
		boolean result = instance.charExists(c, s);
		assertEquals(expResult, result);
	}
**/	
}
