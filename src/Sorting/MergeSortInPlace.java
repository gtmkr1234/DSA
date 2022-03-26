package Sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
            int [] a= {5,4,3,2,1};
            mergeSort(a,0,a.length);
            System.out.println(Arrays.toString(a));

    }
    public static void mergeSort(int[] arr, int start, int end){
            if(end-start==1){
                return;
            }
            else{
                int mid = (start+end)/2;
                mergeSort(arr,start,mid);
                mergeSort(arr,mid,end);
                mergeInPlace(arr,start,mid,end);
            }
    }
    private static void mergeInPlace(int [] arr, int s, int m, int e){
        int [] res = new int[e-s];
            int i = s;
            int j = m;
            int k = 0;

            while(i<m && j<e){
                if(arr[i]<arr[j]){
                    res[k] = arr[i];
                    i++;
                }
                else{
                    res[k] = arr[j];
                    j++;
                }
                k++;
            }
            while(i<m){
                res[k] = arr[i];
                i++;
                k++;
            }
            while(j < e){
                res[k] = arr[j];
                k++;
                j++;
            }
            for(int l = 0; j<res.length; l++){
                arr[s+l] = res[l];
            }

    }

}
