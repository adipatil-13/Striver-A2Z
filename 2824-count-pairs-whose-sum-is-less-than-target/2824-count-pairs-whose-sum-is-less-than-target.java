class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count = 0;
        int left = 0, right = nums.size() - 1;
        while (left < right){
            if(nums.get(left) + nums.get(right) < target){
                count+= right - left; // If sum of elements at left & right is less than target, it means all pairs with current left will also satisfy the condition
                left++;
            } else{
                right--;
            }
        }
        return count;
    }
}