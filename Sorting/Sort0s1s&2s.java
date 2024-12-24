class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int i = 0;
        int j = 0;
        int k = arr.length - 1;
        while(j<=k){
            int elem = arr[j];
            if(elem == 0){
                swap(arr,i,j);
                ++i;
                ++j;
            }
            else if(elem == 1){
                ++j;
            }
            else{
                swap(arr,j,k);
                --k;
            }
        }
    }
    
    public void swap(int[]arr, int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
