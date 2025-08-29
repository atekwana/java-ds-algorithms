public class PrintingArray {

    public static void main(String[] args) {

        int[] arr; // -----------------------------------------> O(1)

        arr = new int[3]; // ----------------------------------> O(1)

        arr[0] = 1; // ----------------------------------------> O(1)
        arr[1] = 2; // ----------------------------------------> O(1)
        arr[2] = 3; // ----------------------------------------> O(1)

        for (int arrs : arr) { // -----------------------------> O(n)

            System.out.print(arrs + " ");

        }

        System.out.println();

        String[] strArr = { "a", "b", "c" };

        for (String strArrs : strArr) { // --------------------> O(n)

            System.out.print(strArrs + " ");

        }

        // in conclusion this program has a runtime complexity of O(n)

        // declaring and instantiating array
        int[][] arr2 = new int[2][2];

        // initializing array
        // R C
        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[1][0] = 3;
        arr2[1][1] = 4;

        for (int i = 0; i < arr2.length; i++) { // ----------------------> O(n)

            for (int j = 0; j < arr2[i].length; j++) { // ----------------------> O(m)

                System.out.print(arr2[i][j] + " "); // ----------------------> O(1)

            }

        }

        System.out.println();

        String[][] strArr2 = { { "a", "b" }, { "c", "d" } };

        for (int i = 0; i < strArr.length; i++) { // ----------------------> O(n)

            for (int j = 0; j < strArr2[i].length; j++) { // ----------------------> O(m)

                System.out.print(strArr2[i][j] + " "); // ----------------------> O(1)

            }

        }

        // time complexity: O(mn)
        // space complexity: O(mn)

    }

}
