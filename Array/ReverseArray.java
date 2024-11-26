class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int sp = 0;
        int ep = arr.length - 1;
        
        while(sp<ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
        
    }
}