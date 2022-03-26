package Sorting;

import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args) {

    }
    static int [] mergeSort(int [] arr){
        if(arr.length == 1){
            return arr;
        }
        else {
            int mid = arr.length / 2;
            int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
            int[] right = mergeSort(Arrays.copyOfRange(arr, mid + 1, arr.length));
            return merge(left, right);
        }
    }
    private static int [] merge(int[]first, int[] last){
        int [] res = new int[first.length+last.length];
        int i,j,k = 0;

    }
}
