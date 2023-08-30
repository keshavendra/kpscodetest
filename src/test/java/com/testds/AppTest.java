package com.testds;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit testds for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the testds case
     *
     * @param testName name of the testds case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        App app = new App();
        app.main(new String[]{"Test"});
//        App.main(new String[]{"Test"});
        assertTrue(true);
    }
}
