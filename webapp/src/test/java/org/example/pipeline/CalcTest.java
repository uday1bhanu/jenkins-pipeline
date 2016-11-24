package org.example.pipeline;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CalcTest
        extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CalcTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(CalcTest.class);
    }

    /**
     * Check if the JSON document was correctly added
     */
    public void testDocument() {
	Calculator calc = new Calculator();
	int result = calc.add(3,1);
	assertTrue(result==4);	
    }
}
