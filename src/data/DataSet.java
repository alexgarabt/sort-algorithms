package data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * DataSet class, a custom list that implements ArrayList, so it have the same basic operations
 * @author Alex
 * @author Elena
 * @version 02/10/2023
 * @see Data
 * @see ArrayList
 */
public class DataSet {

    private ArrayList<Data> list; /*Stores the Data in the Data Set*/

    public DataSet(DataSet dataSet) {
        list = dataSet.getList();
    }
    public DataSet(){
        list= new ArrayList<Data>();
    }

    /**
     * Add the provided data to the DataSet
     * @param element data to add to the data set.
     */
    public void add(Data element) {
        list.add(element);
    }
    /**
     * Add all the data in the provided data set into this one
     * @param element Data set with the data to add
     */
    public void addAll(DataSet element){
        list.addAll(element.getList());
    }
    /**
     * Remove the provided element in from the list if it exists
     * @param element the element to remove from the list
     */
    public void remove(Data element) {
        list.remove(element);
    }
    /**
     * Return the element in that is in the position index in the data-set.
     * @param index index of the element to get
     * @return the element in the position index of the list
     */
    public Data get(int index) {
        return list.get(index);
    }
    /**
     * Returns the number of elements in this list.
     * @return the number of elements in this lis
     */
    public int size() {
        return list.size();
    }
    /**
     * Returns a list with all the data in the data-set.
     * @return a ArrayList with all the data in the data-set
     */
    public ArrayList<Data> getList(){
        return list;
    }
    /**
     * Returns true if this list contains the specified element. More formally, returns true if and only if this list contains at least one element e such that Objects.equals(o, e).
     * @param element element whose presence in this list is to be tested
     * @return true if this list contains the specified element
     */
    public boolean contains(Data element) {
        return list.contains(element);
    }
    /**
     * Return a String with all the data in the data set with the shape of "Data.toString,\n ..."
     * @return string element
     */
    @Override
    public String toString() {
        StringBuilder result= new StringBuilder("");
        for (Data ith: list) {
            result.append(ith.toString()+",\n");
        }
        return result.toString();
    }
    public Iterator<Data> iterator(){
        return this.list.iterator();
    }
}
