class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minD=Integer.MAX_VALUE;
        for(int left=0;left<=nums.length-k;left++){
            int right=left+k-1;
            int ans=nums[right]-nums[left];
            minD=Math.min(minD,ans);
        }
        return minD;
        
    }
}