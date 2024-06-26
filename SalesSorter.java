/**
 * Class containing the bubble sort algorithm to sort sales representatives.
 */
public class SalesSorter {

    /**
     * Sort the array of SalesRepresentative objects in descending order of revenue.
     * 
     * @param representatives Array of SalesRepresentative objects to be sorted.
     * @return Sorted array of SalesRepresentative objects.
     */
    public SalesRepresentative[] sort(SalesRepresentative[] representatives) {
        int n = representatives.length;
        boolean swapped;

        // Bubble sort algorithm
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (representatives[j].getRevenue() < representatives[j + 1].getRevenue()) {
                    // Swap representatives[j] and representatives[j+1]
                    SalesRepresentative temp = representatives[j];
                    representatives[j] = representatives[j + 1];
                    representatives[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped in the inner loop, then the array is sorted
            if (!swapped) break;
        }
        return representatives;
    }
}
