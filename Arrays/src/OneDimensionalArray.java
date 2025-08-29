public class OneDimensionalArray {

    int[] arr = null;

    public OneDimensionalArray(int addSize) {

        arr = new int[addSize];

        for (int index = 0; index < arr.length; index++) { // -----------------------------> O(n)

            arr[index] = Integer.MIN_VALUE;

        }

        // runtime complexity will be O(n)

    }

    public void insertValue(int location, int insertValue) {

        try {

            if (arr[location] == Integer.MIN_VALUE) { // ------------------> O(1)

                arr[location] = insertValue; // ---------------------------> O(1)

                System.out.println("Successfully Inserted"); // ---------> O(1)

            } else {

                System.out.println("This cell is already occupied"); // -> O(1)

            }

        } catch (ArrayIndexOutOfBoundsException e) {

            System.err.println("Invalid Index"); // ----------------------> O(1)

        }

        // in this case of insertion the runtime complexity will be O(1)
    }

    public void traverseArr() {

        try {

            for (int index = 0; index < arr.length; index++) { // -----------------------------> O(n)

                System.out.print(arr[index] + " ");

            }

        } catch (Exception e) {

            System.err.println(e.getMessage()); // -----------------------------> O(1)

        }

        // in conclusion this method has a runtime complexity of O(n)

    }

    // search for an element in the array
    public void searchArr(int valueToSearch) {

        for (int index = 0; index < arr.length; index++) { // -----------------------------> O(n)

            if (arr[index] == valueToSearch) {

                System.out.print("value found at index " + index); // ----------------------> O(1)

                return; // ----------------------> O(1)

            }

        }

        System.out.print(valueToSearch + " is not found"); // ----------------------> O(1)

        // time complexity: O(n)
        // space complexity: O(1)

    }

    // delete element from array

    public void deleteValue(int valueToDelete) {

        try {

            arr[valueToDelete] = Integer.MIN_VALUE;  // ----------------------> O(1)

            System.out.println("value deleted successfully");  // ----------------------> O(1)

        } catch (ArrayIndexOutOfBoundsException e) {

            System.err.println(e.getMessage());  // ----------------------> O(1)

        }

        // time complexity: O(1)
        // space complexity: O(1)
    }

    public static void main(String[] args) {

        OneDimensionalArray ads = new OneDimensionalArray(10);

        ads.insertValue(0, 10);
        ads.insertValue(1, 20);
        ads.insertValue(2, 30);

        // int firstElement = ads.arr[0];
        // System.out.println(firstElement);

        // int thirdElement = ads.arr[2];
        // System.out.println(thirdElement);

        // System.out.println("Array Traversal");
        // ads.traverseArr();

        // System.out.println("\nArray Search");
        // ads.searchArr(0);

        System.out.println("Deleting Value");
        ads.deleteValue(0);

        ads.traverseArr();
        
        System.out.println(ads.arr[0]);

    }

}
