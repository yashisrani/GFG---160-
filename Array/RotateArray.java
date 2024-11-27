class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        
        //reverse the first d element
        reverse(arr,0,d-1);
        
        //reverse the elements after d element
        reverse(arr,d,n-1);
        
        //reverse the whole array
        reverse(arr,0,n-1);
    
    }
    
    static void reverse(int[] arr, int start, int end) {
    
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}