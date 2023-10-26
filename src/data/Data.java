package data;
import algorithm.typeAlgorithm;
/**
 * Data class.
 * This class represents the data to analyze the time complexity of the different algorithms.
 * Stores: time to complete the task, number of "basic" operations of the algorithm to complete the task and
 * size of the array.
 *
 * @author Alex
 * @author Elena
 * @version 05/10/2023
 */
public class Data extends Object{

    private long time;                  /* Number of time used to complete the task in nanoseconds*/
    private int comparisons;           /* Number of comparisons needed to complete the task */
    private int assignments;            /* Number of assignments needed to complete the task */
    private int arrayLength;            /* Size of the array used in the task */
    private typeAlgorithm typeAlgorithm;/* Type of the algorithm use in the task */

    //Used to be converted to a .csv file
    public final static String[] headers = {"Type-Algorithm", "Time(ns)", "Comparisons", "Assignments", "Array-Size"};


    /**
     * Constructor function to initialize the Data object with time, operations and array size data.
     * @param type Type of the algorithm use in the task
     * @param time Number of time used to complete the task
     * @param comparisons Number of operations needed to complete the task
     * @param assignments Number of assignments needed to complete the task
     * @param arrayLength Size of the array used in the task
     */
    public Data(typeAlgorithm type, long time, int comparisons, int assignments, int arrayLength){
        this.typeAlgorithm = type;
        this.time = time;
        this.assignments = assignments;
        this.comparisons = comparisons;
        this.arrayLength = arrayLength;
    }

    /**
     * Constructor function to initialize the Data object with time and operations data.
     * @param time Number of time used to complete the task
     * @param comparisons Number of comparisons needed to complete the task
     * @param assignments Number of assignments needed to complete the task
     */
    public Data(long time, int comparisons, int assignments){
        this.time = time;
        this.comparisons = assignments;
    }
    /**
     * Constructor function to initialize empty the Data object.
     */
    public Data(){
    }

    public double getTime() {
        return time;
    }
    public void setTime(long time) {
        this.time = time;
    }
    public int getComparisons() {
        return comparisons;
    }
    public void setComparisons(int comparisons) {
        this.comparisons = comparisons;
    }
    public int getArrayLength() {
        return arrayLength;
    }
    public void setArrayLength(int arrayLength) {
        this.arrayLength = arrayLength;
    }
    public typeAlgorithm getTypeAlgorithm() {
        return typeAlgorithm;
    }
    public void setTypeAlgorithm(typeAlgorithm typeAlgorithm) {
        this.typeAlgorithm = typeAlgorithm;
    }
    public int getAssignments() {
        return assignments;
    }
    public void setAssignments(int assignments) {
        this.assignments = assignments;
    }

    @Override
    public String toString(){
        return "[" + "Algorithm:"+ typeAlgorithm.toString() + "; " + "time(ns):" + time +"; comparisons:" + comparisons +"; assignments:" + assignments + "; array-length:" + arrayLength + "]";
    }

    /**
     * Returns a String array as defined in the headers order to be used in a csv.
     * @return Returns a String array.
     */
    public String[] dataToCSV(){
        String[] result = {typeAlgorithm.toString(), String.valueOf(time), String.valueOf(comparisons), String.valueOf(assignments), String.valueOf(arrayLength)};
        return result;
    }

    /**
     * Return if the provided Data object is equal to this one
     * @param data Data to check if is equals
     * @return if the two objects are equals
     */
    public boolean equals(Data data){
        return ((this.getTime()==data.getTime()) && (this.getComparisons()==data.getComparisons())
                && (this.getAssignments()==data.getAssignments()) && (this.getArrayLength()==data.getArrayLength())
                && (this.getTypeAlgorithm()==data.getTypeAlgorithm()));
    }
}
