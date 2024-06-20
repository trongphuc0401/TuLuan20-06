package vn.edu.likelion.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Solution -
 *
 * @param
 * @return
 * @throws
 */
public class Solution {

    /**
     * User String[] to store element in method bubleSort1
     * @param string
     */
   public static void bubleSort1(String[] string) {
        for(int i = 0; i < string.length; i++) {
            for (int j = 0; j < string.length - i - 1; j++) {
                if (string[j].compareTo(string[j + 1]) > 0) {
                    String temp = string[j];
                    string[j] = string[j + 1];
                    string[j + 1] = temp;
                }
            }
        }
   }

    /**
     *  User ArrayList to store element in method bubbleSort2
     * @param stringList
     * @return
     */
    public static ArrayList<String> bubbleSort2(ArrayList<String> stringList) {
        int n = stringList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (stringList.get(j).compareTo(stringList.get(j + 1)) > 0) {
                    String temp = stringList.get(j);
                    stringList.set(j, stringList.get(j + 1));
                    stringList.set(j + 1, temp);
                }
            }
        }
        return stringList;
    }

    /**
     * use ArrayList for quicksotr method
     * @param stringList
     * @param left
     * @param right
     * @return
     */

    public static ArrayList<String> quickSort(ArrayList<String> stringList, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(stringList, left, right);
            quickSort(stringList, left, pivotIndex - 1);
            quickSort(stringList, pivotIndex + 1, right);
        }
        return stringList;
    }

    /**
     * Partition use for quicksort
     * @param stringList
     * @param left
     * @param right
     * @return
     */
    public static int partition(ArrayList<String> stringList, int left, int right) {
        String pivot = stringList.get(right);
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (stringList.get(j).compareTo(pivot) < 0) {
                i++;
                String temp = stringList.get(i);
                stringList.set(i, stringList.get(j));
                stringList.set(j, temp);
            }
        }
        String temp = stringList.get(i + 1);
        stringList.set(i + 1, stringList.get(right));
        stringList.set(right, temp);
        return i + 1;
    }


    public static void main(String[] args) {
        String[] stringArray = {"Red","Green","Blue","Yellow","Orange"};
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Red");
        stringList.add("Green");
        stringList.add("Blue");
        stringList.add("Yellow");
        stringList.add("Orange");

        System.out.println("List before sort: " +stringList);

        Solution solution  = new Solution();
        // solution.quickSort(stringList,0,stringList.size()-1);
        solution.bubbleSort2(stringList);
        System.out.println("List after sort: "+stringList);



    }
}
