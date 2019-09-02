package assignment2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void findMax_valid(){
        int[] input = {1,2,3,4,5};
        int expected = 5;
        int result = App.findMax(input);
        assertTrue(expected == result);
    }

    @Test
    public void findMin_valid(){
        int[] input = {1,2,3,4,5};
        int expected = 1;
        int result = App.findMin(input);
        assertTrue(expected == result);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void findMax_invalid_empty(){
        int[] input = {};
        App.findMax(input);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void findMin_invalid_empty(){
        int[] input = {};
        App.findMin(input);
    }

    @Test(expected = NullPointerException.class)
    public void findMax_invalid_null(){
        int[] input = null;
        App.findMax(input);
    }

    @Test(expected = NullPointerException.class)
    public void findMin_invalid_null(){
        int[] input = null;
        App.findMin(input);
    }
}
