package data;
import java.util.Random;


/**
 * RandomArray class. Generates a random array for a  specific range of numbers and length.
 * The range will be from 0 to upperBound. [0,upperbound] in Math notation.
 *
 * @author Alex
 * @author Elena
 * @version 23/09/2023
 */
public class RandomArray {

    private int length;        /* Length of the generated random array */
    private int upperbound;    /* Limit number of the interval of random numbers => [0,upperbound] */
    private Random random;     /* Random object to generate the random numbers. */
    private int[] array;       /* Array will store the random numbers.*/

    /**
     * Constructor function used if only is provided the length of the final Random array.
     * It will select the length as the upperbound.
     * @param length Length of the Random array
     */
    public RandomArray(int length) {
        this.length = length;
        this.upperbound = length;
        random = new Random();
    }
    /**
     * Constructor function used if length and upperbound is provided of the final Random array.
     * It will select the length as the upperbound.
     * @param length Length of the Random array
     * @param maxNumber upperbound for the random numbers generated.
     */
    public RandomArray(int length, int maxNumber){
        this.length = length;
        this.upperbound = maxNumber;
        random = new Random();
    }

    /**
     * Generates random numbers in the range [0,upperbound] and fill the array.
     * If the array is originally filled, the data will be overwritten.
     */
    private void randomizeArray(){
        for (int i=0; i<length; i++) {
            array[i]= random.nextInt(upperbound);
        }
    }

    /**
     * Generates a new random array each time its used.
     * @return A array filed with random numbers between 0 to upperbound.
     */
    public int[] getNextArray() {
        array = new int[length];
        randomizeArray();
        return array;
    }

    /**
     * Set the upperbound for the random interval of numbers: [0,upperbound].
     * @param upperbound Upperbound for the random interval of numbers: [0,upperbound].
     */
    public void setUpperbound(int upperbound) {
        this.upperbound = upperbound;
    }
    public int getUpperbound() {
        return upperbound;
    }
    public int getLength() {
        return length;
    }
}
