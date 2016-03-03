

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PatriotCardTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PatriotCardTest
{
    private PatriotCard patriotC1;
    private PatriotCard patriotC2;
    private PatriotCard patriotC3;
    private PatriotCard patriotC4;
    private PatriotCard patriotC5;

    /**
     * Default constructor for test class PatriotCardTest
     */
    public PatriotCardTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        patriotC1 = new PatriotCard("Black", 2);
        patriotC2 = new PatriotCard("Gold", 4);
        patriotC3 = new PatriotCard("Green", 5);
        patriotC4 = new PatriotCard("Green", 4);
        patriotC5 = new PatriotCard("Green", 4);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void different1()
    {
        assertTrue(patriotC2.compareTo(patriotC4)<0);
    }

    @Test
    public void different2()
    {
        assertTrue(patriotC4.compareTo(patriotC5)==0);
    }
}


