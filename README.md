# Analisis of sort algorithm

---
## Time Complexity Sort Algorithms:

### Shell-sort => ordena1.
    * Complexity depends of the size of the gaps.
    * In this case is *(h = 3 * h + 1;)* .
    * Worst-case time complexity should be  **O(n^(3/2))**.
    * Best-case time complexity should be **O(n^2)**.
    * Average case time complexity is in the interval **[O(n^2), O(n^(3/2))]**.

### Cocktail-sort => ordena2.
    * This algorithm is also know as Bidirectional Bubbel Sort.
    * Worst-case time complexity is **O(n^2)**.
    * Best-case time complexity happends when the input is already or nearly sorted **O(n)**.
    * Average-case time complexity is **O(n^2)**.

### Merge-sort => ordena3. 
    * Worst-case time complexity is **O(n log(n))**.
    * Best-case time complexity is also **O(n log(n))**.
    * Average-case time complexity is also **O(n log(n))**.

---
## Data to analize: (data/)
	* Type of the algorithm.
    * Time to sort the algorithm.
	* Operations need to sort (Comparations &  Assigments).
	* Size of the array.

##  Data Strucuture:
	1- Class analyzer, (Launcher).
	2- Class with the sort algorithm, (algorithm.SortAlgorithms).
    2.1- Class with type of algorithms, (algorithm.typeAlgorithm).
    3- Class random array generator, (data.RandomIntArray).
    4- Class with the basic data to anlyze time complexity, (data.Data).
    5- Class contains the different data, (data.DataSet).
    6- Class to write data as csv files, (csv.CsvWriterSimple).
    7- Package test is for test the sort methods.
        * (test/ArraySorterSelector) Class contais the function contains the sort method to test.
        * (test/ArraySorterTest) is the actual class with the tests use the method in ArraySorter.

## Steps to follow:
	1- Develop the program code.
	2- Take measures of the differents inputs.
	3- Analyze the data.
	4- Draw the conclusions of time and operation complexity.

## TODO:
    * Take measures of the different sort algorithms and analize the time complexity.
