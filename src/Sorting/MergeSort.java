package Sorting;

import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1,0};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int [] mergeSort(int [] arr){
        if(arr.length == 1){
            return arr;
        }
        else {
            int mid = arr.length / 2;
            int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
            int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
            return merge(left, right);
        }
    }
    private static int [] merge(int[]first, int[] last){
        int [] res = new int[first.length+last.length];
        int i = 0;
        int j=0;
        int k=0;

        while(i<first.length && j<last.length){
            if(first[i]< last[j]){
                res[k] = first[i];
                i++;
            }
            else{
                res[k] = last[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            res[k] = first[i];
            i++;
            k++;
        }
        while(j<last.length){
            res[k] = last[j];
            j++;
            k++;
        }
        return res;
    }
}
