/**
 * Main class to demonstrate the sorting of sales representatives.
 */
public class Main {

    public static void main(String[] args) {
        // Create an array of SalesRepresentative objects
        SalesRepresentative[] representatives = {
                new SalesRepresentative(10, 500),
                new SalesRepresentative(7, 800),
                new SalesRepresentative(5, 1000),
                new SalesRepresentative(8, 600)
        };

        // Sort the array using SalesSorter
        SalesSorter sorter = new SalesSorter();
        SalesRepresentative[] sortedRepresentatives = sorter.sort(representatives);

        // Print the sorted array
        System.out.println("Sorted Sales Representatives by Revenue (Descending Order):");
        for (SalesRepresentative rep : sortedRepresentatives) {
            System.out.println(rep);
        }
    }
}
