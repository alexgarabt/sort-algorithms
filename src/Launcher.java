import algorithm.*;
import data.*;
import java.util.Scanner;

/**
 * Launcher class is used to
 */
public class Launcher {
    public static void main(String args[]){


        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce the length of the array: ");
        int lengthArray = scanner.nextInt();
        RandomIntArray randArray = new RandomIntArray(lengthArray,10000);
        int[] arrayTest = randArray.getNextArray();
        int[] ithArray = new int[lengthArray];
        Data data;

        for (typeAlgorithm type: typeAlgorithm.values()) {
            System.arraycopy(arrayTest, 0, ithArray, 0, lengthArray);
            data = SortAlgorithms.measureSortAlgorithm(type,ithArray);
            System.out.println(data.toString());
        }


    }


}
