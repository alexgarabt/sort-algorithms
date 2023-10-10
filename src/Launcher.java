import algorithm.*;
import data.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Launcher class is used to measure the different sort algorithms in the algorithm package.
 * 
 * 
 * @author Alex
 * @author Elena
 * @version 07/10/2023
 * @see algorithm.SortAlgorithms
 * @see algorithm.typeAlgorithm
 * @see data.Data
 * @see data.DataSet
 * @see data.RandomIntArray
 * 
 */
public class Launcher {
    public final static int maxRandomNumber = 100000;

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        DataSet dataSet;
        int initRange, finalRange;

        System.out.print("Introduce the range of array size to study the sort algorithms\n Start number: ");
        initRange = scanner.nextInt();
        System.out.print(" End number: ");
        finalRange = scanner.nextInt();
        System.out.println("Selected range ["+initRange+","+finalRange+"]");

        dataSet = measureRange(initRange,finalRange);
        System.out.println(dataSet);

        System.out.print("Do you want to save the data in csv file?(Type yes/no) ");

        if(!scanner.next().equals("yes")) return;

        System.out.print("Introduce the file path and the file name: ");
        try {
            dataSet.getFileCSV(scanner.next());
        } catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }

    }
    /**
     * Measures all the sort algorithms with a copy of the same unordered array
     * @param unOrderedArray Array to sort with the different algorithms.
     * @return A DataSet object with the data of the measures. 
     */
    private static DataSet measureAllAlgorithms(int[] unOrderedArray){


        DataSet dataSet = new DataSet();
        Data data;
        int[] unOrderedArrayCopy = new int[unOrderedArray.length];

        for (typeAlgorithm type: typeAlgorithm.values()) {
            System.arraycopy(unOrderedArray, 0, unOrderedArrayCopy, 0, unOrderedArray.length);
            data = SortAlgorithms.measureSortAlgorithm(type,unOrderedArrayCopy);
            dataSet.add(data);
        }
        return dataSet;

    }
    /**
     * Measures all the sort algorithms with randoms arrays in the given length range.
     * @param inital inital number of the range.
     * @param last last numbr of the range.
     * @return A DataSet with all the data of the different measures. 
     */
    private static DataSet measureRange(int inital, int last){

        DataSet dataSet = new DataSet();
        RandomIntArray randArray;
        int[] arrayUnsorted;

        for (int i=inital;i<=last;i++){
            randArray = new RandomIntArray(i,maxRandomNumber);
            arrayUnsorted = randArray.getNextArray();
            dataSet.addAll(measureAllAlgorithms(arrayUnsorted));
        }
        return dataSet;
    }


}
