class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int n = nums.length;
        int n1= 0 , n2=0, c1=0,c2=0;
        for(int i:nums){
            if(i==n1){
                c1++;
            }else if(i==n2){
                c2++;
            }else if(c1==0){
                n1=i;
                c1=1;
            }else if(c2==0){
                n2=i;
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i:nums){
            if(i==n1){
                c1++;
            }else if(i==n2){
                c2++;
         }
        }
        List<Integer> ans = new ArrayList();
        if(c1 >n/3) ans.add(n1);
        if(c2 > n/3) ans.add(n2);
        Collections.sort(ans);
        return ans;
    }

}

