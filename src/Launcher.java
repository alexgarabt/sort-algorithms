import algorithm.*;
import data.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Launcher class is used to
 */
public class Launcher {
    public final static int maxRandomNumber = 100000;

    public static void main(String args[]){

        System.out.println(measureRange(1,200));

    }

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
