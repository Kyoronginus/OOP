import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Modify printList to accept any List type
    public static void printList(List<Integer> arr) {
        for (int i = 0 ; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {

        int[] a = { 1, 2, 3 };
        int[] b = a;
        App.printArr(b);
        a[0] = 6;
        App.printArr(a);
        App.printArr(b);

        int[] c = { 1, 2, 3 };
        int[] cCopy = new int[3];
        int[] d = { 0, 0, 0, 0, 0, 0 };
        for (int i = 0; i < c.length; i++) {
            cCopy[i] = c[i];
        }
        System.arraycopy(c, 0, d, 2, c.length);

        App.printArr(c);
        App.printArr(cCopy);
        App.printArr(d);

        int[][] matrix2 = { { 1, 2, 3 }, { 2, 3, 4 } };
        App.printMatrix(matrix2);

        // Declare a List (ArrayList)
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }
        App.printList(list);

        // Declare a LinkedList and print it
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            linkedList.add(i);
        }
        App.printList(linkedList);
    }
}
