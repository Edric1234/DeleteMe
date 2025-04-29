package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 2, 1, 4};
        bubbleSort(nums, true); //{1, 1, 2, 3, 4, 5}

        System.out.println(Arrays.toString(nums));
    }

    /**
     * Sorts an array of int by bubbleSort ascendingly
     * @param nums input array of int
     */
    public static void bubbleSort(int[] nums) {
        bubbleSort(nums, true);
    }

    /**
     * Sorts an array of int by bubbleSort ascendingly or descendingly based on the boolean ascending value
     * @param nums input array of int
     * @param ascending true if the sort is done ascendingly, false otherwise
     */
    public static void bubbleSort(int[] nums, boolean ascending) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                boolean condition = ascending
                        ? nums[j] > nums[j + 1]
                        : nums[j] < nums[j + 1];
                if (condition) {
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Sorts an array of int by selectionSort
     * @param nums input array of int
     */
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }
            //swap nums[i] and nums[minIdx]
            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp;
        }
    }

    /**
     * Sorts an array of int by insertionSort
     * @param nums input array of int
     */
    public static void insertionSort(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }
}
