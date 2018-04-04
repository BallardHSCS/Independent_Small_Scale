
import com.sun.deploy.util.ArrayUtil;

import java.util.Scanner;

public class IntArray {

    public static final int SIZE = 10;
    public static final int MAX_INT = 1000;

    public static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] a, int low, int high, int val) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == val) {
                return mid;

            } else if (a[mid] < val) {
                return binarySearch(a, mid + 1, high, val);
            } else {
                return binarySearch(a, mid - 1, high, val);
            }

        } else {
            return -1;
        }

    }

    private static int minimumPosition(int a[], int from) {
        int minPos = from;
        for (int i = from + 1; i < a.length; i++) {
            if (a[i] < a[minPos]) {
                minPos = i;
            }
        }
        return minPos;
    }

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;


    }

    public static void sorter(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int minPos = minimumPosition(a, i);
            swap(a, minPos, i);
        }

    }


    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int[] myArray = new int[SIZE];

        for (int index = 0; index < myArray.length; index++) {

            myArray[index] = (int) (Math.random() * (MAX_INT + 1));
            System.out.println(myArray[index]);
        }


        while (true) {
            System.out.println("Would you like Binary or Linear search, Type B for Binary, L for Linear ");
            String searchType = user_input.nextLine();
            if (searchType.equals("L")) {
                System.out.println("What Number are you looking for?");
                int searchNumber = user_input.nextInt();
                System.out.println("The Item was found at index: " + linearSearch(myArray, searchNumber));

            } else if (searchType.equals("B")) {
                sorter(myArray);

                for (int i = 0; i < myArray.length; i++) {
                    System.out.println(myArray[i]);
                }

                System.out.println("What nombre art thou searching for?");
                int searchNumber = user_input.nextInt();
                System.out.println("Your Item was found at index: " + binarySearch(myArray, 0, SIZE, searchNumber));
            }
            else {
                System.out.println("Please enter a valid selection!");
            }


        }
    }
}