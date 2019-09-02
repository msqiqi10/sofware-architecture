package assignment2;

/**
 * Hello world!
 *
 */
public class Finder 
{
    public static int findMax(int[] input){
        int max = input[0];
        for(int e : input){
            if(e > max){
                max = e;
            }
        }
        return max;
    }

    public static int findMin(int[] input){
        int min = input[0];
        for(int e : input){
            if(e < min){
                min = e;
            }
        }
        return min;
    }
}
