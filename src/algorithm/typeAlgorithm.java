package algorithm;

/**
 * Enum class typeAlgorithm is used to enumerate the type of sort algorithms.
 *
 * @author Alex
 * @author Elena
 * @version 27/09/2023
 */
public enum typeAlgorithm {

    /*Convention is NAME_TYPE*/
    SHELL_SORT,
    MERGE_SORT,
    COCKTAIL_SORT;

    @Override
    public String toString() {
        switch (this){
            case SHELL_SORT:
                return "Shell-sort";
            case COCKTAIL_SORT:
                return "Cocktail-sort";
            case MERGE_SORT:
                return "Merge-sort";
            default:
                return null;
        }
    }
}
