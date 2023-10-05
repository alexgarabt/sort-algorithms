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
 * @version 24/09/2023
 */
public class Data extends Object{

    private long time;                  /* Number of time used to complete the task in nanoseconds*/
    private int operations;             /* Number of operations needed to complete the task */
    private int arrayLength;            /* Size of the array used in the task */
    private typeAlgorithm typeAlgorithm; /* Type of the algorithm use in the task */

    /**
     * Constructor function to initialize the Data object with time, operations and array size data.
     * @param type Type of the algorithm use in the task
     * @param time Number of time used to complete the task
     * @param operations Number of operations needed to complete the task
     * @param arrayLength Size of the array used in the task
     */
    public Data(typeAlgorithm type, long time, int operations, int arrayLength){
        this.typeAlgorithm = type;
        this.time = time;
        this.operations = operations;
        this.arrayLength = arrayLength;
    }
    /**
     * Constructor function to initialize the Data object with time and operations data.
     * @param time Number of time used to complete the task
     * @param operations Number of operations needed to complete the task
     */
    public Data(long time, int operations){
        this.time = time;
        this.operations = operations;
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
    public int getOperations() {
        return operations;
    }
    public void setOperations(int operations) {
        this.operations = operations;
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

    @Override
    public String toString(){
        return "[" + "Algorithm:"+ typeAlgorithm.toString() + "; " + "time:" + time +"; operations:" + operations + "; array-length:" + arrayLength + "]";
    }
    /**
     * Return if the provided Data object is equal to this one
     * @param data Data to check if is equals
     * @return if the two objects are equals
     */
    public boolean equals(Data data){
        return ((this.getTime()==data.getTime()) && (this.getOperations()==data.getOperations())
                && (this.getArrayLength()==data.getArrayLength()) && (this.getTypeAlgorithm()==data.getTypeAlgorithm()));
    }
}
