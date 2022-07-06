class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            int left = i + 1;
            int right = nums.length -1;
            int sum = 0 - nums[i];
            if(i == 0 || (i >0 && nums[i - 1] != nums[i])){
                while(left < right){
                    if(nums[left] + nums[right] == sum){
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        do{
                            left++;
                        }while(left < right && nums[left] == nums[left -1]);
                        do{
                            right--;
                        }while(left < right && nums[right] == nums[right + 1]);
                    }
                    else if(nums[left] + nums[right] > sum) right--;
                    else left++;
                }
            }
        }
        return res;
    }
}
