import java.util.Arrays;

public class TwoDimensionalArray {

    int[][] arr = null;

    public TwoDimensionalArray(int numRows, int numCols) {

        this.arr = new int[numRows][numCols];

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[0].length; col++) {

                arr[row][col] = Integer.MIN_VALUE;

            }

        }

    }

    // inserting value method
    public void insertValue(int row, int col, int value) {

        try {

            if (arr[row][col] == Integer.MIN_VALUE) { // -----------> O(1)

                arr[row][col] = value; // --------------------------> O(1)

                System.out.println("insertion successful"); // ---> O(1)

            } else {

                System.out.println("index is alread taken"); // --> O(1)

            }

        } catch (ArrayIndexOutOfBoundsException e) {

            System.err.println(e.getMessage()); // -----------------> O(1)

        }

        // time complexity: O(1)
        // space complexity: O(1)

    }

    // accessing 2d array
    public void accessArr(int row, int col) {

        System.out.println("\nrow# " + row + " col# " + col); // --------> O(1)

        try {

            System.out.println("cell value is: " + arr[row][col]); // ---> O(1)

        } catch (Exception e) {

            System.err.println(e.getMessage()); // ----------------------> O(1)

        }

        // time complexity: O(1)
        // space complexity: O(1)

    }

    public void traverseArr() {

        for (int row = 0; row < arr.length; row++) { // ------------------------> O(m)

            for (int col = 0; col < arr[0].length; col++) { // -----------------> O(n)

                System.out.print(arr[row][col] + " "); // ----------------------> O(1)

            }

            System.out.println(); // -------------------------------------------> O(1)

        }

        // time complexity: O(mn)
        // space complexity: O(1)

    }

    /**
     * method to find a specific value in 2d array
     * 
     * @param valueToSearch
     */
    public void searchArr(int valueToSearch) {

        for (int row = 0; row < arr.length; row++) { // ----------------------------------> O(m)

            for (int col = 0; col < arr[0].length; col++) { // ---------------------------> O(n)

                if (arr[row][col] == valueToSearch) { // ---------------------------------> O(1)

                    System.out.print("value found at row: " + row + " col: " + col); // --> O(1)

                    return;

                }

            }

        } 

        // time complexity: O(mn)
        // space complexity: O(1)
    }

    /**
     * method to delete an element from 2d array
     * 
     * @param valueToDelete
     */
    public void deleteValue(int row, int col) {

        try {

            System.out.println("deleted: " + arr[row][col]); // --------> O(1)

            arr[row][col] = Integer.MIN_VALUE; // ----------------------> O(1)
          
        } catch (ArrayIndexOutOfBoundsException e) {
           
            System.err.println(e.getMessage()); // ---------------------> O(1)
            
        }

        // time complexity: O(1)
        // space complexity: O(1)

    }

    public static void main(String[] args) {

        TwoDimensionalArray ads = new TwoDimensionalArray(3, 3);

        ads.insertValue(0, 0, 2);
        ads.insertValue(0, 1, 4);
        ads.insertValue(1, 1, 2);

        // ads.accessArr(0, 0);

        System.out.println(Arrays.deepToString(ads.arr));

        //ads.traverseArr();

        ads.deleteValue(0, 0);

        System.out.println(Arrays.deepToString(ads.arr));

    }

}
