class Solution {


    public void mergeArrays(int a[], int b[],int []arr) {
        int m = a.length;
        int n = b.length;
       // int[] ans = new int[m + n];
        int i = 0, j = 0, idx = 0;
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                arr[idx++] = a[i++];
            } else {
                arr[idx++] = b[j++];
            }
        }
        while (i < m) {
            arr[idx++] = a[i++];
        }
        while (j < n) {
            arr[idx++] = b[j++];
        }

    }
    public void mergeSort(int []arr){
        int n = arr.length;
        if(n == 1) return;
        int []a = new int[n/2];
        int []b = new int[n-n/2];
        int idx = 0;
        for(int i = 0;i<a.length;i++)  a[i] = arr[idx++];
        for(int i = 0;i<b.length;i++) b[i] = arr[idx++];
        mergeSort(a);
        mergeSort(b);
        mergeArrays(a,b,arr); 

    }
    public int[] sortArray(int[] arr) {
        mergeSort(arr);
        return arr;

           

}
}