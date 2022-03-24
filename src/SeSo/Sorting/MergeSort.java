package SeSo.Sorting;

public class MergeSort {
    public static void mergeSort(int [] arr, int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr, l, mid, r);
        }
    }
    public static void merge(int [] arr, int l, int mid, int r){
        int i = l;
        int j = mid+1;
        int k = l;
        int [] b = new int[arr.length] ;
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                b[k] = arr[i];
                i++;
                k++;
            }
            else{
                b[k] = arr[j];
                j++;
                k++;
            }

        }
        if(i>mid){
            while(j<=r){
                b[k++] = arr[j++];
            }
        }
        else{
            while(i<=mid){
                b[k++] = arr[i++];
            }
        }
        for(k=l; k<r; k++){
            arr[k] = b[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = {15,45,1,56,78,78,89,65,124,2};
        mergeSort(arr,1,9);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
