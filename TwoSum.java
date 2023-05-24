class Solution {
    public int[] twoSum(int[] nums, int target) {                                                 
        for(int i = 0 ; i < nums.length;i++){             //iterating in 1st time in array
            for(int j = i+1; j < nums.length; j++){     //iterating after element of the 1st loop 
                if(nums[i] + nums[j] == target){        // checking for the sum of target
                    return new int [] {i,j};            // return new array index
                }
            }
        }
        return null; 
    }
}
