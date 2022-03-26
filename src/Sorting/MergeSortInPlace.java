package Sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1,0};
        mergeSortinplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortinplace(int [] arr, int s, int e){
        if((e-s) == 1){
            return ;
        }
        else {
            int mid = (s+e) / 2;
            mergeSortinplace(arr,s,mid);
            mergeSortinplace(arr,mid,e);
            mergeinplace(arr,s,mid,e);
        }
    }
    private static void mergeinplace(int[]arr, int s,int m,int e){
        int [] res = new int[e-s];
        int i = s;
        int j=m;
        int k=0;

        while(i<m && j<e){
            if(arr[i]< arr[j]){
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
        while(j<e){
            res[k] = arr[j];
            j++;
            k++;
        }
        for(int l=0;l<res.length;l++){
            arr[s+l] = res[l];
        }
    }

}
