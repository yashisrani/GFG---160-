class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        Arrays.sort(arr, (a,b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
        for(int[] interval : arr){
            if(res.isEmpty() || res.get(res.size() - 1)[1] < interval[0]){
                res.add(interval);
            }
            else{
                res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], interval[1]);
            }
        }
        return res;
    }
}