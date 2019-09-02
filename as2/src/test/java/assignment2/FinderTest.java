package assignment2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FinderTest 
{
    @Test
    public void findMax_valid(){
        int[] input = {1,2,3,4,5};
        int expected = 5;
        int result = Finder.findMax(input);
        assertTrue(expected == result);
    }

    @Test
    public void findMin_valid(){
        int[] input = {1,2,3,4,5};
        int expected = 1;
        int result = Finder.findMin(input);
        assertTrue(expected == result);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void findMax_invalid_empty(){
        int[] input = {};
        Finder.findMax(input);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void findMin_invalid_empty(){
        int[] input = {};
        Finder.findMin(input);
    }

    @Test(expected = NullPointerException.class)
    public void findMax_invalid_null(){
        int[] input = null;
        Finder.findMax(input);
    }

    @Test(expected = NullPointerException.class)
    public void findMin_invalid_null(){
        int[] input = null;
        Finder.findMin(input);
    }
}
