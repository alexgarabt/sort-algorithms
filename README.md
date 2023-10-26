# Analisis of sort algorithm

## Time Complexity Sort Algorithms n = Array size
    1- Measured time.
    2- Measured Operations of sort.
        * Assignments.
        * Comparisons.


### Shell-sort => ordena1.
    * Complexity depends of the size of the gaps.
    * In this case is *(h = 3 * h + 1;)* .
    * Worst-case time complexity should be  **O(n^(3/2))**.
    * Best-case time complexity should be **O(n^2)**.
    * Average case time complexity is in the interval **[O(n^2), O(n^(3/2))]**.
Complexity formula for time = <bold>17,4413747094157*(n^(6/5))</bold>
Complexity formula for comparisons = <bold>3,751513396*(n^(6/5))</bold>
Complexity formula for time = <bold>4,948071144*(n^(6/5))</bold>


### Cocktail-sort => ordena2.
    * This algorithm is also know as Bidirectional Bubbel Sort.
    * Worst-case time complexity is **O(n^2)**.
    * Best-case time complexity happends when the input is already or nearly sorted **O(n)**.
    * Average-case time complexity is **O(n^2)**.
Complexity formula for time = <bold>1,049089349*(n^2)</bold>
Complexity formula for comparisons = <bold>0,3770798664*(n^2)</bold>
Complexity formula for time = <bold>0,6247194668*(n^2)</bold>

### Merge-sort => ordena3. 
    * Worst-case time complexity is **O(n log(n))**.
    * Best-case time complexity is also **O(n log(n))**.
    * Average-case time complexity is also **O(n log(n))**.
Complexity formula for time = <bold>167050,967*(n log(n))</bold>
Complexity formula for comparisons = <bold>7544,089543*(n log(n))</bold>
Complexity formula for assignments = <bold>34174,13877*(n log(n))</bold>

---
## Data to analize: (data/raw-measures.csv)
	* Type of the algorithm.
    * Time to sort the algorithm.
	* Operations need to sort (Comparations &  Assigments).
	* Size of the array.

## How data was obtained & analyzed: (data/filered-data.xlsx)
    1- Measure the data using the program developed -> data/raw-measures.csv
    2- Using google sheets, filter the data of each type of algorithm.
    3- Remove some first meditions due to they are not consistant with the data
        * Meditions with an array size less than 245.
    4- Find the complexity of each algorithm for each type of measure by bounding the data.
    5- Find the constant that muliply the complexity
        1- k = operation/complexity.
        2- Do it for all the data
        3- Get the average k for each one of the types of measures for each type of algorithm.
        * example of Cocktail-sort k(time)-> k = TIME/(n^2)
    6- Elaborate the complexity formula for every one.
---

## How to generate new measures:
Compile the project and run the Launcher.
<code>$ java Launcher</code>

## Project Strucuture:
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
    8- Directory (data/) contains the raw measures and the analyzed ones & some graphs.



=SUBTOTAL(101; G4:G)

# Formula for time constant
=ARRAYFORMULA(SI(A2="Cocktail-sort"; C2/(B2^(2)); SI(A2="Shell-sort"; C2/(B2^(6/5)); SI(A1="Merge-sort"; C2/LOG(B2); ""))))

# Formula for comparisons constant
=ARRAYFORMULA(SI(A2="Cocktail-sort"; D2/(B2^(2)); SI(A2="Shell-sort"; D2/(B2^(6/5)); SI(A2="Merge-sort"; D2/LOG(B2); ""))))

# Formula for assignments
=ARRAYFORMULA(SI(A2="Cocktail-sort"; E2/(B2^(2)); SI(A2="Shell-sort"; E2/(B2^(6/5)); SI(A2="Merge-sort"; E2/LOG(B2); ""))))
