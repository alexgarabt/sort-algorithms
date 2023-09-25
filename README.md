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
## Data to analize:
	* Time to sort the algorithm.
	* Operations need to sort (Comparations &  Assigments).
	* Size of the array.

##  Data Strucuture:
	1- Class analyzer, (Launcher.java).
	2- Class with the sort algorithm, (algorithm.SortAlgorithms.java).
    3- Class random array generator, (data.RandomArray).
    4- Class with the basic data to anlyze time complexity, (data.Data).

## Steps to follow:
	1- Develop the program code.
	2- Take measures of the differents inputs.
	3- Analyze the data.
	4- Draw the conclusions of time and operation complexity.
